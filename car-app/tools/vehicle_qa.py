"""Run isolated vehicle-related Android checks on one disposable standard emulator.

Uses real MediaBrowser, MediaController, MediaPlayer, audio focus and app restarts.
Does not claim Pleos, real GPS driving, vehicle UX, or vehicle audio hardware coverage.
"""
import argparse
import re
import subprocess
import time
from pathlib import Path

parser = argparse.ArgumentParser()
parser.add_argument("--adb", default="adb")
parser.add_argument("--label", default="vehicle-qa")
parser.add_argument("--offline", action="store_true", help="Temporarily disable emulator Wi-Fi and mobile data, restoring both afterward")
parser.add_argument("--suites", nargs="+", default=["smoke", "cold-start", "system-stop", "queue", "focus", "media", "lifecycle", "permissions"])
args = parser.parse_args()
root = Path(__file__).resolve().parents[1]
out = root / "build" / "verification" / args.label
out.mkdir(parents=True, exist_ok=True)


def adb(*parts, timeout=30):
    return subprocess.check_output([args.adb, *parts], timeout=timeout).decode("utf-8", "replace")


devices = [line.split()[0] for line in adb("devices").splitlines()[1:] if line.endswith("\tdevice")]
assert len(devices) == 1 and devices[0].startswith("emulator-"), "Use one disposable emulator only"
adb("shell", "pm", "grant", "com.musicmap.car", "android.permission.POST_NOTIFICATIONS")
failed = []
total = 0
network_settings = {}
try:
    if args.offline:
        for service, setting in (("wifi", "wifi_on"), ("data", "mobile_data")):
            original = adb("shell", "settings", "get", "global", setting).strip()
            assert original in ("0", "1"), f"Unknown original setting: {setting}={original}"
            network_settings[service] = original
            adb("shell", "svc", service, "disable")
        for _ in range(20):
            connectivity = adb("shell", "dumpsys", "connectivity")
            if "Active default network: none" in connectivity:
                break
            time.sleep(0.5)
        else:
            raise AssertionError("Emulator still has a default network")
        (out / "network.txt").write_text(connectivity, encoding="utf-8")
        print("Confirmed offline: no active default network", flush=True)
    for suite in args.suites:
        adb("shell", "am", "force-stop", "com.musicmap.car")
        for permission in ("ACCESS_FINE_LOCATION", "ACCESS_COARSE_LOCATION"):
            adb("shell", "pm", "revoke" if suite == "permissions" else "grant", "com.musicmap.car", "android.permission." + permission)
        adb("shell", "appops", "set", "com.musicmap.car", "android:mock_location", "allow")
        result = adb("shell", "am", "instrument", "-w", "-e", "suite", suite,
                     "com.musicmap.car.test/com.musicmap.car.SmokeInstrumentation", timeout=120)
        (out / f"{suite}.txt").write_text(result, encoding="utf-8")
        match = re.search(r"PASS (\d+) checks", result)
        if match and "FAIL" not in result and "Process crashed" not in result:
            total += int(match[1])
            print(f"PASS {suite}: {match[1]} checks", flush=True)
        else:
            failed.append(suite)
            print(result, flush=True)
    summary = f"{len(args.suites) - len(failed)}/{len(args.suites)} suites passed; {total} checks passed; failures: {', '.join(failed) or 'none'}"
    (out / "summary.txt").write_text(summary + "\n", encoding="utf-8")
    print(summary, flush=True)
finally:
    adb("shell", "am", "force-stop", "com.musicmap.car")
    for permission in ("ACCESS_FINE_LOCATION", "ACCESS_COARSE_LOCATION"):
        adb("shell", "pm", "grant", "com.musicmap.car", "android.permission." + permission)
    for service, original in network_settings.items():
        adb("shell", "svc", service, "enable" if original == "1" else "disable")
raise SystemExit(bool(failed))
