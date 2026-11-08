package O;

import D0.a0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L implements D0.M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f8693a = new L();

    @Override // D0.M
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final D0.N mo1measure3p2s80s(D0.O o10, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer numValueOf = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((D0.L) list.get(i10)).E(j10));
        }
        int size2 = arrayList.size();
        Integer numValueOf2 = numValueOf;
        for (int i11 = 0; i11 < size2; i11++) {
            numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((D0.X) arrayList.get(i11)).f1762a));
        }
        int iIntValue = numValueOf2.intValue();
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((D0.X) arrayList.get(i12)).f1763b));
        }
        return o10.S(iIntValue, numValueOf.intValue(), N8.t.f8651a, new a0(2, arrayList));
    }
}
