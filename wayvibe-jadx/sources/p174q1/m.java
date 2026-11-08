package p174q1;

import java.util.ArrayList;
import java.util.Arrays;
import p182r1.h;
import p182r1.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends g {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public g[] f25642n0 = new g[4];

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f25643o0 = 0;

    public final void N(g gVar) {
        if (gVar == this || gVar == null) {
            return;
        }
        int i10 = this.f25643o0 + 1;
        g[] gVarArr = this.f25642n0;
        if (i10 > gVarArr.length) {
            this.f25642n0 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
        }
        g[] gVarArr2 = this.f25642n0;
        int i11 = this.f25643o0;
        gVarArr2[i11] = gVar;
        this.f25643o0 = i11 + 1;
    }

    public final void O(int i10, ArrayList arrayList, n nVar) {
        for (int i11 = 0; i11 < this.f25643o0; i11++) {
            g gVar = this.f25642n0[i11];
            ArrayList arrayList2 = nVar.f25738a;
            if (!arrayList2.contains(gVar)) {
                arrayList2.add(gVar);
            }
        }
        for (int i12 = 0; i12 < this.f25643o0; i12++) {
            h.b(this.f25642n0[i12], i10, arrayList, nVar);
        }
    }
}
