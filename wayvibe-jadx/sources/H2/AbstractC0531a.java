package H2;

import A6.AbstractC0093s;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: renamed from: H2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0531a {
    private static A6.I a() {
        A6.H h10 = new A6.H(4);
        Integer[] numArr = {8, 7};
        AbstractC0093s.b(2, numArr);
        h10.e(h10.f405b + 2);
        System.arraycopy(numArr, 0, h10.f404a, h10.f405b, 2);
        h10.f405b += 2;
        int i10 = B2.C.f560a;
        if (i10 >= 31) {
            Integer[] numArr2 = {26, 27};
            AbstractC0093s.b(2, numArr2);
            h10.e(h10.f405b + 2);
            System.arraycopy(numArr2, 0, h10.f404a, h10.f405b, 2);
            h10.f405b += 2;
        }
        if (i10 >= 33) {
            h10.a(30);
        }
        return h10.f();
    }

    public static boolean b(AudioManager audioManager, C0541k c0541k) {
        AudioDeviceInfo[] devices;
        if (c0541k == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c0541k.f5918a};
        }
        A6.I iA = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (iA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
