package androidx.compose.ui.layout;

import D0.C0199z;
import F0.AbstractC0382a0;
import G0.K0;
import Z8.f;
import kotlin.jvm.internal.m;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f14833a;

    public LayoutElement(f fVar) {
        this.f14833a = fVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        C0199z c0199z = new C0199z();
        c0199z.f1826a = this.f14833a;
        return c0199z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && m.b(this.f14833a, ((LayoutElement) obj).f14833a);
    }

    public final int hashCode() {
        return this.f14833a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "layout";
        k10.f5042c.c(this.f14833a, "measure");
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f14833a + ')';
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((C0199z) qVar).f1826a = this.f14833a;
    }
}
