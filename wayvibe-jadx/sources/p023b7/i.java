package p023b7;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15795c;

    public i(int i10, int i11, Class cls) {
        this(q.a(cls), i10, i11);
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f15793a.equals(iVar.f15793a) && this.f15794b == iVar.f15794b && this.f15795c == iVar.f15795c;
    }

    public final int hashCode() {
        return ((((this.f15793a.hashCode() ^ 1000003) * 1000003) ^ this.f15794b) * 1000003) ^ this.f15795c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f15793a);
        sb.append(", type=");
        int i10 = this.f15794b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i11 = this.f15795c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(b.j(i11, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return b.m(sb, str2, "}");
    }

    public i(q qVar, int i10, int i11) {
        this.f15793a = qVar;
        this.f15794b = i10;
        this.f15795c = i11;
    }
}
