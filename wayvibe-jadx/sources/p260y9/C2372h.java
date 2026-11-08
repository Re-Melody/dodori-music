package p260y9;

import kotlin.jvm.internal.m;
import p251x9.a;
import p251x9.b;

/* JADX INFO: renamed from: y9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2372h extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2372h f29290c = new C2372h(C2373i.f29293a);

    @Override // p260y9.AbstractC2365a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        m.f(bArr, "<this>");
        return bArr.length;
    }

    @Override // p260y9.AbstractC2378n, p260y9.AbstractC2365a
    public final void f(a aVar, int i10, Object obj) {
        C2371g builder = (C2371g) obj;
        m.f(builder, "builder");
        byte bJ = aVar.j(this.f29259b, i10);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f29286a;
        int i11 = builder.f29287b;
        builder.f29287b = i11 + 1;
        bArr[i11] = bJ;
    }

    @Override // p260y9.AbstractC2365a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        m.f(bArr, "<this>");
        C2371g c2371g = new C2371g();
        c2371g.f29286a = bArr;
        c2371g.f29287b = bArr.length;
        c2371g.b(10);
        return c2371g;
    }

    @Override // p260y9.U
    public final Object j() {
        return new byte[0];
    }

    @Override // p260y9.U
    public final void k(b encoder, Object obj, int i10) {
        byte[] content = (byte[]) obj;
        m.f(encoder, "encoder");
        m.f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.E(this.f29259b, i11, content[i11]);
        }
    }
}
