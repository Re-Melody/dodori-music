package androidx.compose.ui.platform;

import F0.AbstractC0382a0;
import G0.C0462d1;
import G0.K0;
import kotlin.jvm.internal.m;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
final class TestTagElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14844a;

    public TestTagElement(String str) {
        this.f14844a = str;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        C0462d1 c0462d1 = new C0462d1();
        c0462d1.f5208a = this.f14844a;
        return c0462d1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return m.b(this.f14844a, ((TestTagElement) obj).f14844a);
    }

    public final int hashCode() {
        return this.f14844a.hashCode();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
        k10.f5040a = "testTag";
        k10.f5042c.c(this.f14844a, "tag");
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        ((C0462d1) qVar).f5208a = this.f14844a;
    }
}
