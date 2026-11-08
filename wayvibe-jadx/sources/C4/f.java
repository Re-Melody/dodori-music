package C4;

import B2.AbstractC0111a;
import B2.C;
import p140m7.C2061m;
import p230w.A;
import p230w.AbstractC2285s;
import p230w.D;
import p230w.F;
import p230w.r0;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e, p203t3.c, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1337c;

    public f() {
        this.f1337c = new f[256];
        this.f1335a = 0;
        this.f1336b = 0;
    }

    @Override // C4.e
    public int a() {
        return this.f1336b;
    }

    @Override // C4.e
    public int b() {
        int i10 = this.f1335a;
        return i10 == 0 ? ((X4.f) this.f1337c).q() : i10;
    }

    @Override // C4.e
    public boolean c() {
        return this.f1335a != 0;
    }

    @Override // p230w.q0
    public AbstractC2285s e(long j10, AbstractC2285s abstractC2285s, AbstractC2285s abstractC2285s2, AbstractC2285s abstractC2285s3) {
        return ((C2061m) this.f1337c).e(j10, abstractC2285s, abstractC2285s2, abstractC2285s3);
    }

    @Override // p203t3.c
    public int f() {
        return this.f1335a;
    }

    @Override // p230w.q0
    public AbstractC2285s g(long j10, AbstractC2285s abstractC2285s, AbstractC2285s abstractC2285s2, AbstractC2285s abstractC2285s3) {
        return ((C2061m) this.f1337c).g(j10, abstractC2285s, abstractC2285s2, abstractC2285s3);
    }

    @Override // p203t3.c
    public int h() {
        return this.f1336b;
    }

    @Override // p230w.r0
    public int i() {
        return this.f1336b;
    }

    @Override // p203t3.c
    public int j() {
        int i10 = this.f1335a;
        return i10 == -1 ? ((B2.u) this.f1337c).x() : i10;
    }

    @Override // p230w.r0
    public int l() {
        return this.f1335a;
    }

    public f(int i10, int i11, int i12) {
        switch (i12) {
            case 3:
                this.f1335a = i11;
                this.f1337c = new byte[(i11 * 2) - 1];
                this.f1336b = 0;
                break;
            default:
                this.f1337c = null;
                this.f1335a = i10;
                int i13 = i11 & 7;
                this.f1336b = i13 == 0 ? 8 : i13;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(int i10, int i11, Z8.a aVar) {
        this.f1335a = i10;
        this.f1336b = i11;
        this.f1337c = (kotlin.jvm.internal.n) aVar;
    }

    public f(int i10, int i11, A a10) {
        this.f1335a = i10;
        this.f1336b = i11;
        this.f1337c = new C2061m((D) new F(i10, i11, a10));
    }

    public f(b bVar) {
        X4.f fVar = bVar.f1230V0;
        this.f1337c = fVar;
        fVar.f(12);
        this.f1335a = fVar.q();
        this.f1336b = fVar.q();
    }

    public f(p203t3.b bVar, C2339o c2339o) {
        B2.u uVar = bVar.f26700c;
        this.f1337c = uVar;
        uVar.F(12);
        int iX = uVar.x();
        if ("audio/raw".equals(c2339o.f28954m)) {
            int iZ = C.z(c2339o.f28934C, c2339o.f28932A);
            if (iX == 0 || iX % iZ != 0) {
                AbstractC0111a.x("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iZ + ", stsz sample size: " + iX);
                iX = iZ;
            }
        }
        this.f1335a = iX == 0 ? -1 : iX;
        this.f1336b = uVar.x();
    }
}
