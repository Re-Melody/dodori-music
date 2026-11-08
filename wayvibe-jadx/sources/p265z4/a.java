package p265z4;

import B2.AbstractC0112b;
import X4.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import p255y2.J;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new J(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f29861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f29863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29864e;

    public a(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f29861b = uuid;
        this.f29862c = str;
        this.f29863d = bArr;
        this.f29864e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f29862c.equals(aVar.f29862c) && j.h(this.f29861b, aVar.f29861b) && Arrays.equals(this.f29863d, aVar.f29863d);
    }

    public final int hashCode() {
        if (this.f29860a == 0) {
            this.f29860a = Arrays.hashCode(this.f29863d) + AbstractC0112b.a(this.f29861b.hashCode() * 31, 31, this.f29862c);
        }
        return this.f29860a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f29861b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f29862c);
        parcel.writeByteArray(this.f29863d);
        parcel.writeByte(this.f29864e ? (byte) 1 : (byte) 0);
    }

    public a(Parcel parcel) {
        this.f29861b = new UUID(parcel.readLong(), parcel.readLong());
        this.f29862c = parcel.readString();
        this.f29863d = parcel.createByteArray();
        this.f29864e = parcel.readByte() != 0;
    }
}
