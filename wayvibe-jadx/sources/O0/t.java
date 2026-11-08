package O0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a1.p f8957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f8958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a1.g f8959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p005a1.q f8962i;

    public t(int i10, int i11, long j10, p005a1.p pVar, v vVar, p005a1.g gVar, int i12, int i13, p005a1.q qVar) {
        this.f8954a = i10;
        this.f8955b = i11;
        this.f8956c = j10;
        this.f8957d = pVar;
        this.f8958e = vVar;
        this.f8959f = gVar;
        this.f8960g = i12;
        this.f8961h = i13;
        this.f8962i = qVar;
        if (p028c1.m.a(j10, p028c1.m.f15861c) || p028c1.m.c(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + p028c1.m.c(j10) + ')').toString());
    }

    public final t a(t tVar) {
        if (tVar == null) {
            return this;
        }
        return u.a(this, tVar.f8954a, tVar.f8955b, tVar.f8956c, tVar.f8957d, tVar.f8958e, tVar.f8959f, tVar.f8960g, tVar.f8961h, tVar.f8962i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f8954a == tVar.f8954a && this.f8955b == tVar.f8955b && p028c1.m.a(this.f8956c, tVar.f8956c) && kotlin.jvm.internal.m.b(this.f8957d, tVar.f8957d) && kotlin.jvm.internal.m.b(this.f8958e, tVar.f8958e) && kotlin.jvm.internal.m.b(this.f8959f, tVar.f8959f) && this.f8960g == tVar.f8960g && this.f8961h == tVar.f8961h && kotlin.jvm.internal.m.b(this.f8962i, tVar.f8962i);
    }

    public final int hashCode() {
        int iC = p134m1.b.c(this.f8955b, Integer.hashCode(this.f8954a) * 31, 31);
        p028c1.n[] nVarArr = p028c1.m.f15860b;
        int iG = p134m1.b.g(this.f8956c, iC, 31);
        p005a1.p pVar = this.f8957d;
        int iHashCode = (iG + (pVar != null ? pVar.hashCode() : 0)) * 31;
        v vVar = this.f8958e;
        int iHashCode2 = (iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        p005a1.g gVar = this.f8959f;
        int iC2 = p134m1.b.c(this.f8961h, p134m1.b.c(this.f8960g, (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
        p005a1.q qVar = this.f8962i;
        return iC2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) p005a1.i.a(this.f8954a)) + ", textDirection=" + ((Object) p005a1.k.a(this.f8955b)) + ", lineHeight=" + ((Object) p028c1.m.d(this.f8956c)) + ", textIndent=" + this.f8957d + ", platformStyle=" + this.f8958e + ", lineHeightStyle=" + this.f8959f + ", lineBreak=" + ((Object) p005a1.e.a(this.f8960g)) + ", hyphens=" + ((Object) p005a1.d.a(this.f8961h)) + ", textMotion=" + this.f8962i + ')';
    }
}
