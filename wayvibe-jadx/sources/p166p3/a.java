package p166p3;

import B2.C;
import V0.p;
import android.os.Parcel;
import android.os.Parcelable;
import p146n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new b(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f25179c;

    public a(long j10, long j11, byte[] bArr) {
        this.f25177a = j11;
        this.f25178b = j10;
        this.f25179c = bArr;
    }

    @Override // p166p3.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f25177a);
        sb.append(", identifier= ");
        return p.k(this.f25178b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f25177a);
        parcel.writeLong(this.f25178b);
        parcel.writeByteArray(this.f25179c);
    }

    public a(Parcel parcel) {
        this.f25177a = parcel.readLong();
        this.f25178b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i10 = C.f560a;
        this.f25179c = bArrCreateByteArray;
    }
}
