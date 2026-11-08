package p146n3;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {
    public static final Parcelable.Creator<g> CREATOR = new b(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f22933e;

    public g(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f22930b = str;
        this.f22931c = str2;
        this.f22932d = str3;
        this.f22933e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (C.a(this.f22930b, gVar.f22930b) && C.a(this.f22931c, gVar.f22931c) && C.a(this.f22932d, gVar.f22932d) && Arrays.equals(this.f22933e, gVar.f22933e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22930b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22931c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22932d;
        return Arrays.hashCode(this.f22933e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p146n3.i
    public final String toString() {
        return this.f22936a + ": mimeType=" + this.f22930b + ", filename=" + this.f22931c + ", description=" + this.f22932d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22930b);
        parcel.writeString(this.f22931c);
        parcel.writeString(this.f22932d);
        parcel.writeByteArray(this.f22933e);
    }

    public g(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = C.f560a;
        this.f22930b = string;
        this.f22931c = parcel.readString();
        this.f22932d = parcel.readString();
        this.f22933e = parcel.createByteArray();
    }
}
