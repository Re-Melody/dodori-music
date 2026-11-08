package com.revenuecat.purchases.models;

import B2.AbstractC0112b;
import B8.V;
import Z4.C0983p;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.ProductType;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GooglePurchasingData implements PurchasingData {

    public static final class InAppProduct extends GooglePurchasingData {
        private final C0983p productDetails;
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(String productId, C0983p productDetails) {
            super(null);
            m.f(productId, "productId");
            m.f(productDetails, "productDetails");
            this.productId = productId;
            this.productDetails = productDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) obj;
            return m.b(this.productId, inAppProduct.productId) && m.b(this.productDetails, inAppProduct.productDetails);
        }

        public final C0983p getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productDetails.f13794a.hashCode() + (this.productId.hashCode() * 31);
        }

        public String toString() {
            return "InAppProduct(productId=" + this.productId + ", productDetails=" + this.productDetails + ')';
        }
    }

    public static final class Subscription extends GooglePurchasingData {
        private final List<GooglePurchasingData> addOnProducts;
        private final Period billingPeriod;
        private final String optionId;
        private final C0983p productDetails;
        private final String productId;
        private final String token;

        public /* synthetic */ Subscription(String str, String str2, C0983p c0983p, String str3, Period period, List list, int i10, f fVar) {
            this(str, str2, c0983p, str3, (i10 & 16) != 0 ? null : period, (i10 & 32) != 0 ? null : list);
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        public static /* synthetic */ void getAddOnProducts$annotations() {
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        public static /* synthetic */ void getBillingPeriod$annotations() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return m.b(this.productId, subscription.productId) && m.b(this.optionId, subscription.optionId) && m.b(this.productDetails, subscription.productDetails) && m.b(this.token, subscription.token) && m.b(this.billingPeriod, subscription.billingPeriod) && m.b(this.addOnProducts, subscription.addOnProducts);
        }

        public final /* synthetic */ List getAddOnProducts() {
            return this.addOnProducts;
        }

        public final /* synthetic */ Period getBillingPeriod() {
            return this.billingPeriod;
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final C0983p getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            int iA = AbstractC0112b.a(AbstractC0112b.a(AbstractC0112b.a(this.productId.hashCode() * 31, 31, this.optionId), 31, this.productDetails.f13794a), 31, this.token);
            Period period = this.billingPeriod;
            int iHashCode = (iA + (period == null ? 0 : period.hashCode())) * 31;
            List<GooglePurchasingData> list = this.addOnProducts;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Subscription(productId=");
            sb.append(this.productId);
            sb.append(", optionId=");
            sb.append(this.optionId);
            sb.append(", productDetails=");
            sb.append(this.productDetails);
            sb.append(", token=");
            sb.append(this.token);
            sb.append(", billingPeriod=");
            sb.append(this.billingPeriod);
            sb.append(", addOnProducts=");
            return AbstractC0112b.m(sb, this.addOnProducts, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        @ExperimentalPreviewRevenueCatPurchasesAPI
        public Subscription(String productId, String optionId, C0983p productDetails, String token, Period period, List<? extends GooglePurchasingData> list) {
            super(null);
            m.f(productId, "productId");
            m.f(optionId, "optionId");
            m.f(productDetails, "productDetails");
            m.f(token, "token");
            this.productId = productId;
            this.optionId = optionId;
            this.productDetails = productDetails;
            this.token = token;
            this.billingPeriod = period;
            this.addOnProducts = list;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Subscription(String productId, String optionId, C0983p productDetails, String token) {
            this(productId, optionId, productDetails, token, null, null);
            m.f(productId, "productId");
            m.f(optionId, "optionId");
            m.f(productDetails, "productDetails");
            m.f(token, "token");
        }
    }

    public /* synthetic */ GooglePurchasingData(f fVar) {
        this();
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new V();
    }

    private GooglePurchasingData() {
    }
}
