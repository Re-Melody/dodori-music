package androidx.compose.foundation.layout;

import C.M;
import F0.AbstractC0382a0;
import G0.K0;
import p067g0.g;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalAlignElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f14684a;

    public HorizontalAlignElement(g gVar) {
        this.f14684a = gVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        M m8 = new M();
        m8.f937a = this.f14684a;
        return m8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f14684a.equals(horizontalAlignElement.f14684a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f14684a.f19954a);
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "align";
        k10.f5041b = this.f14684a;
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((M) qVar).f937a = this.f14684a;
    }
}
