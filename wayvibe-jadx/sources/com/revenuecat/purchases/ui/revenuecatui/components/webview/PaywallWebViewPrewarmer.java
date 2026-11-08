package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import D7.W;
import M8.InterfaceC0641c;
import N8.k;
import Z8.c;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallWebViewPrewarmer {
    public static final int $stable = 8;
    public static final Companion Companion;
    public static final int MAX_CONCURRENT_WARMS = 2;
    public static final long SETTLE_GRACE_MS = 250;
    public static final long WARM_STALL_TIMEOUT_MS = 3000;
    private static final PaywallWebViewPrewarmer shared;
    private Context applicationContext;
    private int displayedComponents;
    private final LinkedHashMap<String, InFlightWarm> inFlight;
    private final Handler mainHandler;
    private final int maxConcurrentWarms;
    private final k queue;
    private final PaywallWebViewPrewarmer$trimCallbacks$1 trimCallbacks;
    private final Set<String> warmedUrls;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ void getMAX_CONCURRENT_WARMS$revenuecatui_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getSETTLE_GRACE_MS$revenuecatui_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getWARM_STALL_TIMEOUT_MS$revenuecatui_defaultsRelease$annotations() {
        }

        public final PaywallWebViewPrewarmer getShared() {
            return PaywallWebViewPrewarmer.shared;
        }

        private Companion() {
        }
    }

    public static final class InFlightWarm {
        private Runnable scheduledTeardown;
        private final PaywallWebView view;

        public InFlightWarm(PaywallWebView view, Runnable scheduledTeardown) {
            m.f(view, "view");
            m.f(scheduledTeardown, "scheduledTeardown");
            this.view = view;
            this.scheduledTeardown = scheduledTeardown;
        }

        public final Runnable getScheduledTeardown() {
            return this.scheduledTeardown;
        }

        public final PaywallWebView getView() {
            return this.view;
        }

        public final void setScheduledTeardown(Runnable runnable) {
            m.f(runnable, "<set-?>");
            this.scheduledTeardown = runnable;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.webview.PaywallWebViewPrewarmer$startAvailable$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements c {
        public AnonymousClass1() {
            super(1);
        }

        @Override // Z8.c
        public final Boolean invoke(String it) {
            m.f(it, "it");
            return Boolean.valueOf(PaywallWebViewPrewarmer.this.warmedUrls.contains(it));
        }
    }

    static {
        f fVar = null;
        Companion = new Companion(fVar);
        shared = new PaywallWebViewPrewarmer(0, 1, fVar);
    }

    public PaywallWebViewPrewarmer() {
        this(0, 1, null);
    }

    public static final /* synthetic */ void access$finishWarm(PaywallWebViewPrewarmer paywallWebViewPrewarmer, String str) {
        paywallWebViewPrewarmer.finishWarm(str);
    }

    public static final /* synthetic */ void access$settle(PaywallWebViewPrewarmer paywallWebViewPrewarmer, String str) {
        paywallWebViewPrewarmer.settle(str);
    }

    private final boolean alreadyCovered(String str) {
        return this.warmedUrls.contains(str) || this.inFlight.containsKey(str) || this.queue.contains(str);
    }

    private final boolean begin(Context context, String str) {
        b bVar = new b(2, this, str);
        try {
            PaywallWebView paywallWebViewCreateWarmingWebView = WebViewComponentViewKt.createWarmingWebView(context, str, new PaywallWebViewPrewarmer$begin$view$1(this, str), new PaywallWebViewPrewarmer$begin$view$2(this, str));
            this.inFlight.put(str, new InFlightWarm(paywallWebViewCreateWarmingWebView, bVar));
            paywallWebViewCreateWarmingWebView.loadUrl(str);
            this.mainHandler.postDelayed(bVar, WARM_STALL_TIMEOUT_MS);
            Logger.INSTANCE.d("Paywalls V2 web_view warming the http cache for '" + str + "'.");
            return true;
        } catch (Throwable th) {
            Logger.INSTANCE.w("Paywalls V2 web_view could not be prewarmed: " + th);
            release(str);
            this.mainHandler.post(new a(this, 1));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void begin$lambda$1(PaywallWebViewPrewarmer paywallWebViewPrewarmer, String str) {
        Logger.INSTANCE.d("Paywalls V2 web_view cache warm stalled; moving on to the next URL.");
        paywallWebViewPrewarmer.finishWarm(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWarm(String str) {
        if (release(str)) {
            startAvailable();
        }
    }

    private final boolean release(String str) {
        InFlightWarm inFlightWarmRemove = this.inFlight.remove(str);
        if (inFlightWarmRemove == null) {
            return false;
        }
        this.mainHandler.removeCallbacks(inFlightWarmRemove.getScheduledTeardown());
        WebViewComponentViewKt.destroyPaywallWebView(inFlightWarmRemove.getView());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseInFlight() {
        Set<String> setKeySet = this.inFlight.keySet();
        m.e(setKeySet, "inFlight.keys");
        Iterator it = N8.n.W0(setKeySet).iterator();
        while (it.hasNext()) {
            release((String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void settle(String str) {
        InFlightWarm inFlightWarm = this.inFlight.get(str);
        if (inFlightWarm == null) {
            return;
        }
        this.warmedUrls.add(str);
        this.mainHandler.removeCallbacks(inFlightWarm.getScheduledTeardown());
        inFlightWarm.setScheduledTeardown(new b(3, this, str));
        this.mainHandler.postDelayed(inFlightWarm.getScheduledTeardown(), 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void settle$lambda$3(PaywallWebViewPrewarmer paywallWebViewPrewarmer, String str) {
        paywallWebViewPrewarmer.finishWarm(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void startAvailable() {
        Context context;
        if (this.displayedComponents <= 0 && (context = this.applicationContext) != null) {
            N8.n.N0(this.queue, new AnonymousClass1());
            while (this.inFlight.size() < this.maxConcurrentWarms) {
                k kVar = this.queue;
                String str = (String) (kVar.isEmpty() ? null : kVar.removeFirst());
                if (str == null || !begin(context, str)) {
                    return;
                }
            }
        }
    }

    public final int getQueuedCount$revenuecatui_defaultsRelease() {
        return this.queue.k();
    }

    public final int getWarmingCount$revenuecatui_defaultsRelease() {
        return this.inFlight.size();
    }

    public final void markWarmed(String resolvedUrl) {
        m.f(resolvedUrl, "resolvedUrl");
        this.warmedUrls.add(resolvedUrl);
    }

    public final void onDisplayEnded() {
        int i10 = this.displayedComponents;
        if (i10 == 0) {
            return;
        }
        int i11 = i10 - 1;
        this.displayedComponents = i11;
        if (i11 == 0) {
            this.mainHandler.post(new a(this, 2));
        }
    }

    public final void onDisplayStarted(String resolvedUrl) {
        m.f(resolvedUrl, "resolvedUrl");
        this.queue.remove(resolvedUrl);
        int i10 = this.displayedComponents + 1;
        this.displayedComponents = i10;
        if (i10 > 1) {
            return;
        }
        k kVar = this.queue;
        Set<String> setKeySet = this.inFlight.keySet();
        m.e(setKeySet, "inFlight.keys");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            if (!this.warmedUrls.contains(str) && !m.b(str, resolvedUrl)) {
                arrayList.add(obj);
            }
        }
        kVar.addAll(0, arrayList);
        this.mainHandler.post(new a(this, 0));
    }

    public final void prewarm(Context context, String url) {
        m.f(context, "context");
        m.f(url, "url");
        String strResolve = WebViewUrlResolver.INSTANCE.resolve(url);
        if (strResolve == null) {
            Logger.INSTANCE.d("Paywalls V2 web_view not prewarmed: URL must be https with no '{{' markers: '" + url + '\'');
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (this.applicationContext == null) {
            applicationContext.registerComponentCallbacks(this.trimCallbacks);
        }
        this.applicationContext = applicationContext;
        if (alreadyCovered(strResolve)) {
            Logger.INSTANCE.d("Paywalls V2 web_view already warmed or warming this URL; skipping.");
        } else {
            this.queue.addLast(strResolve);
        }
        startAvailable();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.revenuecat.purchases.ui.revenuecatui.components.webview.PaywallWebViewPrewarmer$trimCallbacks$1] */
    public PaywallWebViewPrewarmer(int i10) {
        this.maxConcurrentWarms = i10;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.queue = new k();
        this.inFlight = new LinkedHashMap<>();
        this.warmedUrls = new LinkedHashSet();
        this.trimCallbacks = new ComponentCallbacks2() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.webview.PaywallWebViewPrewarmer$trimCallbacks$1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
                m.f(newConfig, "newConfig");
            }

            @Override // android.content.ComponentCallbacks
            @InterfaceC0641c
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i11) {
                if (W.U(20, 5).contains(Integer.valueOf(i11))) {
                    return;
                }
                if (this.this$0.inFlight.isEmpty() && this.this$0.queue.isEmpty()) {
                    return;
                }
                Logger.INSTANCE.d("Paywalls V2 web_view cache warming released on trim (level " + i11 + ").");
                k kVar = this.this$0.queue;
                Set setKeySet = this.this$0.inFlight.keySet();
                m.e(setKeySet, "inFlight.keys");
                PaywallWebViewPrewarmer paywallWebViewPrewarmer = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    if (!paywallWebViewPrewarmer.warmedUrls.contains((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                kVar.addAll(0, arrayList);
                this.this$0.releaseInFlight();
            }
        };
    }

    public /* synthetic */ PaywallWebViewPrewarmer(int i10, int i11, f fVar) {
        this((i11 & 1) != 0 ? 2 : i10);
    }
}
