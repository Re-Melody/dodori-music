package p109ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.v;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new v(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f21534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f21535b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f21535b == bVar.f21535b && this.f21534a == bVar.f21534a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f21534a);
        int i10 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f21535b);
        return (i10 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeDouble(this.f21534a);
        out.writeDouble(this.f21535b);
    }
}
