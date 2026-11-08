package H4;

import B2.AbstractC0112b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new B5.c(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6022c;

    public k(String str, String str2, String str3) {
        super(str);
        this.f6021b = str2;
        this.f6022c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f6018a.equals(kVar.f6018a) && X4.j.h(this.f6021b, kVar.f6021b) && X4.j.h(this.f6022c, kVar.f6022c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = AbstractC0112b.a(527, 31, this.f6018a);
        String str = this.f6021b;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6022c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6018a);
        parcel.writeString(this.f6021b);
        parcel.writeString(this.f6022c);
    }

    public k(Parcel parcel) {
        super(parcel.readString());
        this.f6021b = parcel.readString();
        this.f6022c = parcel.readString();
    }
}
