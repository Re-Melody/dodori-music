"""Run installed standardDebug instrumentation on one disposable emulator."""
import argparse
import subprocess
from pathlib import Path

parser = argparse.ArgumentParser()
parser.add_argument("--adb", default="adb")
args = parser.parse_args()
out = Path(__file__).resolve().parents[1] / "build/verification"
out.mkdir(parents=True, exist_ok=True)

def adb(*parts, timeout=30):
    return subprocess.check_output([args.adb, *parts], timeout=timeout).decode("utf-8", "replace")

devices = [line.split()[0] for line in adb("devices").splitlines()[1:] if line.endswith("\tdevice")]
assert len(devices) == 1 and devices[0].startswith("emulator-"), "Use one disposable emulator only"
adb("shell", "am", "force-stop", "com.musicmap.car")
adb("shell", "pm", "grant", "com.musicmap.car", "android.permission.POST_NOTIFICATIONS")
adb("shell", "pm", "grant", "com.musicmap.car", "android.permission.ACCESS_FINE_LOCATION")
adb("shell", "pm", "grant", "com.musicmap.car", "android.permission.ACCESS_COARSE_LOCATION")
adb("shell", "appops", "set", "com.musicmap.car", "android:mock_location", "allow")
result = adb("shell", "am", "instrument", "-w", "com.musicmap.car.test/com.musicmap.car.SmokeInstrumentation", timeout=90)
(out / "smoke-result.txt").write_text(result, encoding="utf-8")
print(result)
assert "PASS 14 checks" in result, "Instrumentation failed; see build/verification/smoke-result.txt"
