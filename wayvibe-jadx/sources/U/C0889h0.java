package U;

import B2.AbstractC0112b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0889h0 implements Parcelable.ClassLoaderCreator {
    public static C0891i0 a(Parcel parcel, ClassLoader classLoader) {
        U u10;
        if (classLoader == null) {
            classLoader = C0889h0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            u10 = U.f11812c;
        } else if (i10 == 1) {
            u10 = U.f11815f;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(AbstractC0112b.d(i10, "Unsupported MutableState policy ", " was restored"));
            }
            u10 = U.f11813d;
        }
        return new C0891i0(value, u10);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C0891i0[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
