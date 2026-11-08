package L2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new H5.m(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7652f;

    public s(int i10, int i11, String str, String str2, String str3, String str4) {
        this.f7647a = i10;
        this.f7648b = i11;
        this.f7649c = str;
        this.f7650d = str2;
        this.f7651e = str3;
        this.f7652f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f7647a == sVar.f7647a && this.f7648b == sVar.f7648b && TextUtils.equals(this.f7649c, sVar.f7649c) && TextUtils.equals(this.f7650d, sVar.f7650d) && TextUtils.equals(this.f7651e, sVar.f7651e) && TextUtils.equals(this.f7652f, sVar.f7652f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f7647a * 31) + this.f7648b) * 31;
        String str = this.f7649c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7650d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7651e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f7652f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7647a);
        parcel.writeInt(this.f7648b);
        parcel.writeString(this.f7649c);
        parcel.writeString(this.f7650d);
        parcel.writeString(this.f7651e);
        parcel.writeString(this.f7652f);
    }

    public s(Parcel parcel) {
        this.f7647a = parcel.readInt();
        this.f7648b = parcel.readInt();
        this.f7649c = parcel.readString();
        this.f7650d = parcel.readString();
        this.f7651e = parcel.readString();
        this.f7652f = parcel.readString();
    }
}
