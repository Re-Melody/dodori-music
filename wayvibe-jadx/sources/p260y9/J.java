package p260y9;

import kotlin.jvm.internal.m;
import p251x9.a;
import p251x9.b;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f29236c = new J(K.f29237a);

    @Override // p260y9.AbstractC2365a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        m.f(jArr, "<this>");
        return jArr.length;
    }

    @Override // p260y9.AbstractC2378n, p260y9.AbstractC2365a
    public final void f(a aVar, int i10, Object obj) {
        I builder = (I) obj;
        m.f(builder, "builder");
        long jH = aVar.h(this.f29259b, i10);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f29234a;
        int i11 = builder.f29235b;
        builder.f29235b = i11 + 1;
        jArr[i11] = jH;
    }

    @Override // p260y9.AbstractC2365a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        m.f(jArr, "<this>");
        I i10 = new I();
        i10.f29234a = jArr;
        i10.f29235b = jArr.length;
        i10.b(10);
        return i10;
    }

    @Override // p260y9.U
    public final Object j() {
        return new long[0];
    }

    @Override // p260y9.U
    public final void k(b encoder, Object obj, int i10) {
        long[] content = (long[]) obj;
        m.f(encoder, "encoder");
        m.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.C(this.f29259b, i11, content[i11]);
        }
    }
}
