package org.maplibre.android.style.layers;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public class CustomLayer extends Layer {
    @Keep
    public CustomLayer(long j10) {
        super(j10);
    }

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    public native void finalize();

    @Keep
    public native void initialize(String str, long j10);

    @Keep
    @Deprecated
    public void update() {
    }
}
