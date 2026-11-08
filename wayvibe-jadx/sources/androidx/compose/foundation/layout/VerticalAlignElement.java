package androidx.compose.foundation.layout;

import C.t0;
import F0.AbstractC0382a0;
import G0.K0;
import p067g0.h;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class VerticalAlignElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14707a;

    public VerticalAlignElement(h hVar) {
        this.f14707a = hVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        t0 t0Var = new t0();
        t0Var.f1079a = this.f14707a;
        return t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return this.f14707a.equals(verticalAlignElement.f14707a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f14707a.f19955a);
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "align";
        k10.f5041b = this.f14707a;
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((t0) qVar).f1079a = this.f14707a;
    }
}
