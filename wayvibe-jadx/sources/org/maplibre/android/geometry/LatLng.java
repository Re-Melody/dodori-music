package org.maplibre.android.geometry;

import Da.a;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.auth.api.identity.v;
import kotlin.jvm.internal.m;
import org.maplibre.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class LatLng implements Parcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new v(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f24632a;

    @Keep
    private double latitude;

    @Keep
    private double longitude;

    public LatLng() {
        l(0.0d);
        m(0.0d);
    }

    public final double a(LatLng other) {
        m.f(other, "other");
        Point pointFromLngLat = Point.fromLngLat(this.longitude, this.latitude);
        Point pointFromLngLat2 = Point.fromLngLat(other.longitude, other.latitude);
        double dA = a.a(pointFromLngLat2.latitude() - pointFromLngLat.latitude());
        double dA2 = a.a(pointFromLngLat2.longitude() - pointFromLngLat.longitude());
        double dA3 = a.a(pointFromLngLat.latitude());
        double dA4 = a.a(pointFromLngLat2.latitude());
        double dCos = (Math.cos(dA4) * Math.cos(dA3) * Math.pow(Math.sin(dA2 / 2.0d), 2.0d)) + Math.pow(Math.sin(dA / 2.0d), 2.0d);
        return ((Double) a.f2873a.get("metres")).doubleValue() * Math.atan2(Math.sqrt(dCos), Math.sqrt(1.0d - dCos)) * 2.0d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LatLng.class.equals(obj.getClass())) {
            LatLng latLng = (LatLng) obj;
            if (Double.compare(latLng.f24632a, this.f24632a) == 0 && Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0) {
                return true;
            }
        }
        return false;
    }

    public final double g() {
        return this.latitude;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i10 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f24632a);
        return (i10 * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3));
    }

    public final double k() {
        return this.longitude;
    }

    public final void l(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        }
        if (Math.abs(d10) > 90.0d) {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
        this.latitude = d10;
    }

    public final void m(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        }
        if (Double.isInfinite(d10)) {
            throw new IllegalArgumentException("longitude must not be infinite");
        }
        this.longitude = d10;
    }

    public final String toString() {
        return "LatLng [latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.f24632a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeDouble(this.latitude);
        out.writeDouble(this.longitude);
        out.writeDouble(this.f24632a);
    }

    @Keep
    public LatLng(double d10, double d11) {
        l(d10);
        m(d11);
    }

    public LatLng(Location location) {
        m.f(location, "location");
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        double altitude = location.getAltitude();
        l(latitude);
        m(longitude);
        this.f24632a = altitude;
    }

    public LatLng(Parcel parcel) {
        l(parcel.readDouble());
        m(parcel.readDouble());
        this.f24632a = parcel.readDouble();
    }
}
