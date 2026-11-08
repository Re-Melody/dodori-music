package L3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p018b2.b {
    public static final Parcelable.Creator<A> CREATOR = new z(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f7666c;

    public A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7666c = parcel.readParcelable(classLoader == null ? s.class.getClassLoader() : classLoader);
    }

    @Override // p018b2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f7666c, 0);
    }
}
