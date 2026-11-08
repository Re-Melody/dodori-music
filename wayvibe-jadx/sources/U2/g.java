package U2;

import F2.AbstractC0412e;
import p255y2.C2339o;
import p255y2.P;

/* JADX INFO: loaded from: classes.dex */
public final class g extends n implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12107f;

    public g(int i10, P p10, int i11, j jVar, int i12) {
        int i13;
        super(i10, p10, i11);
        this.f12106e = AbstractC0412e.m(i12, jVar.f12123w) ? 1 : 0;
        C2339o c2339o = this.f12139d;
        int i14 = c2339o.f28959s;
        int i15 = -1;
        if (i14 != -1 && (i13 = c2339o.f28960t) != -1) {
            i15 = i14 * i13;
        }
        this.f12107f = i15;
    }

    @Override // U2.n
    public final int a() {
        return this.f12106e;
    }

    @Override // U2.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f12107f, ((g) obj).f12107f);
    }
}
