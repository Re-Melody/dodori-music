package p143n0;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: renamed from: n0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2081h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f22772a;

    public C2081h(Bitmap bitmap) {
        this.f22772a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.f22772a.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i10 < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
