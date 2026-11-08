package p255y2;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p146n3.b;

/* JADX INFO: renamed from: y2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2336l implements Comparator, Parcelable {
    public static final Parcelable.Creator<C2336l> CREATOR = new b(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2335k[] f28894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28897d;

    public C2336l(String str, ArrayList arrayList) {
        this(str, false, (C2335k[]) arrayList.toArray(new C2335k[0]));
    }

    public final C2336l a(String str) {
        return C.a(this.f28896c, str) ? this : new C2336l(str, false, this.f28894a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2335k c2335k = (C2335k) obj;
        C2335k c2335k2 = (C2335k) obj2;
        UUID uuid = AbstractC2331g.f28874a;
        if (uuid.equals(c2335k.f28890b)) {
            return uuid.equals(c2335k2.f28890b) ? 0 : 1;
        }
        return c2335k.f28890b.compareTo(c2335k2.f28890b);
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
        if (obj != null && C2336l.class == obj.getClass()) {
            C2336l c2336l = (C2336l) obj;
            if (C.a(this.f28896c, c2336l.f28896c) && Arrays.equals(this.f28894a, c2336l.f28894a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f28895b == 0) {
            String str = this.f28896c;
            this.f28895b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f28894a);
        }
        return this.f28895b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f28896c);
        parcel.writeTypedArray(this.f28894a, 0);
    }

    public C2336l(String str, boolean z10, C2335k... c2335kArr) {
        this.f28896c = str;
        c2335kArr = z10 ? (C2335k[]) c2335kArr.clone() : c2335kArr;
        this.f28894a = c2335kArr;
        this.f28897d = c2335kArr.length;
        Arrays.sort(c2335kArr, this);
    }

    public C2336l(Parcel parcel) {
        this.f28896c = parcel.readString();
        C2335k[] c2335kArr = (C2335k[]) parcel.createTypedArray(C2335k.CREATOR);
        int i10 = C.f560a;
        this.f28894a = c2335kArr;
        this.f28897d = c2335kArr.length;
    }
}
