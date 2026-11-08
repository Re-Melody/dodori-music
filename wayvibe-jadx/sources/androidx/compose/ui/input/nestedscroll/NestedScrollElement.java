package androidx.compose.ui.input.nestedscroll;

import F0.AbstractC0382a0;
import G0.C0480j1;
import G0.K0;
import Z0.b;
import kotlin.jvm.internal.m;
import p067g0.q;
import p253y0.d;
import p253y0.g;

/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p253y0.a f14827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f14828b;

    public NestedScrollElement(p253y0.a aVar, d dVar) {
        this.f14827a = aVar;
        this.f14828b = dVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        return new g(this.f14827a, this.f14828b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return m.b(nestedScrollElement.f14827a, this.f14827a) && m.b(nestedScrollElement.f14828b, this.f14828b);
    }

    public final int hashCode() {
        int iHashCode = this.f14827a.hashCode() * 31;
        d dVar = this.f14828b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "nestedScroll";
        C0480j1 c0480j1 = k10.f5042c;
        c0480j1.c(this.f14827a, "connection");
        c0480j1.c(this.f14828b, "dispatcher");
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        g gVar = (g) qVar;
        gVar.f28749a = this.f14827a;
        d dVar = gVar.f28750b;
        if (dVar.f28735a == gVar) {
            dVar.f28735a = null;
        }
        d dVar2 = this.f14828b;
        if (dVar2 == null) {
            gVar.f28750b = new d();
        } else if (!dVar2.equals(dVar)) {
            gVar.f28750b = dVar2;
        }
        if (gVar.isAttached()) {
            d dVar3 = gVar.f28750b;
            dVar3.f28735a = gVar;
            dVar3.f28736b = new b(gVar, 18);
            dVar3.f28737c = gVar.getCoroutineScope();
        }
    }
}
