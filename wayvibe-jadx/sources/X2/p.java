package X2;

import B2.AbstractC0111a;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            AbstractC0111a.m("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}
