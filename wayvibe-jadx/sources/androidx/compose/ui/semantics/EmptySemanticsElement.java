package androidx.compose.ui.semantics;

import F0.AbstractC0382a0;
import G0.K0;
import M0.d;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySemanticsElement extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14848a;

    public EmptySemanticsElement(d dVar) {
        this.f14848a = dVar;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        return this.f14848a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // F0.AbstractC0382a0
    public final /* bridge */ /* synthetic */ void update(q qVar) {
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
    }
}
