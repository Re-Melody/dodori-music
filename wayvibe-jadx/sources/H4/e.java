package H4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new B5.c(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6009d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f6007b = str;
        this.f6008c = str2;
        this.f6009d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (X4.j.h(this.f6008c, eVar.f6008c) && X4.j.h(this.f6007b, eVar.f6007b) && X4.j.h(this.f6009d, eVar.f6009d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6007b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6008c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6009d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6018a);
        parcel.writeString(this.f6007b);
        parcel.writeString(this.f6009d);
    }

    public e(Parcel parcel) {
        super("COMM");
        this.f6007b = parcel.readString();
        this.f6008c = parcel.readString();
        this.f6009d = parcel.readString();
    }
}
