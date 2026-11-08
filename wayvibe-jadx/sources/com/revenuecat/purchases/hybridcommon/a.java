package com.revenuecat.purchases.hybridcommon;

import S3.d;
import T3.g;
import Z8.c;
import android.net.Uri;
import android.webkit.WebView;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventListener;
import com.revenuecat.purchases.TrackedEventListener;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.ui.revenuecatui.components.webview.WebViewGestureOwnershipProbeKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements DebugEventListener, TrackedEventListener, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f18882a;

    public /* synthetic */ a(c cVar) {
        this.f18882a = cVar;
    }

    @Override // S3.d
    public void a(WebView webView, S3.b bVar, Uri uri, boolean z10, g gVar) {
        WebViewGestureOwnershipProbeKt.installGestureOwnershipProbe$lambda$0(this.f18882a, webView, bVar, uri, z10, gVar);
    }

    @Override // com.revenuecat.purchases.DebugEventListener
    public void onDebugEventReceived(DebugEvent debugEvent) {
        CommonKt.setDebugEventListener$lambda$16(this.f18882a, debugEvent);
    }

    @Override // com.revenuecat.purchases.TrackedEventListener
    public void onEventTracked(FeatureEvent featureEvent) {
        CommonKt.setTrackedEventListener$lambda$15(this.f18882a, featureEvent);
    }
}
