"""Generate original synthetic demo music. No samples or commercial recordings.
Run from any directory: python tools/generate_demo_audio.py
"""
from pathlib import Path
import array
import math
import wave

OUTPUT = Path(__file__).resolve().parents[1] / "app/src/main/assets/audio"
OUTPUT.mkdir(parents=True, exist_ok=True)
RATE, SECONDS = 16000, 24
SONGS = {
    "river": (60, 84), "city": (64, 112), "walls": (57, 80),
    "road": (62, 108), "lake": (65, 76), "forest": (67, 104),
}

def frequency(midi):
    return 440 * 2 ** ((midi - 69) / 12)

for name, (root, bpm) in SONGS.items():
    samples = array.array("h")
    beat = 60 / bpm
    melody = [0, 4, 7, 12, 7, 4, 2, 7, 4, 9, 7, 4, 2, 4, 7, 2]
    for i in range(RATE * SECONDS):
        t = i / RATE
        step = int(t / beat)
        phase = t % beat
        chord_root = root + [0, -5, -3, -7][(step // 4) % 4]
        chord = sum(math.sin(2 * math.pi * frequency(chord_root + n) * t) for n in [0, 4, 7]) / 3
        note = frequency(root + 12 + melody[step % len(melody)])
        envelope = (1 - math.exp(-phase * 60)) * math.exp(-phase * 5)
        lead = (math.sin(2 * math.pi * note * t) + .2 * math.sin(4 * math.pi * note * t)) * envelope
        fade = min(1, t / .8, (SECONDS - t) / 1.2)
        samples.append(int(11000 * fade * (.35 * chord + .55 * lead)))
    with wave.open(str(OUTPUT / f"{name}.wav"), "wb") as file:
        file.setnchannels(1); file.setsampwidth(2); file.setframerate(RATE)
        file.writeframes(samples.tobytes())
print(f"Generated {len(SONGS)} original demo tracks in {OUTPUT}")
