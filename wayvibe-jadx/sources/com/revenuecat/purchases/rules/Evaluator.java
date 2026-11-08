package com.revenuecat.purchases.rules;

import B8.V;
import N8.n;
import N8.o;
import com.revenuecat.purchases.rules.operators.Operators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class Evaluator {
    public static final Evaluator INSTANCE = new Evaluator();

    private Evaluator() {
    }

    public final boolean evaluate(Value predicate, Map<String, ? extends Value> variables) {
        m.f(predicate, "predicate");
        m.f(variables, "variables");
        return evaluateValue$purchases_defaultsRelease(predicate, new Scope(new Value.ObjectValue(variables))).isTruthy$purchases_defaultsRelease();
    }

    public final Value evaluateValue$purchases_defaultsRelease(Value predicate, Scope vars) {
        m.f(predicate, "predicate");
        m.f(vars, "vars");
        if (predicate.equals(Value.Null.INSTANCE) ? true : predicate.equals(Value.Undefined.INSTANCE) ? true : predicate instanceof Value.BoolValue ? true : predicate instanceof Value.IntValue ? true : predicate instanceof Value.FloatValue ? true : predicate instanceof Value.StringValue) {
            return predicate;
        }
        if (predicate instanceof Value.ArrayValue) {
            List<Value> items = ((Value.ArrayValue) predicate).getItems();
            ArrayList arrayList = new ArrayList(o.o0(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(INSTANCE.evaluateValue$purchases_defaultsRelease((Value) it.next(), vars));
            }
            return new Value.ArrayValue(arrayList);
        }
        if (!(predicate instanceof Value.ObjectValue)) {
            throw new V();
        }
        Map<String, Value> entries = ((Value.ObjectValue) predicate).getEntries();
        if (entries.size() != 1) {
            return predicate;
        }
        Map.Entry entry = (Map.Entry) n.A0(entries.entrySet());
        return Operators.INSTANCE.dispatch((String) entry.getKey(), (Value) entry.getValue(), vars);
    }
}
