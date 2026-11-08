package org.maplibre.android.maps;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements InterfaceC2207e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f25069a;

    public y(MapView mapView) {
        this.f25069a = mapView;
    }

    @Override // org.maplibre.android.maps.InterfaceC2207e
    public final void a(PointF pointF) {
        this.f25069a.f24866l = pointF;
    }
}
