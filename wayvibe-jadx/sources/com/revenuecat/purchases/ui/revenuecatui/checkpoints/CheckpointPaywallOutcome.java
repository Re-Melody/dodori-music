package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public abstract class CheckpointPaywallOutcome {
    public static final int $stable = 0;

    public static final class Dismissed extends CheckpointPaywallOutcome {
        public static final int $stable = 0;
        public static final Dismissed INSTANCE = new Dismissed();

        private Dismissed() {
        }

        public String toString() {
            return "Dismissed";
        }
    }

    public static final class Error extends CheckpointPaywallOutcome {
        public static final int $stable = 0;
        private final PurchasesError error;

        public Error(PurchasesError error) {
            m.f(error, "error");
            this.error = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && m.b(this.error, ((Error) obj).error);
        }

        public final PurchasesError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    public static final class Purchased extends CheckpointPaywallOutcome {
        public static final int $stable = 8;
        private final CustomerInfo customerInfo;
        private final StoreTransaction storeTransaction;

        public Purchased(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
            m.f(customerInfo, "customerInfo");
            m.f(storeTransaction, "storeTransaction");
            this.customerInfo = customerInfo;
            this.storeTransaction = storeTransaction;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Purchased)) {
                return false;
            }
            Purchased purchased = (Purchased) obj;
            return m.b(this.customerInfo, purchased.customerInfo) && m.b(this.storeTransaction, purchased.storeTransaction);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public final StoreTransaction getStoreTransaction() {
            return this.storeTransaction;
        }

        public int hashCode() {
            return this.storeTransaction.hashCode() + (this.customerInfo.hashCode() * 31);
        }

        public String toString() {
            return "Purchased(customerInfo=" + this.customerInfo + ", storeTransaction=" + this.storeTransaction + ')';
        }
    }

    public static final class Restored extends CheckpointPaywallOutcome {
        public static final int $stable = 8;
        private final CustomerInfo customerInfo;

        public Restored(CustomerInfo customerInfo) {
            m.f(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Restored) && m.b(this.customerInfo, ((Restored) obj).customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public String toString() {
            return "Restored(customerInfo=" + this.customerInfo + ')';
        }
    }

    public static final class WebCheckoutOpened extends CheckpointPaywallOutcome {
        public static final int $stable = 0;
        public static final WebCheckoutOpened INSTANCE = new WebCheckoutOpened();

        private WebCheckoutOpened() {
        }

        public String toString() {
            return "WebCheckoutOpened";
        }
    }
}
