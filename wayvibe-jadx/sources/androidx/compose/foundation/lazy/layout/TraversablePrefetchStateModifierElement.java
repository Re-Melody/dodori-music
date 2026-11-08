package androidx.compose.foundation.lazy.layout;

import F.K;
import F.a0;
import F0.AbstractC0382a0;
import G0.K0;
import kotlin.jvm.internal.m;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f14730a;

    public TraversablePrefetchStateModifierElement(K k) {
        this.f14730a = k;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        a0 a0Var = new a0();
        a0Var.f3517a = this.f14730a;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && m.b(this.f14730a, ((TraversablePrefetchStateModifierElement) obj).f14730a);
    }

    public final int hashCode() {
        return this.f14730a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "traversablePrefetchState";
        k10.f5041b = this.f14730a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f14730a + ')';
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((a0) qVar).f3517a = this.f14730a;
    }
}
