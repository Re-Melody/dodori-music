package p260y9;

import kotlin.jvm.internal.m;
import p251x9.a;
import p251x9.b;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f29224c = new D(E.f29225a);

    @Override // p260y9.AbstractC2365a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        m.f(iArr, "<this>");
        return iArr.length;
    }

    @Override // p260y9.AbstractC2378n, p260y9.AbstractC2365a
    public final void f(a aVar, int i10, Object obj) {
        C builder = (C) obj;
        m.f(builder, "builder");
        int iY = aVar.y(this.f29259b, i10);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f29222a;
        int i11 = builder.f29223b;
        builder.f29223b = i11 + 1;
        iArr[i11] = iY;
    }

    @Override // p260y9.AbstractC2365a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        m.f(iArr, "<this>");
        C c3 = new C();
        c3.f29222a = iArr;
        c3.f29223b = iArr.length;
        c3.b(10);
        return c3;
    }

    @Override // p260y9.U
    public final Object j() {
        return new int[0];
    }

    @Override // p260y9.U
    public final void k(b encoder, Object obj, int i10) {
        int[] content = (int[]) obj;
        m.f(encoder, "encoder");
        m.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.p(i11, content[i11], this.f29259b);
        }
    }
}
