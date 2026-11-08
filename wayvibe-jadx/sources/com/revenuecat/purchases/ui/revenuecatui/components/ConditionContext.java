package com.revenuecat.purchases.ui.revenuecatui.components;

import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class ConditionContext {
    public static final int $stable = 8;
    private final Map<String, CustomVariableValue> customVariables;
    private final String selectedPackageId;
    private final c stateReader;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.ConditionContext$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements c {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // Z8.c
        public final Void invoke(String it) {
            m.f(it, "it");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConditionContext(String str, Map<String, ? extends CustomVariableValue> customVariables, c stateReader) {
        m.f(customVariables, "customVariables");
        m.f(stateReader, "stateReader");
        this.selectedPackageId = str;
        this.customVariables = customVariables;
        this.stateReader = stateReader;
    }

    public final Map<String, CustomVariableValue> getCustomVariables() {
        return this.customVariables;
    }

    public final String getSelectedPackageId() {
        return this.selectedPackageId;
    }

    public final c getStateReader() {
        return this.stateReader;
    }

    public /* synthetic */ ConditionContext(String str, Map map, c cVar, int i10, f fVar) {
        this(str, map, (i10 & 4) != 0 ? AnonymousClass1.INSTANCE : cVar);
    }
}
