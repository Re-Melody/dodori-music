package org.maplibre.android.location;

import android.animation.TypeEvaluator;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: renamed from: org.maplibre.android.location.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2195b implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f24663a = new LatLng();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        LatLng latLng = (LatLng) obj;
        LatLng latLng2 = (LatLng) obj2;
        double dG = latLng.g();
        double dG2 = latLng2.g() - latLng.g();
        double d10 = f10;
        LatLng latLng3 = this.f24663a;
        latLng3.l((dG2 * d10) + dG);
        latLng3.m(((latLng2.k() - latLng.k()) * d10) + latLng.k());
        return latLng3;
    }
}
