package com.revenuecat.purchases.ads.rewardverification;

import B8.V;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class OutcomeKt {
    public static final RewardVerificationResult toResult(Outcome outcome) {
        m.f(outcome, "<this>");
        if (outcome instanceof Outcome.Verified) {
            Outcome.Verified verified = (Outcome.Verified) outcome;
            return RewardVerificationResult.Companion.verified(verified.getReward(), verified.getMoreRewards());
        }
        if (outcome instanceof Outcome.Failed) {
            return RewardVerificationResult.failed;
        }
        throw new V();
    }
}
