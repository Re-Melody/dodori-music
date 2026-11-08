package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import android.net.Uri;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Date;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TransactionDetails {
    public static final int $stable = 0;
    private final boolean isSandbox;
    private final Price price;
    private final String productIdentifier;
    private final Store store;

    public static final class NonSubscription extends TransactionDetails {
        public static final int $stable = 0;
        private final boolean isSandbox;
        private final Price price;
        private final String productIdentifier;
        private final Store store;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonSubscription(String productIdentifier, Store store, Price price, boolean z10) {
            super(productIdentifier, store, price, z10, null);
            m.f(productIdentifier, "productIdentifier");
            m.f(store, "store");
            this.productIdentifier = productIdentifier;
            this.store = store;
            this.price = price;
            this.isSandbox = z10;
        }

        public static /* synthetic */ NonSubscription copy$default(NonSubscription nonSubscription, String str, Store store, Price price, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = nonSubscription.productIdentifier;
            }
            if ((i10 & 2) != 0) {
                store = nonSubscription.store;
            }
            if ((i10 & 4) != 0) {
                price = nonSubscription.price;
            }
            if ((i10 & 8) != 0) {
                z10 = nonSubscription.isSandbox;
            }
            return nonSubscription.copy(str, store, price, z10);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final Store component2() {
            return this.store;
        }

        public final Price component3() {
            return this.price;
        }

        public final boolean component4() {
            return this.isSandbox;
        }

        public final NonSubscription copy(String productIdentifier, Store store, Price price, boolean z10) {
            m.f(productIdentifier, "productIdentifier");
            m.f(store, "store");
            return new NonSubscription(productIdentifier, store, price, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NonSubscription)) {
                return false;
            }
            NonSubscription nonSubscription = (NonSubscription) obj;
            return m.b(this.productIdentifier, nonSubscription.productIdentifier) && this.store == nonSubscription.store && m.b(this.price, nonSubscription.price) && this.isSandbox == nonSubscription.isSandbox;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public Price getPrice() {
            return this.price;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public String getProductIdentifier() {
            return this.productIdentifier;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public Store getStore() {
            return this.store;
        }

        public int hashCode() {
            int iHashCode = (this.store.hashCode() + (this.productIdentifier.hashCode() * 31)) * 31;
            Price price = this.price;
            return Boolean.hashCode(this.isSandbox) + ((iHashCode + (price == null ? 0 : price.hashCode())) * 31);
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public boolean isSandbox() {
            return this.isSandbox;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NonSubscription(productIdentifier=");
            sb.append(this.productIdentifier);
            sb.append(", store=");
            sb.append(this.store);
            sb.append(", price=");
            sb.append(this.price);
            sb.append(", isSandbox=");
            return b.o(sb, this.isSandbox, ')');
        }
    }

    public static final class Subscription extends TransactionDetails {
        public static final int $stable = 0;
        private final Date expiresDate;
        private final boolean isActive;
        private final boolean isSandbox;
        private final boolean isTrial;
        private final Uri managementURL;
        private final Price price;
        private final String productIdentifier;
        private final String productPlanIdentifier;
        private final Store store;
        private final boolean willRenew;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String productIdentifier, String str, Store store, boolean z10, boolean z11, Date date, boolean z12, Uri uri, Price price, boolean z13) {
            super(productIdentifier, store, price, z13, null);
            m.f(productIdentifier, "productIdentifier");
            m.f(store, "store");
            this.productIdentifier = productIdentifier;
            this.productPlanIdentifier = str;
            this.store = store;
            this.isActive = z10;
            this.willRenew = z11;
            this.expiresDate = date;
            this.isTrial = z12;
            this.managementURL = uri;
            this.price = price;
            this.isSandbox = z13;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, Store store, boolean z10, boolean z11, Date date, boolean z12, Uri uri, Price price, boolean z13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = subscription.productIdentifier;
            }
            if ((i10 & 2) != 0) {
                str2 = subscription.productPlanIdentifier;
            }
            if ((i10 & 4) != 0) {
                store = subscription.store;
            }
            if ((i10 & 8) != 0) {
                z10 = subscription.isActive;
            }
            if ((i10 & 16) != 0) {
                z11 = subscription.willRenew;
            }
            if ((i10 & 32) != 0) {
                date = subscription.expiresDate;
            }
            if ((i10 & 64) != 0) {
                z12 = subscription.isTrial;
            }
            if ((i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0) {
                uri = subscription.managementURL;
            }
            if ((i10 & 256) != 0) {
                price = subscription.price;
            }
            if ((i10 & 512) != 0) {
                z13 = subscription.isSandbox;
            }
            Price price2 = price;
            boolean z14 = z13;
            boolean z15 = z12;
            Uri uri2 = uri;
            boolean z16 = z11;
            Date date2 = date;
            return subscription.copy(str, str2, store, z10, z16, date2, z15, uri2, price2, z14);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final boolean component10() {
            return this.isSandbox;
        }

        public final String component2() {
            return this.productPlanIdentifier;
        }

        public final Store component3() {
            return this.store;
        }

        public final boolean component4() {
            return this.isActive;
        }

        public final boolean component5() {
            return this.willRenew;
        }

        public final Date component6() {
            return this.expiresDate;
        }

        public final boolean component7() {
            return this.isTrial;
        }

        public final Uri component8() {
            return this.managementURL;
        }

        public final Price component9() {
            return this.price;
        }

        public final Subscription copy(String productIdentifier, String str, Store store, boolean z10, boolean z11, Date date, boolean z12, Uri uri, Price price, boolean z13) {
            m.f(productIdentifier, "productIdentifier");
            m.f(store, "store");
            return new Subscription(productIdentifier, str, store, z10, z11, date, z12, uri, price, z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return m.b(this.productIdentifier, subscription.productIdentifier) && m.b(this.productPlanIdentifier, subscription.productPlanIdentifier) && this.store == subscription.store && this.isActive == subscription.isActive && this.willRenew == subscription.willRenew && m.b(this.expiresDate, subscription.expiresDate) && this.isTrial == subscription.isTrial && m.b(this.managementURL, subscription.managementURL) && m.b(this.price, subscription.price) && this.isSandbox == subscription.isSandbox;
        }

        public final Date getExpiresDate() {
            return this.expiresDate;
        }

        public final Uri getManagementURL() {
            return this.managementURL;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public Price getPrice() {
            return this.price;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public String getProductIdentifier() {
            return this.productIdentifier;
        }

        public final String getProductPlanIdentifier() {
            return this.productPlanIdentifier;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public Store getStore() {
            return this.store;
        }

        public final boolean getWillRenew() {
            return this.willRenew;
        }

        public int hashCode() {
            int iHashCode = this.productIdentifier.hashCode() * 31;
            String str = this.productPlanIdentifier;
            int iF = b.f(b.f((this.store.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.isActive), 31, this.willRenew);
            Date date = this.expiresDate;
            int iF2 = b.f((iF + (date == null ? 0 : date.hashCode())) * 31, 31, this.isTrial);
            Uri uri = this.managementURL;
            int iHashCode2 = (iF2 + (uri == null ? 0 : uri.hashCode())) * 31;
            Price price = this.price;
            return Boolean.hashCode(this.isSandbox) + ((iHashCode2 + (price != null ? price.hashCode() : 0)) * 31);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public boolean isSandbox() {
            return this.isSandbox;
        }

        public final boolean isTrial() {
            return this.isTrial;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Subscription(productIdentifier=");
            sb.append(this.productIdentifier);
            sb.append(", productPlanIdentifier=");
            sb.append(this.productPlanIdentifier);
            sb.append(", store=");
            sb.append(this.store);
            sb.append(", isActive=");
            sb.append(this.isActive);
            sb.append(", willRenew=");
            sb.append(this.willRenew);
            sb.append(", expiresDate=");
            sb.append(this.expiresDate);
            sb.append(", isTrial=");
            sb.append(this.isTrial);
            sb.append(", managementURL=");
            sb.append(this.managementURL);
            sb.append(", price=");
            sb.append(this.price);
            sb.append(", isSandbox=");
            return b.o(sb, this.isSandbox, ')');
        }
    }

    public /* synthetic */ TransactionDetails(String str, Store store, Price price, boolean z10, f fVar) {
        this(str, store, price, z10);
    }

    public Price getPrice() {
        return this.price;
    }

    public String getProductIdentifier() {
        return this.productIdentifier;
    }

    public Store getStore() {
        return this.store;
    }

    public boolean isSandbox() {
        return this.isSandbox;
    }

    private TransactionDetails(String str, Store store, Price price, boolean z10) {
        this.productIdentifier = str;
        this.store = store;
        this.price = price;
        this.isSandbox = z10;
    }
}
