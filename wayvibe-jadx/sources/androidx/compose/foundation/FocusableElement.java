package androidx.compose.foundation;

import B.m;
import F0.AbstractC0382a0;
import G0.C0480j1;
import G0.K0;
import p067g0.q;
import p241x.O;

/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f14643a;

    public FocusableElement(m mVar) {
        this.f14643a = mVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        return new O(this.f14643a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return kotlin.jvm.internal.m.b(this.f14643a, ((FocusableElement) obj).f14643a);
        }
        return false;
    }

    public final int hashCode() {
        m mVar = this.f14643a;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "focusable";
        Boolean bool = Boolean.TRUE;
        C0480j1 c0480j1 = k10.f5042c;
        c0480j1.c(bool, "enabled");
        c0480j1.c(this.f14643a, "interactionSource");
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((O) qVar).r0(this.f14643a);
    }
}
