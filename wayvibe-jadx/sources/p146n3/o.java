package p146n3;

import B2.AbstractC0112b;
import B2.C;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new b(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22951c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f22950b = str2;
        this.f22951c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f22936a.equals(oVar.f22936a) && C.a(this.f22950b, oVar.f22950b) && C.a(this.f22951c, oVar.f22951c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = AbstractC0112b.a(527, 31, this.f22936a);
        String str = this.f22950b;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22951c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p146n3.i
    public final String toString() {
        return this.f22936a + ": url=" + this.f22951c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22936a);
        parcel.writeString(this.f22950b);
        parcel.writeString(this.f22951c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Parcel parcel) {
        String string = parcel.readString();
        int i10 = C.f560a;
        super(string);
        this.f22950b = parcel.readString();
        this.f22951c = parcel.readString();
    }
}
