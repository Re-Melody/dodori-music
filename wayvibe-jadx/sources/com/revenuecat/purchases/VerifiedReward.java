package com.revenuecat.purchases;

import V0.p;
import java.util.Date;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public interface VerifiedReward {

    public static final class Entitlement implements VerifiedReward {
        private final Date expiresAt;
        private final String identifier;

        public Entitlement(String identifier, Date expiresAt) {
            m.f(identifier, "identifier");
            m.f(expiresAt, "expiresAt");
            this.identifier = identifier;
            this.expiresAt = expiresAt;
        }

        public static /* synthetic */ Entitlement copy$default(Entitlement entitlement, String str, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = entitlement.identifier;
            }
            if ((i10 & 2) != 0) {
                date = entitlement.expiresAt;
            }
            return entitlement.copy(str, date);
        }

        public final String component1() {
            return this.identifier;
        }

        public final Date component2() {
            return this.expiresAt;
        }

        public final Entitlement copy(String identifier, Date expiresAt) {
            m.f(identifier, "identifier");
            m.f(expiresAt, "expiresAt");
            return new Entitlement(identifier, expiresAt);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entitlement)) {
                return false;
            }
            Entitlement entitlement = (Entitlement) obj;
            return m.b(this.identifier, entitlement.identifier) && m.b(this.expiresAt, entitlement.expiresAt);
        }

        public final Date getExpiresAt() {
            return this.expiresAt;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public int hashCode() {
            return this.expiresAt.hashCode() + (this.identifier.hashCode() * 31);
        }

        public String toString() {
            return "Entitlement(identifier=" + this.identifier + ", expiresAt=" + this.expiresAt + ')';
        }
    }

    public static final class NoReward implements VerifiedReward {
        public static final NoReward INSTANCE = new NoReward();

        private NoReward() {
        }
    }

    public static final class UnsupportedReward implements VerifiedReward {
        public static final UnsupportedReward INSTANCE = new UnsupportedReward();

        private UnsupportedReward() {
        }
    }

    public static final class VirtualCurrency implements VerifiedReward {
        private final int amount;
        private final String code;

        public VirtualCurrency(String code, int i10) {
            m.f(code, "code");
            this.code = code;
            this.amount = i10;
        }

        public static /* synthetic */ VirtualCurrency copy$default(VirtualCurrency virtualCurrency, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = virtualCurrency.code;
            }
            if ((i11 & 2) != 0) {
                i10 = virtualCurrency.amount;
            }
            return virtualCurrency.copy(str, i10);
        }

        public final String component1() {
            return this.code;
        }

        public final int component2() {
            return this.amount;
        }

        public final VirtualCurrency copy(String code, int i10) {
            m.f(code, "code");
            return new VirtualCurrency(code, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VirtualCurrency)) {
                return false;
            }
            VirtualCurrency virtualCurrency = (VirtualCurrency) obj;
            return m.b(this.code, virtualCurrency.code) && this.amount == virtualCurrency.amount;
        }

        public final int getAmount() {
            return this.amount;
        }

        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            return Integer.hashCode(this.amount) + (this.code.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VirtualCurrency(code=");
            sb.append(this.code);
            sb.append(", amount=");
            return p.q(sb, this.amount, ')');
        }
    }
}
