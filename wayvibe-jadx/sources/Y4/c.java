package Y4;

import X4.j;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Surface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f13353d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f13354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13355b;

    public c(b bVar, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.f13354a = bVar;
    }

    public static c a(Context context, boolean z10) {
        if (j.f13232a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        boolean z11 = false;
        X4.a.q(!z10 || b(context));
        b bVar = new b();
        bVar.start();
        bVar.f13347e = new Handler(bVar.getLooper(), bVar);
        synchronized (bVar) {
            bVar.f13347e.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
            while (bVar.f13351i == null && bVar.f13350h == null && bVar.f13349g == null) {
                try {
                    bVar.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bVar.f13350h;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = bVar.f13349g;
        if (error == null) {
            return bVar.f13351i;
        }
        throw error;
    }

    public static synchronized boolean b(Context context) {
        String strEglQueryString;
        try {
            if (!f13353d) {
                int i10 = j.f13232a;
                boolean z10 = false;
                if (i10 >= 24) {
                    if ((i10 >= 26 || !"samsung".equals(j.f13234c)) && (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")) {
                        z10 = true;
                    }
                }
                f13352c = z10;
                f13353d = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13352c;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f13354a) {
            try {
                if (!this.f13355b) {
                    this.f13354a.f13347e.sendEmptyMessage(3);
                    this.f13355b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
