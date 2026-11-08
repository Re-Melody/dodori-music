package androidx.compose.ui.layout;

import D0.C0196w;
import F0.AbstractC0382a0;
import G0.K0;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14834a;

    public LayoutIdElement(String str) {
        this.f14834a = str;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        C0196w c0196w = new C0196w();
        c0196w.f1825a = this.f14834a;
        return c0196w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f14834a.equals(((LayoutIdElement) obj).f14834a);
    }

    public final int hashCode() {
        return this.f14834a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "layoutId";
        k10.f5041b = this.f14834a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f14834a) + ')';
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((C0196w) qVar).f1825a = this.f14834a;
    }
}
