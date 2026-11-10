param(
    [ValidateSet('standard', 'pleos')][string]$Variant = 'pleos',
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

function Get-DeviceAvd([string]$DeviceSerial) {
    if ($DeviceSerial -notmatch '^emulator-') { return '' }
    (& $adbExe -s $DeviceSerial emu avd name 2>$null | Where-Object { $_.Trim() -and $_ -ne 'OK' } | Select-Object -First 1)
}

function Test-PleosAvd([string]$Name) {
    if (!$Name) { return $false }
    $avdHome = if ($env:ANDROID_AVD_HOME) { $env:ANDROID_AVD_HOME } elseif ($env:ANDROID_USER_HOME) { Join-Path $env:ANDROID_USER_HOME 'avd' } else { Join-Path $env:USERPROFILE '.android\avd' }
    $ini = Join-Path $avdHome "$Name.ini"
    if (!(Test-Path -LiteralPath $ini)) { return $false }
    $pathLine = Get-Content -LiteralPath $ini | Where-Object { $_ -match '^path=' } | Select-Object -First 1
    if (!$pathLine) { return $false }
    $config = Join-Path $pathLine.Substring(5) 'config.ini'
    if (!(Test-Path -LiteralPath $config)) { return $false }
    return [bool](Get-Content -LiteralPath $config | Where-Object { $_ -match '^image\.sysdir\.1=.*pleos' })
}

Push-Location $PSScriptRoot
try {
    $avds = @(& $emulatorExe -list-avds | Where-Object { $_.Trim() })
    if ($Avd -and $Avd -notin $avds) { throw "AVD '$Avd' is not installed." }
    if ($Variant -eq 'pleos' -and $Avd -and !(Test-PleosAvd $Avd)) { throw "AVD '$Avd' does not use a Pleos system image." }
    $devices = @(Get-ConnectedDevices)
    if (!$Serial) {
        $candidates = @($devices | Where-Object {
            $deviceAvd = Get-DeviceAvd $_
            if ($Avd) { $deviceAvd -eq $Avd }
            elseif ($Variant -eq 'pleos') { Test-PleosAvd $deviceAvd }
            else { $true }
        })
        if ($candidates.Count -gt 1) { throw 'Multiple matching devices. Use -Serial emulator-5554 to choose one.' }
        if ($candidates.Count -eq 1) { $Serial = $candidates[0] }
    }
    if (!$Serial) {
        if (!$Avd) {
            if ($Variant -eq 'pleos') {
                $pleosAvds = @($avds | Where-Object { Test-PleosAvd $_ })
                if ($pleosAvds.Count -gt 1) { throw 'Multiple Pleos AVDs. Select one with -Avd YOUR_PLEOS_AVD.' }
                $Avd = $pleosAvds | Select-Object -First 1
                if (!$Avd) { throw 'Pleos system image/AVD is not installed. See docs/PLEOS.md for setup.' }
            } else { $Avd = $avds | Select-Object -First 1 }
        }
        if (!$Avd -or $Avd -notin $avds) { throw 'No matching AVD. Create an emulator in Android Studio Device Manager.' }
        Write-Host "Starting emulator: $Avd"
        $emulatorArgs = @('-avd', $Avd, '-no-snapshot-load')
        if ($Variant -eq 'pleos') { $emulatorArgs += '-no-snapshot-save' }
        Start-Process -FilePath $emulatorExe -ArgumentList $emulatorArgs -WindowStyle Hidden
        $deadline = (Get-Date).AddMinutes(5)
        do {
            Start-Sleep -Seconds 2
            $Serial = Get-ConnectedDevices | Where-Object { (Get-DeviceAvd $_) -eq $Avd } | Select-Object -First 1
        } while (!$Serial -and (Get-Date) -lt $deadline)
        if (!$Serial) { throw "Emulator '$Avd' did not connect within five minutes." }
    }
    if ($Serial -notin @(Get-ConnectedDevices)) { throw "Device $Serial is not connected or authorized." }
    $selectedAvd = Get-DeviceAvd $Serial
    if ($Avd -and $selectedAvd -ne $Avd) { throw "Device $Serial is not running AVD '$Avd'." }
    if ($Variant -eq 'pleos' -and $Serial -match '^emulator-' -and !(Test-PleosAvd $selectedAvd)) {
        throw "Device $Serial does not use a Pleos system image. Select the Pleos emulator."
    }
    Write-Host "Waiting for Android to finish booting: $Serial"
    $deadline = (Get-Date).AddMinutes(5)
    do {
        $booted = (& $adbExe -s $Serial shell getprop sys.boot_completed 2>$null | Out-String).Trim()
        if ($booted -eq '1') { break }
        Start-Sleep -Seconds 2
    } while ((Get-Date) -lt $deadline)
    if ($booted -ne '1') { throw 'Android boot timed out. Check the emulator window.' }
    if ($Variant -eq 'pleos') {
        $features = (& $adbExe -s $Serial shell pm list features | Out-String)
        if ($features -notmatch 'android.hardware.type.automotive') { throw "Device $Serial is not an Automotive device." }
    }
    $taskVariant = (Get-Culture).TextInfo.ToTitleCase($Variant)
    & .\gradlew.bat ":app:assemble${taskVariant}Debug" --console=plain
    if ($LASTEXITCODE -ne 0) { throw 'APK build failed. See Gradle output above.' }
    & $adbExe -s $Serial install -r "app/build/outputs/apk/$Variant/debug/app-$Variant-debug.apk"
    if ($LASTEXITCODE -ne 0) { throw 'APK installation failed. See adb output above.' }
    & $adbExe -s $Serial shell am start -W -n com.musicmap.car/.MainActivity
    if ($LASTEXITCODE -ne 0) { throw 'App launch failed.' }
} finally { Pop-Location }
