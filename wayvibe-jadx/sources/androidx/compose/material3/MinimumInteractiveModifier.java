package androidx.compose.material3;

import F0.AbstractC0382a0;
import G0.K0;
import Q.C0733f0;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class MinimumInteractiveModifier extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MinimumInteractiveModifier f14785a = new MinimumInteractiveModifier();

    private MinimumInteractiveModifier() {
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        return new C0733f0();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "minimumInteractiveComponentSize";
        k10.f5042c.c("Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller", "README");
    }

    @Override // F0.AbstractC0382a0
    public final /* bridge */ /* synthetic */ void update(q qVar) {
    }
}
