package I4;

import H5.m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new m(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6395c;

    public a(long j10, long j11, byte[] bArr) {
        this.f6393a = j11;
        this.f6394b = j10;
        this.f6395c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6393a);
        parcel.writeLong(this.f6394b);
        byte[] bArr = this.f6395c;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    public a(Parcel parcel) {
        this.f6393a = parcel.readLong();
        this.f6394b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f6395c = bArr;
        parcel.readByteArray(bArr);
    }
}
