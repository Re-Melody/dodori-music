package pa;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.maplibre.android.log.Logger;
import p011a7.z;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Thread implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.maplibre.android.maps.renderer.b f25346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25347b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f25348c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SurfaceTexture f25349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25355j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z f25358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25359o;

    public a(TextureView textureView, org.maplibre.android.maps.renderer.b bVar) {
        textureView.setOpaque(!bVar.f25361b);
        textureView.setSurfaceTextureListener(this);
        this.f25346a = bVar;
        WeakReference weakReference = new WeakReference(textureView);
        boolean z10 = bVar.f25361b;
        z zVar = new z();
        zVar.f14294e = EGL10.EGL_NO_DISPLAY;
        zVar.f14295f = EGL10.EGL_NO_CONTEXT;
        zVar.f14296g = EGL10.EGL_NO_SURFACE;
        zVar.f14291b = weakReference;
        zVar.f14290a = z10;
        this.f25358n = zVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        synchronized (this.f25347b) {
            this.f25349d = surfaceTexture;
            this.f25351f = i10;
            this.f25352g = i11;
            this.f25353h = true;
            this.f25347b.notifyAll();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.f25347b) {
            this.f25349d = null;
            this.k = true;
            this.f25353h = false;
            this.f25347b.notifyAll();
            while (this.f25350e) {
                try {
                    this.f25347b.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        synchronized (this.f25347b) {
            this.f25351f = i10;
            this.f25352g = i11;
            this.f25354i = true;
            this.f25353h = true;
            this.f25347b.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i10;
        Runnable runnable;
        boolean z10;
        boolean z11;
        int i11;
        while (true) {
            try {
                synchronized (this.f25347b) {
                    while (true) {
                        if (this.f25356l) {
                            this.f25358n.f();
                            synchronized (this.f25347b) {
                                this.f25350e = false;
                                this.f25357m = true;
                                this.f25347b.notifyAll();
                            }
                            return;
                        }
                        i10 = -1;
                        if (this.f25348c.isEmpty()) {
                            if (this.k) {
                                this.f25358n.j();
                                this.k = false;
                                this.f25350e = false;
                                this.f25347b.notifyAll();
                            } else {
                                if (this.f25359o) {
                                    this.f25358n.i();
                                    this.f25359o = false;
                                } else if (this.f25349d == null || this.f25355j || !this.f25353h) {
                                    this.f25347b.wait();
                                } else {
                                    i10 = this.f25351f;
                                    int i12 = this.f25352g;
                                    z zVar = this.f25358n;
                                    if (((EGLContext) zVar.f14295f) == EGL10.EGL_NO_CONTEXT) {
                                        this.f25350e = true;
                                        z10 = true;
                                        z11 = false;
                                    } else if (((EGLSurface) zVar.f14296g) == EGL10.EGL_NO_SURFACE) {
                                        this.f25350e = true;
                                        z11 = true;
                                        z10 = false;
                                    } else {
                                        this.f25353h = false;
                                        z10 = false;
                                        z11 = false;
                                    }
                                    i11 = i12;
                                }
                                runnable = null;
                            }
                            z10 = false;
                            z11 = false;
                            i11 = -1;
                            runnable = null;
                        } else {
                            runnable = (Runnable) this.f25348c.remove(0);
                            z10 = false;
                            z11 = false;
                            i11 = -1;
                        }
                    }
                }
                if (runnable != null) {
                    runnable.run();
                } else {
                    if (z10) {
                        this.f25358n.q();
                        synchronized (this.f25347b) {
                            try {
                                if (this.f25358n.h()) {
                                    this.f25346a.onSurfaceCreated(null);
                                    this.f25346a.onSurfaceChanged(i10, i11);
                                } else {
                                    this.k = true;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else if (z11) {
                        synchronized (this.f25347b) {
                            this.f25358n.h();
                        }
                        this.f25346a.onSurfaceChanged(i10, i11);
                    } else if (this.f25354i) {
                        this.f25346a.onSurfaceChanged(i10, i11);
                        this.f25354i = false;
                    } else if (((EGLSurface) this.f25358n.f14296g) != EGL10.EGL_NO_SURFACE) {
                        this.f25346a.onDrawFrame();
                        z zVar2 = this.f25358n;
                        int iEglGetError = !((EGL10) zVar2.f14292c).eglSwapBuffers((EGLDisplay) zVar2.f14294e, (EGLSurface) zVar2.f14296g) ? ((EGL10) zVar2.f14292c).eglGetError() : 12288;
                        if (iEglGetError == 12288) {
                            continue;
                        } else if (iEglGetError != 12302) {
                            Logger.w("Mbgl-TextureViewRenderThread", "eglSwapBuffer error: " + iEglGetError + ". Waiting or new surface");
                            synchronized (this.f25347b) {
                                this.f25349d = null;
                                this.k = true;
                            }
                        } else {
                            Logger.w("Mbgl-TextureViewRenderThread", "Context lost. Waiting for re-aquire");
                            synchronized (this.f25347b) {
                                this.f25349d = null;
                                this.k = true;
                                this.f25359o = true;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f25358n.f();
                synchronized (this.f25347b) {
                    this.f25350e = false;
                    this.f25357m = true;
                    this.f25347b.notifyAll();
                    return;
                }
            } catch (Throwable th2) {
                this.f25358n.f();
                synchronized (this.f25347b) {
                    this.f25350e = false;
                    this.f25357m = true;
                    this.f25347b.notifyAll();
                    throw th2;
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
