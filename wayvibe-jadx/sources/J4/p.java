package J4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p235w4.n[] f6648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6649c;

    public p(p235w4.n... nVarArr) {
        X4.a.q(nVarArr.length > 0);
        this.f6648b = nVarArr;
        this.f6647a = nVarArr.length;
    }

    public final int a(p235w4.n nVar) {
        int i10 = 0;
        while (true) {
            p235w4.n[] nVarArr = this.f6648b;
            if (i10 >= nVarArr.length) {
                return -1;
            }
            if (nVar == nVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f6647a == pVar.f6647a && Arrays.equals(this.f6648b, pVar.f6648b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6649c == 0) {
            this.f6649c = 527 + Arrays.hashCode(this.f6648b);
        }
        return this.f6649c;
    }
}
