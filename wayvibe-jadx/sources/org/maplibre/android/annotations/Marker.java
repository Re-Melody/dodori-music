package org.maplibre.android.annotations;

import androidx.annotation.Keep;
import org.maplibre.android.geometry.LatLng;
import p054ea.a;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class Marker extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24630b;

    @Keep
    private String iconId;

    @Keep
    private LatLng position;

    public final LatLng a() {
        return this.position;
    }

    public final String toString() {
        return "Marker [position[" + this.position + "]]";
    }
}
