package com.revenuecat.purchases.ads.events.types;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class AdRevenueData {
    private final String adFormat;
    private final String adUnitId;
    private final String currency;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;
    private final String precision;
    private final long revenueMicros;

    public /* synthetic */ AdRevenueData(String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, String str8, f fVar) {
        this(str, str2, str3, str4, str5, str6, j10, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdRevenueData)) {
            return false;
        }
        AdRevenueData adRevenueData = (AdRevenueData) obj;
        return m.b(this.networkName, adRevenueData.networkName) && AdMediatorName.m113equalsimpl0(this.mediatorName, adRevenueData.mediatorName) && AdFormat.m96equalsimpl0(this.adFormat, adRevenueData.adFormat) && m.b(this.placement, adRevenueData.placement) && m.b(this.adUnitId, adRevenueData.adUnitId) && m.b(this.impressionId, adRevenueData.impressionId) && this.revenueMicros == adRevenueData.revenueMicros && m.b(this.currency, adRevenueData.currency) && AdRevenuePrecision.m128equalsimpl0(this.precision, adRevenueData.precision);
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name */
    public final String m122getAdFormaty0COY5Q() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: not valid java name */
    public final String m123getMediatorNameGyoM_N4() {
        return this.mediatorName;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final String getPlacement() {
        return this.placement;
    }

    /* JADX INFO: renamed from: getPrecision-rAcPn4k, reason: not valid java name */
    public final String m124getPrecisionrAcPn4k() {
        return this.precision;
    }

    public final long getRevenueMicros() {
        return this.revenueMicros;
    }

    public int hashCode() {
        String str = this.networkName;
        int iM97hashCodeimpl = (AdFormat.m97hashCodeimpl(this.adFormat) + ((AdMediatorName.m114hashCodeimpl(this.mediatorName) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.placement;
        return AdRevenuePrecision.m129hashCodeimpl(this.precision) + AbstractC0112b.a(b.g(this.revenueMicros, AbstractC0112b.a(AbstractC0112b.a((iM97hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.adUnitId), 31, this.impressionId), 31), 31, this.currency);
    }

    public String toString() {
        return "AdRevenueData(networkName=" + this.networkName + ", mediatorName=" + ((Object) AdMediatorName.m115toStringimpl(this.mediatorName)) + ", adFormat=" + ((Object) AdFormat.m98toStringimpl(this.adFormat)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", revenueMicros=" + this.revenueMicros + ", currency=" + this.currency + ", precision=" + ((Object) AdRevenuePrecision.m130toStringimpl(this.precision)) + ')';
    }

    private AdRevenueData(String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, long j10, String currency, String precision) {
        m.f(mediatorName, "mediatorName");
        m.f(adFormat, "adFormat");
        m.f(adUnitId, "adUnitId");
        m.f(impressionId, "impressionId");
        m.f(currency, "currency");
        m.f(precision, "precision");
        this.networkName = str;
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str2;
        this.adUnitId = adUnitId;
        this.impressionId = impressionId;
        this.revenueMicros = j10;
        this.currency = currency;
        this.precision = precision;
    }
}
