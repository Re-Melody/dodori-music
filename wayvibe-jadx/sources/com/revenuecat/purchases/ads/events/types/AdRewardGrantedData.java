package com.revenuecat.purchases.ads.events.types;

import B2.AbstractC0112b;
import com.revenuecat.purchases.VerifiedReward;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class AdRewardGrantedData {
    private final String adFormat;
    private final String adUnitId;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;
    private final VerifiedReward reward;

    public /* synthetic */ AdRewardGrantedData(String str, String str2, String str3, String str4, String str5, String str6, VerifiedReward verifiedReward, f fVar) {
        this(str, str2, str3, str4, str5, str6, verifiedReward);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdRewardGrantedData)) {
            return false;
        }
        AdRewardGrantedData adRewardGrantedData = (AdRewardGrantedData) obj;
        return m.b(this.networkName, adRewardGrantedData.networkName) && AdMediatorName.m113equalsimpl0(this.mediatorName, adRewardGrantedData.mediatorName) && AdFormat.m96equalsimpl0(this.adFormat, adRewardGrantedData.adFormat) && m.b(this.placement, adRewardGrantedData.placement) && m.b(this.adUnitId, adRewardGrantedData.adUnitId) && m.b(this.impressionId, adRewardGrantedData.impressionId) && m.b(this.reward, adRewardGrantedData.reward);
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name */
    public final String m141getAdFormaty0COY5Q() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: not valid java name */
    public final String m142getMediatorNameGyoM_N4() {
        return this.mediatorName;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final VerifiedReward getReward() {
        return this.reward;
    }

    public int hashCode() {
        String str = this.networkName;
        int iM97hashCodeimpl = (AdFormat.m97hashCodeimpl(this.adFormat) + ((AdMediatorName.m114hashCodeimpl(this.mediatorName) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.placement;
        return this.reward.hashCode() + AbstractC0112b.a(AbstractC0112b.a((iM97hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.adUnitId), 31, this.impressionId);
    }

    public String toString() {
        return "AdRewardGrantedData(networkName=" + this.networkName + ", mediatorName=" + ((Object) AdMediatorName.m115toStringimpl(this.mediatorName)) + ", adFormat=" + ((Object) AdFormat.m98toStringimpl(this.adFormat)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", reward=" + this.reward + ')';
    }

    private AdRewardGrantedData(String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, VerifiedReward reward) {
        m.f(mediatorName, "mediatorName");
        m.f(adFormat, "adFormat");
        m.f(adUnitId, "adUnitId");
        m.f(impressionId, "impressionId");
        m.f(reward, "reward");
        this.networkName = str;
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str2;
        this.adUnitId = adUnitId;
        this.impressionId = impressionId;
        this.reward = reward;
    }
}
