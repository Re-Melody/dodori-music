package p232w1;

import L3.z;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p018b2.b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new z(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray f27842c;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        int[] iArr = new int[i10];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f27842c = new SparseArray(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f27842c.append(iArr[i11], parcelableArray[i11]);
        }
    }

    @Override // p018b2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        SparseArray sparseArray = this.f27842c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f27842c.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f27842c.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
