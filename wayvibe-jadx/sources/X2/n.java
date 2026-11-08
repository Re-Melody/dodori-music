package X2;

import B2.AbstractC0111a;
import B2.C;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f13135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f13136e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f13138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13139c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f13138b = mVar;
        this.f13137a = z10;
    }

    public static synchronized boolean a(Context context) {
        String strEglQueryString;
        int i10;
        try {
            if (!f13136e) {
                int i11 = C.f560a;
                if (i11 >= 24 && ((i11 >= 26 || !("samsung".equals(C.f562c) || "XT1650".equals(C.f563d))) && ((i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i10 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i10 = 0;
                }
                f13135d = i10;
                f13136e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13135d != 0;
    }

    public static n b(Context context, boolean z10) {
        boolean z11 = false;
        AbstractC0111a.h(!z10 || a(context));
        m mVar = new m("ExoPlayer:PlaceholderSurface");
        int i10 = z10 ? f13135d : 0;
        mVar.start();
        Handler handler = new Handler(mVar.getLooper(), mVar);
        mVar.f13131b = handler;
        mVar.f13130a = new B2.f(handler);
        synchronized (mVar) {
            mVar.f13131b.obtainMessage(1, i10, 0).sendToTarget();
            while (mVar.f13134e == null && mVar.f13133d == null && mVar.f13132c == null) {
                try {
                    mVar.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = mVar.f13133d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = mVar.f13132c;
        if (error != null) {
            throw error;
        }
        n nVar = mVar.f13134e;
        nVar.getClass();
        return nVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f13138b) {
            try {
                if (!this.f13139c) {
                    m mVar = this.f13138b;
                    mVar.f13131b.getClass();
                    mVar.f13131b.sendEmptyMessage(2);
                    this.f13139c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
