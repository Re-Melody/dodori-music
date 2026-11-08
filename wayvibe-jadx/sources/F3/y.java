package F3;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public final class y implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f4497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B2.u f4498b = new B2.u(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4502f;

    public y(x xVar) {
        this.f4497a = xVar;
    }

    @Override // F3.C
    public final void a(B2.A a10, Z2.q qVar, D4.x xVar) {
        this.f4497a.a(a10, qVar, xVar);
        this.f4502f = true;
    }

    @Override // F3.C
    public final void b(int i10, B2.u uVar) {
        int iT;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iT = uVar.f631b + uVar.t();
        } else {
            iT = -1;
        }
        if (this.f4502f) {
            if (!z10) {
                return;
            }
            this.f4502f = false;
            uVar.F(iT);
            this.f4500d = 0;
        }
        while (uVar.a() > 0) {
            int i11 = this.f4500d;
            B2.u uVar2 = this.f4498b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iT2 = uVar.t();
                    uVar.F(uVar.f631b - 1);
                    if (iT2 == 255) {
                        this.f4502f = true;
                        return;
                    }
                }
                int iMin = Math.min(uVar.a(), 3 - this.f4500d);
                uVar.e(uVar2.f630a, this.f4500d, iMin);
                int i12 = this.f4500d + iMin;
                this.f4500d = i12;
                if (i12 == 3) {
                    uVar2.F(0);
                    uVar2.E(3);
                    uVar2.G(1);
                    int iT3 = uVar2.t();
                    int iT4 = uVar2.t();
                    this.f4501e = (iT3 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0;
                    int i13 = (((iT3 & 15) << 8) | iT4) + 3;
                    this.f4499c = i13;
                    byte[] bArr = uVar2.f630a;
                    if (bArr.length < i13) {
                        uVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(uVar.a(), this.f4499c - this.f4500d);
                uVar.e(uVar2.f630a, this.f4500d, iMin2);
                int i14 = this.f4500d + iMin2;
                this.f4500d = i14;
                int i15 = this.f4499c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f4501e) {
                        uVar2.E(i15);
                    } else {
                        if (B2.C.m(0, uVar2.f630a, i15, -1) != 0) {
                            this.f4502f = true;
                            return;
                        }
                        uVar2.E(this.f4499c - 4);
                    }
                    uVar2.F(0);
                    this.f4497a.c(uVar2);
                    this.f4500d = 0;
                }
            }
        }
    }

    @Override // F3.C
    public final void d() {
        this.f4502f = true;
    }
}
