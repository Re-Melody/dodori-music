package org.maplibre.android.maps.renderer.egl;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    Format16Bit(3),
    Format32BitNoAlpha(1),
    Format32BitAlpha(2),
    Format24Bit(0),
    Unknown(4);

    int value;

    b(int i10) {
        this.value = i10;
    }
}
