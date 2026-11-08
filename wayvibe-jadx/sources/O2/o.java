package O2;

import android.hardware.biometrics.BiometricManager;
import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static /* bridge */ /* synthetic */ BiometricManager e(Object obj) {
        return (BiometricManager) obj;
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g(int i10, int i11, int i12) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, i12);
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return BiometricManager.class;
    }

    public static /* synthetic */ void i() {
    }
}
