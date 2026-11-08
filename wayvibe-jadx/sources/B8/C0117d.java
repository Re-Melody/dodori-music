package B8;

import B2.AbstractC0112b;

/* JADX INFO: renamed from: B8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0117d implements G7.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f785b;

    public static C0117d a(B2.u uVar) {
        String str;
        uVar.G(2);
        int iT = uVar.t();
        int i10 = iT >> 1;
        int iT2 = ((uVar.t() >> 3) & 31) | ((iT & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i10);
        return new C0117d(AbstractC0112b.k(sb, iT2 >= 10 ? "." : ".0", iT2), 3);
    }

    public String toString() {
        switch (this.f784a) {
            case 0:
                return this.f785b;
            default:
                return super.toString();
        }
    }

    @Override // G7.o
    public Object y() {
        switch (this.f784a) {
            case 1:
                throw new E7.n(this.f785b);
            default:
                throw new E7.n(this.f785b);
        }
    }

    public /* synthetic */ C0117d(String str, int i10) {
        this.f784a = i10;
        this.f785b = str;
    }
}
