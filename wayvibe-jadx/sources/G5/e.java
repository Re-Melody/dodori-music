package G5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends I5.a {
    public static final Parcelable.Creator<e> CREATOR = new B5.c(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f5472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5474c;

    public e(Bundle bundle, ArrayList arrayList) {
        this.f5472a = bundle;
        this.f5473b = arrayList;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            map.put(dVar.f5471b, dVar);
        }
        this.f5474c = map;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.O(parcel, 1, this.f5472a, false);
        p242x0.c.Z(parcel, 2, this.f5473b, false);
        p242x0.c.d0(iC0, parcel);
    }
}
