package H4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new B5.c(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5994e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f5991b = str;
        this.f5992c = str2;
        this.f5993d = i10;
        this.f5994e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5993d == aVar.f5993d && X4.j.h(this.f5991b, aVar.f5991b) && X4.j.h(this.f5992c, aVar.f5992c) && Arrays.equals(this.f5994e, aVar.f5994e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f5993d) * 31;
        String str = this.f5991b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5992c;
        return Arrays.hashCode(this.f5994e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5991b);
        parcel.writeString(this.f5992c);
        parcel.writeInt(this.f5993d);
        parcel.writeByteArray(this.f5994e);
    }

    public a(Parcel parcel) {
        super("APIC");
        this.f5991b = parcel.readString();
        this.f5992c = parcel.readString();
        this.f5993d = parcel.readInt();
        this.f5994e = parcel.createByteArray();
    }
}
