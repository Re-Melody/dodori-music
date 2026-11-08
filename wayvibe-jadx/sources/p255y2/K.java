package p255y2;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class K implements Comparable, Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new J(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28777c;

    static {
        C.D(0);
        C.D(1);
        C.D(2);
    }

    public K() {
        this.f28775a = -1;
        this.f28776b = -1;
        this.f28777c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        K k = (K) obj;
        int i10 = this.f28775a - k.f28775a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f28776b - k.f28776b;
        return i11 == 0 ? this.f28777c - k.f28777c : i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k = (K) obj;
            if (this.f28775a == k.f28775a && this.f28776b == k.f28776b && this.f28777c == k.f28777c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f28775a * 31) + this.f28776b) * 31) + this.f28777c;
    }

    public final String toString() {
        return this.f28775a + "." + this.f28776b + "." + this.f28777c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28775a);
        parcel.writeInt(this.f28776b);
        parcel.writeInt(this.f28777c);
    }

    public K(Parcel parcel) {
        this.f28775a = parcel.readInt();
        this.f28776b = parcel.readInt();
        this.f28777c = parcel.readInt();
    }
}
