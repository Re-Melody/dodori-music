package p187r6;

import L3.z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p018b2.b;
import p199t.G;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new z(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f25977c;

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f25977c = new G(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f25977c + "}";
    }

    @Override // p018b2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        G g3 = this.f25977c;
        int i11 = g3.f26268c;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = (String) g3.g(i12);
            bundleArr[i12] = (Bundle) g3.j(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f25977c = new G(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25977c.put(strArr[i11], bundleArr[i11]);
        }
    }
}
