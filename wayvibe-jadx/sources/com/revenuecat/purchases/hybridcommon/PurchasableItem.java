package com.revenuecat.purchases.hybridcommon;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
interface PurchasableItem {

    public static final class Package implements PurchasableItem {
        private final String packageIdentifier;

        public Package(String packageIdentifier) {
            m.f(packageIdentifier, "packageIdentifier");
            this.packageIdentifier = packageIdentifier;
        }

        public static /* synthetic */ Package copy$default(Package r10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = r10.packageIdentifier;
            }
            return r10.copy(str);
        }

        public final String component1() {
            return this.packageIdentifier;
        }

        public final Package copy(String packageIdentifier) {
            m.f(packageIdentifier, "packageIdentifier");
            return new Package(packageIdentifier);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Package) && m.b(this.packageIdentifier, ((Package) obj).packageIdentifier);
        }

        public final String getPackageIdentifier() {
            return this.packageIdentifier;
        }

        public int hashCode() {
            return this.packageIdentifier.hashCode();
        }

        public String toString() {
            return AbstractC0112b.j(new StringBuilder("Package(packageIdentifier="), this.packageIdentifier, ')');
        }
    }

    public static final class Product implements PurchasableItem {
        private final String googleBasePlanId;
        private final String productIdentifier;
        private final String type;

        public Product(String productIdentifier, String type, String str) {
            m.f(productIdentifier, "productIdentifier");
            m.f(type, "type");
            this.productIdentifier = productIdentifier;
            this.type = type;
            this.googleBasePlanId = str;
        }

        public static /* synthetic */ Product copy$default(Product product, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = product.productIdentifier;
            }
            if ((i10 & 2) != 0) {
                str2 = product.type;
            }
            if ((i10 & 4) != 0) {
                str3 = product.googleBasePlanId;
            }
            return product.copy(str, str2, str3);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final String component2() {
            return this.type;
        }

        public final String component3() {
            return this.googleBasePlanId;
        }

        public final Product copy(String productIdentifier, String type, String str) {
            m.f(productIdentifier, "productIdentifier");
            m.f(type, "type");
            return new Product(productIdentifier, type, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return m.b(this.productIdentifier, product.productIdentifier) && m.b(this.type, product.type) && m.b(this.googleBasePlanId, product.googleBasePlanId);
        }

        public final String getGoogleBasePlanId() {
            return this.googleBasePlanId;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iA = AbstractC0112b.a(this.productIdentifier.hashCode() * 31, 31, this.type);
            String str = this.googleBasePlanId;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Product(productIdentifier=");
            sb.append(this.productIdentifier);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", googleBasePlanId=");
            return AbstractC0112b.j(sb, this.googleBasePlanId, ')');
        }
    }

    public static final class SubscriptionOption implements PurchasableItem {
        private final String optionIdentifier;
        private final String productIdentifier;

        public SubscriptionOption(String productIdentifier, String optionIdentifier) {
            m.f(productIdentifier, "productIdentifier");
            m.f(optionIdentifier, "optionIdentifier");
            this.productIdentifier = productIdentifier;
            this.optionIdentifier = optionIdentifier;
        }

        public static /* synthetic */ SubscriptionOption copy$default(SubscriptionOption subscriptionOption, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = subscriptionOption.productIdentifier;
            }
            if ((i10 & 2) != 0) {
                str2 = subscriptionOption.optionIdentifier;
            }
            return subscriptionOption.copy(str, str2);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final String component2() {
            return this.optionIdentifier;
        }

        public final SubscriptionOption copy(String productIdentifier, String optionIdentifier) {
            m.f(productIdentifier, "productIdentifier");
            m.f(optionIdentifier, "optionIdentifier");
            return new SubscriptionOption(productIdentifier, optionIdentifier);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubscriptionOption)) {
                return false;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) obj;
            return m.b(this.productIdentifier, subscriptionOption.productIdentifier) && m.b(this.optionIdentifier, subscriptionOption.optionIdentifier);
        }

        public final String getOptionIdentifier() {
            return this.optionIdentifier;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public int hashCode() {
            return this.optionIdentifier.hashCode() + (this.productIdentifier.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SubscriptionOption(productIdentifier=");
            sb.append(this.productIdentifier);
            sb.append(", optionIdentifier=");
            return AbstractC0112b.j(sb, this.optionIdentifier, ')');
        }
    }
}
