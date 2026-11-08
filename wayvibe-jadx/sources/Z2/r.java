package Z2;

import B2.AbstractC0111a;

/* JADX INFO: loaded from: classes.dex */
public class r implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13566c;

    public /* synthetic */ r(Object obj, long j10, int i10) {
        this.f13564a = i10;
        this.f13566c = obj;
        this.f13565b = j10;
    }

    @Override // Z2.z
    public final boolean d() {
        switch (this.f13564a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // Z2.z
    public final y i(long j10) {
        switch (this.f13564a) {
            case 0:
                s sVar = (s) this.f13566c;
                AbstractC0111a.i(sVar.k);
                B4.d dVar = sVar.k;
                long[] jArr = dVar.f665a;
                int iF = B2.C.f(jArr, B2.C.k((((long) sVar.f13571e) * j10) / 1000000, 0L, sVar.f13576j - 1), false);
                long j11 = iF == -1 ? 0L : jArr[iF];
                long[] jArr2 = dVar.f666b;
                long j12 = iF != -1 ? jArr2[iF] : 0L;
                int i10 = sVar.f13571e;
                long j13 = (j11 * 1000000) / ((long) i10);
                long j14 = this.f13565b;
                A a10 = new A(j13, j12 + j14);
                if (j13 == j10 || iF == jArr.length - 1) {
                    return new y(a10, a10);
                }
                int i11 = iF + 1;
                return new y(a10, new A((jArr[i11] * 1000000) / ((long) i10), j14 + jArr2[i11]));
            case 1:
                return (y) this.f13566c;
            default:
                p019b3.b bVar = (p019b3.b) this.f13566c;
                y yVarB = bVar.f15725i[0].b(j10);
                int i12 = 1;
                while (true) {
                    p019b3.e[] eVarArr = bVar.f15725i;
                    if (i12 >= eVarArr.length) {
                        return yVarB;
                    }
                    y yVarB2 = eVarArr[i12].b(j10);
                    if (yVarB2.f13603a.f13457b < yVarB.f13603a.f13457b) {
                        yVarB = yVarB2;
                    }
                    i12++;
                }
                break;
        }
    }

    @Override // Z2.z
    public final long l() {
        switch (this.f13564a) {
            case 0:
                return ((s) this.f13566c).b();
            case 1:
                return this.f13565b;
            default:
                return this.f13565b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(long j10) {
        this(j10, 0L);
        this.f13564a = 1;
    }

    public r(long j10, long j11) {
        this.f13564a = 1;
        this.f13565b = j10;
        A a10 = j11 == 0 ? A.f13455c : new A(0L, j11);
        this.f13566c = new y(a10, a10);
    }
}
