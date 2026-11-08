package com.revenuecat.purchases.ui.revenuecatui.extensions;

import D0.L;
import D0.N;
import D0.O;
import D0.W;
import D0.X;
import M8.D;
import N8.t;
import U.InterfaceC0877b0;
import Z8.c;
import Z8.e;
import Z8.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p028c1.a;
import p067g0.o;
import p067g0.r;

/* JADX INFO: loaded from: classes2.dex */
public final class ModifierExtensionsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt$trackMainAxisUnbounded$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements f {
        final /* synthetic */ boolean $isHorizontal;
        final /* synthetic */ InterfaceC0877b0 $unboundedState;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt$trackMainAxisUnbounded$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00731 extends n implements c {
            final /* synthetic */ X $placeable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00731(X x10) {
                super(1);
                this.$placeable = x10;
            }

            @Override // Z8.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W) obj);
                return D.f8402a;
            }

            public final void invoke(W layout) {
                m.f(layout, "$this$layout");
                W.d(layout, this.$placeable, 0, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC0877b0 interfaceC0877b0, boolean z10) {
            super(3);
            this.$unboundedState = interfaceC0877b0;
            this.$isHorizontal = z10;
        }

        @Override // Z8.f
        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m821invoke3p2s80s((O) obj, (L) obj2, ((a) obj3).f15843a);
        }

        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
        public final N m821invoke3p2s80s(O layout, L measurable, long j10) {
            m.f(layout, "$this$layout");
            m.f(measurable, "measurable");
            InterfaceC0877b0 interfaceC0877b0 = this.$unboundedState;
            boolean z10 = false;
            if (!this.$isHorizontal ? !(a.c(j10) || a.i(j10) != 0) : !(a.d(j10) || a.j(j10) != 0)) {
                z10 = true;
            }
            interfaceC0877b0.setValue(Boolean.valueOf(z10));
            X xE = measurable.E(j10);
            return layout.S(xE.f1762a, xE.f1763b, t.f8651a, new C00731(xE));
        }
    }

    public static final <T> r applyIfNotNull(r rVar, T t10, e modifier) {
        m.f(rVar, "<this>");
        m.f(modifier, "modifier");
        return t10 != null ? rVar.then((r) modifier.invoke(o.f19964a, t10)) : rVar;
    }

    public static final r conditional(r rVar, boolean z10, c modifier) {
        m.f(rVar, "<this>");
        m.f(modifier, "modifier");
        return z10 ? rVar.then((r) modifier.invoke(o.f19964a)) : rVar;
    }

    public static final r trackMainAxisUnbounded(r rVar, boolean z10, InterfaceC0877b0 unboundedState) {
        m.f(rVar, "<this>");
        m.f(unboundedState, "unboundedState");
        return androidx.compose.ui.layout.a.b(rVar, new AnonymousClass1(unboundedState, z10));
    }

    public static final <T, V> r applyIfNotNull(r rVar, T t10, V v3, f modifier) {
        m.f(rVar, "<this>");
        m.f(modifier, "modifier");
        return (t10 == null || v3 == null) ? rVar : rVar.then((r) modifier.invoke(o.f19964a, t10, v3));
    }
}
