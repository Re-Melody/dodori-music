package androidx.compose.foundation.layout;

import C.T;
import C.U;
import F0.AbstractC0382a0;
import G0.K0;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicHeightElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f14685a;

    public IntrinsicHeightElement(U u10) {
        this.f14685a = u10;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        T t10 = new T();
        t10.f957a = this.f14685a;
        t10.f958b = true;
        return t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.f14685a == intrinsicHeightElement.f14685a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f14685a.hashCode() * 31);
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        T t10 = (T) qVar;
        t10.f957a = this.f14685a;
        t10.f958b = true;
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
    }
}
