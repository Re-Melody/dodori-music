package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import B8.V;
import android.net.Uri;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter;
import com.revenuecat.purchases.ui.revenuecatui.utils.DefaultDateFormatter;
import java.util.Locale;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p097i9.r;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseInformation {
    public static final int $stable = 8;
    private final ExpirationOrRenewal expirationOrRenewal;
    private final boolean isCancelled;
    private final boolean isExpired;
    private final boolean isLifetime;
    private boolean isSubscription;
    private final boolean isTrial;
    private final Uri managementURL;
    private final PriceDetails pricePaid;
    private final StoreProduct product;
    private final Store store;
    private final String title;

    public PurchaseInformation(String str, PriceDetails pricePaid, ExpirationOrRenewal expirationOrRenewal, StoreProduct storeProduct, Store store, boolean z10, Uri uri, boolean z11, boolean z12, boolean z13, boolean z14) {
        m.f(pricePaid, "pricePaid");
        m.f(store, "store");
        this.title = str;
        this.pricePaid = pricePaid;
        this.expirationOrRenewal = expirationOrRenewal;
        this.product = storeProduct;
        this.store = store;
        this.isSubscription = z10;
        this.managementURL = uri;
        this.isExpired = z11;
        this.isTrial = z12;
        this.isCancelled = z13;
        this.isLifetime = z14;
    }

    public static /* synthetic */ PurchaseInformation copy$default(PurchaseInformation purchaseInformation, String str, PriceDetails priceDetails, ExpirationOrRenewal expirationOrRenewal, StoreProduct storeProduct, Store store, boolean z10, Uri uri, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = purchaseInformation.title;
        }
        if ((i10 & 2) != 0) {
            priceDetails = purchaseInformation.pricePaid;
        }
        if ((i10 & 4) != 0) {
            expirationOrRenewal = purchaseInformation.expirationOrRenewal;
        }
        if ((i10 & 8) != 0) {
            storeProduct = purchaseInformation.product;
        }
        if ((i10 & 16) != 0) {
            store = purchaseInformation.store;
        }
        if ((i10 & 32) != 0) {
            z10 = purchaseInformation.isSubscription;
        }
        if ((i10 & 64) != 0) {
            uri = purchaseInformation.managementURL;
        }
        if ((i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0) {
            z11 = purchaseInformation.isExpired;
        }
        if ((i10 & 256) != 0) {
            z12 = purchaseInformation.isTrial;
        }
        if ((i10 & 512) != 0) {
            z13 = purchaseInformation.isCancelled;
        }
        if ((i10 & 1024) != 0) {
            z14 = purchaseInformation.isLifetime;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        boolean z17 = z11;
        boolean z18 = z12;
        boolean z19 = z10;
        Uri uri2 = uri;
        Store store2 = store;
        ExpirationOrRenewal expirationOrRenewal2 = expirationOrRenewal;
        return purchaseInformation.copy(str, priceDetails, expirationOrRenewal2, storeProduct, store2, z19, uri2, z17, z18, z15, z16);
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component10() {
        return this.isCancelled;
    }

    public final boolean component11() {
        return this.isLifetime;
    }

    public final PriceDetails component2() {
        return this.pricePaid;
    }

    public final ExpirationOrRenewal component3() {
        return this.expirationOrRenewal;
    }

    public final StoreProduct component4() {
        return this.product;
    }

    public final Store component5() {
        return this.store;
    }

    public final boolean component6() {
        return this.isSubscription;
    }

    public final Uri component7() {
        return this.managementURL;
    }

    public final boolean component8() {
        return this.isExpired;
    }

    public final boolean component9() {
        return this.isTrial;
    }

    public final PurchaseInformation copy(String str, PriceDetails pricePaid, ExpirationOrRenewal expirationOrRenewal, StoreProduct storeProduct, Store store, boolean z10, Uri uri, boolean z11, boolean z12, boolean z13, boolean z14) {
        m.f(pricePaid, "pricePaid");
        m.f(store, "store");
        return new PurchaseInformation(str, pricePaid, expirationOrRenewal, storeProduct, store, z10, uri, z11, z12, z13, z14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseInformation)) {
            return false;
        }
        PurchaseInformation purchaseInformation = (PurchaseInformation) obj;
        return m.b(this.title, purchaseInformation.title) && m.b(this.pricePaid, purchaseInformation.pricePaid) && m.b(this.expirationOrRenewal, purchaseInformation.expirationOrRenewal) && m.b(this.product, purchaseInformation.product) && this.store == purchaseInformation.store && this.isSubscription == purchaseInformation.isSubscription && m.b(this.managementURL, purchaseInformation.managementURL) && this.isExpired == purchaseInformation.isExpired && this.isTrial == purchaseInformation.isTrial && this.isCancelled == purchaseInformation.isCancelled && this.isLifetime == purchaseInformation.isLifetime;
    }

    public final String expirationString(String expirationDate, CustomerCenterConfigData.Localization localization) {
        m.f(expirationDate, "expirationDate");
        m.f(localization, "localization");
        return this.isExpired ? r.h0(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASE_INFO_EXPIRED_ON_DATE), "{{ date }}", expirationDate) : r.h0(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASE_INFO_EXPIRES_ON_DATE), "{{ date }}", expirationDate);
    }

    public final ExpirationOrRenewal getExpirationOrRenewal() {
        return this.expirationOrRenewal;
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final PriceDetails getPricePaid() {
        return this.pricePaid;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (this.pricePaid.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        ExpirationOrRenewal expirationOrRenewal = this.expirationOrRenewal;
        int iHashCode2 = (iHashCode + (expirationOrRenewal == null ? 0 : expirationOrRenewal.hashCode())) * 31;
        StoreProduct storeProduct = this.product;
        int iF = b.f((this.store.hashCode() + ((iHashCode2 + (storeProduct == null ? 0 : storeProduct.hashCode())) * 31)) * 31, 31, this.isSubscription);
        Uri uri = this.managementURL;
        return Boolean.hashCode(this.isLifetime) + b.f(b.f(b.f((iF + (uri != null ? uri.hashCode() : 0)) * 31, 31, this.isExpired), 31, this.isTrial), 31, this.isCancelled);
    }

    public final boolean isCancelled() {
        return this.isCancelled;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public final boolean isLifetime() {
        return this.isLifetime;
    }

    public final boolean isSubscription() {
        return this.isSubscription;
    }

    public final boolean isTrial() {
        return this.isTrial;
    }

    public final String renewalString(String renewalDate, CustomerCenterConfigData.Localization localization) {
        m.f(renewalDate, "renewalDate");
        m.f(localization, "localization");
        PriceDetails priceDetails = this.pricePaid;
        if (m.b(priceDetails, PriceDetails.Free.INSTANCE) ? true : m.b(priceDetails, PriceDetails.Unknown.INSTANCE)) {
            return r.h0(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.RENEWS_ON_DATE), "{{ date }}", renewalDate);
        }
        if (!(priceDetails instanceof PriceDetails.Paid)) {
            throw new V();
        }
        return r.h0(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.LAST_CHARGE_WAS), "{{ price }}", ((PriceDetails.Paid) this.pricePaid).getPrice()) + '\n' + r.h0(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.NEXT_BILLING_DATE_ON), "{{ date }}", renewalDate);
    }

    public final void setSubscription(boolean z10) {
        this.isSubscription = z10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchaseInformation(title=");
        sb.append(this.title);
        sb.append(", pricePaid=");
        sb.append(this.pricePaid);
        sb.append(", expirationOrRenewal=");
        sb.append(this.expirationOrRenewal);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(", store=");
        sb.append(this.store);
        sb.append(", isSubscription=");
        sb.append(this.isSubscription);
        sb.append(", managementURL=");
        sb.append(this.managementURL);
        sb.append(", isExpired=");
        sb.append(this.isExpired);
        sb.append(", isTrial=");
        sb.append(this.isTrial);
        sb.append(", isCancelled=");
        sb.append(this.isCancelled);
        sb.append(", isLifetime=");
        return b.o(sb, this.isLifetime, ')');
    }

    public /* synthetic */ PurchaseInformation(EntitlementInfo entitlementInfo, StoreProduct storeProduct, TransactionDetails transactionDetails, DateFormatter dateFormatter, Locale locale, CustomerCenterConfigData.Localization localization, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : entitlementInfo, (i10 & 2) != 0 ? null : storeProduct, transactionDetails, (i10 & 8) != 0 ? new DefaultDateFormatter() : dateFormatter, locale, localization);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseInformation(EntitlementInfo entitlementInfo, StoreProduct storeProduct, TransactionDetails transaction, DateFormatter dateFormatter, Locale locale, CustomerCenterConfigData.Localization localization) {
        boolean z10;
        Store store;
        m.f(transaction, "transaction");
        m.f(dateFormatter, "dateFormatter");
        m.f(locale, "locale");
        m.f(localization, "localization");
        String strDetermineTitle = PurchaseInformationKt.determineTitle(entitlementInfo, storeProduct, transaction, localization);
        ExpirationOrRenewal expirationOrRenewalDetermineExpirationOrRenewal = PurchaseInformationKt.determineExpirationOrRenewal(entitlementInfo, transaction, dateFormatter, locale);
        Store store2 = (entitlementInfo == null || (store = entitlementInfo.getStore()) == null) ? transaction.getStore() : store;
        PriceDetails priceDetailsDeterminePrice = PurchaseInformationKt.determinePrice(storeProduct, transaction);
        boolean z11 = transaction instanceof TransactionDetails.Subscription;
        boolean z12 = false;
        boolean z13 = z11 && transaction.getStore() != Store.PROMOTIONAL;
        TransactionDetails.Subscription subscription = z11 ? (TransactionDetails.Subscription) transaction : null;
        Uri managementURL = subscription != null ? subscription.getManagementURL() : null;
        if (entitlementInfo != null) {
            z12 = !entitlementInfo.isActive();
        } else if (z11) {
            z10 = ((TransactionDetails.Subscription) transaction).isActive() ? z10 : true;
            this(strDetermineTitle, priceDetailsDeterminePrice, expirationOrRenewalDetermineExpirationOrRenewal, storeProduct, store2, z13, managementURL, z10, PurchaseInformationKt.determineTrialStatus(entitlementInfo, transaction), PurchaseInformationKt.determineCancellationStatus(entitlementInfo, transaction), PurchaseInformationKt.determineLifetimeStatus(entitlementInfo, transaction));
        } else if (!(transaction instanceof TransactionDetails.NonSubscription)) {
            throw new V();
        }
        z10 = z12;
        this(strDetermineTitle, priceDetailsDeterminePrice, expirationOrRenewalDetermineExpirationOrRenewal, storeProduct, store2, z13, managementURL, z10, PurchaseInformationKt.determineTrialStatus(entitlementInfo, transaction), PurchaseInformationKt.determineCancellationStatus(entitlementInfo, transaction), PurchaseInformationKt.determineLifetimeStatus(entitlementInfo, transaction));
    }
}
