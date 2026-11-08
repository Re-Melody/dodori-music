package oa;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.plugins.firebase.firestore.RunnableC1983h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends SurfaceView implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p096i8.c f23919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f23920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f23921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f23922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23923e;

    public d(Context context) {
        super(context);
        this.f23919a = new p096i8.c();
        SurfaceHolder holder = getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    public final void finalize() throws Throwable {
        try {
            a aVar = this.f23921c;
            if (aVar != null && aVar.isAlive()) {
                this.f23921c.c();
            }
        } finally {
            super.finalize();
        }
    }

    public org.maplibre.android.maps.renderer.a getRenderingRefreshMode() {
        org.maplibre.android.maps.renderer.a aVar;
        a aVar2 = this.f23921c;
        synchronized (aVar2.f23908p) {
            aVar = aVar2.f23902i;
        }
        return aVar;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        org.maplibre.android.maps.renderer.a aVar;
        super.onAttachedToWindow();
        if (this.f23923e && this.f23920b != null) {
            org.maplibre.android.maps.renderer.a aVar2 = org.maplibre.android.maps.renderer.a.WHEN_DIRTY;
            a aVar3 = this.f23921c;
            if (aVar3 != null) {
                synchronized (aVar3.f23908p) {
                    aVar = aVar3.f23902i;
                }
            } else {
                aVar = aVar2;
            }
            b bVar = (b) this;
            bVar.f23921c = new a(bVar.f23914f);
            if (aVar != aVar2) {
                a aVar4 = this.f23921c;
                synchronized (aVar4.f23908p) {
                    aVar4.f23902i = aVar;
                    aVar4.f23908p.notifyAll();
                }
            }
            this.f23921c.start();
        }
        this.f23923e = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        c cVar = this.f23922d;
        if (cVar != null) {
            ((f) ((e) cVar).f23925b).nativeReset();
        }
        a aVar = this.f23921c;
        if (aVar != null && aVar.isAlive()) {
            this.f23921c.c();
        }
        this.f23923e = true;
        super.onDetachedFromWindow();
    }

    public void setDetachedListener(c cVar) {
        if (this.f23922d != null) {
            throw new IllegalArgumentException("Detached from window listener has been already set.");
        }
        this.f23922d = cVar;
    }

    public void setRenderer(f fVar) {
        if (this.f23921c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        this.f23920b = fVar;
        b bVar = (b) this;
        bVar.f23921c = new a(bVar.f23914f);
        this.f23921c.start();
    }

    public void setRenderingRefreshMode(org.maplibre.android.maps.renderer.a aVar) {
        a aVar2 = this.f23921c;
        synchronized (aVar2.f23908p) {
            aVar2.f23902i = aVar;
            aVar2.f23908p.notifyAll();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        a aVar = this.f23921c;
        synchronized (aVar.f23908p) {
            try {
                aVar.f23900g = i11;
                aVar.f23901h = i12;
                aVar.f23906n = true;
                aVar.f23903j = true;
                aVar.f23904l = false;
                if (Thread.currentThread() == aVar) {
                    return;
                }
                aVar.f23908p.notifyAll();
                while (!aVar.f23895b && !aVar.f23897d && !aVar.f23904l && aVar.r && aVar.f23910s && aVar.b()) {
                    try {
                        aVar.f23908p.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        a aVar = this.f23921c;
        synchronized (aVar.f23908p) {
            aVar.f23898e = true;
            aVar.f23911t = false;
            aVar.f23908p.notifyAll();
            while (aVar.f23899f && !aVar.f23911t && !aVar.f23895b) {
                try {
                    aVar.f23908p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        a aVar = this.f23921c;
        synchronized (aVar.f23908p) {
            aVar.f23898e = false;
            aVar.f23908p.notifyAll();
            while (!aVar.f23895b && !aVar.f23899f) {
                try {
                    aVar.f23908p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        a aVar = this.f23921c;
        if (aVar != null) {
            synchronized (aVar.f23908p) {
                try {
                    if (Thread.currentThread() == aVar) {
                        return;
                    }
                    aVar.k = true;
                    aVar.f23903j = true;
                    aVar.f23904l = false;
                    aVar.f23907o = new RunnableC1983h(10, aVar.f23907o, runnable);
                    aVar.f23908p.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
