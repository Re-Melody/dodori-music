package p146n3;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new b(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22940d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f22938b = str;
        this.f22939c = str2;
        this.f22940d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (C.a(this.f22939c, kVar.f22939c) && C.a(this.f22938b, kVar.f22938b) && C.a(this.f22940d, kVar.f22940d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22938b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22939c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22940d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p146n3.i
    public final String toString() {
        return this.f22936a + ": domain=" + this.f22938b + ", description=" + this.f22939c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22936a);
        parcel.writeString(this.f22938b);
        parcel.writeString(this.f22940d);
    }

    public k(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = C.f560a;
        this.f22938b = string;
        this.f22939c = parcel.readString();
        this.f22940d = parcel.readString();
    }
}
