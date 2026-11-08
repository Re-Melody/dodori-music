package p170p7;

import java.util.Comparator;
import p140m7.C2064p;
import p245x3.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25280a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f25280a) {
            case 0:
                return ((C2064p) obj).f22471c.compareTo(((C2064p) obj2).f22471c);
            case 1:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 2:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return Integer.compare(((d) obj2).f28380b, ((d) obj).f28380b);
        }
    }
}
