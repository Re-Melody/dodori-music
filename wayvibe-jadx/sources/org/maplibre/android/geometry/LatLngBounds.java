package org.maplibre.android.geometry;

import U.C0899m0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.auth.api.identity.v;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import kotlin.jvm.internal.m;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p109ja.a;
import p109ja.b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class LatLngBounds implements Parcelable {

    @Keep
    public final double latitudeNorth;

    @Keep
    public final double latitudeSouth;

    @Keep
    public final double longitudeEast;

    @Keep
    public final double longitudeWest;
    public static final a Companion = new a();
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new v(19);

    @Keep
    public LatLngBounds(double d10, double d11, double d12, double d13) {
        this.latitudeNorth = d10;
        this.longitudeEast = d11;
        this.latitudeSouth = d12;
        this.longitudeWest = d13;
    }

    private final boolean containsLatitude(double d10) {
        return d10 <= this.latitudeNorth && d10 >= this.latitudeSouth;
    }

    private final boolean containsLongitude(double d10) {
        return d10 <= this.longitudeEast && d10 >= this.longitudeWest;
    }

    public static final LatLngBounds from(double d10, double d11, double d12, double d13) {
        Companion.getClass();
        a.a(d10, d11, d12, d13);
        return new LatLngBounds(d10, d11, d12, d13);
    }

    private final LatLngBounds intersectNoParamCheck(double d10, double d11, double d12, double d13) {
        double dMax = Math.max(this.longitudeWest, d13);
        double dMin = Math.min(this.longitudeEast, d11);
        if (dMin < dMax) {
            return null;
        }
        double dMax2 = Math.max(this.latitudeSouth, d12);
        double dMin2 = Math.min(this.latitudeNorth, d10);
        if (dMin2 >= dMax2) {
            return new LatLngBounds(dMin2, dMin, dMax2, dMax);
        }
        return null;
    }

    private final LatLngBounds unionNoParamCheck(double d10, double d11, double d12, double d13) {
        double d14 = this.latitudeNorth;
        if (d14 < d10) {
            d14 = d10;
        }
        double d15 = this.longitudeEast;
        double d16 = d15 < d11 ? d11 : d15;
        double d17 = this.latitudeSouth;
        double d18 = d17 > d12 ? d12 : d17;
        double d19 = this.longitudeWest;
        return new LatLngBounds(d14, d16, d18, d19 > d13 ? d13 : d19);
    }

    public static final LatLngBounds world() {
        Companion.getClass();
        a.a(90.0d, 180.0d, -90.0d, -180.0d);
        return new LatLngBounds(90.0d, 180.0d, -90.0d, -180.0d);
    }

    public final boolean contains(LatLng latLng) {
        m.f(latLng, "latLng");
        return containsLatitude(latLng.g()) && containsLongitude(latLng.k());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            if (this.latitudeNorth == latLngBounds.latitudeNorth && this.latitudeSouth == latLngBounds.latitudeSouth && this.longitudeEast == latLngBounds.longitudeEast && this.longitudeWest == latLngBounds.longitudeWest) {
                return true;
            }
        }
        return false;
    }

    public final LatLng getCenter() {
        return new LatLng((this.latitudeNorth + this.latitudeSouth) / 2.0d, (this.longitudeEast + this.longitudeWest) / 2.0d);
    }

    public final double getLatNorth() {
        return this.latitudeNorth;
    }

    public final double getLatSouth() {
        return this.latitudeSouth;
    }

    public final double getLatitudeSpan() {
        return Math.abs(this.latitudeNorth - this.latitudeSouth);
    }

    public final double getLonEast() {
        return this.longitudeEast;
    }

    public final double getLonWest() {
        return this.longitudeWest;
    }

    public final double getLongitudeSpan() {
        return Math.abs(this.longitudeEast - this.longitudeWest);
    }

    public final LatLng getNorthEast() {
        return new LatLng(this.latitudeNorth, this.longitudeEast);
    }

    public final LatLng getNorthWest() {
        return new LatLng(this.latitudeNorth, this.longitudeWest);
    }

    public final LatLng getSouthEast() {
        return new LatLng(this.latitudeSouth, this.longitudeEast);
    }

    public final LatLng getSouthWest() {
        return new LatLng(this.latitudeSouth, this.longitudeWest);
    }

    public final b getSpan() {
        double latitudeSpan = getLatitudeSpan();
        double longitudeSpan = getLongitudeSpan();
        b bVar = new b();
        bVar.f21534a = latitudeSpan;
        bVar.f21535b = longitudeSpan;
        return bVar;
    }

    public int hashCode() {
        double d10 = 90;
        double d11 = ((this.latitudeSouth + d10) * ((double) PipesIterator.DEFAULT_QUEUE_SIZE)) + this.latitudeNorth + d10;
        double d12 = this.longitudeEast;
        double d13 = SensibleDefaults.X_OFFSET;
        return (int) (((this.longitudeWest + d13) * ((double) 1000000000)) + ((d12 + d13) * ((double) 1000000)) + d11);
    }

    public final LatLngBounds include(LatLng latLng) {
        m.f(latLng, "latLng");
        C0899m0 c0899m0 = new C0899m0(2);
        c0899m0.e(getNorthEast());
        c0899m0.e(getSouthWest());
        c0899m0.e(latLng);
        return c0899m0.b();
    }

    public final LatLngBounds intersect(LatLngBounds box) {
        m.f(box, "box");
        return intersectNoParamCheck(box.latitudeNorth, box.longitudeEast, box.latitudeSouth, box.longitudeWest);
    }

    public final boolean isEmptySpan() {
        return getLongitudeSpan() == 0.0d || getLatitudeSpan() == 0.0d;
    }

    public final LatLng[] toLatLngs() {
        return new LatLng[]{getNorthEast(), getSouthWest()};
    }

    public String toString() {
        return "N:" + this.latitudeNorth + "; E:" + this.longitudeEast + "; S:" + this.latitudeSouth + "; W:" + this.longitudeWest;
    }

    public final LatLngBounds union(LatLngBounds bounds) {
        m.f(bounds, "bounds");
        return unionNoParamCheck(bounds.latitudeNorth, bounds.longitudeEast, bounds.latitudeSouth, bounds.longitudeWest);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeDouble(this.latitudeNorth);
        out.writeDouble(this.longitudeEast);
        out.writeDouble(this.latitudeSouth);
        out.writeDouble(this.longitudeWest);
    }

    public final boolean contains(LatLngBounds other) {
        m.f(other, "other");
        return contains(other.getNorthEast()) && contains(other.getSouthWest());
    }

    public final LatLngBounds intersect(double d10, double d11, double d12, double d13) {
        Companion.getClass();
        a.a(d10, d11, d12, d13);
        LatLngBounds latLngBoundsIntersectNoParamCheck = intersectNoParamCheck(d10, d11, d12, d13);
        m.c(latLngBoundsIntersectNoParamCheck);
        return latLngBoundsIntersectNoParamCheck;
    }

    public final LatLngBounds union(double d10, double d11, double d12, double d13) {
        Companion.getClass();
        a.a(d10, d11, d12, d13);
        return unionNoParamCheck(d10, d11, d12, d13);
    }

    public static final LatLngBounds from(int i10, int i11, int i12) {
        Companion.getClass();
        double d10 = i10;
        return new LatLngBounds(a.b(i10, i12), ((((double) (i11 + 1)) / Math.pow(2.0d, d10)) * 360.0d) - 180.0d, a.b(i10, i12 + 1), ((((double) i11) / Math.pow(2.0d, d10)) * 360.0d) - 180.0d);
    }
}
