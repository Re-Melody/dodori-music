package p230w;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f27703b;

    public g0(Object obj, Object obj2) {
        this.f27702a = obj;
        this.f27703b = obj2;
    }

    @Override // p230w.f0
    public final Object b() {
        return this.f27702a;
    }

    @Override // p230w.f0
    public final Object c() {
        return this.f27703b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (m.b(this.f27702a, f0Var.b())) {
            return m.b(this.f27703b, f0Var.c());
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f27702a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f27703b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
