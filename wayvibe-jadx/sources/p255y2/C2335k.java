package p255y2;

import B2.AbstractC0112b;
import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import p146n3.b;

/* JADX INFO: renamed from: y2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2335k implements Parcelable {
    public static final Parcelable.Creator<C2335k> CREATOR = new b(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f28890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f28893e;

    public C2335k(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f28890b = uuid;
        this.f28891c = str;
        str2.getClass();
        this.f28892d = C.l(str2);
        this.f28893e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2335k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2335k c2335k = (C2335k) obj;
        return C.a(this.f28891c, c2335k.f28891c) && C.a(this.f28892d, c2335k.f28892d) && C.a(this.f28890b, c2335k.f28890b) && Arrays.equals(this.f28893e, c2335k.f28893e);
    }

    public final int hashCode() {
        if (this.f28889a == 0) {
            int iHashCode = this.f28890b.hashCode() * 31;
            String str = this.f28891c;
            this.f28889a = Arrays.hashCode(this.f28893e) + AbstractC0112b.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f28892d);
        }
        return this.f28889a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f28890b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f28891c);
        parcel.writeString(this.f28892d);
        parcel.writeByteArray(this.f28893e);
    }

    public C2335k(Parcel parcel) {
        this.f28890b = new UUID(parcel.readLong(), parcel.readLong());
        this.f28891c = parcel.readString();
        String string = parcel.readString();
        int i10 = C.f560a;
        this.f28892d = string;
        this.f28893e = parcel.createByteArray();
    }
}
