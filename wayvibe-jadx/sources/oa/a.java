package oa;

import android.util.Log;
import io.flutter.plugins.firebase.firestore.RunnableC1983h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public org.maplibre.android.maps.renderer.a f23902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23903j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f23905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RunnableC1983h f23907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p096i8.c f23908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23909q;
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f23911t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public G2.e f23912u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final WeakReference f23913v;

    public a(WeakReference weakReference) {
        p096i8.c cVar = ((b) weakReference.get()).f23919a;
        this.f23905m = new ArrayList();
        this.f23906n = true;
        this.f23907o = null;
        this.f23900g = 0;
        this.f23901h = 0;
        this.f23903j = true;
        this.f23902i = org.maplibre.android.maps.renderer.a.WHEN_DIRTY;
        this.k = false;
        this.f23908p = cVar;
        this.f23913v = weakReference;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a() {
        RunnableC1983h runnableC1983h;
        boolean z10;
        b bVar;
        WeakReference weakReference = this.f23913v;
        G2.e eVar = new G2.e();
        eVar.f5366a = weakReference;
        this.f23912u = eVar;
        int i10 = 0;
        this.r = false;
        this.f23910s = false;
        this.k = false;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        int i15 = 0;
        int i16 = 0;
        RunnableC1983h runnableC1983h2 = null;
        while (true) {
            Runnable runnable = null;
            while (true) {
                try {
                    synchronized (this.f23908p) {
                        while (true) {
                            if (this.f23894a) {
                                synchronized (this.f23908p) {
                                    e();
                                    d();
                                }
                                return;
                            }
                            if (!this.f23905m.isEmpty()) {
                                runnable = (Runnable) this.f23905m.remove(i10);
                                break;
                            }
                            boolean z14 = this.f23897d;
                            boolean z15 = this.f23896c;
                            if (z14 != z15) {
                                this.f23897d = z15;
                                this.f23908p.notifyAll();
                            } else {
                                z15 = false;
                            }
                            if (z11) {
                                e();
                                d();
                                z11 = false;
                            }
                            if (z15 && this.f23910s) {
                                e();
                            }
                            if (z15 && this.r && ((bVar = (b) this.f23913v.get()) == null || !bVar.f23918j)) {
                                d();
                            }
                            if (!this.f23898e && !this.f23899f) {
                                if (this.f23910s) {
                                    e();
                                }
                                this.f23899f = true;
                                this.f23909q = false;
                                this.f23908p.notifyAll();
                            }
                            if (this.f23898e && this.f23899f) {
                                this.f23899f = false;
                                this.f23908p.notifyAll();
                            }
                            if (z12) {
                                this.k = false;
                                this.f23904l = true;
                                this.f23908p.notifyAll();
                                z12 = false;
                            }
                            RunnableC1983h runnableC1983h3 = this.f23907o;
                            if (runnableC1983h3 != null) {
                                this.f23907o = null;
                                runnableC1983h2 = runnableC1983h3;
                            }
                            if (b()) {
                                if (!this.r) {
                                    try {
                                        this.f23912u.z();
                                        this.r = true;
                                        this.f23908p.notifyAll();
                                        i11 = 1;
                                    } catch (RuntimeException unused) {
                                        this.f23908p.notifyAll();
                                        synchronized (this.f23908p) {
                                            e();
                                            d();
                                            return;
                                        }
                                    }
                                }
                                if (this.r && !this.f23910s) {
                                    this.f23910s = true;
                                    i12 = 1;
                                    i13 = 1;
                                    i14 = 1;
                                }
                                if (this.f23910s) {
                                    if (this.f23906n) {
                                        i15 = this.f23900g;
                                        i16 = this.f23901h;
                                        this.k = true;
                                        this.f23906n = false;
                                        i12 = 1;
                                        i14 = 1;
                                    }
                                    i10 = 0;
                                    this.f23903j = false;
                                    this.f23908p.notifyAll();
                                    if (!this.k) {
                                        break;
                                    }
                                    z13 = true;
                                    break;
                                }
                            } else if (runnableC1983h2 != null) {
                                Log.w("MapLibreSurfaceView", "Warning, !readyToDraw() but waiting for draw finished! Early reporting draw finished.");
                                runnableC1983h2.run();
                                runnableC1983h2 = null;
                            }
                            this.f23908p.wait();
                            i10 = 0;
                        }
                    }
                    if (runnable != null) {
                        break;
                    }
                    if (i12 != 0) {
                        if (this.f23912u.i()) {
                            synchronized (this.f23908p) {
                                this.f23911t = true;
                                this.f23908p.notifyAll();
                            }
                            i12 = i10;
                        } else {
                            synchronized (this.f23908p) {
                                this.f23911t = true;
                                this.f23909q = true;
                                this.f23908p.notifyAll();
                            }
                        }
                        synchronized (this.f23908p) {
                            e();
                            d();
                            throw th;
                        }
                    }
                    if (i13 != 0) {
                        i13 = i10;
                    }
                    if (i11 != 0) {
                        d dVar = (d) this.f23913v.get();
                        if (dVar != null) {
                            runnableC1983h = null;
                            dVar.f23920b.onSurfaceCreated(null);
                        } else {
                            runnableC1983h = null;
                        }
                        i11 = i10;
                    } else {
                        runnableC1983h = null;
                    }
                    if (i14 != 0) {
                        d dVar2 = (d) this.f23913v.get();
                        if (dVar2 != null) {
                            dVar2.f23920b.onSurfaceChanged(i15, i16);
                        }
                        i14 = i10;
                    }
                    d dVar3 = (d) this.f23913v.get();
                    if (dVar3 != null) {
                        dVar3.f23920b.onDrawFrame();
                        if (runnableC1983h2 != null) {
                            runnableC1983h2.run();
                            runnableC1983h2 = runnableC1983h;
                        }
                    }
                    G2.e eVar2 = this.f23912u;
                    int iEglGetError = !((EGL10) eVar2.f5367b).eglSwapBuffers((EGLDisplay) eVar2.f5368c, (EGLSurface) eVar2.f5369d) ? ((EGL10) eVar2.f5367b).eglGetError() : 12288;
                    if (iEglGetError == 12288) {
                        z10 = true;
                    } else if (iEglGetError != 12302) {
                        G2.e.q(iEglGetError, "eglSwapBuffers");
                        synchronized (this.f23908p) {
                            z10 = true;
                            this.f23909q = true;
                            this.f23908p.notifyAll();
                        }
                    } else {
                        z10 = true;
                        z11 = true;
                    }
                    if (z13) {
                        z12 = z10;
                        z13 = false;
                    }
                    i10 = 0;
                } catch (Throwable th) {
                    synchronized (this.f23908p) {
                        e();
                        d();
                        throw th;
                    }
                }
            }
            runnable.run();
        }
    }

    public final boolean b() {
        if (this.f23897d || !this.f23898e || this.f23900g <= 0 || this.f23901h <= 0) {
            return false;
        }
        return (this.f23903j || this.f23902i == org.maplibre.android.maps.renderer.a.CONTINUOUS) && !this.f23909q;
    }

    public final void c() {
        synchronized (this.f23908p) {
            this.f23894a = true;
            this.f23908p.notifyAll();
            while (!this.f23895b && isAlive()) {
                try {
                    this.f23908p.wait(100L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void d() {
        if (this.r) {
            G2.e eVar = this.f23912u;
            EGLDisplay eGLDisplay = (EGLDisplay) eVar.f5368c;
            if (eGLDisplay != null) {
                EGL10 egl10 = (EGL10) eVar.f5367b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            if (((EGLContext) eVar.f5371f) != null) {
                b bVar = (b) ((WeakReference) eVar.f5366a).get();
                if (bVar != null) {
                    bVar.f23916h.destroyContext((EGL10) eVar.f5367b, (EGLDisplay) eVar.f5368c, (EGLContext) eVar.f5371f);
                }
                eVar.f5371f = null;
            }
            EGLDisplay eGLDisplay2 = (EGLDisplay) eVar.f5368c;
            if (eGLDisplay2 != null) {
                ((EGL10) eVar.f5367b).eglTerminate(eGLDisplay2);
                eVar.f5368c = null;
            }
            this.r = false;
            this.f23908p.notifyAll();
        }
    }

    public final void e() {
        if (this.f23910s) {
            this.f23910s = false;
            this.f23912u.j();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        p096i8.c cVar = this.f23908p;
        setName("RenderThread " + getId());
        try {
            a();
        } catch (InterruptedException unused) {
        } finally {
            cVar.o(this);
        }
    }
}
