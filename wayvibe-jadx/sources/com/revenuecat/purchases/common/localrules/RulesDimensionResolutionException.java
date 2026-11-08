package com.revenuecat.purchases.common.localrules;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RulesDimensionResolutionException extends Exception {

    public static final class ConflictingDimension extends RulesDimensionResolutionException {
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConflictingDimension(String path) {
            super("two dimension providers supplied '" + path + '\'', null);
            m.f(path, "path");
            this.path = path;
        }

        public static /* synthetic */ ConflictingDimension copy$default(ConflictingDimension conflictingDimension, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conflictingDimension.path;
            }
            return conflictingDimension.copy(str);
        }

        public final String component1() {
            return this.path;
        }

        public final ConflictingDimension copy(String path) {
            m.f(path, "path");
            return new ConflictingDimension(path);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConflictingDimension) && m.b(this.path, ((ConflictingDimension) obj).path);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return AbstractC0112b.j(new StringBuilder("ConflictingDimension(path="), this.path, ')');
        }
    }

    public static final class ProviderFailed extends RulesDimensionResolutionException {
        private final RulesDimensionNamespace namespace;
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderFailed(RulesDimensionNamespace namespace, String reason) {
            super("dimension provider '" + namespace.getKey() + "' failed: " + reason, null);
            m.f(namespace, "namespace");
            m.f(reason, "reason");
            this.namespace = namespace;
            this.reason = reason;
        }

        public static /* synthetic */ ProviderFailed copy$default(ProviderFailed providerFailed, RulesDimensionNamespace rulesDimensionNamespace, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rulesDimensionNamespace = providerFailed.namespace;
            }
            if ((i10 & 2) != 0) {
                str = providerFailed.reason;
            }
            return providerFailed.copy(rulesDimensionNamespace, str);
        }

        public final RulesDimensionNamespace component1() {
            return this.namespace;
        }

        public final String component2() {
            return this.reason;
        }

        public final ProviderFailed copy(RulesDimensionNamespace namespace, String reason) {
            m.f(namespace, "namespace");
            m.f(reason, "reason");
            return new ProviderFailed(namespace, reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderFailed)) {
                return false;
            }
            ProviderFailed providerFailed = (ProviderFailed) obj;
            return this.namespace == providerFailed.namespace && m.b(this.reason, providerFailed.reason);
        }

        public final RulesDimensionNamespace getNamespace() {
            return this.namespace;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode() + (this.namespace.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public String toString() {
            StringBuilder sb = new StringBuilder("ProviderFailed(namespace=");
            sb.append(this.namespace);
            sb.append(", reason=");
            return AbstractC0112b.j(sb, this.reason, ')');
        }
    }

    public /* synthetic */ RulesDimensionResolutionException(String str, f fVar) {
        this(str);
    }

    private RulesDimensionResolutionException(String str) {
        super(str);
    }
}
