package U2;

import A6.AbstractC0097w;
import F2.AbstractC0412e;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12109b;

    public h(C2339o c2339o, int i10) {
        this.f12108a = (c2339o.f28947e & 1) != 0;
        this.f12109b = AbstractC0412e.m(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return AbstractC0097w.f400a.c(this.f12109b, hVar.f12109b).c(this.f12108a, hVar.f12108a).e();
    }
}
