package com.revenuecat.purchases.hybridcommon.ui;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallFragmentNonSerializableArgs {
    private final PaywallListenerWrapper paywallListener;
    private final HybridPurchaseLogicBridge purchaseLogic;

    public PaywallFragmentNonSerializableArgs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaywallFragmentNonSerializableArgs copy$default(PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs, PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallListenerWrapper = paywallFragmentNonSerializableArgs.paywallListener;
        }
        if ((i10 & 2) != 0) {
            hybridPurchaseLogicBridge = paywallFragmentNonSerializableArgs.purchaseLogic;
        }
        return paywallFragmentNonSerializableArgs.copy(paywallListenerWrapper, hybridPurchaseLogicBridge);
    }

    public final PaywallListenerWrapper component1() {
        return this.paywallListener;
    }

    public final HybridPurchaseLogicBridge component2() {
        return this.purchaseLogic;
    }

    public final PaywallFragmentNonSerializableArgs copy(PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
        return new PaywallFragmentNonSerializableArgs(paywallListenerWrapper, hybridPurchaseLogicBridge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallFragmentNonSerializableArgs)) {
            return false;
        }
        PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs = (PaywallFragmentNonSerializableArgs) obj;
        return m.b(this.paywallListener, paywallFragmentNonSerializableArgs.paywallListener) && m.b(this.purchaseLogic, paywallFragmentNonSerializableArgs.purchaseLogic);
    }

    public final PaywallListenerWrapper getPaywallListener() {
        return this.paywallListener;
    }

    public final HybridPurchaseLogicBridge getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public int hashCode() {
        PaywallListenerWrapper paywallListenerWrapper = this.paywallListener;
        int iHashCode = (paywallListenerWrapper == null ? 0 : paywallListenerWrapper.hashCode()) * 31;
        HybridPurchaseLogicBridge hybridPurchaseLogicBridge = this.purchaseLogic;
        return iHashCode + (hybridPurchaseLogicBridge != null ? hybridPurchaseLogicBridge.hashCode() : 0);
    }

    public String toString() {
        return "PaywallFragmentNonSerializableArgs(paywallListener=" + this.paywallListener + ", purchaseLogic=" + this.purchaseLogic + ')';
    }

    public PaywallFragmentNonSerializableArgs(PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
        this.paywallListener = paywallListenerWrapper;
        this.purchaseLogic = hybridPurchaseLogicBridge;
    }

    public /* synthetic */ PaywallFragmentNonSerializableArgs(PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : paywallListenerWrapper, (i10 & 2) != 0 ? null : hybridPurchaseLogicBridge);
    }
}
