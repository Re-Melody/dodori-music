package androidx.compose.foundation.layout;

import C.C0155m;
import F0.AbstractC0382a0;
import G0.K0;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class AspectRatioElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14678b;

    public AspectRatioElement(float f10, boolean z10) {
        this.f14677a = f10;
        this.f14678b = z10;
        if (f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f10 + " must be > 0").toString());
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        C0155m c0155m = new C0155m();
        c0155m.f1035a = this.f14677a;
        c0155m.f1036b = this.f14678b;
        return c0155m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement != null && this.f14677a == aspectRatioElement.f14677a) {
            if (this.f14678b == ((AspectRatioElement) obj).f14678b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14678b) + (Float.hashCode(this.f14677a) * 31);
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        C0155m c0155m = (C0155m) qVar;
        c0155m.f1035a = this.f14677a;
        c0155m.f1036b = this.f14678b;
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
    }
}
