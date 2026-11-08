package p146n3;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new b(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22929d;

    public f(String str, String str2, String str3) {
        super("COMM");
        this.f22927b = str;
        this.f22928c = str2;
        this.f22929d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (C.a(this.f22928c, fVar.f22928c) && C.a(this.f22927b, fVar.f22927b) && C.a(this.f22929d, fVar.f22929d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22927b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22928c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22929d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p146n3.i
    public final String toString() {
        return this.f22936a + ": language=" + this.f22927b + ", description=" + this.f22928c + ", text=" + this.f22929d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22936a);
        parcel.writeString(this.f22927b);
        parcel.writeString(this.f22929d);
    }

    public f(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = C.f560a;
        this.f22927b = string;
        this.f22928c = parcel.readString();
        this.f22929d = parcel.readString();
    }
}
