package com.revenuecat.purchases.common.localrules;

import com.revenuecat.purchases.rules.Value;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class RulesDimensionSnapshot {
    private final Date evaluationDate;
    private final Map<String, Value> values;

    /* JADX WARN: Multi-variable type inference failed */
    public RulesDimensionSnapshot(Map<String, ? extends Value> values, Date evaluationDate) {
        m.f(values, "values");
        m.f(evaluationDate, "evaluationDate");
        this.values = values;
        this.evaluationDate = evaluationDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RulesDimensionSnapshot copy$default(RulesDimensionSnapshot rulesDimensionSnapshot, Map map, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = rulesDimensionSnapshot.values;
        }
        if ((i10 & 2) != 0) {
            date = rulesDimensionSnapshot.evaluationDate;
        }
        return rulesDimensionSnapshot.copy(map, date);
    }

    public final Map<String, Value> component1() {
        return this.values;
    }

    public final Date component2() {
        return this.evaluationDate;
    }

    public final RulesDimensionSnapshot copy(Map<String, ? extends Value> values, Date evaluationDate) {
        m.f(values, "values");
        m.f(evaluationDate, "evaluationDate");
        return new RulesDimensionSnapshot(values, evaluationDate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RulesDimensionSnapshot)) {
            return false;
        }
        RulesDimensionSnapshot rulesDimensionSnapshot = (RulesDimensionSnapshot) obj;
        return m.b(this.values, rulesDimensionSnapshot.values) && m.b(this.evaluationDate, rulesDimensionSnapshot.evaluationDate);
    }

    public final Date getEvaluationDate() {
        return this.evaluationDate;
    }

    public final Map<String, Value> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.evaluationDate.hashCode() + (this.values.hashCode() * 31);
    }

    public String toString() {
        return "RulesDimensionSnapshot(values=" + this.values + ", evaluationDate=" + this.evaluationDate + ')';
    }
}
