package X2;

import B2.AbstractC0111a;
import B2.C;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class m extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B2.f f13130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f13131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Error f13132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RuntimeException f13133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f13134e;

    public final void a(int i10) throws B2.g {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f13130a.getClass();
        B2.f fVar = this.f13130a;
        fVar.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC0111a.e("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC0111a.e("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        fVar.f586c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, B2.f.f583g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z10 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i11 = C.f560a;
        AbstractC0111a.e(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(fVar.f586c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC0111a.e("eglCreateContext failed", eGLContextEglCreateContext != null);
        fVar.f587d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = fVar.f586c;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC0111a.e("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC0111a.e("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        fVar.f588e = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = fVar.f585b;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        boolean z11 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z11) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z11 = true;
        }
        if (z11) {
            throw new B2.g(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        fVar.f589f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(fVar);
        SurfaceTexture surfaceTexture2 = this.f13130a.f589f;
        surfaceTexture2.getClass();
        this.f13134e = new n(this, surfaceTexture2, i10 != 0);
    }

    public final void b() {
        this.f13130a.getClass();
        B2.f fVar = this.f13130a;
        fVar.f584a.removeCallbacks(fVar);
        try {
            SurfaceTexture surfaceTexture = fVar.f589f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, fVar.f585b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = fVar.f586c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = fVar.f586c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = fVar.f588e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(fVar.f586c, fVar.f588e);
            }
            EGLContext eGLContext = fVar.f587d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(fVar.f586c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = fVar.f586c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(fVar.f586c);
            }
            fVar.f586c = null;
            fVar.f587d = null;
            fVar.f588e = null;
            fVar.f589f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (B2.g e2) {
                    AbstractC0111a.m("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f13133d = new IllegalStateException(e2);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e4) {
                    AbstractC0111a.m("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.f13132c = e4;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e7) {
                    AbstractC0111a.m("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f13133d = e7;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        AbstractC0111a.m("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
