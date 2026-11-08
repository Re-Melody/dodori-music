package com.revenuecat.purchases.models;

import B2.AbstractC0112b;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import java.util.List;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
final class ComparableData {
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<String> productIds;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final String signature;
    private final String storeUserID;
    private final String subscriptionOptionId;
    private final ProductType type;

    public ComparableData(String str, List<String> productIds, ProductType type, long j10, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, PresentedOfferingContext presentedOfferingContext, String str3, PurchaseType purchaseType, String str4, String str5) {
        m.f(productIds, "productIds");
        m.f(type, "type");
        m.f(purchaseToken, "purchaseToken");
        m.f(purchaseState, "purchaseState");
        m.f(purchaseType, "purchaseType");
        this.orderId = str;
        this.productIds = productIds;
        this.type = type;
        this.purchaseTime = j10;
        this.purchaseToken = purchaseToken;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str2;
        this.presentedOfferingContext = presentedOfferingContext;
        this.storeUserID = str3;
        this.purchaseType = purchaseType;
        this.marketplace = str4;
        this.subscriptionOptionId = str5;
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component10() {
        return this.storeUserID;
    }

    public final PurchaseType component11() {
        return this.purchaseType;
    }

    public final String component12() {
        return this.marketplace;
    }

    public final String component13() {
        return this.subscriptionOptionId;
    }

    public final List<String> component2() {
        return this.productIds;
    }

    public final ProductType component3() {
        return this.type;
    }

    public final long component4() {
        return this.purchaseTime;
    }

    public final String component5() {
        return this.purchaseToken;
    }

    public final PurchaseState component6() {
        return this.purchaseState;
    }

    public final Boolean component7() {
        return this.isAutoRenewing;
    }

    public final String component8() {
        return this.signature;
    }

    public final PresentedOfferingContext component9() {
        return this.presentedOfferingContext;
    }

    public final ComparableData copy(String str, List<String> productIds, ProductType type, long j10, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, PresentedOfferingContext presentedOfferingContext, String str3, PurchaseType purchaseType, String str4, String str5) {
        m.f(productIds, "productIds");
        m.f(type, "type");
        m.f(purchaseToken, "purchaseToken");
        m.f(purchaseState, "purchaseState");
        m.f(purchaseType, "purchaseType");
        return new ComparableData(str, productIds, type, j10, purchaseToken, purchaseState, bool, str2, presentedOfferingContext, str3, purchaseType, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) obj;
        return m.b(this.orderId, comparableData.orderId) && m.b(this.productIds, comparableData.productIds) && this.type == comparableData.type && this.purchaseTime == comparableData.purchaseTime && m.b(this.purchaseToken, comparableData.purchaseToken) && this.purchaseState == comparableData.purchaseState && m.b(this.isAutoRenewing, comparableData.isAutoRenewing) && m.b(this.signature, comparableData.signature) && m.b(this.presentedOfferingContext, comparableData.presentedOfferingContext) && m.b(this.storeUserID, comparableData.storeUserID) && this.purchaseType == comparableData.purchaseType && m.b(this.marketplace, comparableData.marketplace) && m.b(this.subscriptionOptionId, comparableData.subscriptionOptionId);
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (this.purchaseState.hashCode() + AbstractC0112b.a(b.g(this.purchaseTime, (this.type.hashCode() + b.d((str == null ? 0 : str.hashCode()) * 31, 31, this.productIds)) * 31, 31), 31, this.purchaseToken)) * 31;
        Boolean bool = this.isAutoRenewing;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.signature;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode4 = (iHashCode3 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        String str3 = this.storeUserID;
        int iHashCode5 = (this.purchaseType.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.marketplace;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subscriptionOptionId;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComparableData(orderId=");
        sb.append(this.orderId);
        sb.append(", productIds=");
        sb.append(this.productIds);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", purchaseTime=");
        sb.append(this.purchaseTime);
        sb.append(", purchaseToken=");
        sb.append(this.purchaseToken);
        sb.append(", purchaseState=");
        sb.append(this.purchaseState);
        sb.append(", isAutoRenewing=");
        sb.append(this.isAutoRenewing);
        sb.append(", signature=");
        sb.append(this.signature);
        sb.append(", presentedOfferingContext=");
        sb.append(this.presentedOfferingContext);
        sb.append(", storeUserID=");
        sb.append(this.storeUserID);
        sb.append(", purchaseType=");
        sb.append(this.purchaseType);
        sb.append(", marketplace=");
        sb.append(this.marketplace);
        sb.append(", subscriptionOptionId=");
        return AbstractC0112b.j(sb, this.subscriptionOptionId, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(StoreTransaction storeTransaction) {
        this(storeTransaction.getOrderId(), storeTransaction.getProductIds(), storeTransaction.getType(), storeTransaction.getPurchaseTime(), storeTransaction.getPurchaseToken(), storeTransaction.getPurchaseState(), storeTransaction.isAutoRenewing(), storeTransaction.getSignature(), storeTransaction.getPresentedOfferingContext(), storeTransaction.getStoreUserID(), storeTransaction.getPurchaseType(), storeTransaction.getMarketplace(), storeTransaction.getSubscriptionOptionId());
        m.f(storeTransaction, "storeTransaction");
    }
}
