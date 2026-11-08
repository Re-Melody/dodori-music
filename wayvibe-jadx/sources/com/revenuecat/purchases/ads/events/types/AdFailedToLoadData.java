package com.revenuecat.purchases.ads.events.types;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class AdFailedToLoadData {
    private final String adFormat;
    private final String adUnitId;
    private final Integer mediatorErrorCode;
    private final String mediatorName;
    private final String placement;

    public /* synthetic */ AdFailedToLoadData(String str, String str2, String str3, String str4, Integer num, f fVar) {
        this(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdFailedToLoadData)) {
            return false;
        }
        AdFailedToLoadData adFailedToLoadData = (AdFailedToLoadData) obj;
        return AdMediatorName.m113equalsimpl0(this.mediatorName, adFailedToLoadData.mediatorName) && AdFormat.m96equalsimpl0(this.adFormat, adFailedToLoadData.adFormat) && m.b(this.placement, adFailedToLoadData.placement) && m.b(this.adUnitId, adFailedToLoadData.adUnitId) && m.b(this.mediatorErrorCode, adFailedToLoadData.mediatorErrorCode);
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name */
    public final String m91getAdFormaty0COY5Q() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final Integer getMediatorErrorCode() {
        return this.mediatorErrorCode;
    }

    /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: not valid java name */
    public final String m92getMediatorNameGyoM_N4() {
        return this.mediatorName;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        int iM97hashCodeimpl = (AdFormat.m97hashCodeimpl(this.adFormat) + (AdMediatorName.m114hashCodeimpl(this.mediatorName) * 31)) * 31;
        String str = this.placement;
        int iA = AbstractC0112b.a((iM97hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31, 31, this.adUnitId);
        Integer num = this.mediatorErrorCode;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AdFailedToLoadData(mediatorName=" + ((Object) AdMediatorName.m115toStringimpl(this.mediatorName)) + ", adFormat=" + ((Object) AdFormat.m98toStringimpl(this.adFormat)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", mediatorErrorCode=" + this.mediatorErrorCode + ')';
    }

    private AdFailedToLoadData(String mediatorName, String adFormat, String str, String adUnitId, Integer num) {
        m.f(mediatorName, "mediatorName");
        m.f(adFormat, "adFormat");
        m.f(adUnitId, "adUnitId");
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str;
        this.adUnitId = adUnitId;
        this.mediatorErrorCode = num;
    }
}
