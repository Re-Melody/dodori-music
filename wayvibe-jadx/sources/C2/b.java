package C2;

import B2.AbstractC0111a;
import android.os.Parcel;
import android.os.Parcelable;
import p255y2.A;

/* JADX INFO: loaded from: classes.dex */
public final class b implements A {
    public static final Parcelable.Creator<b> CREATOR = new B5.c(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1124b;

    public b(float f10, float f11) {
        AbstractC0111a.c("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f1123a = f10;
        this.f1124b = f11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f1123a == bVar.f1123a && this.f1124b == bVar.f1124b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f1124b).hashCode() + ((Float.valueOf(this.f1123a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f1123a + ", longitude=" + this.f1124b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f1123a);
        parcel.writeFloat(this.f1124b);
    }

    public b(Parcel parcel) {
        this.f1123a = parcel.readFloat();
        this.f1124b = parcel.readFloat();
    }
}
