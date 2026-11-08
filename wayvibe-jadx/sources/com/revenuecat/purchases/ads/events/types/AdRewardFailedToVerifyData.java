package com.revenuecat.purchases.ads.events.types;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class AdRewardFailedToVerifyData {
    private final String adFormat;
    private final String adUnitId;
    private final AdRewardFailureReason failureReason;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;

    public /* synthetic */ AdRewardFailedToVerifyData(String str, String str2, String str3, String str4, String str5, String str6, AdRewardFailureReason adRewardFailureReason, f fVar) {
        this(str, str2, str3, str4, str5, str6, adRewardFailureReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdRewardFailedToVerifyData)) {
            return false;
        }
        AdRewardFailedToVerifyData adRewardFailedToVerifyData = (AdRewardFailedToVerifyData) obj;
        return m.b(this.networkName, adRewardFailedToVerifyData.networkName) && AdMediatorName.m113equalsimpl0(this.mediatorName, adRewardFailedToVerifyData.mediatorName) && AdFormat.m96equalsimpl0(this.adFormat, adRewardFailedToVerifyData.adFormat) && m.b(this.placement, adRewardFailedToVerifyData.placement) && m.b(this.adUnitId, adRewardFailedToVerifyData.adUnitId) && m.b(this.impressionId, adRewardFailedToVerifyData.impressionId) && m.b(this.failureReason, adRewardFailedToVerifyData.failureReason);
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name */
    public final String m139getAdFormaty0COY5Q() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final AdRewardFailureReason getFailureReason() {
        return this.failureReason;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: not valid java name */
    public final String m140getMediatorNameGyoM_N4() {
        return this.mediatorName;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        String str = this.networkName;
        int iM97hashCodeimpl = (AdFormat.m97hashCodeimpl(this.adFormat) + ((AdMediatorName.m114hashCodeimpl(this.mediatorName) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.placement;
        return this.failureReason.hashCode() + AbstractC0112b.a(AbstractC0112b.a((iM97hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.adUnitId), 31, this.impressionId);
    }

    public String toString() {
        return "AdRewardFailedToVerifyData(networkName=" + this.networkName + ", mediatorName=" + ((Object) AdMediatorName.m115toStringimpl(this.mediatorName)) + ", adFormat=" + ((Object) AdFormat.m98toStringimpl(this.adFormat)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", failureReason=" + this.failureReason + ')';
    }

    private AdRewardFailedToVerifyData(String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, AdRewardFailureReason failureReason) {
        m.f(mediatorName, "mediatorName");
        m.f(adFormat, "adFormat");
        m.f(adUnitId, "adUnitId");
        m.f(impressionId, "impressionId");
        m.f(failureReason, "failureReason");
        this.networkName = str;
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str2;
        this.adUnitId = adUnitId;
        this.impressionId = impressionId;
        this.failureReason = failureReason;
    }
}
