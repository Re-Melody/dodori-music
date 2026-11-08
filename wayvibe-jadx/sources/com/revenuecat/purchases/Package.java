package com.revenuecat.purchases;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.models.StoreProduct;
import java.net.URL;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class Package {
    private final String identifier;
    private final PackageType packageType;
    private final PresentedOfferingContext presentedOfferingContext;
    private final StoreProduct product;
    private final URL webCheckoutURL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Package(String identifier, PackageType packageType, StoreProduct product, PresentedOfferingContext presentedOfferingContext) {
        this(identifier, packageType, product, presentedOfferingContext, null, 16, null);
        m.f(identifier, "identifier");
        m.f(packageType, "packageType");
        m.f(product, "product");
        m.f(presentedOfferingContext, "presentedOfferingContext");
    }

    @InterfaceC0641c
    public static /* synthetic */ void getOffering$annotations() {
    }

    public final Package copy$purchases_defaultsRelease(PresentedOfferingContext presentedOfferingContext) {
        m.f(presentedOfferingContext, "presentedOfferingContext");
        return new Package(this.identifier, this.packageType, this.product.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext, this.webCheckoutURL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Package)) {
            return false;
        }
        Package r10 = (Package) obj;
        return m.b(this.identifier, r10.identifier) && this.packageType == r10.packageType && m.b(this.product, r10.product) && m.b(this.presentedOfferingContext, r10.presentedOfferingContext) && m.b(this.webCheckoutURL, r10.webCheckoutURL);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getOffering() {
        String offeringIdentifier = this.presentedOfferingContext.getOfferingIdentifier();
        return offeringIdentifier == null ? "" : offeringIdentifier;
    }

    public final PackageType getPackageType() {
        return this.packageType;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public final URL getWebCheckoutURL() {
        return this.webCheckoutURL;
    }

    public int hashCode() {
        int iHashCode = (this.presentedOfferingContext.hashCode() + ((this.product.hashCode() + ((this.packageType.hashCode() + (this.identifier.hashCode() * 31)) * 31)) * 31)) * 31;
        URL url = this.webCheckoutURL;
        return iHashCode + (url == null ? 0 : url.hashCode());
    }

    public String toString() {
        return "Package(identifier=" + this.identifier + ", packageType=" + this.packageType + ", product=" + this.product + ", presentedOfferingContext=" + this.presentedOfferingContext + ", webCheckoutURL=" + this.webCheckoutURL + ')';
    }

    public Package(String identifier, PackageType packageType, StoreProduct product, PresentedOfferingContext presentedOfferingContext, URL url) {
        m.f(identifier, "identifier");
        m.f(packageType, "packageType");
        m.f(product, "product");
        m.f(presentedOfferingContext, "presentedOfferingContext");
        this.identifier = identifier;
        this.packageType = packageType;
        this.product = product;
        this.presentedOfferingContext = presentedOfferingContext;
        this.webCheckoutURL = url;
    }

    public /* synthetic */ Package(String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext, URL url, int i10, f fVar) {
        this(str, packageType, storeProduct, presentedOfferingContext, (i10 & 16) != 0 ? null : url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0641c
    public Package(String identifier, PackageType packageType, StoreProduct product, String offering) {
        this(identifier, packageType, product, new PresentedOfferingContext(offering), null);
        m.f(identifier, "identifier");
        m.f(packageType, "packageType");
        m.f(product, "product");
        m.f(offering, "offering");
    }
}
