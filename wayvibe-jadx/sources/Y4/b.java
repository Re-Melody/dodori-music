package Y4;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class b extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f13343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EGLDisplay f13344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLContext f13345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLSurface f13346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f13347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f13348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Error f13349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RuntimeException f13350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f13351i;

    public b() {
        super("dummySurface");
        this.f13343a = new int[1];
    }

    public final void a() {
        try {
            SurfaceTexture surfaceTexture = this.f13348f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f13343a, 0);
            }
        } finally {
            EGLSurface eGLSurface = this.f13346d;
            if (eGLSurface != null) {
                EGL14.eglDestroySurface(this.f13344b, eGLSurface);
            }
            EGLContext eGLContext = this.f13345c;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f13344b, eGLContext);
            }
            this.f13346d = null;
            this.f13345c = null;
            this.f13344b = null;
            this.f13351i = null;
            this.f13348f = null;
        }
    }

    public final void b(boolean z10) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f13344b = eGLDisplayEglGetDisplay;
        X4.a.r(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        X4.a.r(EGL14.eglInitialize(this.f13344b, iArr, 0, iArr, 1), "eglInitialize failed");
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        X4.a.r(EGL14.eglChooseConfig(this.f13344b, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f13344b, eGLConfig, EGL14.EGL_NO_CONTEXT, z10 ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
        this.f13345c = eGLContextEglCreateContext;
        X4.a.r(eGLContextEglCreateContext != null, "eglCreateContext failed");
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f13344b, eGLConfig, z10 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
        this.f13346d = eGLSurfaceEglCreatePbufferSurface;
        X4.a.r(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        EGLDisplay eGLDisplay = this.f13344b;
        EGLSurface eGLSurface = this.f13346d;
        X4.a.r(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f13345c), "eglMakeCurrent failed");
        int[] iArr3 = this.f13343a;
        GLES20.glGenTextures(1, iArr3, 0);
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f13348f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f13351i = new c(this, this.f13348f);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    try {
                        b(message.arg1 != 0);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (Error e2) {
                        this.f13349g = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (RuntimeException e4) {
                    this.f13350h = e4;
                    synchronized (this) {
                        notify();
                    }
                }
            } else {
                if (i10 == 2) {
                    this.f13348f.updateTexImage();
                    return true;
                }
                if (i10 == 3) {
                    try {
                        a();
                        quit();
                        return true;
                    } catch (Throwable unused) {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f13347e.sendEmptyMessage(2);
    }
}
