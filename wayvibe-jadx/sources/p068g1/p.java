package p068g1;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20012a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20013b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f20014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20016e;

    public p(z zVar, boolean z10, boolean z11) {
        this.f20014c = zVar;
        this.f20015d = z10;
        this.f20016e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f20012a == pVar.f20012a && this.f20013b == pVar.f20013b && this.f20014c == pVar.f20014c && this.f20015d == pVar.f20015d && this.f20016e == pVar.f20016e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20016e) + b.f((this.f20014c.hashCode() + b.f(Boolean.hashCode(this.f20012a) * 31, 31, this.f20013b)) * 31, 31, this.f20015d);
    }
}
