package H4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new B5.c(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f6005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i[] f6006f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f6002b = str;
        this.f6003c = z10;
        this.f6004d = z11;
        this.f6005e = strArr;
        this.f6006f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f6003c == dVar.f6003c && this.f6004d == dVar.f6004d && X4.j.h(this.f6002b, dVar.f6002b) && Arrays.equals(this.f6005e, dVar.f6005e) && Arrays.equals(this.f6006f, dVar.f6006f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f6003c ? 1 : 0)) * 31) + (this.f6004d ? 1 : 0)) * 31;
        String str = this.f6002b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6002b);
        parcel.writeByte(this.f6003c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6004d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f6005e);
        i[] iVarArr = this.f6006f;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        this.f6002b = parcel.readString();
        this.f6003c = parcel.readByte() != 0;
        this.f6004d = parcel.readByte() != 0;
        this.f6005e = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f6006f = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f6006f[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
