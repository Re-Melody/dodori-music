package C4;

import Z2.AbstractC0961b;
import p255y2.D;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f1333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f1334i;

    public d(X4.f fVar, X4.f fVar2, boolean z10) {
        this.f1334i = fVar;
        this.f1333h = fVar2;
        this.f1330e = z10;
        fVar2.f(12);
        this.f1326a = fVar2.q();
        fVar.f(12);
        this.f1332g = fVar.q();
        X4.a.r(fVar.n() == 1, "first_chunk must be 1");
        this.f1327b = -1;
    }

    public boolean a() {
        int i10 = this.f1327b + 1;
        this.f1327b = i10;
        if (i10 == this.f1326a) {
            return false;
        }
        boolean z10 = this.f1330e;
        X4.f fVar = (X4.f) this.f1333h;
        this.f1329d = z10 ? fVar.r() : fVar.m();
        if (this.f1327b == this.f1331f) {
            X4.f fVar2 = (X4.f) this.f1334i;
            this.f1328c = fVar2.q();
            fVar2.g(4);
            int i11 = this.f1332g - 1;
            this.f1332g = i11;
            this.f1331f = i11 > 0 ? fVar2.q() - 1 : -1;
        }
        return true;
    }

    public boolean b() {
        int i10 = this.f1327b + 1;
        this.f1327b = i10;
        if (i10 == this.f1326a) {
            return false;
        }
        boolean z10 = this.f1330e;
        B2.u uVar = (B2.u) this.f1333h;
        this.f1329d = z10 ? uVar.y() : uVar.v();
        if (this.f1327b == this.f1331f) {
            B2.u uVar2 = (B2.u) this.f1334i;
            this.f1328c = uVar2.x();
            uVar2.G(4);
            int i11 = this.f1332g - 1;
            this.f1332g = i11;
            this.f1331f = i11 > 0 ? uVar2.x() - 1 : -1;
        }
        return true;
    }

    public d(B2.u uVar, B2.u uVar2, boolean z10) throws D {
        this.f1334i = uVar;
        this.f1333h = uVar2;
        this.f1330e = z10;
        uVar2.F(12);
        this.f1326a = uVar2.x();
        uVar.F(12);
        this.f1332g = uVar.x();
        AbstractC0961b.c("first_chunk must be 1", uVar.g() == 1);
        this.f1327b = -1;
    }
}
