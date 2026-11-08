package V4;

import p235w4.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12578b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12582f;

    public b(n nVar, c cVar, int i10) {
        this.f12577a = d.b(i10, false) ? 1 : 0;
        this.f12579c = (nVar.f28017x & 1) != 0 ? 1 : 0;
        this.f12580d = nVar.r;
        this.f12581e = nVar.f28012s;
        this.f12582f = nVar.f27997b;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b bVar) {
        int iA;
        int i10 = bVar.f12577a;
        int i11 = this.f12577a;
        if (i11 != i10) {
            return d.a(i11, i10);
        }
        int i12 = this.f12578b;
        int i13 = bVar.f12578b;
        if (i12 != i13) {
            return d.a(i12, i13);
        }
        int i14 = this.f12579c;
        int i15 = bVar.f12579c;
        if (i14 != i15) {
            return d.a(i14, i15);
        }
        int i16 = i11 != 1 ? -1 : 1;
        int i17 = this.f12580d;
        int i18 = bVar.f12580d;
        if (i17 != i18) {
            iA = d.a(i17, i18);
        } else {
            int i19 = this.f12581e;
            int i20 = bVar.f12581e;
            iA = i19 != i20 ? d.a(i19, i20) : d.a(this.f12582f, bVar.f12582f);
        }
        return iA * i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f12577a == bVar.f12577a && this.f12578b == bVar.f12578b && this.f12579c == bVar.f12579c && this.f12580d == bVar.f12580d && this.f12581e == bVar.f12581e && this.f12582f == bVar.f12582f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.f12577a * 31) + this.f12578b) * 31) + this.f12579c) * 31) + this.f12580d) * 31) + this.f12581e) * 31) + this.f12582f;
    }
}
