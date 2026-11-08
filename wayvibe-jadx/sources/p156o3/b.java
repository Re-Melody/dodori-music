package p156o3;

import B2.AbstractC0111a;
import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new p146n3.b(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23654c;

    public b(int i10, long j10, long j11) {
        AbstractC0111a.d(j10 < j11);
        this.f23652a = j10;
        this.f23653b = j11;
        this.f23654c = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f23652a == bVar.f23652a && this.f23653b == bVar.f23653b && this.f23654c == bVar.f23654c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23652a), Long.valueOf(this.f23653b), Integer.valueOf(this.f23654c)});
    }

    public final String toString() {
        int i10 = C.f560a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f23652a + ", endTimeMs=" + this.f23653b + ", speedDivisor=" + this.f23654c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f23652a);
        parcel.writeLong(this.f23653b);
        parcel.writeInt(this.f23654c);
    }
}
