package Y4;

import V5.e0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new e0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13342e;

    public a(Parcel parcel) {
        this.f13338a = parcel.readInt();
        this.f13339b = parcel.readInt();
        this.f13340c = parcel.readInt();
        this.f13341d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13338a == aVar.f13338a && this.f13339b == aVar.f13339b && this.f13340c == aVar.f13340c && Arrays.equals(this.f13341d, aVar.f13341d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f13342e == 0) {
            this.f13342e = Arrays.hashCode(this.f13341d) + ((((((527 + this.f13338a) * 31) + this.f13339b) * 31) + this.f13340c) * 31);
        }
        return this.f13342e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f13338a);
        sb.append(", ");
        sb.append(this.f13339b);
        sb.append(", ");
        sb.append(this.f13340c);
        sb.append(", ");
        sb.append(this.f13341d != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13338a);
        parcel.writeInt(this.f13339b);
        parcel.writeInt(this.f13340c);
        byte[] bArr = this.f13341d;
        parcel.writeInt(bArr != null ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
