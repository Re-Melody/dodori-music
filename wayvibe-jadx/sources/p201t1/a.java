package p201t1;

import java.util.ArrayList;
import p192s1.c;
import p192s1.e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public i[] f26547i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f26548j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f26549k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ArrayList f26550l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f26551m0;

    @Override // p201t1.i
    public final void a(c cVar) {
        boolean z10;
        int i10;
        f[] fVarArr = this.f26580A;
        f fVar = this.f26630s;
        fVarArr[0] = fVar;
        f fVar2 = this.f26631t;
        fVarArr[2] = fVar2;
        f fVar3 = this.f26632u;
        fVarArr[1] = fVar3;
        f fVar4 = this.f26633v;
        fVarArr[3] = fVar4;
        for (f fVar5 : fVarArr) {
            fVar5.f26577i = cVar.j(fVar5);
        }
        int i11 = this.f26549k0;
        if (i11 < 0 || i11 >= 4) {
            return;
        }
        f fVar6 = fVarArr[i11];
        int i12 = 0;
        while (true) {
            if (i12 >= this.f26548j0) {
                z10 = false;
                break;
            }
            i iVar = this.f26547i0[i12];
            if ((this.f26551m0 || iVar.b()) && ((((i10 = this.f26549k0) == 0 || i10 == 1) && iVar.f26582C[0] == h.MATCH_CONSTRAINT) || ((i10 == 2 || i10 == 3) && iVar.f26582C[1] == h.MATCH_CONSTRAINT))) {
                z10 = true;
                break;
            }
            i12++;
        }
        int i13 = this.f26549k0;
        if (i13 == 0 || i13 == 1 ? this.f26583D.f26582C[0] == h.WRAP_CONTENT : this.f26583D.f26582C[1] == h.WRAP_CONTENT) {
            z10 = false;
        }
        for (int i14 = 0; i14 < this.f26548j0; i14++) {
            i iVar2 = this.f26547i0[i14];
            if (this.f26551m0 || iVar2.b()) {
                e eVarJ = cVar.j(iVar2.f26580A[this.f26549k0]);
                int i15 = this.f26549k0;
                iVar2.f26580A[i15].f26577i = eVarJ;
                if (i15 == 0 || i15 == 2) {
                    e eVar = fVar6.f26577i;
                    p192s1.a aVarK = cVar.k();
                    e eVarL = cVar.l();
                    eVarL.f26060c = 0;
                    aVarK.d(eVar, eVarJ, eVarL, 0);
                    if (z10) {
                        p100j1.a aVar = aVarK.f26042c;
                        aVar.l(cVar.i(1), (int) (aVar.e(eVarL) * (-1.0f)));
                    }
                    cVar.c(aVarK);
                } else {
                    e eVar2 = fVar6.f26577i;
                    p192s1.a aVarK2 = cVar.k();
                    e eVarL2 = cVar.l();
                    eVarL2.f26060c = 0;
                    aVarK2.c(eVar2, eVarJ, eVarL2, 0);
                    if (z10) {
                        p100j1.a aVar2 = aVarK2.f26042c;
                        aVar2.l(cVar.i(1), (int) (aVar2.e(eVarL2) * (-1.0f)));
                    }
                    cVar.c(aVarK2);
                }
            }
        }
        int i16 = this.f26549k0;
        if (i16 == 0) {
            cVar.e(fVar3.f26577i, fVar.f26577i, 0, 6);
            if (z10) {
                return;
            }
            cVar.e(fVar.f26577i, this.f26583D.f26632u.f26577i, 0, 5);
            return;
        }
        if (i16 == 1) {
            cVar.e(fVar.f26577i, fVar3.f26577i, 0, 6);
            if (z10) {
                return;
            }
            cVar.e(fVar.f26577i, this.f26583D.f26630s.f26577i, 0, 5);
            return;
        }
        if (i16 == 2) {
            cVar.e(fVar4.f26577i, fVar2.f26577i, 0, 6);
            if (z10) {
                return;
            }
            cVar.e(fVar2.f26577i, this.f26583D.f26633v.f26577i, 0, 5);
            return;
        }
        if (i16 == 3) {
            cVar.e(fVar2.f26577i, fVar4.f26577i, 0, 6);
            if (z10) {
                return;
            }
            cVar.e(fVar2.f26577i, this.f26583D.f26631t.f26577i, 0, 5);
        }
    }

    @Override // p201t1.i
    public final boolean b() {
        return true;
    }

    @Override // p201t1.i
    public final void c(int i10) {
        o oVar;
        o oVar2;
        i iVar = this.f26583D;
        if (iVar != null && ((j) iVar).D(2)) {
            int i11 = this.f26549k0;
            f fVar = this.f26630s;
            f fVar2 = this.f26632u;
            f fVar3 = this.f26631t;
            f fVar4 = this.f26633v;
            if (i11 == 0) {
                oVar = fVar.f26569a;
            } else if (i11 == 1) {
                oVar = fVar2.f26569a;
            } else if (i11 == 2) {
                oVar = fVar3.f26569a;
            } else if (i11 != 3) {
                return;
            } else {
                oVar = fVar4.f26569a;
            }
            oVar.f26677h = 5;
            if (i11 == 0 || i11 == 1) {
                fVar3.f26569a.k(null, 0.0f);
                fVar4.f26569a.k(null, 0.0f);
            } else {
                fVar.f26569a.k(null, 0.0f);
                fVar2.f26569a.k(null, 0.0f);
            }
            ArrayList arrayList = this.f26550l0;
            arrayList.clear();
            for (int i12 = 0; i12 < this.f26548j0; i12++) {
                i iVar2 = this.f26547i0[i12];
                if (this.f26551m0 || iVar2.b()) {
                    int i13 = this.f26549k0;
                    if (i13 == 0) {
                        oVar2 = iVar2.f26630s.f26569a;
                    } else if (i13 == 1) {
                        oVar2 = iVar2.f26632u.f26569a;
                    } else if (i13 != 2) {
                        oVar2 = i13 != 3 ? null : iVar2.f26633v.f26569a;
                    } else {
                        oVar2 = iVar2.f26631t.f26569a;
                    }
                    if (oVar2 != null) {
                        arrayList.add(oVar2);
                        oVar2.a(oVar);
                    }
                }
            }
        }
    }

    @Override // p201t1.i
    public final void p() {
        super.p();
        this.f26550l0.clear();
    }

    @Override // p201t1.i
    public final void r() {
        o oVar;
        float f10;
        o oVar2;
        int i10 = this.f26549k0;
        f fVar = this.f26630s;
        f fVar2 = this.f26632u;
        f fVar3 = this.f26631t;
        f fVar4 = this.f26633v;
        float f11 = Float.MAX_VALUE;
        if (i10 != 0) {
            if (i10 == 1) {
                oVar = fVar2.f26569a;
            } else if (i10 == 2) {
                oVar = fVar3.f26569a;
            } else if (i10 != 3) {
                return;
            } else {
                oVar = fVar4.f26569a;
            }
            f11 = 0.0f;
        } else {
            oVar = fVar.f26569a;
        }
        ArrayList arrayList = this.f26550l0;
        int size = arrayList.size();
        o oVar3 = null;
        for (int i11 = 0; i11 < size; i11++) {
            o oVar4 = (o) arrayList.get(i11);
            if (oVar4.f26683b != 1) {
                return;
            }
            int i12 = this.f26549k0;
            if (i12 == 0 || i12 == 2) {
                f10 = oVar4.f26676g;
                if (f10 < f11) {
                    oVar2 = oVar4.f26675f;
                    oVar3 = oVar2;
                    f11 = f10;
                }
            } else {
                f10 = oVar4.f26676g;
                if (f10 > f11) {
                    oVar2 = oVar4.f26675f;
                    oVar3 = oVar2;
                    f11 = f10;
                }
            }
        }
        oVar.f26675f = oVar3;
        oVar.f26676g = f11;
        oVar.b();
        int i13 = this.f26549k0;
        if (i13 == 0) {
            fVar2.f26569a.k(oVar3, f11);
            return;
        }
        if (i13 == 1) {
            fVar.f26569a.k(oVar3, f11);
        } else if (i13 == 2) {
            fVar4.f26569a.k(oVar3, f11);
        } else {
            if (i13 != 3) {
                return;
            }
            fVar3.f26569a.k(oVar3, f11);
        }
    }
}
