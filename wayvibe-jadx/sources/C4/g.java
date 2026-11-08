package C4;

import B2.AbstractC0112b;
import B2.z;
import O0.C0678g;
import O0.K;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public final class g implements e, p203t3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1338a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1343f;

    public /* synthetic */ g() {
    }

    @Override // C4.e
    public int a() {
        return this.f1339b;
    }

    @Override // C4.e
    public int b() {
        X4.f fVar = (X4.f) this.f1343f;
        int i10 = this.f1340c;
        if (i10 == 8) {
            return fVar.i();
        }
        if (i10 == 16) {
            return fVar.k();
        }
        int i11 = this.f1341d;
        this.f1341d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f1342e & 15;
        }
        int i12 = fVar.i();
        this.f1342e = i12;
        return (i12 & 240) >> 4;
    }

    @Override // C4.e
    public boolean c() {
        return false;
    }

    public void d(int i10, int i11) {
        long jB = R3.a.b(i10, i11);
        ((z) this.f1343f).o(i10, i11, "");
        long jW = Q5.b.W(R3.a.b(this.f1339b, this.f1340c), jB);
        n(K.e(jW));
        m(K.d(jW));
        int i12 = this.f1341d;
        if (i12 != -1) {
            long jW2 = Q5.b.W(R3.a.b(i12, this.f1342e), jB);
            if (K.b(jW2)) {
                this.f1341d = -1;
                this.f1342e = -1;
            } else {
                this.f1341d = K.e(jW2);
                this.f1342e = K.d(jW2);
            }
        }
    }

    public char e(int i10) {
        z zVar = (z) this.f1343f;
        B2.n nVar = (B2.n) zVar.f644e;
        if (nVar == null) {
            return ((String) zVar.f643d).charAt(i10);
        }
        if (i10 < zVar.f641b) {
            return ((String) zVar.f643d).charAt(i10);
        }
        int iC = nVar.f610b - nVar.c();
        int i11 = zVar.f641b;
        if (i10 >= iC + i11) {
            return ((String) zVar.f643d).charAt(i10 - ((iC - zVar.f642c) + i11));
        }
        int i12 = i10 - i11;
        int i13 = nVar.f611c;
        return i12 < i13 ? ((char[]) nVar.f613e)[i12] : ((char[]) nVar.f613e)[(i12 - i13) + nVar.f612d];
    }

    @Override // p203t3.c
    public int f() {
        return -1;
    }

    public K g() {
        int i10 = this.f1341d;
        if (i10 != -1) {
            return new K(R3.a.b(i10, this.f1342e));
        }
        return null;
    }

    @Override // p203t3.c
    public int h() {
        return this.f1339b;
    }

    public void i(int i10, int i11, String str) {
        z zVar = (z) this.f1343f;
        if (i10 < 0 || i10 > zVar.f()) {
            StringBuilder sbP = p134m1.b.p(i10, "start (", ") offset is outside of text region ");
            sbP.append(zVar.f());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i11 < 0 || i11 > zVar.f()) {
            StringBuilder sbP2 = p134m1.b.p(i11, "end (", ") offset is outside of text region ");
            sbP2.append(zVar.f());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC0112b.e("Do not set reversed range: ", i10, i11, " > "));
        }
        zVar.o(i10, i11, str);
        n(str.length() + i10);
        m(str.length() + i10);
        this.f1341d = -1;
        this.f1342e = -1;
    }

    @Override // p203t3.c
    public int j() {
        B2.u uVar = (B2.u) this.f1343f;
        int i10 = this.f1340c;
        if (i10 == 8) {
            return uVar.t();
        }
        if (i10 == 16) {
            return uVar.z();
        }
        int i11 = this.f1341d;
        this.f1341d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f1342e & 15;
        }
        int iT = uVar.t();
        this.f1342e = iT;
        return (iT & 240) >> 4;
    }

    public void k(int i10, int i11) {
        z zVar = (z) this.f1343f;
        if (i10 < 0 || i10 > zVar.f()) {
            StringBuilder sbP = p134m1.b.p(i10, "start (", ") offset is outside of text region ");
            sbP.append(zVar.f());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i11 < 0 || i11 > zVar.f()) {
            StringBuilder sbP2 = p134m1.b.p(i11, "end (", ") offset is outside of text region ");
            sbP2.append(zVar.f());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(AbstractC0112b.e("Do not set reversed or empty range: ", i10, i11, " > "));
        }
        this.f1341d = i10;
        this.f1342e = i11;
    }

    public void l(int i10, int i11) {
        z zVar = (z) this.f1343f;
        if (i10 < 0 || i10 > zVar.f()) {
            StringBuilder sbP = p134m1.b.p(i10, "start (", ") offset is outside of text region ");
            sbP.append(zVar.f());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i11 < 0 || i11 > zVar.f()) {
            StringBuilder sbP2 = p134m1.b.p(i11, "end (", ") offset is outside of text region ");
            sbP2.append(zVar.f());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC0112b.e("Do not set reversed range: ", i10, i11, " > "));
        }
        n(i10);
        m(i11);
    }

    public void m(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.f1340c = i10;
    }

    public void n(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.f1339b = i10;
    }

    public String toString() {
        switch (this.f1338a) {
            case 2:
                return ((z) this.f1343f).toString();
            default:
                return super.toString();
        }
    }

    public g(C0678g c0678g, long j10) {
        String str = c0678g.f8920a;
        z zVar = new z(2, (byte) 0);
        zVar.f643d = str;
        zVar.f641b = -1;
        zVar.f642c = -1;
        this.f1343f = zVar;
        this.f1339b = K.e(j10);
        this.f1340c = K.d(j10);
        this.f1341d = -1;
        this.f1342e = -1;
        int iE = K.e(j10);
        int iD = K.d(j10);
        String str2 = c0678g.f8920a;
        if (iE < 0 || iE > str2.length()) {
            StringBuilder sbP = p134m1.b.p(iE, "start (", ") offset is outside of text region ");
            sbP.append(str2.length());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (iD < 0 || iD > str2.length()) {
            StringBuilder sbP2 = p134m1.b.p(iD, "end (", ") offset is outside of text region ");
            sbP2.append(str2.length());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(AbstractC0112b.e("Do not set reversed range: ", iE, iD, " > "));
        }
    }

    public g(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f1339b = i11;
        this.f1340c = i12;
        this.f1341d = i13;
        this.f1342e = i14;
        this.f1343f = bArr;
    }

    public g(b bVar) {
        X4.f fVar = bVar.f1230V0;
        this.f1343f = fVar;
        fVar.f(12);
        this.f1340c = fVar.q() & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        this.f1339b = fVar.q();
    }

    public g(p203t3.b bVar) {
        B2.u uVar = bVar.f26700c;
        this.f1343f = uVar;
        uVar.F(12);
        this.f1340c = uVar.x() & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        this.f1339b = uVar.x();
    }
}
