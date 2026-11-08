package com.revenuecat.purchases.rules.operators;

import D7.W;
import M8.l;
import N8.n;
import N8.o;
import N8.s;
import V0.p;
import com.revenuecat.purchases.rules.Evaluator;
import com.revenuecat.purchases.rules.RulesEngine;
import com.revenuecat.purchases.rules.RulesEngineLogger;
import com.revenuecat.purchases.rules.Scope;
import com.revenuecat.purchases.rules.Value;
import com.revenuecat.purchases.rules.ValueKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p097i9.r;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessorOperators {
    public static final AccessorOperators INSTANCE = new AccessorOperators();

    private AccessorOperators() {
    }

    private final boolean isMissing(Value value) {
        if (value == null ? true : value.equals(Value.Null.INSTANCE)) {
            return true;
        }
        return (value instanceof Value.StringValue) && ((Value.StringValue) value).getValue().length() == 0;
    }

    private final List<String> jsDotSplit(String str) {
        if (str.length() == 0) {
            return W.T("");
        }
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) == '.') {
                String strSubstring = str.substring(i10, i11);
                m.e(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                i10 = i11 + 1;
            }
        }
        String strSubstring2 = str.substring(i10);
        m.e(strSubstring2, "substring(...)");
        arrayList.add(strSubstring2);
        return arrayList;
    }

    private final String keyAsPath(Value value) {
        if ((value instanceof Value.Null) || (value instanceof Value.Undefined)) {
            return null;
        }
        return ValueKt.jsString(value);
    }

    private final Value lookupPath(Value value, String str) {
        Integer numK0;
        int iIntValue;
        for (String str2 : jsDotSplit(str)) {
            if (!(value instanceof Value.ObjectValue)) {
                if ((value instanceof Value.ArrayValue) && (numK0 = r.k0(str2)) != null && (iIntValue = numK0.intValue()) >= 0) {
                    Value.ArrayValue arrayValue = (Value.ArrayValue) value;
                    if (iIntValue < arrayValue.getItems().size()) {
                        value = arrayValue.getItems().get(iIntValue);
                    }
                }
                return null;
            }
            value = ((Value.ObjectValue) value).getEntries().get(str2);
            if (value == null) {
                return null;
            }
        }
        return value;
    }

    private final Value lookupVar(Value value, String str) {
        return str.length() == 0 ? value : lookupPath(value, str);
    }

    private final l parseVarArrayArgs(List<? extends Value> list, String str) {
        String strPathSegment = pathSegment((Value) n.D0(list));
        Value value = list.size() >= 2 ? list.get(1) : null;
        if (list.size() > 2) {
            RulesEngineLogger logger$purchases_defaultsRelease = RulesEngine.INSTANCE.getLogger$purchases_defaultsRelease();
            StringBuilder sbT = p.t(str, ": ignoring ");
            sbT.append(list.size() - 2);
            sbT.append(" extra arg(s); expected [path] or [path, default]");
            logger$purchases_defaultsRelease.warn(sbT.toString());
        }
        return new l(strPathSegment, value);
    }

    private final String pathSegment(Value value) {
        return value == null ? true : value.equals(Value.Null.INSTANCE) ? true : m.b(value, Value.Undefined.INSTANCE) ? "" : ValueKt.jsString(value);
    }

    private final l resolveVarArgs(Value value, Scope scope, String str) {
        if (!(value instanceof Value.ArrayValue)) {
            return new l(pathSegment(Evaluator.INSTANCE.evaluateValue$purchases_defaultsRelease(value, scope)), null);
        }
        List<Value> items = ((Value.ArrayValue) value).getItems();
        ArrayList arrayList = new ArrayList(o.o0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(Evaluator.INSTANCE.evaluateValue$purchases_defaultsRelease((Value) it.next(), scope));
        }
        return parseVarArrayArgs(arrayList, str);
    }

    private final Value varLookup(Value value, String str) {
        Value valueLookupVar = lookupVar(value, str);
        return valueLookupVar == null ? Value.Null.INSTANCE : valueLookupVar;
    }

    public final Value opMissing(Value args, Scope vars) {
        List<Value> listT;
        m.f(args, "args");
        m.f(vars, "vars");
        if (args instanceof Value.ArrayValue) {
            List<Value> items = ((Value.ArrayValue) args).getItems();
            listT = new ArrayList<>(o.o0(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                listT.add(Evaluator.INSTANCE.evaluateValue$purchases_defaultsRelease((Value) it.next(), vars));
            }
        } else {
            listT = W.T(Evaluator.INSTANCE.evaluateValue$purchases_defaultsRelease(args, vars));
        }
        Value value = (Value) n.D0(listT);
        if (value instanceof Value.ArrayValue) {
            listT = ((Value.ArrayValue) value).getItems();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Value> it2 = listT.iterator();
        while (it2.hasNext()) {
            String strKeyAsPath = keyAsPath(it2.next());
            if (strKeyAsPath != null && isMissing(varLookup(vars.getCurrent(), strKeyAsPath))) {
                arrayList.add(new Value.StringValue(strKeyAsPath));
            }
        }
        return new Value.ArrayValue(arrayList);
    }

    public final Value opMissingSome(Value args, Scope vars) throws RulesEngine.EvaluationException.TypeMismatch {
        Long lValueOf;
        List<Value> listT;
        List<Value> items;
        m.f(args, "args");
        m.f(vars, "vars");
        List<Value> listEvalArgs = Operators.INSTANCE.evalArgs(args, vars);
        if (listEvalArgs.size() != 2) {
            throw new RulesEngine.EvaluationException.TypeMismatch("operator 'missing_some' expects 2 arguments, got " + listEvalArgs.size());
        }
        Value value = listEvalArgs.get(0);
        Value value2 = listEvalArgs.get(1);
        boolean z10 = value2 instanceof Value.ArrayValue;
        s sVar = s.f8650a;
        if (z10) {
            Value.ArrayValue arrayValue = (Value.ArrayValue) value2;
            listT = arrayValue.getItems();
            lValueOf = Long.valueOf(arrayValue.getItems().size());
        } else if (value2 instanceof Value.StringValue) {
            Value.StringValue stringValue = (Value.StringValue) value2;
            listT = W.T(new Value.StringValue(stringValue.getValue()));
            lValueOf = Long.valueOf(stringValue.getValue().length());
        } else {
            if (!(m.b(value2, Value.Null.INSTANCE) ? true : m.b(value2, Value.Undefined.INSTANCE))) {
                throw new RulesEngine.EvaluationException.TypeMismatch("operator 'missing_some': second argument must be array-like, got " + value2);
            }
            lValueOf = null;
            listT = sVar;
        }
        double dJsToNumber = ValueKt.jsToNumber(value);
        Value valueOpMissing = opMissing(new Value.ArrayValue(listT), vars);
        Value.ArrayValue arrayValue2 = valueOpMissing instanceof Value.ArrayValue ? (Value.ArrayValue) valueOpMissing : null;
        return (lValueOf == null || ((double) (lValueOf.longValue() - ((arrayValue2 == null || (items = arrayValue2.getItems()) == null) ? 0L : (long) items.size()))) < dJsToNumber) ? valueOpMissing : new Value.ArrayValue(sVar);
    }

    public final Value opVar(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        return resolveVar(args, vars.getCurrent(), vars, "var");
    }

    public final Value resolveVar(Value args, Value target, Scope vars, String operatorName) throws RulesEngine.EvaluationException.UnresolvedVariable {
        m.f(args, "args");
        m.f(target, "target");
        m.f(vars, "vars");
        m.f(operatorName, "operatorName");
        l lVarResolveVarArgs = resolveVarArgs(args, vars, operatorName);
        String str = (String) lVarResolveVarArgs.f8413a;
        Value value = (Value) lVarResolveVarArgs.f8414b;
        Value valueLookupVar = lookupVar(target, str);
        if (valueLookupVar != null) {
            return valueLookupVar;
        }
        if (value instanceof Value.Undefined) {
            return Value.Null.INSTANCE;
        }
        if (value != null) {
            return value;
        }
        throw new RulesEngine.EvaluationException.UnresolvedVariable(str);
    }
}
