package com.revenuecat.purchases.common.localrules;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LocalRulesEvaluationException extends Exception {

    public static final class DimensionResolution extends LocalRulesEvaluationException {
        private final Throwable reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DimensionResolution(Throwable reason) {
            super("dimensions could not be collected: " + reason.getMessage(), null);
            m.f(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ DimensionResolution copy$default(DimensionResolution dimensionResolution, Throwable th, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th = dimensionResolution.reason;
            }
            return dimensionResolution.copy(th);
        }

        public final Throwable component1() {
            return this.reason;
        }

        public final DimensionResolution copy(Throwable reason) {
            m.f(reason, "reason");
            return new DimensionResolution(reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DimensionResolution) && m.b(this.reason, ((DimensionResolution) obj).reason);
        }

        public final Throwable getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DimensionResolution(reason=" + this.reason + ')';
        }
    }

    public static final class PredicateEvaluation extends LocalRulesEvaluationException {
        private final Throwable error;
        private final int ruleIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PredicateEvaluation(int i10, Throwable error) {
            super("rule at index " + i10 + " could not be evaluated: " + error.getMessage(), null);
            m.f(error, "error");
            this.ruleIndex = i10;
            this.error = error;
        }

        public static /* synthetic */ PredicateEvaluation copy$default(PredicateEvaluation predicateEvaluation, int i10, Throwable th, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = predicateEvaluation.ruleIndex;
            }
            if ((i11 & 2) != 0) {
                th = predicateEvaluation.error;
            }
            return predicateEvaluation.copy(i10, th);
        }

        public final int component1() {
            return this.ruleIndex;
        }

        public final Throwable component2() {
            return this.error;
        }

        public final PredicateEvaluation copy(int i10, Throwable error) {
            m.f(error, "error");
            return new PredicateEvaluation(i10, error);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PredicateEvaluation)) {
                return false;
            }
            PredicateEvaluation predicateEvaluation = (PredicateEvaluation) obj;
            return this.ruleIndex == predicateEvaluation.ruleIndex && m.b(this.error, predicateEvaluation.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public final int getRuleIndex() {
            return this.ruleIndex;
        }

        public int hashCode() {
            return this.error.hashCode() + (Integer.hashCode(this.ruleIndex) * 31);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PredicateEvaluation(ruleIndex=" + this.ruleIndex + ", error=" + this.error + ')';
        }
    }

    public /* synthetic */ LocalRulesEvaluationException(String str, f fVar) {
        this(str);
    }

    private LocalRulesEvaluationException(String str) {
        super(str);
    }
}
