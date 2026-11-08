package com.google.android.gms.location;

import I5.a;
import Z5.u;
import Z5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new u(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x[] f18121e;

    public LocationAvailability(int i10, int i11, int i12, long j10, x[] xVarArr) {
        this.f18120d = i10 < 1000 ? 0 : PipesIterator.DEFAULT_QUEUE_SIZE;
        this.f18117a = i11;
        this.f18118b = i12;
        this.f18119c = j10;
        this.f18121e = xVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f18117a == locationAvailability.f18117a && this.f18118b == locationAvailability.f18118b && this.f18119c == locationAvailability.f18119c && this.f18120d == locationAvailability.f18120d && Arrays.equals(this.f18121e, locationAvailability.f18121e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18120d)});
    }

    public final String toString() {
        boolean z10 = this.f18120d < 1000;
        StringBuilder sb = new StringBuilder(String.valueOf(z10).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z10);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        c.b0(parcel, 1, 4);
        parcel.writeInt(this.f18117a);
        c.b0(parcel, 2, 4);
        parcel.writeInt(this.f18118b);
        c.b0(parcel, 3, 8);
        parcel.writeLong(this.f18119c);
        c.b0(parcel, 4, 4);
        int i11 = this.f18120d;
        parcel.writeInt(i11);
        c.Y(parcel, 5, this.f18121e, i10);
        int i12 = i11 >= 1000 ? 0 : 1;
        c.b0(parcel, 6, 4);
        parcel.writeInt(i12);
        c.d0(iC0, parcel);
    }
}
