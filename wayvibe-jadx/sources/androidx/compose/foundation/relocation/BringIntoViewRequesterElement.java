package androidx.compose.foundation.relocation;

import F0.AbstractC0382a0;
import G0.K0;
import H.c;
import H.d;
import kotlin.jvm.internal.m;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14744a;

    public BringIntoViewRequesterElement(c cVar) {
        this.f14744a = cVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        d dVar = new d();
        dVar.f5709a = this.f14744a;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return m.b(this.f14744a, ((BringIntoViewRequesterElement) obj).f14744a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14744a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "bringIntoViewRequester";
        k10.f5042c.c(this.f14744a, "bringIntoViewRequester");
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        d dVar = (d) qVar;
        c cVar = dVar.f5709a;
        if (cVar != null) {
            cVar.f5708a.n(dVar);
        }
        c cVar2 = this.f14744a;
        if (cVar2 != null) {
            cVar2.f5708a.b(dVar);
        }
        dVar.f5709a = cVar2;
    }
}
