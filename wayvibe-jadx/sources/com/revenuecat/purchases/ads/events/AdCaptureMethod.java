package com.revenuecat.purchases.ads.events;

/* JADX INFO: loaded from: classes.dex */
public enum AdCaptureMethod {
    ADAPTER("adapter"),
    MANUAL("manual");

    private final String value;

    AdCaptureMethod(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
