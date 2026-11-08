package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import M8.D;
import S3.d;
import T3.k;
import Z8.e;
import android.net.Uri;
import android.webkit.WebView;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p009a5.o;
import p097i9.r;
import p119k9.C;
import p119k9.D0;
import p119k9.F;
import p119k9.O;
import p260y9.A;
import p270z9.l;
import p270z9.y;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewJavaScriptBridge {
    private static final double MAX_RESIZE_CSS_PX = 10000.0d;
    private static final int RESIZE_APPLY_THRESHOLD_CSS_PX = 1;
    private boolean channelOpen;
    private final String componentId;
    private C documentScope;
    private final String expectedOrigin;
    private Integer lastAppliedHeightCssPx;
    private Integer lastAppliedWidthCssPx;
    private boolean messageListenerInstalled;
    private final e onContentResize;
    private final Z8.a onDocumentReset;
    private final Z8.a onSecureMessagingUnsupported;
    private final int protocolVersion;
    private boolean released;
    private final boolean sizeToContentHeight;
    private final boolean sizeToContentWidth;
    private final d webMessageListener;
    private final WeakReference<WebView> webViewRef;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.webview.WebViewJavaScriptBridge$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements e {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        public final void invoke(Integer num, Integer num2) {
        }

        @Override // Z8.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Integer) obj, (Integer) obj2);
            return D.f8402a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.webview.WebViewJavaScriptBridge$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements Z8.a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m530invoke() {
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m530invoke();
            return D.f8402a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.webview.WebViewJavaScriptBridge$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements Z8.a {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m531invoke() {
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m531invoke();
            return D.f8402a;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final String escapeForJavaScript(String str) {
            m.f(str, "<this>");
            return r.h0(r.h0(str, "\u2028", "\\u2028"), "\u2029", "\\u2029");
        }

        public final Integer resizeDimension(y yVar, String key) {
            Double dF;
            m.f(yVar, "<this>");
            m.f(key, "key");
            Object obj = yVar.get(key);
            p270z9.C c3 = obj instanceof p270z9.C ? (p270z9.C) obj : null;
            if (c3 != null && !c3.c() && (dF = l.f(c3)) != null) {
                double dDoubleValue = dF.doubleValue();
                if (Math.abs(dDoubleValue) <= Double.MAX_VALUE && dDoubleValue > 0.0d) {
                    if (dDoubleValue > WebViewJavaScriptBridge.MAX_RESIZE_CSS_PX) {
                        dDoubleValue = 10000.0d;
                    }
                    return Integer.valueOf((int) dDoubleValue);
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebViewEnvelope.Kind.values().length];
            try {
                iArr[WebViewEnvelope.Kind.CONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebViewEnvelope.Kind.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebViewEnvelope.Kind.REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WebViewJavaScriptBridge(WebView webView, String componentId, String expectedUrl, boolean z10, boolean z11, e onContentResize, Z8.a onDocumentReset, Z8.a onSecureMessagingUnsupported) {
        m.f(webView, "webView");
        m.f(componentId, "componentId");
        m.f(expectedUrl, "expectedUrl");
        m.f(onContentResize, "onContentResize");
        m.f(onDocumentReset, "onDocumentReset");
        m.f(onSecureMessagingUnsupported, "onSecureMessagingUnsupported");
        this.componentId = componentId;
        this.sizeToContentWidth = z10;
        this.sizeToContentHeight = z11;
        this.onContentResize = onContentResize;
        this.onDocumentReset = onDocumentReset;
        this.onSecureMessagingUnsupported = onSecureMessagingUnsupported;
        this.webViewRef = new WeakReference<>(webView);
        this.expectedOrigin = WebViewOriginsKt.toOriginOrNull(expectedUrl);
        this.protocolVersion = 1;
        this.documentScope = newDocumentScope();
        this.webMessageListener = new o(this, 7);
    }

    private final Integer applyResize(Integer num, Integer num2) {
        if (num == null) {
            return null;
        }
        if (num2 == null || Math.abs(num.intValue() - num2.intValue()) >= 1) {
            return num;
        }
        return null;
    }

    private final boolean deliverEnvelopeNow(WebViewEnvelope webViewEnvelope, boolean z10) {
        WebView webView = this.webViewRef.get();
        if (webView == null) {
            return false;
        }
        if (!isCurrentUrlTrusted(webView, z10)) {
            Logger.INSTANCE.w("Dropping outbound web view message: current origin does not match the resolved component origin.");
            return false;
        }
        webView.evaluateJavascript("if (typeof window.__rcWebComponentsReceive === 'function') { window.__rcWebComponentsReceive(" + Companion.escapeForJavaScript(webViewEnvelope.toJsonString()) + "); }", null);
        return true;
    }

    public static /* synthetic */ void getWebMessageListener$revenuecatui_defaultsRelease$annotations() {
    }

    private final void handleAppFrame(WebViewEnvelope webViewEnvelope) {
        if (!this.channelOpen) {
            Logger.INSTANCE.w("Dropping inbound web view message: channel is not open.");
            return;
        }
        if (webViewEnvelope.getKind() == WebViewEnvelope.Kind.REQUEST && webViewEnvelope.getId() == null) {
            Logger.INSTANCE.w("Dropping inbound web view message: request frame is missing an id.");
            return;
        }
        if (m.b(webViewEnvelope.getType(), WebViewMessageType.RESIZE)) {
            handleResize(webViewEnvelope);
            return;
        }
        Logger.INSTANCE.w("Dropping inbound web view message: unsupported message type '" + webViewEnvelope.getType() + "'.");
    }

    private final void handleConnect(WebViewEnvelope webViewEnvelope) {
        if (this.channelOpen || this.released) {
            return;
        }
        int protocolVersion = webViewEnvelope.getProtocolVersion();
        int i10 = this.protocolVersion;
        if (protocolVersion != i10) {
            deliverEnvelopeNow(new WebViewEnvelope((String) null, i10, WebViewEnvelope.Kind.REJECT, "", (String) null, (String) null, (y) null, "Unsupported protocol_version " + webViewEnvelope.getProtocolVersion() + "; native host supports " + this.protocolVersion, 113, (f) null), true);
            return;
        }
        if (deliverEnvelopeNow(new WebViewEnvelope((String) null, i10, WebViewEnvelope.Kind.INIT, this.componentId, (String) null, (String) null, (y) null, (String) null, 241, (f) null), true)) {
            this.channelOpen = true;
            Logger.INSTANCE.d("Paywalls V2 web_view handshake complete, channel open (componentId='" + this.componentId + "').");
            sendFitIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleInboundMessage(String str, Uri uri, boolean z10) {
        if (this.released) {
            return;
        }
        if (!isSourceTrusted(uri, z10)) {
            Logger.INSTANCE.w("Dropping inbound web view message: source origin is not the resolved component origin or the frame is not the main frame.");
            return;
        }
        WebViewEnvelope webViewEnvelope = WebViewEnvelope.Companion.parse(str);
        if (webViewEnvelope == null) {
            Logger.INSTANCE.w("Dropping inbound web view message: not a valid transport envelope.");
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[webViewEnvelope.getKind().ordinal()];
        if (i10 == 1) {
            handleConnect(webViewEnvelope);
            return;
        }
        if (i10 == 2 || i10 == 3) {
            handleAppFrame(webViewEnvelope);
            return;
        }
        Logger.INSTANCE.w("Dropping inbound web view message: unexpected envelope kind '" + webViewEnvelope.getKind() + "'.");
    }

    private final void handleResize(WebViewEnvelope webViewEnvelope) {
        if (!m.b(webViewEnvelope.getComponentId(), this.componentId)) {
            Logger.INSTANCE.w("Dropping inbound web view message: resize component id does not match.");
            return;
        }
        y payload = webViewEnvelope.getPayload();
        if (payload == null) {
            return;
        }
        Companion companion = Companion;
        Integer numResizeDimension = companion.resizeDimension(payload, "width");
        Integer num = null;
        if (!this.sizeToContentWidth) {
            numResizeDimension = null;
        }
        Integer numApplyResize = applyResize(numResizeDimension, this.lastAppliedWidthCssPx);
        if (numApplyResize != null) {
            this.lastAppliedWidthCssPx = Integer.valueOf(numApplyResize.intValue());
        } else {
            numApplyResize = null;
        }
        Integer numResizeDimension2 = companion.resizeDimension(payload, "height");
        if (!this.sizeToContentHeight) {
            numResizeDimension2 = null;
        }
        Integer numApplyResize2 = applyResize(numResizeDimension2, this.lastAppliedHeightCssPx);
        if (numApplyResize2 != null) {
            this.lastAppliedHeightCssPx = Integer.valueOf(numApplyResize2.intValue());
            num = numApplyResize2;
        }
        if (numApplyResize == null && num == null) {
            return;
        }
        this.onContentResize.invoke(numApplyResize, num);
    }

    private final boolean isCurrentUrlTrusted(WebView webView, boolean z10) {
        if (this.expectedOrigin == null) {
            return false;
        }
        String url = webView.getUrl();
        String originOrNull = url != null ? WebViewOriginsKt.toOriginOrNull(url) : null;
        return originOrNull == null ? z10 : originOrNull.equals(this.expectedOrigin);
    }

    private final boolean isSourceTrusted(Uri uri, boolean z10) {
        String originOrNull;
        if (!z10 || this.expectedOrigin == null || uri == null || (originOrNull = WebViewOriginsKt.toOriginOrNull(uri)) == null) {
            return false;
        }
        return originOrNull.equals(this.expectedOrigin);
    }

    private final C newDocumentScope() {
        D0 d0D = F.d();
        r9.f fVar = O.f21697a;
        return F.b(p025b9.a.Q(d0D, p9.m.f25335a.f22114f));
    }

    private final void sendFitIfNeeded() {
        if (this.sizeToContentWidth || this.sizeToContentHeight) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.sizeToContentWidth) {
                Boolean bool = Boolean.TRUE;
                A a10 = l.f29931a;
            }
            if (this.sizeToContentHeight) {
                Boolean bool2 = Boolean.TRUE;
                A a11 = l.f29931a;
            }
            y yVar = new y(linkedHashMap);
            String str = null;
            deliverEnvelopeNow(new WebViewEnvelope(str, this.protocolVersion, WebViewEnvelope.Kind.MESSAGE, this.componentId, WebViewMessageType.FIT, (String) null, yVar, (String) null, 161, (f) null), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webMessageListener$lambda$0(WebViewJavaScriptBridge webViewJavaScriptBridge, WebView webView, S3.b bVar, Uri uri, boolean z10, S3.a aVar) {
        String strA = bVar.a();
        if (strA == null) {
            return;
        }
        F.w(webViewJavaScriptBridge.documentScope, null, null, new WebViewJavaScriptBridge$webMessageListener$1$1(webViewJavaScriptBridge, strA, uri, z10, null), 3);
    }

    public final void attach() {
        WebView webView;
        if (this.messageListenerInstalled || (webView = this.webViewRef.get()) == null) {
            return;
        }
        String str = this.expectedOrigin;
        if (str == null) {
            Logger.INSTANCE.w("Paywalls V2 web_view expected origin is not a valid origin; the bridge cannot verify message provenance and will reject all messages.");
            this.onSecureMessagingUnsupported.invoke();
            return;
        }
        if (!R3.a.Q("WEB_MESSAGE_LISTENER")) {
            Logger.INSTANCE.d("Paywalls V2 web_view secure messaging is unsupported on this System WebView (missing WEB_MESSAGE_LISTENER); falling back.");
            this.onSecureMessagingUnsupported.invoke();
            return;
        }
        try {
            S3.e.b(webView, WebViewEnvelope.NATIVE_OBJECT_NAME, R3.a.b0(str), this.webMessageListener);
            this.messageListenerInstalled = true;
        } catch (RuntimeException e2) {
            Logger.INSTANCE.w("Paywalls V2 web_view could not install the secure message listener; falling back. " + e2);
            this.onSecureMessagingUnsupported.invoke();
        }
    }

    public final d getWebMessageListener$revenuecatui_defaultsRelease() {
        return this.webMessageListener;
    }

    public final void onMainFrameNavigationStarted() {
        if (this.released) {
            return;
        }
        F.f(this.documentScope, null);
        this.documentScope = newDocumentScope();
        this.channelOpen = false;
        this.lastAppliedWidthCssPx = null;
        this.lastAppliedHeightCssPx = null;
        this.onDocumentReset.invoke();
    }

    public final void release() {
        this.released = true;
        this.channelOpen = false;
        F.f(this.documentScope, null);
        WebView webView = this.webViewRef.get();
        if (!this.messageListenerInstalled || webView == null) {
            return;
        }
        WeakHashMap weakHashMap = S3.e.f11087a;
        if (!k.f11608c.b()) {
            throw k.a();
        }
        S3.e.d(webView).f11616a.removeWebMessageListener(WebViewEnvelope.NATIVE_OBJECT_NAME);
        this.messageListenerInstalled = false;
    }

    public /* synthetic */ WebViewJavaScriptBridge(WebView webView, String str, String str2, boolean z10, boolean z11, e eVar, Z8.a aVar, Z8.a aVar2, int i10, f fVar) {
        this(webView, str, str2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? AnonymousClass1.INSTANCE : eVar, (i10 & 64) != 0 ? AnonymousClass2.INSTANCE : aVar, (i10 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0 ? AnonymousClass3.INSTANCE : aVar2);
    }
}
