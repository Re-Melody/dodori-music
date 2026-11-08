package Q;

import p119k9.C2028n;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f9964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2028n f9965b;

    public S0(T0 t10, C2028n c2028n) {
        this.f9964a = t10;
        this.f9965b = c2028n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S0.class != obj.getClass()) {
            return false;
        }
        S0 s8 = (S0) obj;
        return kotlin.jvm.internal.m.b(this.f9964a, s8.f9964a) && this.f9965b.equals(s8.f9965b);
    }

    public final int hashCode() {
        return this.f9965b.hashCode() + (this.f9964a.hashCode() * 31);
    }
}
