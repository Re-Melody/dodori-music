package U;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0881d0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11855a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11855a) {
            case 0:
                return new C0883e0(parcel.readFloat());
            case 1:
                return new C0885f0(parcel.readInt());
            default:
                return new C0887g0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f11855a) {
            case 0:
                return new C0883e0[i10];
            case 1:
                return new C0885f0[i10];
            default:
                return new C0887g0[i10];
        }
    }
}
