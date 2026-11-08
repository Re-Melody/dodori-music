package androidx.compose.ui.input.rotary;

import F0.AbstractC0382a0;
import G0.C0491o;
import G0.K0;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends AbstractC0382a0 {
    @Override // F0.AbstractC0382a0
    public final q create() {
        B0.a aVar = new B0.a();
        aVar.f530a = C0491o.f5255d;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        Object obj2 = C0491o.f5255d;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C0491o.f5255d.hashCode() * 31;
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        C0491o c0491o = C0491o.f5255d;
        k10.f5040a = "onRotaryScrollEvent";
        k10.f5042c.c(c0491o, "onRotaryScrollEvent");
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C0491o.f5255d + ", onPreRotaryScrollEvent=null)";
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((B0.a) qVar).f530a = C0491o.f5255d;
    }
}
