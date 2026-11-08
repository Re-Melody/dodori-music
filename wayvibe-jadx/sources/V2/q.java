package V2;

import B2.AbstractC0111a;
import B2.C;
import D2.A;
import R2.C0793v;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D2.k f12530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f12532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f12533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f12534f;

    public q(D2.h hVar, Uri uri, int i10, p pVar) {
        Map map = Collections.EMPTY_MAP;
        AbstractC0111a.j(uri, "The uri must be set.");
        D2.k kVar = new D2.k(uri, 1, null, map, 0L, -1L, null, 1);
        this.f12532d = new A(hVar);
        this.f12530b = kVar;
        this.f12531c = i10;
        this.f12533e = pVar;
        this.f12529a = C0793v.f10874b.getAndIncrement();
    }

    @Override // V2.k
    public final void h() {
        this.f12532d.f1828b = 0L;
        D2.j jVar = new D2.j(this.f12532d, this.f12530b);
        try {
            jVar.f1859a.l(jVar.f1860b);
            jVar.f1862d = true;
            Uri uriS = this.f12532d.f1827a.s();
            uriS.getClass();
            this.f12534f = this.f12533e.g(uriS, jVar);
        } finally {
            C.h(jVar);
        }
    }

    @Override // V2.k
    public final void k() {
    }
}
