package p133m0;

import D7.W;
import p134m1.b;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f22183e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22187d;

    public d(float f10, float f11, float f12, float f13) {
        this.f22184a = f10;
        this.f22185b = f11;
        this.f22186c = f12;
        this.f22187d = f13;
    }

    public final boolean a(long j10) {
        return c.d(j10) >= this.f22184a && c.d(j10) < this.f22186c && c.e(j10) >= this.f22185b && c.e(j10) < this.f22187d;
    }

    public final long b() {
        return W.c((d() / 2.0f) + this.f22184a, (c() / 2.0f) + this.f22185b);
    }

    public final float c() {
        return this.f22187d - this.f22185b;
    }

    public final float d() {
        return this.f22186c - this.f22184a;
    }

    public final d e(d dVar) {
        return new d(Math.max(this.f22184a, dVar.f22184a), Math.max(this.f22185b, dVar.f22185b), Math.min(this.f22186c, dVar.f22186c), Math.min(this.f22187d, dVar.f22187d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f22184a, dVar.f22184a) == 0 && Float.compare(this.f22185b, dVar.f22185b) == 0 && Float.compare(this.f22186c, dVar.f22186c) == 0 && Float.compare(this.f22187d, dVar.f22187d) == 0;
    }

    public final boolean f() {
        return this.f22184a >= this.f22186c || this.f22185b >= this.f22187d;
    }

    public final boolean g(d dVar) {
        return this.f22186c > dVar.f22184a && dVar.f22186c > this.f22184a && this.f22187d > dVar.f22185b && dVar.f22187d > this.f22185b;
    }

    public final d h(float f10, float f11) {
        return new d(this.f22184a + f10, this.f22185b + f11, this.f22186c + f10, this.f22187d + f11);
    }

    public final int hashCode() {
        return Float.hashCode(this.f22187d) + b.b(this.f22186c, b.b(this.f22185b, Float.hashCode(this.f22184a) * 31, 31), 31);
    }

    public final d i(long j10) {
        return new d(c.d(j10) + this.f22184a, c.e(j10) + this.f22185b, c.d(j10) + this.f22186c, c.e(j10) + this.f22187d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + c.N(this.f22184a) + ", " + c.N(this.f22185b) + ", " + c.N(this.f22186c) + ", " + c.N(this.f22187d) + ')';
    }
}
