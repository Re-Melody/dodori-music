package p265z4;

import X4.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p235w4.AbstractC2294b;
import p255y2.J;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable, Comparator {
    public static final Parcelable.Creator<b> CREATOR = new J(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f29865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29868d;

    public b(String str, boolean z10, a... aVarArr) {
        this.f29867c = str;
        aVarArr = z10 ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        this.f29865a = aVarArr;
        this.f29868d = aVarArr.length;
    }

    public final b a(String str) {
        return j.h(this.f29867c, str) ? this : new b(str, false, this.f29865a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        UUID uuid = AbstractC2294b.f27904b;
        if (uuid.equals(aVar.f29861b)) {
            return uuid.equals(aVar2.f29861b) ? 0 : 1;
        }
        return aVar.f29861b.compareTo(aVar2.f29861b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (j.h(this.f29867c, bVar.f29867c) && Arrays.equals(this.f29865a, bVar.f29865a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29866b == 0) {
            String str = this.f29867c;
            this.f29866b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f29865a);
        }
        return this.f29866b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f29867c);
        parcel.writeTypedArray(this.f29865a, 0);
    }

    public b(Parcel parcel) {
        this.f29867c = parcel.readString();
        a[] aVarArr = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f29865a = aVarArr;
        this.f29868d = aVarArr.length;
    }
}
