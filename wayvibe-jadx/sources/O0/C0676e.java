package O0;

import B2.AbstractC0112b;

/* JADX INFO: renamed from: O0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0676e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8919d;

    public C0676e(int i10, int i11, Object obj, String str) {
        this.f8916a = obj;
        this.f8917b = i10;
        this.f8918c = i11;
        this.f8919d = str;
        if (i10 > i11) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0676e)) {
            return false;
        }
        C0676e c0676e = (C0676e) obj;
        return kotlin.jvm.internal.m.b(this.f8916a, c0676e.f8916a) && this.f8917b == c0676e.f8917b && this.f8918c == c0676e.f8918c && kotlin.jvm.internal.m.b(this.f8919d, c0676e.f8919d);
    }

    public final int hashCode() {
        Object obj = this.f8916a;
        return this.f8919d.hashCode() + p134m1.b.c(this.f8918c, p134m1.b.c(this.f8917b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f8916a);
        sb.append(", start=");
        sb.append(this.f8917b);
        sb.append(", end=");
        sb.append(this.f8918c);
        sb.append(", tag=");
        return AbstractC0112b.j(sb, this.f8919d, ')');
    }

    public C0676e(Object obj, int i10, int i11) {
        this(i10, i11, obj, "");
    }
}
