package androidx.compose.foundation.layout;

import C.C0156n;
import F0.AbstractC0382a0;
import G0.K0;
import kotlin.jvm.internal.m;
import p067g0.e;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f14679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14680b;

    public BoxChildDataElement(e eVar, boolean z10) {
        this.f14679a = eVar;
        this.f14680b = z10;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        C0156n c0156n = new C0156n();
        c0156n.f1039a = this.f14679a;
        c0156n.f1040b = this.f14680b;
        return c0156n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && m.b(this.f14679a, boxChildDataElement.f14679a) && this.f14680b == boxChildDataElement.f14680b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14680b) + (this.f14679a.hashCode() * 31);
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        C0156n c0156n = (C0156n) qVar;
        c0156n.f1039a = this.f14679a;
        c0156n.f1040b = this.f14680b;
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
    }
}
