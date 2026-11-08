package p260y9;

import kotlin.jvm.internal.m;
import p251x9.a;
import p251x9.b;

/* JADX INFO: renamed from: y9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2369e extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2369e f29280c = new C2369e(C2370f.f29283a);

    @Override // p260y9.AbstractC2365a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        m.f(zArr, "<this>");
        return zArr.length;
    }

    @Override // p260y9.AbstractC2378n, p260y9.AbstractC2365a
    public final void f(a aVar, int i10, Object obj) {
        C2368d builder = (C2368d) obj;
        m.f(builder, "builder");
        boolean zR = aVar.r(this.f29259b, i10);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f29274a;
        int i11 = builder.f29275b;
        builder.f29275b = i11 + 1;
        zArr[i11] = zR;
    }

    @Override // p260y9.AbstractC2365a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        m.f(zArr, "<this>");
        C2368d c2368d = new C2368d();
        c2368d.f29274a = zArr;
        c2368d.f29275b = zArr.length;
        c2368d.b(10);
        return c2368d;
    }

    @Override // p260y9.U
    public final Object j() {
        return new boolean[0];
    }

    @Override // p260y9.U
    public final void k(b encoder, Object obj, int i10) {
        boolean[] content = (boolean[]) obj;
        m.f(encoder, "encoder");
        m.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.s(this.f29259b, i11, content[i11]);
        }
    }
}
