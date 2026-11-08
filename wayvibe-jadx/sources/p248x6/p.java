package p248x6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends j implements q {
    @Override // p248x6.j
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) k.a(parcel);
            k.b(parcel);
            e(bundle);
            return true;
        }
        if (i10 == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) k.a(parcel);
            k.b(parcel);
            c(bundle2);
            return true;
        }
        if (i10 == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) k.a(parcel);
            k.b(parcel);
            d(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) k.a(parcel);
        k.b(parcel);
        b(bundle4);
        return true;
    }
}
