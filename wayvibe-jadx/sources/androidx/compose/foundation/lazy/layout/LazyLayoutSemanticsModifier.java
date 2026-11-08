package androidx.compose.foundation.lazy.layout;

import F.M;
import F.Q;
import F0.AbstractC0382a0;
import F0.AbstractC0388f;
import G0.K0;
import kotlin.jvm.internal.m;
import p067g0.q;
import p075g9.h;
import p261z.EnumC2391a0;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends AbstractC0382a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f14727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC2391a0 f14728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14729d;

    public LazyLayoutSemanticsModifier(h hVar, M m8, EnumC2391a0 enumC2391a0, boolean z10) {
        this.f14726a = hVar;
        this.f14727b = m8;
        this.f14728c = enumC2391a0;
        this.f14729d = z10;
    }

    @Override // F0.AbstractC0382a0
    public final q create() {
        return new Q(this.f14726a, this.f14727b, this.f14728c, this.f14729d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f14726a == lazyLayoutSemanticsModifier.f14726a && m.b(this.f14727b, lazyLayoutSemanticsModifier.f14727b) && this.f14728c == lazyLayoutSemanticsModifier.f14728c && this.f14729d == lazyLayoutSemanticsModifier.f14729d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + p134m1.b.f((this.f14728c.hashCode() + ((this.f14727b.hashCode() + (this.f14726a.hashCode() * 31)) * 31)) * 31, 31, this.f14729d);
    }

    @Override // F0.AbstractC0382a0
    public final void update(q qVar) {
        Q q5 = (Q) qVar;
        q5.f3477a = this.f14726a;
        q5.f3478b = this.f14727b;
        EnumC2391a0 enumC2391a0 = q5.f3479c;
        EnumC2391a0 enumC2391a1 = this.f14728c;
        if (enumC2391a0 != enumC2391a1) {
            q5.f3479c = enumC2391a1;
            AbstractC0388f.r(q5).C();
        }
        boolean z10 = q5.f3480d;
        boolean z11 = this.f14729d;
        if (z10 == z11) {
            return;
        }
        q5.f3480d = z11;
        q5.o0();
        AbstractC0388f.r(q5).C();
    }

    @Override // F0.AbstractC0382a0
    public final void inspectableProperties(K0 k10) {
    }
}
