package androidx.compose.foundation.layout;

import C.X;
import F0.AbstractC0382a0;
import G0.C0480j1;
import G0.K0;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14688b;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f14687a = f10;
        this.f14688b = z10;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        X x10 = new X();
        x10.f961a = this.f14687a;
        x10.f962b = this.f14688b;
        return x10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f14687a == layoutWeightElement.f14687a && this.f14688b == layoutWeightElement.f14688b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14688b) + (Float.hashCode(this.f14687a) * 31);
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "weight";
        float f10 = this.f14687a;
        k10.f5041b = Float.valueOf(f10);
        Float fValueOf = Float.valueOf(f10);
        C0480j1 c0480j1 = k10.f5042c;
        c0480j1.c(fValueOf, "weight");
        c0480j1.c(Boolean.valueOf(this.f14688b), "fill");
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        X x10 = (X) qVar;
        x10.f961a = this.f14687a;
        x10.f962b = this.f14688b;
    }
}
