package F;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: F.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0360e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0361f(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C0361f[i10];
    }
}
