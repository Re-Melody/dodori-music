package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.auth.api.identity.v;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class LatLngQuad implements Parcelable {
    public static final Parcelable.Creator<LatLngQuad> CREATOR = new v(20);

    @Keep
    private final LatLng bottomLeft;

    @Keep
    private final LatLng bottomRight;

    @Keep
    private final LatLng topLeft;

    @Keep
    private final LatLng topRight;

    @Keep
    public LatLngQuad(LatLng topLeft, LatLng topRight, LatLng bottomRight, LatLng bottomLeft) {
        m.f(topLeft, "topLeft");
        m.f(topRight, "topRight");
        m.f(bottomRight, "bottomRight");
        m.f(bottomLeft, "bottomLeft");
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomRight = bottomRight;
        this.bottomLeft = bottomLeft;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LatLngQuad.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.d(obj, "null cannot be cast to non-null type org.maplibre.android.geometry.LatLngQuad");
        LatLngQuad latLngQuad = (LatLngQuad) obj;
        return m.b(this.topLeft, latLngQuad.topLeft) && m.b(this.topRight, latLngQuad.topRight) && m.b(this.bottomRight, latLngQuad.bottomRight) && m.b(this.bottomLeft, latLngQuad.bottomLeft);
    }

    public final int hashCode() {
        return this.bottomLeft.hashCode() + ((this.bottomRight.hashCode() + ((this.topRight.hashCode() + (this.topLeft.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        this.topLeft.writeToParcel(out, i10);
        this.topRight.writeToParcel(out, i10);
        this.bottomRight.writeToParcel(out, i10);
        this.bottomLeft.writeToParcel(out, i10);
    }
}
