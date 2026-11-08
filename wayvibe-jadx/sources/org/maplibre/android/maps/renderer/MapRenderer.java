package org.maplibre.android.maps.renderer;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.Keep;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.t;
import org.maplibre.android.maps.x;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class MapRenderer implements MapRendererScheduler {
    private static final String TAG = "Mbgl-MapRenderer";
    private t onFpsChangedListener;
    private long timeElapsed;
    private long nativePtr = 0;
    private double expectedRenderTime = 0.0d;

    static {
        p046da.a.a();
    }

    public MapRenderer(Context context, String str) {
        nativeInitialize(this, context.getResources().getDisplayMetrics().density, str);
    }

    public static MapRenderer create(x xVar, Context context, Runnable runnable) {
        String str = xVar.f25031C ? xVar.f25032D : null;
        return xVar.f25035G ? MapRendererFactory.newTextureViewMapRenderer(context, new TextureView(context), str, xVar.f25036H, runnable) : MapRendererFactory.newSurfaceViewMapRenderer(context, str, xVar.f25030B, runnable);
    }

    private native void nativeInitialize(MapRenderer mapRenderer, float f10, String str);

    private native void nativeOnSurfaceChanged(int i10, int i11);

    private native void nativeOnSurfaceCreated(Surface surface);

    private native void nativeOnSurfaceDestroyed();

    private native void nativeRender();

    private native void nativeSetSwapBehaviorFlush(boolean z10);

    private void updateFps() {
        long jNanoTime = System.nanoTime();
        if (this.timeElapsed > 0) {
            throw null;
        }
        this.timeElapsed = jNanoTime;
    }

    public native void finalize();

    public abstract a getRenderingRefreshMode();

    public abstract View getView();

    public native void nativeReset();

    public void onDestroy() {
    }

    public void onDrawFrame() {
        long jNanoTime = System.nanoTime();
        try {
            nativeRender();
        } catch (Error e2) {
            Logger.e(TAG, e2.getMessage());
        }
        double dNanoTime = System.nanoTime() - jNanoTime;
        double d10 = this.expectedRenderTime;
        if (dNanoTime < d10) {
            try {
                Thread.sleep((long) ((d10 - dNanoTime) / 1000000.0d));
            } catch (InterruptedException e4) {
                Logger.e(TAG, e4.getMessage());
            }
        }
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onSurfaceChanged(int i10, int i11) {
        nativeOnSurfaceChanged(i10, i11);
    }

    public void onSurfaceCreated(Surface surface) {
        nativeOnSurfaceCreated(surface);
    }

    public void onSurfaceDestroyed() {
        nativeOnSurfaceDestroyed();
    }

    public void queueEvent(MapRendererRunnable mapRendererRunnable) {
        queueEvent((Runnable) mapRendererRunnable);
    }

    public void setMaximumFps(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.expectedRenderTime = 1.0E9d / ((double) i10);
    }

    public void setOnFpsChangedListener(t tVar) {
    }

    public abstract void setRenderingRefreshMode(a aVar);

    public void setSwapBehaviorFlush(boolean z10) {
        nativeSetSwapBehaviorFlush(z10);
    }
}
