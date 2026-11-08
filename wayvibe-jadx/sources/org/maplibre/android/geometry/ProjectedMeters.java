package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.auth.api.identity.v;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class ProjectedMeters implements Parcelable {
    public static final Parcelable.Creator<ProjectedMeters> CREATOR = new v(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f24633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f24634b;

    @Keep
    public ProjectedMeters(double d10, double d11) {
        this.f24633a = d10;
        this.f24634b = d11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProjectedMeters.class.equals(obj.getClass())) {
            ProjectedMeters projectedMeters = (ProjectedMeters) obj;
            if (Double.compare(projectedMeters.f24634b, this.f24634b) == 0 && Double.compare(projectedMeters.f24633a, this.f24633a) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f24634b);
        int i10 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f24633a);
        return (i10 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "ProjectedMeters [northing=" + this.f24633a + ", easting=" + this.f24634b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeDouble(this.f24633a);
        out.writeDouble(this.f24634b);
    }
}
