package H4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new B5.c(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i[] f6001g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f5996b = str;
        this.f5997c = i10;
        this.f5998d = i11;
        this.f5999e = j10;
        this.f6000f = j11;
        this.f6001g = iVarArr;
    }

    @Override // H4.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f5997c == cVar.f5997c && this.f5998d == cVar.f5998d && this.f5999e == cVar.f5999e && this.f6000f == cVar.f6000f && X4.j.h(this.f5996b, cVar.f5996b) && Arrays.equals(this.f6001g, cVar.f6001g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f5997c) * 31) + this.f5998d) * 31) + ((int) this.f5999e)) * 31) + ((int) this.f6000f)) * 31;
        String str = this.f5996b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5996b);
        parcel.writeInt(this.f5997c);
        parcel.writeInt(this.f5998d);
        parcel.writeLong(this.f5999e);
        parcel.writeLong(this.f6000f);
        i[] iVarArr = this.f6001g;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        this.f5996b = parcel.readString();
        this.f5997c = parcel.readInt();
        this.f5998d = parcel.readInt();
        this.f5999e = parcel.readLong();
        this.f6000f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f6001g = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f6001g[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
