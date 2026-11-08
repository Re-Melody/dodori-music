package p011a7;

import I5.a;
import Z6.B;
import Z6.I;
import Z6.y;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import java.util.Iterator;
import p242x0.c;

/* JADX INFO: renamed from: a7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1021i extends a {
    public static final Parcelable.Creator<C1021i> CREATOR = new C1014b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1022j f14246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f14248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1018f f14249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f14250f;

    public C1021i(ArrayList arrayList, C1022j c1022j, String str, I i10, C1018f c1018f, ArrayList arrayList2) {
        E.h(arrayList);
        this.f14245a = arrayList;
        E.h(c1022j);
        this.f14246b = c1022j;
        E.e(str);
        this.f14247c = str;
        this.f14248d = i10;
        this.f14249e = c1018f;
        E.h(arrayList2);
        this.f14250f = arrayList2;
    }

    public final ArrayList u() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14245a.iterator();
        while (it.hasNext()) {
            arrayList.add((y) it.next());
        }
        Iterator it2 = this.f14250f.iterator();
        while (it2.hasNext()) {
            arrayList.add((B) it2.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        c.Z(parcel, 1, this.f14245a, false);
        c.V(parcel, 2, this.f14246b, i10, false);
        c.W(parcel, 3, this.f14247c, false);
        c.V(parcel, 4, this.f14248d, i10, false);
        c.V(parcel, 5, this.f14249e, i10, false);
        c.Z(parcel, 6, this.f14250f, false);
        c.d0(iC0, parcel);
    }
}
