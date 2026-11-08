package com.revenuecat.purchases.utils;

import android.net.Uri;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallComponentAssets {
    private final Set<Uri> imageUris;
    private final Set<String> webViewUrls;

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallComponentAssets(Set<? extends Uri> imageUris, Set<String> webViewUrls) {
        m.f(imageUris, "imageUris");
        m.f(webViewUrls, "webViewUrls");
        this.imageUris = imageUris;
        this.webViewUrls = webViewUrls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallComponentAssets copy$default(PaywallComponentAssets paywallComponentAssets, Set set, Set set2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = paywallComponentAssets.imageUris;
        }
        if ((i10 & 2) != 0) {
            set2 = paywallComponentAssets.webViewUrls;
        }
        return paywallComponentAssets.copy(set, set2);
    }

    public final Set<Uri> component1() {
        return this.imageUris;
    }

    public final Set<String> component2() {
        return this.webViewUrls;
    }

    public final PaywallComponentAssets copy(Set<? extends Uri> imageUris, Set<String> webViewUrls) {
        m.f(imageUris, "imageUris");
        m.f(webViewUrls, "webViewUrls");
        return new PaywallComponentAssets(imageUris, webViewUrls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentAssets)) {
            return false;
        }
        PaywallComponentAssets paywallComponentAssets = (PaywallComponentAssets) obj;
        return m.b(this.imageUris, paywallComponentAssets.imageUris) && m.b(this.webViewUrls, paywallComponentAssets.webViewUrls);
    }

    public final Set<Uri> getImageUris() {
        return this.imageUris;
    }

    public final Set<String> getWebViewUrls() {
        return this.webViewUrls;
    }

    public int hashCode() {
        return this.webViewUrls.hashCode() + (this.imageUris.hashCode() * 31);
    }

    public String toString() {
        return "PaywallComponentAssets(imageUris=" + this.imageUris + ", webViewUrls=" + this.webViewUrls + ')';
    }
}
