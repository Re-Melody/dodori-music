package p152o;

import L3.z;
import android.os.Parcel;
import android.os.Parcelable;
import p018b2.b;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends b {
    public static final Parcelable.Creator<b1> CREATOR = new z(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23309d;

    public b1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f23308c = parcel.readInt();
        this.f23309d = parcel.readInt() != 0;
    }

    @Override // p018b2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f23308c);
        parcel.writeInt(this.f23309d ? 1 : 0);
    }
}
