package p201t1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f26658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f26659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f26661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f26662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f26663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f26664i;

    public k(List list) {
        this.f26657b = false;
        this.f26658c = new int[]{-1, -1};
        this.f26659d = new ArrayList();
        this.f26660e = new ArrayList();
        this.f26661f = new HashSet();
        this.f26662g = new HashSet();
        this.f26663h = new ArrayList();
        this.f26664i = new ArrayList();
        this.f26656a = list;
    }

    public static void b(ArrayList arrayList, i iVar) {
        if (iVar.f26611c0) {
            return;
        }
        arrayList.add(iVar);
        iVar.f26611c0 = true;
        if (iVar.n()) {
            return;
        }
        if (iVar instanceof a) {
            a aVar = (a) iVar;
            int i10 = aVar.f26548j0;
            for (int i11 = 0; i11 < i10; i11++) {
                b(arrayList, aVar.f26547i0[i11]);
            }
        }
        for (f fVar : iVar.f26580A) {
            f fVar2 = fVar.f26572d;
            if (fVar2 != null) {
                i iVar2 = iVar.f26583D;
                i iVar3 = fVar2.f26570b;
                if (iVar3 != iVar2) {
                    b(arrayList, iVar3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003e  */
    public static void c(i iVar) {
        int iK;
        int iK2;
        if (!iVar.f26607a0 || iVar.n()) {
            return;
        }
        f fVar = iVar.f26632u;
        f fVar2 = fVar.f26572d;
        boolean z10 = fVar2 != null;
        f fVar3 = iVar.f26630s;
        if (!z10) {
            fVar2 = fVar3.f26572d;
        }
        if (fVar2 != null) {
            i iVar2 = fVar2.f26570b;
            if (!iVar2.f26609b0) {
                c(iVar2);
            }
            e eVar = e.RIGHT;
            e eVar2 = fVar2.f26571c;
            if (eVar2 == eVar) {
                iK = iVar2.k() + iVar2.f26588I;
            } else if (eVar2 == e.LEFT) {
                iK = iVar2.f26588I;
            } else {
                iK = 0;
            }
        } else {
            iK = 0;
        }
        if (z10) {
            iK2 = iK - fVar.b();
        } else {
            iK2 = iK + iVar.k() + fVar3.b();
        }
        int iK3 = iK2 - iVar.k();
        iVar.f26588I = iK3;
        int i10 = iK2 - iK3;
        iVar.f26584E = i10;
        int i11 = iVar.f26597R;
        if (i10 < i11) {
            iVar.f26584E = i11;
        }
        f fVar4 = iVar.f26634w.f26572d;
        if (fVar4 != null) {
            i iVar3 = fVar4.f26570b;
            if (!iVar3.f26609b0) {
                c(iVar3);
            }
            int i12 = (iVar3.f26589J + iVar3.f26596Q) - iVar.f26596Q;
            iVar.v(i12, iVar.f26585F + i12);
            iVar.f26609b0 = true;
            return;
        }
        f fVar5 = iVar.f26633v;
        f fVar6 = fVar5.f26572d;
        boolean z11 = fVar6 != null;
        f fVar7 = iVar.f26631t;
        if (!z11) {
            fVar6 = fVar7.f26572d;
        }
        if (fVar6 != null) {
            i iVar4 = fVar6.f26570b;
            if (!iVar4.f26609b0) {
                c(iVar4);
            }
            e eVar3 = e.BOTTOM;
            e eVar4 = fVar6.f26571c;
            if (eVar4 == eVar3) {
                iK2 = iVar4.g() + iVar4.f26589J;
            } else if (eVar4 == e.TOP) {
                iK2 = iVar4.f26589J;
            }
        }
        int iB = z11 ? iK2 - fVar5.b() : iK2 + iVar.g() + fVar7.b();
        iVar.v(iB - iVar.g(), iB);
        iVar.f26609b0 = true;
    }

    public final void a(i iVar, int i10) {
        if (i10 == 0) {
            this.f26661f.add(iVar);
        } else if (i10 == 1) {
            this.f26662g.add(iVar);
        }
    }

    public k(ArrayList arrayList) {
        this.f26657b = false;
        this.f26658c = new int[]{-1, -1};
        this.f26659d = new ArrayList();
        this.f26660e = new ArrayList();
        this.f26661f = new HashSet();
        this.f26662g = new HashSet();
        this.f26663h = new ArrayList();
        this.f26664i = new ArrayList();
        this.f26656a = arrayList;
        this.f26657b = true;
    }
}
