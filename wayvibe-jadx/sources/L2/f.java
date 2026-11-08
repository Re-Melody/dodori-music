package L2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends S2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7503e;

    public f(List list, long j10) {
        super(0L, list.size() - 1);
        this.f7503e = j10;
        this.f7502d = list;
    }

    @Override // S2.k
    public final long e() {
        a();
        return this.f7503e + ((M2.g) this.f7502d.get((int) this.f11021c)).f8152e;
    }

    @Override // S2.k
    public final long f() {
        a();
        M2.g gVar = (M2.g) this.f7502d.get((int) this.f11021c);
        return this.f7503e + gVar.f8152e + gVar.f8150c;
    }
}
