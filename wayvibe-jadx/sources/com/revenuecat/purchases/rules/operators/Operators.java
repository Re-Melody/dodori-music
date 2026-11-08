package com.revenuecat.purchases.rules.operators;

import D7.W;
import M8.l;
import N8.n;
import N8.o;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.android.gms.common.api.f;
import com.revenuecat.purchases.rules.Evaluator;
import com.revenuecat.purchases.rules.Scope;
import com.revenuecat.purchases.rules.Value;
import com.revenuecat.purchases.rules.customoperators.CustomOperators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: loaded from: classes2.dex */
public final class Operators {
    public static final Operators INSTANCE = new Operators();

    private Operators() {
    }

    public final List<Value> argsAsList(Value args) {
        m.f(args, "args");
        return args instanceof Value.ArrayValue ? ((Value.ArrayValue) args).getItems() : W.T(args);
    }

    public final int clampedInt(double d10) {
        if (Double.isNaN(d10)) {
            return 0;
        }
        if (d10 >= 2.147483647E9d) {
            return f.API_PRIORITY_OTHER;
        }
        return d10 <= -2.147483648E9d ? MediaPlayerException.ERROR_UNKNOWN : (int) d10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Value dispatch(String op, Value args, Scope vars) {
        m.f(op, "op");
        m.f(args, "args");
        m.f(vars, "vars");
        switch (op.hashCode()) {
            case -1274492040:
                if (op.equals("filter")) {
                    return IterationOperators.INSTANCE.opFilter(args, vars);
                }
                break;
            case -1146545107:
                if (op.equals("missing_some")) {
                    return AccessorOperators.INSTANCE.opMissingSome(args, vars);
                }
                break;
            case -934873754:
                if (op.equals("reduce")) {
                    return IterationOperators.INSTANCE.opReduce(args, vars);
                }
                break;
            case -891529231:
                if (op.equals("substr")) {
                    return StringArrayOperators.INSTANCE.opSubstr(args, vars);
                }
                break;
            case 33:
                if (op.equals("!")) {
                    return LogicOperators.INSTANCE.opNot(args, vars);
                }
                break;
            case 37:
                if (op.equals("%")) {
                    return ArithmeticOperators.INSTANCE.opMod(args, vars);
                }
                break;
            case 42:
                if (op.equals("*")) {
                    return ArithmeticOperators.INSTANCE.opMul(args, vars);
                }
                break;
            case 43:
                if (op.equals("+")) {
                    return ArithmeticOperators.INSTANCE.opAdd(args, vars);
                }
                break;
            case 45:
                if (op.equals("-")) {
                    return ArithmeticOperators.INSTANCE.opSub(args, vars);
                }
                break;
            case 47:
                if (op.equals("/")) {
                    return ArithmeticOperators.INSTANCE.opDiv(args, vars);
                }
                break;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                if (op.equals("<")) {
                    return ComparisonOperators.INSTANCE.opLt(args, vars);
                }
                break;
            case 62:
                if (op.equals(">")) {
                    return ComparisonOperators.INSTANCE.opGt(args, vars);
                }
                break;
            case 1056:
                if (op.equals("!!")) {
                    return LogicOperators.INSTANCE.opNotNot(args, vars);
                }
                break;
            case 1084:
                if (op.equals("!=")) {
                    return EqualityOperators.INSTANCE.opLooseNe(args, vars);
                }
                break;
            case 1921:
                if (op.equals("<=")) {
                    return ComparisonOperators.INSTANCE.opLe(args, vars);
                }
                break;
            case 1952:
                if (op.equals("==")) {
                    return EqualityOperators.INSTANCE.opLooseEq(args, vars);
                }
                break;
            case 1983:
                if (op.equals(">=")) {
                    return ComparisonOperators.INSTANCE.opGe(args, vars);
                }
                break;
            case 3357:
                if (op.equals("if")) {
                    return LogicOperators.INSTANCE.opIf(args, vars);
                }
                break;
            case 3365:
                if (op.equals("in")) {
                    return StringArrayOperators.INSTANCE.opIn(args, vars);
                }
                break;
            case 3555:
                if (op.equals("or")) {
                    return LogicOperators.INSTANCE.opOr(args, vars);
                }
                break;
            case 33665:
                if (op.equals("!==")) {
                    return EqualityOperators.INSTANCE.opStrictNe(args, vars);
                }
                break;
            case 60573:
                if (op.equals("===")) {
                    return EqualityOperators.INSTANCE.opStrictEq(args, vars);
                }
                break;
            case 96673:
                if (op.equals("all")) {
                    return IterationOperators.INSTANCE.opAll(args, vars);
                }
                break;
            case 96727:
                if (op.equals("and")) {
                    return LogicOperators.INSTANCE.opAnd(args, vars);
                }
                break;
            case 98262:
                if (op.equals("cat")) {
                    return StringArrayOperators.INSTANCE.opCat(args, vars);
                }
                break;
            case 107332:
                if (op.equals("log")) {
                    return MiscOperators.INSTANCE.opLog(args, vars);
                }
                break;
            case 107868:
                if (op.equals("map")) {
                    return IterationOperators.INSTANCE.opMap(args, vars);
                }
                break;
            case 107876:
                if (op.equals("max")) {
                    return MinMaxOperators.INSTANCE.opMax(args, vars);
                }
                break;
            case 108114:
                if (op.equals("min")) {
                    return MinMaxOperators.INSTANCE.opMin(args, vars);
                }
                break;
            case 116519:
                if (op.equals("var")) {
                    return AccessorOperators.INSTANCE.opVar(args, vars);
                }
                break;
            case 3387192:
                if (op.equals("none")) {
                    return IterationOperators.INSTANCE.opNone(args, vars);
                }
                break;
            case 3536116:
                if (op.equals("some")) {
                    return IterationOperators.INSTANCE.opSome(args, vars);
                }
                break;
            case 103785528:
                if (op.equals("merge")) {
                    return StringArrayOperators.INSTANCE.opMerge(args, vars);
                }
                break;
            case 1069449574:
                if (op.equals("missing")) {
                    return AccessorOperators.INSTANCE.opMissing(args, vars);
                }
                break;
        }
        return CustomOperators.INSTANCE.dispatch(op, args, vars);
    }

    public final List<Value> evalArgs(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        List<Value> listArgsAsList = argsAsList(args);
        ArrayList arrayList = new ArrayList(o.o0(listArgsAsList, 10));
        Iterator<T> it = listArgsAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(Evaluator.INSTANCE.evaluateValue$purchases_defaultsRelease((Value) it.next(), vars));
        }
        return arrayList;
    }

    public final l evalTwo(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        List<Value> listEvalArgs = evalArgs(args, vars);
        Object obj = (Value) n.D0(listEvalArgs);
        if (obj == null) {
            obj = Value.Undefined.INSTANCE;
        }
        return new l(obj, listEvalArgs.size() >= 2 ? listEvalArgs.get(1) : Value.Undefined.INSTANCE);
    }

    public final Value firstArgEvaluated(Value args, Scope vars) {
        m.f(args, "args");
        m.f(vars, "vars");
        Value value = (Value) n.D0(argsAsList(args));
        if (value == null) {
            value = Value.Null.INSTANCE;
        }
        return Evaluator.INSTANCE.evaluateValue$purchases_defaultsRelease(value, vars);
    }
}
