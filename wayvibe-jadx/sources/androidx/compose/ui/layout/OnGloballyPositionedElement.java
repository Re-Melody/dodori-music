package androidx.compose.ui.layout;

import D0.S;
import F0.AbstractC0382a0;
import G0.K0;
import Z8.c;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14835a;

    public OnGloballyPositionedElement(c cVar) {
        this.f14835a = cVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        S s8 = new S();
        s8.f1757a = this.f14835a;
        return s8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f14835a == ((OnGloballyPositionedElement) obj).f14835a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14835a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "onGloballyPositioned";
        k10.f5042c.c(this.f14835a, "onGloballyPositioned");
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((S) qVar).f1757a = this.f14835a;
    }
}
