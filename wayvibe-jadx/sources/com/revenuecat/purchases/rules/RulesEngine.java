package com.revenuecat.purchases.rules;

import B2.AbstractC0112b;
import Q5.b;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class RulesEngine {
    public static final RulesEngine INSTANCE = new RulesEngine();
    private static volatile RulesEngineLogger _logger = PrintLogger.INSTANCE;

    public static abstract class EvaluationException extends Exception {

        public static final class Parse extends EvaluationException {
            private final String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Parse(String reason) {
                super("failed to parse predicate JSON: ".concat(reason), null);
                m.f(reason, "reason");
                this.reason = reason;
            }

            public static /* synthetic */ Parse copy$default(Parse parse, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = parse.reason;
                }
                return parse.copy(str);
            }

            public final String component1() {
                return this.reason;
            }

            public final Parse copy(String reason) {
                m.f(reason, "reason");
                return new Parse(reason);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Parse) && m.b(this.reason, ((Parse) obj).reason);
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return AbstractC0112b.j(new StringBuilder("Parse(reason="), this.reason, ')');
            }
        }

        public static final class TypeMismatch extends EvaluationException {
            private final String detail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TypeMismatch(String detail) {
                super("type mismatch: ".concat(detail), null);
                m.f(detail, "detail");
                this.detail = detail;
            }

            public static /* synthetic */ TypeMismatch copy$default(TypeMismatch typeMismatch, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = typeMismatch.detail;
                }
                return typeMismatch.copy(str);
            }

            public final String component1() {
                return this.detail;
            }

            public final TypeMismatch copy(String detail) {
                m.f(detail, "detail");
                return new TypeMismatch(detail);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TypeMismatch) && m.b(this.detail, ((TypeMismatch) obj).detail);
            }

            public final String getDetail() {
                return this.detail;
            }

            public int hashCode() {
                return this.detail.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return AbstractC0112b.j(new StringBuilder("TypeMismatch(detail="), this.detail, ')');
            }
        }

        public static final class Unknown extends EvaluationException {
            private final String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(String reason) {
                super("unknown error: ".concat(reason), null);
                m.f(reason, "reason");
                this.reason = reason;
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unknown.reason;
                }
                return unknown.copy(str);
            }

            public final String component1() {
                return this.reason;
            }

            public final Unknown copy(String reason) {
                m.f(reason, "reason");
                return new Unknown(reason);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown) && m.b(this.reason, ((Unknown) obj).reason);
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return AbstractC0112b.j(new StringBuilder("Unknown(reason="), this.reason, ')');
            }
        }

        public static final class UnresolvedVariable extends EvaluationException {
            private final String path;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnresolvedVariable(String path) {
                super("unresolved variable: ".concat(path), null);
                m.f(path, "path");
                this.path = path;
            }

            public static /* synthetic */ UnresolvedVariable copy$default(UnresolvedVariable unresolvedVariable, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unresolvedVariable.path;
                }
                return unresolvedVariable.copy(str);
            }

            public final String component1() {
                return this.path;
            }

            public final UnresolvedVariable copy(String path) {
                m.f(path, "path");
                return new UnresolvedVariable(path);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnresolvedVariable) && m.b(this.path, ((UnresolvedVariable) obj).path);
            }

            public final String getPath() {
                return this.path;
            }

            public int hashCode() {
                return this.path.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return AbstractC0112b.j(new StringBuilder("UnresolvedVariable(path="), this.path, ')');
            }
        }

        public static final class UnsupportedOperator extends EvaluationException {
            private final String name;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnsupportedOperator(String name) {
                super("unsupported operator: ".concat(name), null);
                m.f(name, "name");
                this.name = name;
            }

            public static /* synthetic */ UnsupportedOperator copy$default(UnsupportedOperator unsupportedOperator, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unsupportedOperator.name;
                }
                return unsupportedOperator.copy(str);
            }

            public final String component1() {
                return this.name;
            }

            public final UnsupportedOperator copy(String name) {
                m.f(name, "name");
                return new UnsupportedOperator(name);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnsupportedOperator) && m.b(this.name, ((UnsupportedOperator) obj).name);
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return AbstractC0112b.j(new StringBuilder("UnsupportedOperator(name="), this.name, ')');
            }
        }

        public /* synthetic */ EvaluationException(String str, f fVar) {
            this(str);
        }

        private EvaluationException(String str) {
            super(str);
        }
    }

    private RulesEngine() {
    }

    /* JADX INFO: renamed from: evaluate-gIAlu-s, reason: not valid java name */
    public final Object m305evaluategIAlus(String predicate, Map<String, ? extends Value> variables) {
        m.f(predicate, "predicate");
        m.f(variables, "variables");
        try {
            return Boolean.valueOf(Evaluator.INSTANCE.evaluate(ValueJson.INSTANCE.parse(predicate), variables));
        } catch (EvaluationException e2) {
            return b.r(e2);
        } catch (Exception e4) {
            String message = e4.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            return b.r(new EvaluationException.Unknown(message));
        }
    }

    public final RulesEngineLogger getLogger$purchases_defaultsRelease() {
        return _logger;
    }

    public final synchronized void setLogger(RulesEngineLogger logger) {
        m.f(logger, "logger");
        _logger = logger;
    }
}
