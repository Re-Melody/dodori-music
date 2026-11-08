package B;

import M8.D;
import U.InterfaceC0877b0;
import java.util.ArrayList;
import p151n9.InterfaceC2106h;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC2106h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0877b0 f515c;

    public /* synthetic */ f(ArrayList arrayList, InterfaceC0877b0 interfaceC0877b0, int i10) {
        this.f513a = i10;
        this.f514b = arrayList;
        this.f515c = interfaceC0877b0;
    }

    @Override // p151n9.InterfaceC2106h
    public final Object emit(Object obj, Q8.d dVar) {
        switch (this.f513a) {
            case 0:
                k kVar = (k) obj;
                boolean z10 = kVar instanceof d;
                ArrayList arrayList = this.f514b;
                if (z10) {
                    arrayList.add(kVar);
                } else if (kVar instanceof e) {
                    arrayList.remove(((e) kVar).f512a);
                }
                this.f515c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                k kVar2 = (k) obj;
                boolean z11 = kVar2 instanceof h;
                ArrayList arrayList2 = this.f514b;
                if (z11) {
                    arrayList2.add(kVar2);
                } else if (kVar2 instanceof i) {
                    arrayList2.remove(((i) kVar2).f519a);
                }
                this.f515c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
            default:
                k kVar3 = (k) obj;
                boolean z12 = kVar3 instanceof p;
                ArrayList arrayList3 = this.f514b;
                if (z12) {
                    arrayList3.add(kVar3);
                } else if (kVar3 instanceof q) {
                    arrayList3.remove(((q) kVar3).f526a);
                } else if (kVar3 instanceof o) {
                    arrayList3.remove(((o) kVar3).f524a);
                }
                this.f515c.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                break;
        }
        return D.f8402a;
    }
}
