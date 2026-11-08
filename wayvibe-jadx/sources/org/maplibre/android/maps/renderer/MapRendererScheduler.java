package org.maplibre.android.maps.renderer;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public interface MapRendererScheduler {
    @Keep
    void queueEvent(Runnable runnable);

    @Keep
    void requestRender();

    @Keep
    void waitForEmpty();
}
