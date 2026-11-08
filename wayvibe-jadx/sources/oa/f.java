package oa;

import android.content.Context;
import android.view.View;
import org.maplibre.android.maps.renderer.MapRenderer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends MapRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23926a;

    public f(Context context, b bVar, String str) {
        super(context, str);
        this.f23926a = bVar;
        bVar.setDetachedListener(new e(this, 0));
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final org.maplibre.android.maps.renderer.a getRenderingRefreshMode() {
        return this.f23926a.getRenderingRefreshMode();
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final View getView() {
        return this.f23926a;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStart() {
        a aVar = this.f23926a.f23921c;
        synchronized (aVar.f23908p) {
            aVar.f23896c = false;
            aVar.f23903j = true;
            aVar.f23904l = false;
            aVar.f23908p.notifyAll();
            while (!aVar.f23895b && aVar.f23897d && !aVar.f23904l) {
                try {
                    aVar.f23908p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStop() {
        a aVar = this.f23926a.f23921c;
        synchronized (aVar.f23908p) {
            aVar.f23896c = true;
            aVar.f23908p.notifyAll();
            while (!aVar.f23895b && !aVar.f23897d) {
                try {
                    aVar.f23908p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void queueEvent(Runnable runnable) {
        a aVar = this.f23926a.f23921c;
        synchronized (aVar.f23908p) {
            aVar.f23905m.add(runnable);
            aVar.f23908p.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void requestRender() {
        a aVar = this.f23926a.f23921c;
        synchronized (aVar.f23908p) {
            aVar.f23903j = true;
            aVar.f23908p.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void setRenderingRefreshMode(org.maplibre.android.maps.renderer.a aVar) {
        this.f23926a.setRenderingRefreshMode(aVar);
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void waitForEmpty() {
        a aVar = this.f23926a.f23921c;
        synchronized (aVar.f23908p) {
            while (!aVar.f23905m.isEmpty()) {
                try {
                    aVar.f23908p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
