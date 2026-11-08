package p260y9;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p240w9.g;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends Q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f29220l;

    public A(String str, InterfaceC2389z interfaceC2389z) {
        super(str, interfaceC2389z, 1);
        this.f29220l = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [M8.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [M8.h, java.lang.Object] */
    @Override // p260y9.Q
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            g gVar = (g) obj;
            if (this.f29248a.equals(gVar.a())) {
                A a10 = (A) obj;
                if (a10.f29220l && Arrays.equals((g[]) this.f29257j.getValue(), (g[]) a10.f29257j.getValue())) {
                    int iF = gVar.f();
                    int i10 = this.f29250c;
                    if (i10 == iF) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (m.b(i(i11).a(), gVar.i(i11).a()) && m.b(i(i11).e(), gVar.i(i11).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p260y9.Q
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p260y9.Q, p240w9.g
    public final boolean isInline() {
        return this.f29220l;
    }
}
