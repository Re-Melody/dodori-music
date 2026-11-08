package androidx.versionedparcelable;

import H5.m;
import R3.c;
import R3.d;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new m(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f15696a;

    public ParcelImpl(d dVar) {
        this.f15696a = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new c(parcel).l(this.f15696a);
    }

    public ParcelImpl(Parcel parcel) {
        this.f15696a = new c(parcel).h();
    }
}
