package G4;

import B5.c;
import F4.b;
import X4.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR = new c(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5465f;

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f5460a = str;
        this.f5461b = str2;
        this.f5462c = j10;
        this.f5463d = j11;
        this.f5464e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5462c == aVar.f5462c && this.f5463d == aVar.f5463d && j.h(this.f5460a, aVar.f5460a) && j.h(this.f5461b, aVar.f5461b) && Arrays.equals(this.f5464e, aVar.f5464e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5465f == 0) {
            String str = this.f5460a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f5461b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f5462c;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f5463d;
            this.f5465f = Arrays.hashCode(this.f5464e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f5465f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5460a);
        parcel.writeString(this.f5461b);
        parcel.writeLong(this.f5462c);
        parcel.writeLong(this.f5463d);
        parcel.writeByteArray(this.f5464e);
    }

    public a(Parcel parcel) {
        this.f5460a = parcel.readString();
        this.f5461b = parcel.readString();
        this.f5462c = parcel.readLong();
        this.f5463d = parcel.readLong();
        this.f5464e = parcel.createByteArray();
    }
}
