package pa;

import android.view.TextureView;
import android.view.View;
import org.maplibre.android.maps.renderer.MapRenderer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends MapRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f25360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextureView f25362c;

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final org.maplibre.android.maps.renderer.a getRenderingRefreshMode() {
        throw new RuntimeException("getRenderingRefreshMode is not supported for TextureViewMapRenderer. Use SurfaceViewMapRenderer to set the rendering refresh mode.");
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final View getView() {
        return this.f25362c;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onDestroy() {
        a aVar = this.f25360a;
        synchronized (aVar.f25347b) {
            aVar.f25356l = true;
            aVar.f25347b.notifyAll();
            while (!aVar.f25357m) {
                try {
                    aVar.f25347b.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStart() {
        a aVar = this.f25360a;
        synchronized (aVar.f25347b) {
            aVar.f25355j = false;
            aVar.f25347b.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStop() {
        a aVar = this.f25360a;
        synchronized (aVar.f25347b) {
            aVar.f25355j = true;
            aVar.f25347b.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void queueEvent(Runnable runnable) {
        a aVar = this.f25360a;
        if (runnable == null) {
            aVar.getClass();
            throw new IllegalArgumentException("runnable must not be null");
        }
        synchronized (aVar.f25347b) {
            aVar.f25348c.add(runnable);
            aVar.f25347b.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void requestRender() {
        a aVar = this.f25360a;
        synchronized (aVar.f25347b) {
            aVar.f25353h = true;
            aVar.f25347b.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void setRenderingRefreshMode(org.maplibre.android.maps.renderer.a aVar) {
        throw new RuntimeException("setRenderingRefreshMode is not supported for TextureViewMapRenderer. Use SurfaceViewMapRenderer to set the rendering refresh mode.");
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void waitForEmpty() {
        a aVar = this.f25360a;
        synchronized (aVar.f25347b) {
            while (!aVar.f25348c.isEmpty()) {
                try {
                    aVar.f25347b.wait(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
