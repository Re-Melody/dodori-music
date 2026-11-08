package com.amazon.a.a.n.a;

import com.amazon.d.a.j;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16326b = new com.amazon.a.a.o.c("KiwiCommand");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.amazon.a.a.j.a f16327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f16331g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f16333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f16334j;
    private h k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.amazon.a.b.f f16332h = new com.amazon.a.b.f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f16335l = false;

    public h(com.amazon.a.a.j.a aVar, String str, String str2, String str3, String str4) {
        this.f16327c = aVar;
        this.f16328d = str3;
        this.f16329e = str;
        this.f16330f = str2;
        HashMap map = new HashMap();
        this.f16331g = map;
        map.put("requestId", str3);
        map.put("sdkVersion", str4);
        this.f16333i = true;
        this.f16334j = null;
        this.k = null;
    }

    public h a(boolean z10) {
        this.f16335l = z10;
        return this;
    }

    @Override // com.amazon.a.a.n.a.a
    public String a_() {
        return this.f16329e;
    }

    public abstract boolean b(j jVar);

    @Override // com.amazon.a.a.n.a.a
    public boolean d() {
        return true;
    }

    public boolean i() {
        return this.f16335l;
    }

    public com.amazon.a.a.j.a j() {
        return this.f16327c;
    }

    public String k() {
        return this.f16328d;
    }

    public void l() {
        com.amazon.a.a.a(this);
    }

    public void a(h hVar) {
        this.f16334j = hVar;
    }

    public void b(h hVar) {
        this.k = hVar;
    }

    @Override // com.amazon.a.a.n.a.a
    public String c() {
        return this.f16330f;
    }

    public void a(String str, Object obj) {
        this.f16331g.put(str, obj);
    }

    @Override // com.amazon.a.a.n.a.a
    public Map<String, Object> b() {
        return this.f16331g;
    }

    private void a(com.amazon.a.a.i.c cVar) {
        if (cVar == null) {
            return;
        }
        com.amazon.a.a.i.a aVar = new com.amazon.a.a.i.a(cVar);
        com.amazon.a.a.i.e eVarA = com.amazon.a.a.a();
        if (eVarA == null) {
            f16326b.b("Prompt manager is null. Cannot show prompt dropping request");
        } else {
            eVarA.a((com.amazon.a.a.i.b) aVar);
        }
    }

    public void b(boolean z10) {
        this.f16333i = z10;
    }

    @Override // com.amazon.a.a.n.a.a
    public void b(com.amazon.a.a.d.b bVar) {
        h hVar;
        if ("UNHANDLED_EXCEPTION".equals(bVar.a()) && com.amazon.a.a.o.b.ah.equals(this.f16330f) && (hVar = this.k) != null) {
            hVar.a(this.f16335l);
            this.k.l();
            return;
        }
        try {
            c(bVar);
        } catch (Exception e2) {
            f16326b.a("Error calling onResult: " + e2);
        }
        if (this.f16333i) {
            a(this.f16332h.a(bVar));
        }
        if (this.f16335l) {
            return;
        }
        this.f16327c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(j jVar) {
        boolean zB;
        h hVar;
        String str = (String) jVar.b().get(com.amazon.a.a.o.b.f16407f);
        f16326b.a("onSuccess: result = " + jVar + ", errorMessage: " + str);
        if (com.amazon.a.a.o.f.a(str)) {
            try {
                zB = b(jVar);
            } catch (Exception e2) {
                f16326b.a("Error calling onResult: " + e2);
                zB = false;
            }
            if (zB && (hVar = this.f16334j) != null) {
                hVar.l();
                return;
            } else {
                if (this.f16335l) {
                    return;
                }
                if (zB) {
                    this.f16327c.b();
                    return;
                } else {
                    this.f16327c.c();
                    return;
                }
            }
        }
        if (this.f16335l) {
            return;
        }
        this.f16327c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(com.amazon.d.a.h hVar) {
        String str;
        h hVar2;
        f16326b.a("onFailure: result = " + hVar);
        if (hVar != null && (str = (String) hVar.f().get(com.amazon.a.a.o.b.an)) != null && str.equalsIgnoreCase("1.0") && (hVar2 = this.k) != null) {
            hVar2.a(this.f16335l);
            this.k.l();
            return;
        }
        try {
            b(hVar);
        } catch (Exception e2) {
            f16326b.a("Error calling onResult: " + e2);
        }
        if (this.f16333i) {
            a(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e()));
        }
        if (this.f16335l) {
            return;
        }
        this.f16327c.c();
    }

    public void b(com.amazon.d.a.h hVar) {
    }

    public void c(com.amazon.a.a.d.b bVar) {
    }
}
