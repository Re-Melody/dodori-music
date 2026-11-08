package com.revenuecat.purchases.ads.events.types;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class AdLoadedData {
    private final String adFormat;
    private final String adUnitId;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;

    public /* synthetic */ AdLoadedData(String str, String str2, String str3, String str4, String str5, String str6, f fVar) {
        this(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdLoadedData)) {
            return false;
        }
        AdLoadedData adLoadedData = (AdLoadedData) obj;
        return m.b(this.networkName, adLoadedData.networkName) && AdMediatorName.m113equalsimpl0(this.mediatorName, adLoadedData.mediatorName) && AdFormat.m96equalsimpl0(this.adFormat, adLoadedData.adFormat) && m.b(this.placement, adLoadedData.placement) && m.b(this.adUnitId, adLoadedData.adUnitId) && m.b(this.impressionId, adLoadedData.impressionId);
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name */
    public final String m108getAdFormaty0COY5Q() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: not valid java name */
    public final String m109getMediatorNameGyoM_N4() {
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
        return this.impressionId.hashCode() + AbstractC0112b.a((iM97hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.adUnitId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdLoadedData(networkName=");
        sb.append(this.networkName);
        sb.append(", mediatorName=");
        sb.append((Object) AdMediatorName.m115toStringimpl(this.mediatorName));
        sb.append(", adFormat=");
        sb.append((Object) AdFormat.m98toStringimpl(this.adFormat));
        sb.append(", placement=");
        sb.append(this.placement);
        sb.append(", adUnitId=");
        sb.append(this.adUnitId);
        sb.append(", impressionId=");
        return AbstractC0112b.j(sb, this.impressionId, ')');
    }

    private AdLoadedData(String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId) {
        m.f(mediatorName, "mediatorName");
        m.f(adFormat, "adFormat");
        m.f(adUnitId, "adUnitId");
        m.f(impressionId, "impressionId");
        this.networkName = str;
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str2;
        this.adUnitId = adUnitId;
        this.impressionId = impressionId;
    }
}
