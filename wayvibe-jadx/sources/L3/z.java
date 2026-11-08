package L3;

import android.os.Parcel;
import android.os.Parcelable;
import p152o.b1;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7774a;

    public /* synthetic */ z(int i10) {
        this.f7774a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f7774a) {
            case 0:
                return new A(parcel, classLoader);
            case 1:
                return new androidx.fragment.app.E(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return p018b2.b.f15715b;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new p094i6.b(parcel, classLoader);
            case 4:
                return new b1(parcel, classLoader);
            case 5:
                return new p187r6.a(parcel, classLoader);
            default:
                return new p232w1.e(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f7774a) {
            case 0:
                return new A[i10];
            case 1:
                return new androidx.fragment.app.E[i10];
            case 2:
                return new p018b2.b[i10];
            case 3:
                return new p094i6.b[i10];
            case 4:
                return new b1[i10];
            case 5:
                return new p187r6.a[i10];
            default:
                return new p232w1.e[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7774a) {
            case 0:
                return new A(parcel, null);
            case 1:
                return new androidx.fragment.app.E(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return p018b2.b.f15715b;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new p094i6.b(parcel, null);
            case 4:
                return new b1(parcel, null);
            case 5:
                return new p187r6.a(parcel, null);
            default:
                return new p232w1.e(parcel, null);
        }
    }
}
