package androidx.compose.ui.input.key;

import F0.AbstractC0382a0;
import G0.C0480j1;
import G0.K0;
import Z8.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p067g0.q;
import p242x0.e;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f14826b;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(c cVar, c cVar2) {
        this.f14825a = cVar;
        this.f14826b = (n) cVar2;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        e eVar = new e();
        eVar.f28331a = this.f14825a;
        eVar.f28332b = this.f14826b;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return m.b(this.f14825a, keyInputElement.f14825a) && m.b(this.f14826b, keyInputElement.f14826b);
    }

    public final int hashCode() {
        c cVar = this.f14825a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        n nVar = this.f14826b;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        C0480j1 c0480j1 = k10.f5042c;
        c cVar = this.f14825a;
        if (cVar != null) {
            k10.f5040a = "onKeyEvent";
            c0480j1.c(cVar, "onKeyEvent");
        }
        n nVar = this.f14826b;
        if (nVar != null) {
            k10.f5040a = "onPreviewKeyEvent";
            c0480j1.c(nVar, "onPreviewKeyEvent");
        }
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f14825a + ", onPreKeyEvent=" + this.f14826b + ')';
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        e eVar = (e) qVar;
        eVar.f28331a = this.f14825a;
        eVar.f28332b = this.f14826b;
    }
}
