package p260y9;

import kotlin.jvm.internal.m;
import p251x9.a;
import p251x9.b;

/* JADX INFO: renamed from: y9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2376l extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2376l f29302c = new C2376l(C2377m.f29304a);

    @Override // p260y9.AbstractC2365a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        m.f(cArr, "<this>");
        return cArr.length;
    }

    @Override // p260y9.AbstractC2378n, p260y9.AbstractC2365a
    public final void f(a aVar, int i10, Object obj) {
        C2375k builder = (C2375k) obj;
        m.f(builder, "builder");
        char cG = aVar.g(this.f29259b, i10);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f29298a;
        int i11 = builder.f29299b;
        builder.f29299b = i11 + 1;
        cArr[i11] = cG;
    }

    @Override // p260y9.AbstractC2365a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        m.f(cArr, "<this>");
        C2375k c2375k = new C2375k();
        c2375k.f29298a = cArr;
        c2375k.f29299b = cArr.length;
        c2375k.b(10);
        return c2375k;
    }

    @Override // p260y9.U
    public final Object j() {
        return new char[0];
    }

    @Override // p260y9.U
    public final void k(b encoder, Object obj, int i10) {
        char[] content = (char[]) obj;
        m.f(encoder, "encoder");
        m.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.r(this.f29259b, i11, content[i11]);
        }
    }
}
