package com.amazon.a.b;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.amazon.a.a.n.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16511a = new com.amazon.a.a.o.c("LicenseKillTask");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f16512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f16513c;

    private boolean b() {
        return this.f16512b.b(com.amazon.a.a.m.c.f16233b);
    }

    private com.amazon.a.a.i.c c() {
        com.amazon.a.a.i.c cVar = (com.amazon.a.a.i.c) this.f16512b.a(com.amazon.a.a.m.c.f16234c);
        if (cVar == null) {
            return e.f16519e;
        }
        if (com.amazon.a.a.o.c.f16456a) {
            f16511a.a("Fetched failure content from store: " + cVar);
        }
        this.f16512b.c(com.amazon.a.a.m.c.f16234c);
        return cVar;
    }

    @Override // com.amazon.a.a.n.a
    public void a() {
        if (com.amazon.a.a.o.c.f16456a) {
            f16511a.a("License Kill Task Executing!!!");
        }
        if (b()) {
            f16511a.c("license verification succeeded");
            return;
        }
        if (com.amazon.a.a.o.c.f16456a) {
            f16511a.a("License Kill Task determined app is not licensed, killing app");
        }
        if (m()) {
            n();
        }
        this.f16513c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(c()));
    }
}
