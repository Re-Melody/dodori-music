package p026ba;

import H4.g;
import W9.b;
import W9.f;
import W9.k;
import Z9.w;
import java.util.ArrayList;
import p014aa.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public void b(w wVar) {
        Z9.a aVarE = e();
        if (aVarE.f14050f == null) {
            aVarE.f14050f = new ArrayList();
        }
        aVarE.f14050f.add(wVar);
    }

    public boolean c(Z9.a aVar) {
        return this instanceof b;
    }

    public abstract Z9.a e();

    public boolean f() {
        return this instanceof b;
    }

    public abstract g h(f fVar);

    public void d() {
    }

    public void a(c cVar) {
    }

    public void g(k kVar) {
    }
}
