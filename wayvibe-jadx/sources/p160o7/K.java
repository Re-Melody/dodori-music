package p160o7;

import F.C0356a;
import S5.d;
import W9.j;
import p170p7.h;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class K implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f23698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0356a f23699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23700c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2190t f23701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f23702e;

    public K(O o10, C0356a c0356a) {
        this.f23698a = o10;
        this.f23701d = new C2190t(this, c0356a);
    }

    @Override // p160o7.B
    public final void E(h hVar) {
        a(hVar);
    }

    @Override // p160o7.B
    public final void I(h hVar) {
        a(hVar);
    }

    @Override // p160o7.B
    public final void M(W w10) {
        this.f23698a.f23712g.a(w10.b(r()));
    }

    @Override // p160o7.B
    public final void O(j jVar) {
        this.f23702e = jVar;
    }

    public final void a(h hVar) {
        this.f23698a.J0("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", d.u(hVar.f25264a), Long.valueOf(r()));
    }

    @Override // p160o7.B
    public final void f() {
        c.z("Committing a transaction without having started one", this.f23700c != -1, new Object[0]);
        this.f23700c = -1L;
    }

    @Override // p160o7.B
    public final void j() {
        c.z("Starting a transaction without committing the previous one", this.f23700c == -1, new Object[0]);
        C0356a c0356a = this.f23699b;
        long j10 = c0356a.f3516a + 1;
        c0356a.f3516a = j10;
        this.f23700c = j10;
    }

    @Override // p160o7.B
    public final long r() {
        c.z("Attempting to get a sequence number outside of a transaction", this.f23700c != -1, new Object[0]);
        return this.f23700c;
    }

    @Override // p160o7.B
    public final void t(h hVar) {
        a(hVar);
    }

    @Override // p160o7.B
    public final void v(h hVar) {
        a(hVar);
    }
}
