package p018b2;

import L3.z;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f15716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15715b = new a();
    public static final Parcelable.Creator<b> CREATOR = new z(2);

    public b() {
        this.f15716a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f15716a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f15716a = parcelable == f15715b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f15716a = parcelable == null ? f15715b : parcelable;
    }
}
