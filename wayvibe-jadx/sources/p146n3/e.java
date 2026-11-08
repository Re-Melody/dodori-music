package p146n3;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new b(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f22925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i[] f22926f;

    public e(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f22922b = str;
        this.f22923c = z10;
        this.f22924d = z11;
        this.f22925e = strArr;
        this.f22926f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f22923c == eVar.f22923c && this.f22924d == eVar.f22924d && C.a(this.f22922b, eVar.f22922b) && Arrays.equals(this.f22925e, eVar.f22925e) && Arrays.equals(this.f22926f, eVar.f22926f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f22923c ? 1 : 0)) * 31) + (this.f22924d ? 1 : 0)) * 31;
        String str = this.f22922b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22922b);
        parcel.writeByte(this.f22923c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22924d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f22925e);
        i[] iVarArr = this.f22926f;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public e(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = C.f560a;
        this.f22922b = string;
        this.f22923c = parcel.readByte() != 0;
        this.f22924d = parcel.readByte() != 0;
        this.f22925e = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f22926f = new i[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f22926f[i12] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
