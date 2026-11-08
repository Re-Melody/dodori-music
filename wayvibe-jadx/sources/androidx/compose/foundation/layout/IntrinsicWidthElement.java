package androidx.compose.foundation.layout;

import C.U;
import C.W;
import F0.AbstractC0382a0;
import G0.K0;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f14686a;

    public IntrinsicWidthElement(U u10) {
        this.f14686a = u10;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        W w10 = new W();
        w10.f959a = this.f14686a;
        w10.f960b = true;
        return w10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f14686a == intrinsicWidthElement.f14686a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f14686a.hashCode() * 31);
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        W w10 = (W) qVar;
        w10.f959a = this.f14686a;
        w10.f960b = true;
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
    }
}
