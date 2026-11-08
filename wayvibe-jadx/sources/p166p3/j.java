package p166p3;

import B2.u;
import V0.p;
import android.os.Parcel;
import android.os.Parcelable;
import p146n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new b(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25212b;

    public j(long j10, long j11) {
        this.f25211a = j10;
        this.f25212b = j11;
    }

    public static long a(long j10, u uVar) {
        long jT = uVar.t();
        if ((128 & jT) != 0) {
            return 8589934591L & ((((jT & 1) << 32) | uVar.v()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // p166p3.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f25211a);
        sb.append(", playbackPositionUs= ");
        return p.k(this.f25212b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f25211a);
        parcel.writeLong(this.f25212b);
    }
}
