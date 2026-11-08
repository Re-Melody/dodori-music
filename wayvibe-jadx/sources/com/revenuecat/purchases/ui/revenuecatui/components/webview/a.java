package com.revenuecat.purchases.ui.revenuecatui.components.webview;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaywallWebViewPrewarmer f18910b;

    public /* synthetic */ a(PaywallWebViewPrewarmer paywallWebViewPrewarmer, int i10) {
        this.f18909a = i10;
        this.f18910b = paywallWebViewPrewarmer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18909a) {
            case 0:
                this.f18910b.releaseInFlight();
                break;
            case 1:
                this.f18910b.startAvailable();
                break;
            default:
                this.f18910b.startAvailable();
                break;
        }
    }
}
