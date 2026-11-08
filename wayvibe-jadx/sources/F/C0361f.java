package F;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: F.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0361f implements Parcelable {
    public static final Parcelable.Creator<C0361f> CREATOR = new C0360e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3531a;

    public C0361f(int i10) {
        this.f3531a = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0361f) && this.f3531a == ((C0361f) obj).f3531a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3531a);
    }

    public final String toString() {
        return V0.p.q(new StringBuilder("DefaultLazyKey(index="), this.f3531a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3531a);
    }
}
