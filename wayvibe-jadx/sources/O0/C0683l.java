package O0;

import B2.AbstractC0112b;

/* JADX INFO: renamed from: O0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0683l extends AbstractC0684m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f8928b;

    public C0683l(String str, J j10) {
        this.f8927a = str;
        this.f8928b = j10;
    }

    @Override // O0.AbstractC0684m
    public final J a() {
        return this.f8928b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0683l)) {
            return false;
        }
        C0683l c0683l = (C0683l) obj;
        if (!kotlin.jvm.internal.m.b(this.f8927a, c0683l.f8927a)) {
            return false;
        }
        if (!kotlin.jvm.internal.m.b(this.f8928b, c0683l.f8928b)) {
            return false;
        }
        c0683l.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f8927a.hashCode() * 31;
        J j10 = this.f8928b;
        return (iHashCode + (j10 != null ? j10.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0112b.j(new StringBuilder("LinkAnnotation.Url(url="), this.f8927a, ')');
    }
}
