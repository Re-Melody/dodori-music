package H3;

import B2.u;
import F.C0356a;
import Z2.B;
import Z2.k;
import Z2.o;
import Z2.p;
import Z2.q;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f5989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f5990c;

    public a(int i10) {
        this.f5988a = i10;
        switch (i10) {
            case 1:
                this.f5989b = new u(4);
                this.f5990c = new B(-1, -1, "image/avif");
                break;
            case 2:
                this.f5989b = new u(4);
                this.f5990c = new B(-1, -1, "image/heif");
                break;
            default:
                this.f5989b = new u(4);
                this.f5990c = new B(-1, -1, "image/webp");
                break;
        }
    }

    @Override // Z2.o
    public final int e(p pVar, C0356a c0356a) {
        switch (this.f5988a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f5990c.e(pVar, c0356a);
    }

    @Override // Z2.o
    public final void f(long j10, long j11) {
        switch (this.f5988a) {
            case 0:
                this.f5990c.f(j10, j11);
                break;
            case 1:
                this.f5990c.f(j10, j11);
                break;
            default:
                this.f5990c.f(j10, j11);
                break;
        }
    }

    @Override // Z2.o
    public final boolean g(p pVar) throws EOFException, InterruptedIOException {
        switch (this.f5988a) {
            case 0:
                u uVar = this.f5989b;
                uVar.C(4);
                k kVar = (k) pVar;
                kVar.f(uVar.f630a, 0, 4, false);
                if (uVar.v() != 1380533830) {
                    return false;
                }
                kVar.a(4, false);
                uVar.C(4);
                kVar.f(uVar.f630a, 0, 4, false);
                return uVar.v() == 1464156752;
            case 1:
                k kVar2 = (k) pVar;
                kVar2.a(4, false);
                u uVar2 = this.f5989b;
                uVar2.C(4);
                kVar2.f(uVar2.f630a, 0, 4, false);
                if (uVar2.v() != 1718909296) {
                    return false;
                }
                uVar2.C(4);
                kVar2.f(uVar2.f630a, 0, 4, false);
                return uVar2.v() == ((long) 1635150182);
            default:
                k kVar3 = (k) pVar;
                kVar3.a(4, false);
                u uVar3 = this.f5989b;
                uVar3.C(4);
                kVar3.f(uVar3.f630a, 0, 4, false);
                if (uVar3.v() != 1718909296) {
                    return false;
                }
                uVar3.C(4);
                kVar3.f(uVar3.f630a, 0, 4, false);
                return uVar3.v() == ((long) 1751476579);
        }
    }

    @Override // Z2.o
    public final void k(q qVar) {
        switch (this.f5988a) {
            case 0:
                this.f5990c.k(qVar);
                break;
            case 1:
                this.f5990c.k(qVar);
                break;
            default:
                this.f5990c.k(qVar);
                break;
        }
    }

    @Override // Z2.o
    public final void release() {
        int i10 = this.f5988a;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
