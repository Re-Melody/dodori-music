package androidx.compose.ui.focus;

import F0.AbstractC0382a0;
import G0.K0;
import kotlin.jvm.internal.m;
import p067g0.q;
import p122l0.r;
import p122l0.t;

/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f14803a;

    public FocusRequesterElement(r rVar) {
        this.f14803a = rVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        t tVar = new t();
        tVar.f21918a = this.f14803a;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && m.b(this.f14803a, ((FocusRequesterElement) obj).f14803a);
    }

    public final int hashCode() {
        return this.f14803a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "focusRequester";
        k10.f5042c.c(this.f14803a, "focusRequester");
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f14803a + ')';
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        t tVar = (t) qVar;
        tVar.f21918a.f21917a.n(tVar);
        r rVar = this.f14803a;
        tVar.f21918a = rVar;
        rVar.f21917a.b(tVar);
    }
}
