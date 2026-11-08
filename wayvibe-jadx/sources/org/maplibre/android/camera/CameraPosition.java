package org.maplibre.android.camera;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.auth.api.identity.v;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraPosition implements Parcelable {

    @Keep
    public final double bearing;

    @Keep
    public final double[] padding;

    @Keep
    public final LatLng target;

    @Keep
    public final double tilt;

    @Keep
    public final double zoom;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CameraPosition f24631a = new CameraPosition(new LatLng(), 0.0d, 0.0d, 0.0d, new double[]{0.0d, 0.0d, 0.0d, 0.0d});
    public static final Parcelable.Creator<CameraPosition> CREATOR = new v(16);

    @Keep
    public CameraPosition(LatLng latLng, double d10, double d11, double d12, double[] dArr) {
        this.target = latLng;
        this.zoom = d10;
        this.tilt = d11;
        this.bearing = d12;
        this.padding = dArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CameraPosition.class.equals(obj.getClass())) {
            CameraPosition cameraPosition = (CameraPosition) obj;
            LatLng latLng = this.target;
            return (latLng == null || m.b(latLng, cameraPosition.target)) && this.zoom == cameraPosition.zoom && this.tilt == cameraPosition.tilt && this.bearing == cameraPosition.bearing && Arrays.equals(this.padding, cameraPosition.padding);
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.bearing);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        LatLng latLng = this.target;
        int iHashCode = latLng != null ? latLng.hashCode() : 0;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.tilt);
        int i11 = ((i10 + iHashCode) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.zoom);
        return Arrays.hashCode(this.padding) + (((i11 * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31);
    }

    public final String toString() {
        return "Target: " + this.target + ", Zoom:" + this.zoom + ", Bearing:" + this.bearing + ", Tilt:" + this.tilt + ", Padding:" + Arrays.toString(this.padding);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeDouble(this.bearing);
        out.writeParcelable(this.target, i10);
        out.writeDouble(this.tilt);
        out.writeDouble(this.zoom);
        double[] dArr = this.padding;
        if (dArr == null) {
            out.writeInt(-1);
            return;
        }
        out.writeInt(dArr.length);
        for (double d10 : this.padding) {
            out.writeDouble(d10);
        }
    }
}
