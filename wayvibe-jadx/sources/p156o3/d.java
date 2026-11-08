package p156o3;

import android.os.Parcel;
import android.os.Parcelable;
import p146n3.b;
import p255y2.A;

/* JADX INFO: loaded from: classes.dex */
public final class d implements A {
    public static final Parcelable.Creator<d> CREATOR = new b(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23657b;

    public d(float f10, int i10) {
        this.f23656a = f10;
        this.f23657b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f23656a == dVar.f23656a && this.f23657b == dVar.f23657b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f23656a).hashCode() + 527) * 31) + this.f23657b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f23656a + ", svcTemporalLayerCount=" + this.f23657b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f23656a);
        parcel.writeInt(this.f23657b);
    }

    public d(Parcel parcel) {
        this.f23656a = parcel.readFloat();
        this.f23657b = parcel.readInt();
    }
}
