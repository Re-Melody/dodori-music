package com.revenuecat.purchases.paywalls;

import android.content.Context;
import android.net.Uri;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface PaywallAssetWarmer {
    void prebootWebView(Context context);

    void warmImages(Context context, List<? extends Uri> list);

    void warmWebViewUrls(Context context, List<String> list);
}
