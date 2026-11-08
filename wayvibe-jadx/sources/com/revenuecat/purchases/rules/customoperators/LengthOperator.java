package com.revenuecat.purchases.rules.customoperators;

import com.revenuecat.purchases.rules.RulesEngine;
import com.revenuecat.purchases.rules.Scope;
import com.revenuecat.purchases.rules.Value;
import com.revenuecat.purchases.rules.operators.Operators;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class LengthOperator {
    public static final LengthOperator INSTANCE = new LengthOperator();

    private LengthOperator() {
    }

    public final Value opLength(Value args, Scope vars) throws RulesEngine.EvaluationException.TypeMismatch {
        m.f(args, "args");
        m.f(vars, "vars");
        Value valueFirstArgEvaluated = Operators.INSTANCE.firstArgEvaluated(args, vars);
        if (valueFirstArgEvaluated instanceof Value.StringValue) {
            return new Value.IntValue(((Value.StringValue) valueFirstArgEvaluated).getValue().length());
        }
        if (valueFirstArgEvaluated instanceof Value.ArrayValue) {
            return new Value.IntValue(((Value.ArrayValue) valueFirstArgEvaluated).getItems().size());
        }
        throw new RulesEngine.EvaluationException.TypeMismatch("operator 'rc.length' expected string or array, got " + valueFirstArgEvaluated);
    }
}
