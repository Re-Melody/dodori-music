package L3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: L3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0635l implements Parcelable {
    public static final Parcelable.Creator<C0635l> CREATOR = new H5.m(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7756c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7754a);
        parcel.writeInt(this.f7755b);
        parcel.writeInt(this.f7756c ? 1 : 0);
    }
}
