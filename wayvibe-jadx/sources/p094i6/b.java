package p094i6;

import L3.z;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p018b2.b {
    public static final Parcelable.Creator<b> CREATOR = new z(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20526c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f20526c = parcel.readInt();
    }

    @Override // p018b2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f20526c);
    }

    public b(int i10) {
        super(AbsSavedState.EMPTY_STATE);
        this.f20526c = i10;
    }
}
