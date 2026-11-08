package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.Offering;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public abstract class CheckpointResult {
    public static final int $stable = 0;

    public static final class NoAction extends CheckpointResult {
        public static final int $stable = 0;
        private final Reason reason;

        public static final class Reason {
            public static final int $stable = 0;
            private final String value;
            public static final Companion Companion = new Companion(null);
            public static final Reason NO_MATCH = new Reason("NO_MATCH");
            public static final Reason HOLDOUT = new Reason("HOLDOUT");
            public static final Reason FREQUENCY_CAPPED = new Reason("FREQUENCY_CAPPED");
            public static final Reason CONFIGURATION_UNAVAILABLE = new Reason("CONFIGURATION_UNAVAILABLE");
            public static final Reason UNKNOWN_CHECKPOINT = new Reason("UNKNOWN_CHECKPOINT");
            public static final Reason INVALID_CHECKPOINT_IDENTIFIER = new Reason("INVALID_CHECKPOINT_IDENTIFIER");

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                private Companion() {
                }
            }

            public Reason(String value) {
                m.f(value, "value");
                this.value = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Reason) && m.b(this.value, ((Reason) obj).value);
            }

            public final String getValue$revenuecatui_defaultsRelease() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return this.value;
            }
        }

        public NoAction(Reason reason) {
            m.f(reason, "reason");
            this.reason = reason;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoAction) && m.b(this.reason, ((NoAction) obj).reason);
        }

        public final Reason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "NoAction(reason=" + this.reason + ')';
        }
    }

    public static final class PaywallPresented extends CheckpointResult {
        public static final int $stable = 0;
        private final CheckpointPaywallOutcome paywallOutcome;

        public PaywallPresented(CheckpointPaywallOutcome paywallOutcome) {
            m.f(paywallOutcome, "paywallOutcome");
            this.paywallOutcome = paywallOutcome;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallPresented) && m.b(this.paywallOutcome, ((PaywallPresented) obj).paywallOutcome);
        }

        public final CheckpointPaywallOutcome getPaywallOutcome() {
            return this.paywallOutcome;
        }

        public int hashCode() {
            return this.paywallOutcome.hashCode();
        }

        public String toString() {
            return "PaywallPresented(paywallOutcome=" + this.paywallOutcome + ')';
        }
    }

    public static final class ReceivedOffering extends CheckpointResult {
        public static final int $stable = 8;
        private final Offering offering;

        public ReceivedOffering(Offering offering) {
            m.f(offering, "offering");
            this.offering = offering;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReceivedOffering) && m.b(this.offering, ((ReceivedOffering) obj).offering);
        }

        public final Offering getOffering() {
            return this.offering;
        }

        public int hashCode() {
            return this.offering.hashCode();
        }

        public String toString() {
            return "ReceivedOffering(offering=" + this.offering + ')';
        }
    }
}
