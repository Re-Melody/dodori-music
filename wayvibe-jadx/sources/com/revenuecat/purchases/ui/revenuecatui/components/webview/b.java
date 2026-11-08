package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18913c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f18911a = i10;
        this.f18912b = obj;
        this.f18913c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18911a) {
            case 0:
                PaywallWebViewPrewarmer.access$finishWarm((PaywallWebViewPrewarmer) this.f18912b, (String) this.f18913c);
                break;
            case 1:
                PaywallWebViewPrewarmer.access$settle((PaywallWebViewPrewarmer) this.f18912b, (String) this.f18913c);
                break;
            case 2:
                PaywallWebViewPrewarmer.begin$lambda$1((PaywallWebViewPrewarmer) this.f18912b, (String) this.f18913c);
                break;
            case 3:
                PaywallWebViewPrewarmer.settle$lambda$3((PaywallWebViewPrewarmer) this.f18912b, (String) this.f18913c);
                break;
            default:
                PaywallWebViewStartUp.startUp$lambda$2((Context) this.f18912b, (Executor) this.f18913c);
                break;
        }
    }
}
