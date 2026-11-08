package p146n3;

import B2.C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new b(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f22944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f22945f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f22941b = i10;
        this.f22942c = i11;
        this.f22943d = i12;
        this.f22944e = iArr;
        this.f22945f = iArr2;
    }

    @Override // p146n3.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f22941b == lVar.f22941b && this.f22942c == lVar.f22942c && this.f22943d == lVar.f22943d && Arrays.equals(this.f22944e, lVar.f22944e) && Arrays.equals(this.f22945f, lVar.f22945f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22945f) + ((Arrays.hashCode(this.f22944e) + ((((((527 + this.f22941b) * 31) + this.f22942c) * 31) + this.f22943d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22941b);
        parcel.writeInt(this.f22942c);
        parcel.writeInt(this.f22943d);
        parcel.writeIntArray(this.f22944e);
        parcel.writeIntArray(this.f22945f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f22941b = parcel.readInt();
        this.f22942c = parcel.readInt();
        this.f22943d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = C.f560a;
        this.f22944e = iArrCreateIntArray;
        this.f22945f = parcel.createIntArray();
    }
}
