package p067g0;

import B2.AbstractC0112b;
import Z8.c;
import Z8.e;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f19959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f19960b;

    public k(r rVar, r rVar2) {
        this.f19959a = rVar;
        this.f19960b = rVar2;
    }

    @Override // p067g0.r
    public final boolean all(c cVar) {
        return this.f19959a.all(cVar) && this.f19960b.all(cVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return m.b(this.f19959a, kVar.f19959a) && m.b(this.f19960b, kVar.f19960b);
    }

    @Override // p067g0.r
    public final Object foldIn(Object obj, e eVar) {
        return this.f19960b.foldIn(this.f19959a.foldIn(obj, eVar), eVar);
    }

    public final int hashCode() {
        return (this.f19960b.hashCode() * 31) + this.f19959a.hashCode();
    }

    public final String toString() {
        return AbstractC0112b.j(new StringBuilder("["), (String) foldIn("", j.f19958a), ']');
    }
}
