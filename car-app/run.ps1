param(
    [ValidateSet('standard', 'pleos')][string]$Variant = 'standard',
    [string]$Avd = '',
    [string]$Serial = ''
)
$ErrorActionPreference = 'Stop'
$sdkRoot = if ($env:ANDROID_HOME) { $env:ANDROID_HOME } else { Join-Path $env:LOCALAPPDATA 'Android\Sdk' }
$adbExe = Join-Path $sdkRoot 'platform-tools\adb.exe'
$emulatorExe = Join-Path $sdkRoot 'emulator\emulator.exe'
if (!(Test-Path -LiteralPath $adbExe)) { throw "Android SDK not found at $sdkRoot. Set ANDROID_HOME." }

function Get-ConnectedDevices {
    @(& $adbExe devices | Where-Object { $_ -match '^\S+\s+device$' } | ForEach-Object { ($_ -split '\s+')[0] })
}

Push-Location $PSScriptRoot
try {
    $devices = @(Get-ConnectedDevices)
    if (!$Serial -and $devices.Count -eq 0) {
        $avds = @(& $emulatorExe -list-avds | Where-Object { $_.Trim() })
        if (!$Avd) {
            if ($Variant -eq 'pleos') { throw 'Start a Pleos emulator first, or specify -Avd YOUR_PLEOS_AVD.' }
            $Avd = $avds | Select-Object -First 1
        }
        if (!$Avd -or $Avd -notin $avds) { throw 'No matching AVD. Create an emulator in Android Studio Device Manager.' }
        Write-Host "Starting emulator: $Avd"
        Start-Process -FilePath $emulatorExe -ArgumentList @('-avd', $Avd, '-no-snapshot-load') -WindowStyle Hidden
        $deadline = (Get-Date).AddMinutes(3)
        do {
            Start-Sleep -Seconds 2
            $devices = @(Get-ConnectedDevices)
        } while ($devices.Count -eq 0 -and (Get-Date) -lt $deadline)
    }
    if (!$Serial) {
        if ($devices.Count -ne 1) { throw 'Expected one connected device. Use -Serial emulator-5554 to choose a device.' }
        $Serial = $devices[0]
    }
    if ($Serial -notin @(Get-ConnectedDevices)) { throw "Device $Serial is not connected or authorized." }
    Write-Host "Waiting for Android to finish booting: $Serial"
    $deadline = (Get-Date).AddMinutes(3)
    do {
        $booted = (& $adbExe -s $Serial shell getprop sys.boot_completed 2>$null | Out-String).Trim()
        if ($booted -eq '1') { break }
        Start-Sleep -Seconds 2
    } while ((Get-Date) -lt $deadline)
    if ($booted -ne '1') { throw 'Android boot timed out. Check the emulator window.' }
    $taskVariant = (Get-Culture).TextInfo.ToTitleCase($Variant)
    & .\gradlew.bat ":app:assemble${taskVariant}Debug" --console=plain
    if ($LASTEXITCODE -ne 0) { throw 'APK build failed. See Gradle output above.' }
    & $adbExe -s $Serial install -r "app/build/outputs/apk/$Variant/debug/app-$Variant-debug.apk"
    if ($LASTEXITCODE -ne 0) { throw 'APK installation failed. See adb output above.' }
    & $adbExe -s $Serial shell am start -W -n com.musicmap.car/.MainActivity
    if ($LASTEXITCODE -ne 0) { throw 'App launch failed.' }
} finally { Pop-Location }
