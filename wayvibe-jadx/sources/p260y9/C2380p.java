package p260y9;

import kotlin.jvm.internal.m;
import p251x9.a;
import p251x9.b;

/* JADX INFO: renamed from: y9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2380p extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2380p f29314c = new C2380p(C2381q.f29317a);

    @Override // p260y9.AbstractC2365a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        m.f(dArr, "<this>");
        return dArr.length;
    }

    @Override // p260y9.AbstractC2378n, p260y9.AbstractC2365a
    public final void f(a aVar, int i10, Object obj) {
        C2379o builder = (C2379o) obj;
        m.f(builder, "builder");
        double dL = aVar.l(this.f29259b, i10);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f29311a;
        int i11 = builder.f29312b;
        builder.f29312b = i11 + 1;
        dArr[i11] = dL;
    }

    @Override // p260y9.AbstractC2365a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        m.f(dArr, "<this>");
        C2379o c2379o = new C2379o();
        c2379o.f29311a = dArr;
        c2379o.f29312b = dArr.length;
        c2379o.b(10);
        return c2379o;
    }

    @Override // p260y9.U
    public final Object j() {
        return new double[0];
    }

    @Override // p260y9.U
    public final void k(b encoder, Object obj, int i10) {
        double[] content = (double[]) obj;
        m.f(encoder, "encoder");
        m.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.f(this.f29259b, i11, content[i11]);
        }
    }
}
