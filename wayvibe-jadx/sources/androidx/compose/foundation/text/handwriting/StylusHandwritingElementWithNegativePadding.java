package androidx.compose.foundation.text.handwriting;

import F0.AbstractC0382a0;
import G0.K0;
import L.c;
import kotlin.jvm.internal.m;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z8.a f14762a;

    public StylusHandwritingElementWithNegativePadding(Z8.a aVar) {
        this.f14762a = aVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        return new c(this.f14762a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && m.b(this.f14762a, ((StylusHandwritingElementWithNegativePadding) obj).f14762a);
    }

    public final int hashCode() {
        return this.f14762a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "stylusHandwriting";
        k10.f5042c.c(this.f14762a, "onHandwritingSlopExceeded");
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f14762a + ')';
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((c) qVar).f7421c = this.f14762a;
    }
}
