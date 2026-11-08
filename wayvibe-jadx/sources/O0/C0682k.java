package O0;

import B2.AbstractC0112b;

/* JADX INFO: renamed from: O0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0682k extends AbstractC0684m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f8926b;

    public C0682k(String str, J j10) {
        this.f8925a = str;
        this.f8926b = j10;
    }

    @Override // O0.AbstractC0684m
    public final J a() {
        return this.f8926b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0682k)) {
            return false;
        }
        C0682k c0682k = (C0682k) obj;
        if (!kotlin.jvm.internal.m.b(this.f8925a, c0682k.f8925a)) {
            return false;
        }
        if (!kotlin.jvm.internal.m.b(this.f8926b, c0682k.f8926b)) {
            return false;
        }
        c0682k.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f8925a.hashCode() * 31;
        J j10 = this.f8926b;
        return (iHashCode + (j10 != null ? j10.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0112b.j(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f8925a, ')');
    }
}
