package com.revenuecat.purchases.rules.customoperators;

import com.revenuecat.purchases.rules.Scope;
import com.revenuecat.purchases.rules.Value;
import com.revenuecat.purchases.rules.operators.AccessorOperators;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class RootVarOperator {
    public static final RootVarOperator INSTANCE = new RootVarOperator();

    private RootVarOperator() {
    }

    public final Value opRootVar(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        return AccessorOperators.INSTANCE.resolveVar(args, vars.getRoot(), vars, "rc.rootVar");
    }
}
