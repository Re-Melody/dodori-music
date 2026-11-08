package androidx.compose.foundation.selection;

import B.m;
import F0.AbstractC0382a0;
import F0.AbstractC0388f;
import G0.C0480j1;
import G0.K0;
import I.d;
import M0.g;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class ToggleableElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f14753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z8.c f14754e;

    public ToggleableElement(boolean z10, m mVar, boolean z11, g gVar, Z8.c cVar) {
        this.f14750a = z10;
        this.f14751b = mVar;
        this.f14752c = z11;
        this.f14753d = gVar;
        this.f14754e = cVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        return new d(this.f14750a, this.f14751b, this.f14752c, this.f14753d, this.f14754e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f14750a == toggleableElement.f14750a && kotlin.jvm.internal.m.b(this.f14751b, toggleableElement.f14751b) && this.f14752c == toggleableElement.f14752c && this.f14753d.equals(toggleableElement.f14753d) && this.f14754e == toggleableElement.f14754e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f14750a) * 31;
        m mVar = this.f14751b;
        return this.f14754e.hashCode() + p134m1.b.c(this.f14753d.f8019a, p134m1.b.f((iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 961, 31, this.f14752c), 31);
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "toggleable";
        Object obj = k10.f5041b;
        C0480j1 c0480j1 = k10.f5042c;
        c0480j1.c(obj, "value");
        c0480j1.c(this.f14751b, "interactionSource");
        c0480j1.c(null, "indicationNodeFactory");
        c0480j1.c(Boolean.valueOf(this.f14752c), "enabled");
        c0480j1.c(this.f14753d, "role");
        c0480j1.c(this.f14754e, "onValueChange");
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        d dVar = (d) qVar;
        boolean z10 = dVar.f6252u;
        boolean z11 = this.f14750a;
        if (z10 != z11) {
            dVar.f6252u = z11;
            AbstractC0388f.r(dVar).C();
        }
        dVar.f6253v = this.f14754e;
        dVar.v0(this.f14751b, null, this.f14752c, null, this.f14753d, dVar.f6254w);
    }
}
