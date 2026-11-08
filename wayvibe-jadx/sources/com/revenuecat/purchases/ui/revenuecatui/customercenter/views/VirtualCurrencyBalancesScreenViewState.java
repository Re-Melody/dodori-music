package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import B2.AbstractC0112b;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public interface VirtualCurrencyBalancesScreenViewState {

    public static final class Error implements VirtualCurrencyBalancesScreenViewState {
        public static final int $stable = 0;
        private final PurchasesError error;

        public Error(PurchasesError error) {
            m.f(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, PurchasesError purchasesError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                purchasesError = error.error;
            }
            return error.copy(purchasesError);
        }

        public final PurchasesError component1() {
            return this.error;
        }

        public final Error copy(PurchasesError error) {
            m.f(error, "error");
            return new Error(error);
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

    public static final class Loaded implements VirtualCurrencyBalancesScreenViewState {
        public static final int $stable = 8;
        private final List<VirtualCurrency> virtualCurrencyBalanceData;

        public Loaded(List<VirtualCurrency> virtualCurrencyBalanceData) {
            m.f(virtualCurrencyBalanceData, "virtualCurrencyBalanceData");
            this.virtualCurrencyBalanceData = virtualCurrencyBalanceData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = loaded.virtualCurrencyBalanceData;
            }
            return loaded.copy(list);
        }

        public final List<VirtualCurrency> component1() {
            return this.virtualCurrencyBalanceData;
        }

        public final Loaded copy(List<VirtualCurrency> virtualCurrencyBalanceData) {
            m.f(virtualCurrencyBalanceData, "virtualCurrencyBalanceData");
            return new Loaded(virtualCurrencyBalanceData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && m.b(this.virtualCurrencyBalanceData, ((Loaded) obj).virtualCurrencyBalanceData);
        }

        public final List<VirtualCurrency> getVirtualCurrencyBalanceData() {
            return this.virtualCurrencyBalanceData;
        }

        public int hashCode() {
            return this.virtualCurrencyBalanceData.hashCode();
        }

        public String toString() {
            return AbstractC0112b.m(new StringBuilder("Loaded(virtualCurrencyBalanceData="), this.virtualCurrencyBalanceData, ')');
        }
    }

    public static final class Loading implements VirtualCurrencyBalancesScreenViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }
}
