package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new s(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14360e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14356a);
        parcel.writeInt(this.f14358c);
        parcel.writeInt(this.f14359d);
        parcel.writeInt(this.f14360e);
        parcel.writeInt(this.f14357b);
    }
}
