package com.revenuecat.purchases.rules.operators;

import Z8.e;
import com.revenuecat.purchases.rules.Scope;
import com.revenuecat.purchases.rules.Value;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class MinMaxOperators {
    public static final MinMaxOperators INSTANCE = new MinMaxOperators();

    /* JADX INFO: renamed from: com.revenuecat.purchases.rules.operators.MinMaxOperators$opMax$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements e {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        public final Double invoke(double d10, double d11) {
            return Double.valueOf(Math.max(d10, d11));
        }

        @Override // Z8.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.rules.operators.MinMaxOperators$opMin$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14621 extends n implements e {
        public static final C14621 INSTANCE = new C14621();

        public C14621() {
            super(2);
        }

        public final Double invoke(double d10, double d11) {
            return Double.valueOf(Math.min(d10, d11));
        }

        @Override // Z8.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
        }
    }

    private MinMaxOperators() {
    }

    private final Value reduceExtremum(Value value, Scope scope, double d10, e eVar) {
        Iterator<T> it = Operators.INSTANCE.evalArgs(value, scope).iterator();
        while (it.hasNext()) {
            Double numberOrNull$purchases_defaultsRelease = ((Value) it.next()).toNumberOrNull$purchases_defaultsRelease();
            double dDoubleValue = numberOrNull$purchases_defaultsRelease != null ? numberOrNull$purchases_defaultsRelease.doubleValue() : Double.NaN;
            d10 = (Double.isNaN(d10) || Double.isNaN(dDoubleValue)) ? Double.NaN : ((Number) eVar.invoke(Double.valueOf(d10), Double.valueOf(dDoubleValue))).doubleValue();
        }
        return new Value.FloatValue(d10);
    }

    public final Value opMax(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        return reduceExtremum(args, vars, Double.NEGATIVE_INFINITY, AnonymousClass1.INSTANCE);
    }

    public final Value opMin(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        return reduceExtremum(args, vars, Double.POSITIVE_INFINITY, C14621.INSTANCE);
    }
}
