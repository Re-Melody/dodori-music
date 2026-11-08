package p260y9;

import kotlin.jvm.internal.m;
import p251x9.a;
import p251x9.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f29268c = new a0(b0.f29269a);

    @Override // p260y9.AbstractC2365a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        m.f(sArr, "<this>");
        return sArr.length;
    }

    @Override // p260y9.AbstractC2378n, p260y9.AbstractC2365a
    public final void f(a aVar, int i10, Object obj) {
        Z builder = (Z) obj;
        m.f(builder, "builder");
        short sD = aVar.D(this.f29259b, i10);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f29266a;
        int i11 = builder.f29267b;
        builder.f29267b = i11 + 1;
        sArr[i11] = sD;
    }

    @Override // p260y9.AbstractC2365a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        m.f(sArr, "<this>");
        Z z10 = new Z();
        z10.f29266a = sArr;
        z10.f29267b = sArr.length;
        z10.b(10);
        return z10;
    }

    @Override // p260y9.U
    public final Object j() {
        return new short[0];
    }

    @Override // p260y9.U
    public final void k(b encoder, Object obj, int i10) {
        short[] content = (short[]) obj;
        m.f(encoder, "encoder");
        m.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.i(this.f29259b, i11, content[i11]);
        }
    }
}
