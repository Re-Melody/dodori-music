package com.revenuecat.purchases.ads.rewardverification;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class RewardVerificationToken {
    private final String appUserID;
    private final String clientTransactionId;
    private final String customData;

    public RewardVerificationToken(String customData, String clientTransactionId, String appUserID) {
        m.f(customData, "customData");
        m.f(clientTransactionId, "clientTransactionId");
        m.f(appUserID, "appUserID");
        this.customData = customData;
        this.clientTransactionId = clientTransactionId;
        this.appUserID = appUserID;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardVerificationToken)) {
            return false;
        }
        RewardVerificationToken rewardVerificationToken = (RewardVerificationToken) obj;
        return m.b(this.customData, rewardVerificationToken.customData) && m.b(this.clientTransactionId, rewardVerificationToken.clientTransactionId) && m.b(this.appUserID, rewardVerificationToken.appUserID);
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final String getClientTransactionId() {
        return this.clientTransactionId;
    }

    public final String getCustomData() {
        return this.customData;
    }

    public int hashCode() {
        return this.appUserID.hashCode() + AbstractC0112b.a(this.customData.hashCode() * 31, 31, this.clientTransactionId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardVerificationToken(customData=");
        sb.append(this.customData);
        sb.append(", clientTransactionId=");
        sb.append(this.clientTransactionId);
        sb.append(", appUserID=");
        return AbstractC0112b.j(sb, this.appUserID, ')');
    }
}
