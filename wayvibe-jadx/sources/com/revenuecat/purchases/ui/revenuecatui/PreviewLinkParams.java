package com.revenuecat.purchases.ui.revenuecatui;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
final class PreviewLinkParams {
    private final String offeringId;
    private final String paywallId;

    public PreviewLinkParams(String offeringId, String paywallId) {
        m.f(offeringId, "offeringId");
        m.f(paywallId, "paywallId");
        this.offeringId = offeringId;
        this.paywallId = paywallId;
    }

    public static /* synthetic */ PreviewLinkParams copy$default(PreviewLinkParams previewLinkParams, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = previewLinkParams.offeringId;
        }
        if ((i10 & 2) != 0) {
            str2 = previewLinkParams.paywallId;
        }
        return previewLinkParams.copy(str, str2);
    }

    public final String component1() {
        return this.offeringId;
    }

    public final String component2() {
        return this.paywallId;
    }

    public final PreviewLinkParams copy(String offeringId, String paywallId) {
        m.f(offeringId, "offeringId");
        m.f(paywallId, "paywallId");
        return new PreviewLinkParams(offeringId, paywallId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewLinkParams)) {
            return false;
        }
        PreviewLinkParams previewLinkParams = (PreviewLinkParams) obj;
        return m.b(this.offeringId, previewLinkParams.offeringId) && m.b(this.paywallId, previewLinkParams.paywallId);
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getPaywallId() {
        return this.paywallId;
    }

    public int hashCode() {
        return this.paywallId.hashCode() + (this.offeringId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreviewLinkParams(offeringId=");
        sb.append(this.offeringId);
        sb.append(", paywallId=");
        return AbstractC0112b.j(sb, this.paywallId, ')');
    }
}
