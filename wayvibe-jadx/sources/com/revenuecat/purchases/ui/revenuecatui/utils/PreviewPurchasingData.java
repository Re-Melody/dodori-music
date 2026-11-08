package com.revenuecat.purchases.ui.revenuecatui.utils;

import B2.AbstractC0112b;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.PurchasingData;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PreviewPurchasingData implements PurchasingData {
    public static final int $stable = 0;
    private final String productId;

    public PreviewPurchasingData(String productId) {
        m.f(productId, "productId");
        this.productId = productId;
    }

    public static /* synthetic */ PreviewPurchasingData copy$default(PreviewPurchasingData previewPurchasingData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = previewPurchasingData.productId;
        }
        return previewPurchasingData.copy(str);
    }

    public final String component1() {
        return this.productId;
    }

    public final PreviewPurchasingData copy(String productId) {
        m.f(productId, "productId");
        return new PreviewPurchasingData(productId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreviewPurchasingData) && m.b(this.productId, ((PreviewPurchasingData) obj).productId);
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public /* synthetic */ String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public /* synthetic */ ProductType getProductType() {
        return ProductType.SUBS;
    }

    public int hashCode() {
        return this.productId.hashCode();
    }

    public String toString() {
        return AbstractC0112b.j(new StringBuilder("PreviewPurchasingData(productId="), this.productId, ')');
    }
}
