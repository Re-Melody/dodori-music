package p153o0;

import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23505c;

    public c(String str, long j10, int i10) {
        this.f23503a = str;
        this.f23504b = j10;
        this.f23505c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

    public boolean c() {
        return false;
    }

    public abstract long d(float f10, float f11, float f12);

    public abstract float e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f23505c == cVar.f23505c && m.b(this.f23503a, cVar.f23503a)) {
            return b.a(this.f23504b, cVar.f23504b);
        }
        return false;
    }

    public abstract long f(float f10, float f11, float f12, float f13, c cVar);

    public int hashCode() {
        int iHashCode = this.f23503a.hashCode() * 31;
        int i10 = b.f23502e;
        return b.g(this.f23504b, iHashCode, 31) + this.f23505c;
    }

    public final String toString() {
        return this.f23503a + " (id=" + this.f23505c + ", model=" + ((Object) b.b(this.f23504b)) + ')';
    }
}
