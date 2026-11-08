package androidx.compose.ui.focus;

import F0.AbstractC0382a0;
import G0.K0;
import Z8.c;
import kotlin.jvm.internal.m;
import p067g0.q;
import p122l0.C2045b;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14800a;

    public FocusChangedElement(c cVar) {
        this.f14800a = cVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        C2045b c2045b = new C2045b();
        c2045b.f21883a = this.f14800a;
        return c2045b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && m.b(this.f14800a, ((FocusChangedElement) obj).f14800a);
    }

    public final int hashCode() {
        return this.f14800a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "onFocusChanged";
        k10.f5042c.c(this.f14800a, "onFocusChanged");
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f14800a + ')';
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((C2045b) qVar).f21883a = this.f14800a;
    }
}
