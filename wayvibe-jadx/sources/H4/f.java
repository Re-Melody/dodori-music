package H4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new B5.c(25);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6013e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6010b = str;
        this.f6011c = str2;
        this.f6012d = str3;
        this.f6013e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (X4.j.h(this.f6010b, fVar.f6010b) && X4.j.h(this.f6011c, fVar.f6011c) && X4.j.h(this.f6012d, fVar.f6012d) && Arrays.equals(this.f6013e, fVar.f6013e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6010b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6011c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6012d;
        return Arrays.hashCode(this.f6013e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6010b);
        parcel.writeString(this.f6011c);
        parcel.writeString(this.f6012d);
        parcel.writeByteArray(this.f6013e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        this.f6010b = parcel.readString();
        this.f6011c = parcel.readString();
        this.f6012d = parcel.readString();
        this.f6013e = parcel.createByteArray();
    }
}
