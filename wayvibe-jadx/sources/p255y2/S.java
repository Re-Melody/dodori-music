package p255y2;

import B2.C;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S f28810d = new S(new Q());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28813c;

    static {
        C.D(1);
        C.D(2);
        C.D(3);
    }

    public S(Q q5) {
        this.f28811a = q5.f28807a;
        this.f28812b = q5.f28808b;
        this.f28813c = q5.f28809c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S.class != obj.getClass()) {
            return false;
        }
        S s8 = (S) obj;
        return this.f28811a == s8.f28811a && this.f28812b == s8.f28812b && this.f28813c == s8.f28813c;
    }

    public final int hashCode() {
        return ((((this.f28811a + 31) * 31) + (this.f28812b ? 1 : 0)) * 31) + (this.f28813c ? 1 : 0);
    }
}
