package H4;

import B2.AbstractC0112b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new B5.c(28);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6024c;

    public l(String str, String str2, String str3) {
        super(str);
        this.f6023b = str2;
        this.f6024c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f6018a.equals(lVar.f6018a) && X4.j.h(this.f6023b, lVar.f6023b) && X4.j.h(this.f6024c, lVar.f6024c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = AbstractC0112b.a(527, 31, this.f6018a);
        String str = this.f6023b;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6024c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6018a);
        parcel.writeString(this.f6023b);
        parcel.writeString(this.f6024c);
    }

    public l(Parcel parcel) {
        super(parcel.readString());
        this.f6023b = parcel.readString();
        this.f6024c = parcel.readString();
    }
}
