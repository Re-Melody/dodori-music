package com.revenuecat.purchases;

import B2.AbstractC0112b;
import D7.W;
import M8.f;
import M8.h;
import M8.j;
import N8.n;
import N8.o;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class Offering {
    private final h annual$delegate;
    private final List<Package> availablePackages;
    private boolean hasPaywallComponents;
    private final String identifier;
    private final h lifetime$delegate;
    private final Map<String, Object> metadata;
    private final h monthly$delegate;
    private final PaywallData paywall;
    private final PaywallComponents paywallComponents;
    private final String serverDescription;
    private final h sixMonth$delegate;
    private final h threeMonth$delegate;
    private final h twoMonth$delegate;
    private final URL webCheckoutURL;
    private final h weekly$delegate;

    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywallData, PaywallComponents paywallComponents, URL url) {
        m.f(identifier, "identifier");
        m.f(serverDescription, "serverDescription");
        m.f(metadata, "metadata");
        m.f(availablePackages, "availablePackages");
        this.identifier = identifier;
        this.serverDescription = serverDescription;
        this.metadata = metadata;
        this.availablePackages = availablePackages;
        this.paywall = paywallData;
        this.paywallComponents = paywallComponents;
        this.webCheckoutURL = url;
        this.lifetime$delegate = W.S(new Offering$lifetime$2(this));
        this.annual$delegate = W.S(new Offering$annual$2(this));
        this.sixMonth$delegate = W.S(new Offering$sixMonth$2(this));
        this.threeMonth$delegate = W.S(new Offering$threeMonth$2(this));
        this.twoMonth$delegate = W.S(new Offering$twoMonth$2(this));
        this.monthly$delegate = W.S(new Offering$monthly$2(this));
        this.weekly$delegate = W.S(new Offering$weekly$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Package findPackage(PackageType packageType) {
        Object next;
        Iterator<T> it = this.availablePackages.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (m.b(((Package) next).getIdentifier(), packageType.getIdentifier())) {
                return (Package) next;
            }
        }
        next = null;
        return (Package) next;
    }

    public static /* synthetic */ void getPaywall$annotations() {
    }

    public static /* synthetic */ void getPaywallComponents$annotations() {
    }

    public static /* synthetic */ void getPresentedOfferingContext$annotations() {
    }

    public static /* synthetic */ void hasPaywall$annotations() {
    }

    public final Offering copy(PresentedOfferingContext presentedOfferingContext) {
        m.f(presentedOfferingContext, "presentedOfferingContext");
        String str = this.identifier;
        String str2 = this.serverDescription;
        Map<String, Object> map = this.metadata;
        List<Package> list = this.availablePackages;
        ArrayList arrayList = new ArrayList(o.o0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).copy$purchases_defaultsRelease(presentedOfferingContext));
        }
        Offering offering = new Offering(str, str2, map, arrayList, this.paywall, this.paywallComponents, this.webCheckoutURL);
        offering.hasPaywallComponents = this.hasPaywallComponents;
        return offering;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return m.b(this.identifier, offering.identifier) && m.b(this.serverDescription, offering.serverDescription) && m.b(this.metadata, offering.metadata) && m.b(this.availablePackages, offering.availablePackages) && m.b(this.paywall, offering.paywall) && m.b(this.paywallComponents, offering.paywallComponents) && m.b(this.webCheckoutURL, offering.webCheckoutURL);
    }

    public final Package get(String s8) {
        m.f(s8, "s");
        return getPackage(s8);
    }

    public final Package getAnnual() {
        return (Package) this.annual$delegate.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final boolean getHasPaywallComponents$purchases_defaultsRelease() {
        return this.hasPaywallComponents;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime$delegate.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String key, String str) {
        m.f(key, "key");
        m.f(str, "default");
        Object obj = this.metadata.get(key);
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? str : str2;
    }

    public final Package getMonthly() {
        return (Package) this.monthly$delegate.getValue();
    }

    public final Package getPackage(String identifier) {
        m.f(identifier, "identifier");
        for (Package r10 : this.availablePackages) {
            if (m.b(r10.getIdentifier(), identifier)) {
                return r10;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final PaywallComponents getPaywallComponents() {
        return this.paywallComponents;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        Package r10 = (Package) n.D0(this.availablePackages);
        if (r10 != null) {
            return r10.getPresentedOfferingContext();
        }
        return null;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth$delegate.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth$delegate.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth$delegate.getValue();
    }

    public final URL getWebCheckoutURL() {
        return this.webCheckoutURL;
    }

    public final Package getWeekly() {
        return (Package) this.weekly$delegate.getValue();
    }

    public final boolean hasPaywall() {
        return (this.paywall == null && this.paywallComponents == null && !this.hasPaywallComponents) ? false : true;
    }

    public int hashCode() {
        int iD = p134m1.b.d(p134m1.b.e(AbstractC0112b.a(this.identifier.hashCode() * 31, 31, this.serverDescription), 31, this.metadata), 31, this.availablePackages);
        PaywallData paywallData = this.paywall;
        int iHashCode = (iD + (paywallData == null ? 0 : paywallData.hashCode())) * 31;
        PaywallComponents paywallComponents = this.paywallComponents;
        int iHashCode2 = (iHashCode + (paywallComponents == null ? 0 : paywallComponents.hashCode())) * 31;
        URL url = this.webCheckoutURL;
        return iHashCode2 + (url != null ? url.hashCode() : 0);
    }

    public final void setHasPaywallComponents$purchases_defaultsRelease(boolean z10) {
        this.hasPaywallComponents = z10;
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ", paywallComponents=" + this.paywallComponents + ", webCheckoutURL=" + this.webCheckoutURL + ')';
    }

    public static final class PaywallComponents {
        private final String componentsHash;
        private final h dataResult;
        private final UiConfig uiConfig;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Offering$PaywallComponents$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kotlin.jvm.internal.n implements Z8.a {
            final /* synthetic */ Z8.a $dataProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Z8.a aVar) {
                super(0);
                this.$dataProvider = aVar;
            }

            @Override // Z8.a
            public /* synthetic */ Object invoke() {
                return new M8.o(m57invoked1pmJ48());
            }

            /* JADX INFO: renamed from: invoke-d1pmJ48, reason: not valid java name */
            public final Object m57invoked1pmJ48() {
                try {
                    return this.$dataProvider.invoke();
                } catch (Throwable th) {
                    return Q5.b.r(th);
                }
            }
        }

        private PaywallComponents(UiConfig uiConfig, String str, h hVar) {
            this.uiConfig = uiConfig;
            this.componentsHash = str;
            this.dataResult = hVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallComponents)) {
                return false;
            }
            PaywallComponents paywallComponents = (PaywallComponents) obj;
            return m.b(this.uiConfig, paywallComponents.uiConfig) && m.b(this.componentsHash, paywallComponents.componentsHash);
        }

        /* JADX INFO: renamed from: getData-d1pmJ48, reason: not valid java name */
        public final Object m56getDatad1pmJ48() {
            return ((M8.o) this.dataResult.getValue()).f8416a;
        }

        public final PaywallComponentsData getDataOrNull() {
            Object obj = ((M8.o) this.dataResult.getValue()).f8416a;
            if (obj instanceof M8.n) {
                obj = null;
            }
            return (PaywallComponentsData) obj;
        }

        public final UiConfig getUiConfig() {
            return this.uiConfig;
        }

        public int hashCode() {
            return this.componentsHash.hashCode() + (this.uiConfig.hashCode() * 31);
        }

        public String toString() {
            return "PaywallComponents(uiConfig=" + this.uiConfig + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PaywallComponents(UiConfig uiConfig, PaywallComponentsData data) {
            this(uiConfig, String.valueOf(data.hashCode()), new f(new M8.o(data)));
            m.f(uiConfig, "uiConfig");
            m.f(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PaywallComponents(UiConfig uiConfig, String componentsHash, Z8.a dataProvider) {
            this(uiConfig, componentsHash, W.R(j.SYNCHRONIZED, new AnonymousClass1(dataProvider)));
            m.f(uiConfig, "uiConfig");
            m.f(componentsHash, "componentsHash");
            m.f(dataProvider, "dataProvider");
        }
    }

    public /* synthetic */ Offering(String str, String str2, Map map, List list, PaywallData paywallData, PaywallComponents paywallComponents, URL url, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, map, list, (i10 & 16) != 0 ? null : paywallData, (i10 & 32) != 0 ? null : paywallComponents, (i10 & 64) != 0 ? null : url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages) {
        this(identifier, serverDescription, metadata, availablePackages, null, null, null);
        m.f(identifier, "identifier");
        m.f(serverDescription, "serverDescription");
        m.f(metadata, "metadata");
        m.f(availablePackages, "availablePackages");
    }
}
