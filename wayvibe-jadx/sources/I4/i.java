package I4;

import H5.m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new m(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6425b;

    public i(long j10, long j11) {
        this.f6424a = j10;
        this.f6425b = j11;
    }

    public static long a(X4.f fVar, long j10) {
        long jI = fVar.i();
        if ((128 & jI) != 0) {
            return 8589934591L & ((((jI & 1) << 32) | fVar.m()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6424a);
        parcel.writeLong(this.f6425b);
    }
}
