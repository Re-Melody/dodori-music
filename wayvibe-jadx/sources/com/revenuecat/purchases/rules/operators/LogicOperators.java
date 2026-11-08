package com.revenuecat.purchases.rules.operators;

import com.revenuecat.purchases.rules.Evaluator;
import com.revenuecat.purchases.rules.Scope;
import com.revenuecat.purchases.rules.Value;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class LogicOperators {
    public static final LogicOperators INSTANCE = new LogicOperators();

    private LogicOperators() {
    }

    public final Value opAnd(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        Value valueEvaluateValue$purchases_defaultsRelease = Value.Undefined.INSTANCE;
        Iterator<Value> it = Operators.INSTANCE.argsAsList(args).iterator();
        while (it.hasNext()) {
            valueEvaluateValue$purchases_defaultsRelease = Evaluator.INSTANCE.evaluateValue$purchases_defaultsRelease(it.next(), vars);
            if (!valueEvaluateValue$purchases_defaultsRelease.isTruthy$purchases_defaultsRelease()) {
                break;
            }
        }
        return valueEvaluateValue$purchases_defaultsRelease;
    }

    public final Value opIf(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        List<Value> listArgsAsList = Operators.INSTANCE.argsAsList(args);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= listArgsAsList.size()) {
                return i10 < listArgsAsList.size() ? Evaluator.INSTANCE.evaluateValue$purchases_defaultsRelease(listArgsAsList.get(i10), vars) : Value.Null.INSTANCE;
            }
            Evaluator evaluator = Evaluator.INSTANCE;
            if (evaluator.evaluateValue$purchases_defaultsRelease(listArgsAsList.get(i10), vars).isTruthy$purchases_defaultsRelease()) {
                return evaluator.evaluateValue$purchases_defaultsRelease(listArgsAsList.get(i11), vars);
            }
            i10 += 2;
        }
    }

    public final Value opNot(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        return new Value.BoolValue(!Operators.INSTANCE.firstArgEvaluated(args, vars).isTruthy$purchases_defaultsRelease());
    }

    public final Value opNotNot(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        return new Value.BoolValue(Operators.INSTANCE.firstArgEvaluated(args, vars).isTruthy$purchases_defaultsRelease());
    }

    public final Value opOr(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        Value valueEvaluateValue$purchases_defaultsRelease = Value.Undefined.INSTANCE;
        Iterator<Value> it = Operators.INSTANCE.argsAsList(args).iterator();
        while (it.hasNext()) {
            valueEvaluateValue$purchases_defaultsRelease = Evaluator.INSTANCE.evaluateValue$purchases_defaultsRelease(it.next(), vars);
            if (valueEvaluateValue$purchases_defaultsRelease.isTruthy$purchases_defaultsRelease()) {
                break;
            }
        }
        return valueEvaluateValue$purchases_defaultsRelease;
    }
}
