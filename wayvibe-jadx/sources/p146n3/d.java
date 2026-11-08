package p146n3;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new b(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i[] f22921g;

    public d(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f22916b = str;
        this.f22917c = i10;
        this.f22918d = i11;
        this.f22919e = j10;
        this.f22920f = j11;
        this.f22921g = iVarArr;
    }

    @Override // p146n3.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f22917c == dVar.f22917c && this.f22918d == dVar.f22918d && this.f22919e == dVar.f22919e && this.f22920f == dVar.f22920f && C.a(this.f22916b, dVar.f22916b) && Arrays.equals(this.f22921g, dVar.f22921g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f22917c) * 31) + this.f22918d) * 31) + ((int) this.f22919e)) * 31) + ((int) this.f22920f)) * 31;
        String str = this.f22916b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22916b);
        parcel.writeInt(this.f22917c);
        parcel.writeInt(this.f22918d);
        parcel.writeLong(this.f22919e);
        parcel.writeLong(this.f22920f);
        i[] iVarArr = this.f22921g;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = C.f560a;
        this.f22916b = string;
        this.f22917c = parcel.readInt();
        this.f22918d = parcel.readInt();
        this.f22919e = parcel.readLong();
        this.f22920f = parcel.readLong();
        int i11 = parcel.readInt();
        this.f22921g = new i[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f22921g[i12] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
