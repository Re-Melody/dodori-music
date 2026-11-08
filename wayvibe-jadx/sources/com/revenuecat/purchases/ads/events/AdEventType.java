package com.revenuecat.purchases.ads.events;

/* JADX INFO: loaded from: classes.dex */
public enum AdEventType {
    DISPLAYED("rc_ads_ad_displayed"),
    OPENED("rc_ads_ad_opened"),
    REVENUE("rc_ads_ad_revenue"),
    LOADED("rc_ads_ad_loaded"),
    FAILED_TO_LOAD("rc_ads_ad_failed_to_load"),
    REWARD_EARNED_UNVERIFIED("rc_ads_ad_reward_sdk_earned"),
    REWARD_VERIFIED("rc_ads_ad_reward_sdk_verified"),
    REWARD_GRANTED("rc_ads_ad_reward_sdk_granted"),
    REWARD_FAILED_TO_VERIFY("rc_ads_ad_reward_sdk_failed_to_verify");

    private final String value;

    AdEventType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
