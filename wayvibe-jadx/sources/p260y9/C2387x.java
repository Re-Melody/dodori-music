package p260y9;

import kotlin.jvm.internal.m;
import p251x9.a;
import p251x9.b;

/* JADX INFO: renamed from: y9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2387x extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2387x f29339c = new C2387x(C2388y.f29340a);

    @Override // p260y9.AbstractC2365a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        m.f(fArr, "<this>");
        return fArr.length;
    }

    @Override // p260y9.AbstractC2378n, p260y9.AbstractC2365a
    public final void f(a aVar, int i10, Object obj) {
        C2386w builder = (C2386w) obj;
        m.f(builder, "builder");
        float fS = aVar.s(this.f29259b, i10);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f29337a;
        int i11 = builder.f29338b;
        builder.f29338b = i11 + 1;
        fArr[i11] = fS;
    }

    @Override // p260y9.AbstractC2365a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        m.f(fArr, "<this>");
        C2386w c2386w = new C2386w();
        c2386w.f29337a = fArr;
        c2386w.f29338b = fArr.length;
        c2386w.b(10);
        return c2386w;
    }

    @Override // p260y9.U
    public final Object j() {
        return new float[0];
    }

    @Override // p260y9.U
    public final void k(b encoder, Object obj, int i10) {
        float[] content = (float[]) obj;
        m.f(encoder, "encoder");
        m.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.x(this.f29259b, i11, content[i11]);
        }
    }
}
