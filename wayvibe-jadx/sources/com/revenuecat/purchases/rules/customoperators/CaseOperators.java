package com.revenuecat.purchases.rules.customoperators;

import com.revenuecat.purchases.rules.RulesEngine;
import com.revenuecat.purchases.rules.Scope;
import com.revenuecat.purchases.rules.Value;
import com.revenuecat.purchases.rules.operators.Operators;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class CaseOperators {
    public static final CaseOperators INSTANCE = new CaseOperators();

    private CaseOperators() {
    }

    private final String stringArgument(Value value, Scope scope, String str) throws RulesEngine.EvaluationException.TypeMismatch {
        Value valueFirstArgEvaluated = Operators.INSTANCE.firstArgEvaluated(value, scope);
        if (valueFirstArgEvaluated instanceof Value.StringValue) {
            return ((Value.StringValue) valueFirstArgEvaluated).getValue();
        }
        throw new RulesEngine.EvaluationException.TypeMismatch("operator '" + str + "' expected string, got " + valueFirstArgEvaluated);
    }

    public final Value opLower(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        String lowerCase = stringArgument(args, vars, "rc.lower").toLowerCase(Locale.ROOT);
        m.e(lowerCase, "toLowerCase(...)");
        return new Value.StringValue(lowerCase);
    }

    public final Value opUpper(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        String upperCase = stringArgument(args, vars, "rc.upper").toUpperCase(Locale.ROOT);
        m.e(upperCase, "toUpperCase(...)");
        return new Value.StringValue(upperCase);
    }
}
