package com.revenuecat.purchases_ui_flutter.views;

import F9.h;
import M8.D;
import M8.l;
import N8.y;
import Z8.c;
import android.content.Context;
import android.view.View;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases_ui_flutter.MapHelper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.m;
import p134m1.b;
import p161o8.f;
import p161o8.o;
import p161o8.q;
import p161o8.r;
import p161o8.s;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallView extends BasePaywallView implements q {
    private final s methodChannel;
    private final com.revenuecat.purchases.ui.revenuecatui.views.PaywallView nativePaywallView;
    private HybridPurchaseLogicBridge purchaseLogicBridge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, int i10, f messenger, Map<String, ? extends Object> creationParams) {
        super(context);
        m.f(context, "context");
        m.f(messenger, "messenger");
        m.f(creationParams, "creationParams");
        s sVar = new s(messenger, b.j(i10, "com.revenuecat.purchasesui/PaywallView/"));
        this.methodChannel = sVar;
        sVar.b(this);
        String str = (String) creationParams.get("offeringIdentifier");
        Object obj = creationParams.get("presentedOfferingContext");
        Map map = obj instanceof Map ? (Map) obj : null;
        PresentedOfferingContext presentedOfferingContextMapPresentedOfferingContext = map != null ? MapHelper.INSTANCE.mapPresentedOfferingContext(map) : null;
        com.revenuecat.purchases.ui.revenuecatui.views.PaywallView paywallView = new com.revenuecat.purchases.ui.revenuecatui.views.PaywallView(context, null, null, null, (Boolean) creationParams.get("displayCloseButton"), null, new h(this, 6), 46, null);
        this.nativePaywallView = paywallView;
        paywallView.setPaywallListener(new PaywallListenerWrapper() { // from class: com.revenuecat.purchases_ui_flutter.views.PaywallView.2
            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                PaywallView.this.methodChannel.a("onPurchaseCancelled", null, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseCompleted(Map<String, ? extends Object> customerInfo, Map<String, ? extends Object> storeTransaction) {
                m.f(customerInfo, "customerInfo");
                m.f(storeTransaction, "storeTransaction");
                PaywallView.this.methodChannel.a("onPurchaseCompleted", y.g0(new l("customerInfo", customerInfo), new l("storeTransaction", storeTransaction)), null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseError(Map<String, ? extends Object> error) {
                m.f(error, "error");
                PaywallView.this.methodChannel.a("onPurchaseError", error, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseStarted(Map<String, ? extends Object> rcPackage) {
                m.f(rcPackage, "rcPackage");
                PaywallView.this.methodChannel.a("onPurchaseStarted", rcPackage, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreCompleted(Map<String, ? extends Object> customerInfo) {
                m.f(customerInfo, "customerInfo");
                PaywallView.this.methodChannel.a("onRestoreCompleted", customerInfo, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreError(Map<String, ? extends Object> error) {
                m.f(error, "error");
                PaywallView.this.methodChannel.a("onRestoreError", error, null);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onUrlOpened(String url) {
                m.f(url, "url");
                PaywallView.this.methodChannel.a("onUrlOpened", y.f0(new l("url", url)), null);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onWebCheckoutOpened() {
                PaywallView.this.methodChannel.a("onWebCheckoutOpened", null, null);
            }
        });
        Object obj2 = creationParams.get("customVariables");
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map2.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                l lVar = value instanceof String ? new l(str2, new CustomVariableValue.String((String) value)) : value instanceof Double ? new l(str2, new CustomVariableValue.Number(((Number) value).doubleValue())) : value instanceof Boolean ? new l(str2, new CustomVariableValue.Boolean(((Boolean) value).booleanValue())) : null;
                if (lVar != null) {
                    arrayList.add(lVar);
                }
            }
            this.nativePaywallView.setCustomVariables(y.p0(arrayList));
        }
        this.nativePaywallView.setOfferingId(str, presentedOfferingContextMapPresentedOfferingContext);
        Object obj3 = creationParams.get("hasPurchaseLogic");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        if (bool != null ? bool.booleanValue() : false) {
            final int i11 = 0;
            final int i12 = 1;
            HybridPurchaseLogicBridge hybridPurchaseLogicBridge = new HybridPurchaseLogicBridge(new c(this) { // from class: com.revenuecat.purchases_ui_flutter.views.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PaywallView f18923b;

                {
                    this.f18923b = this;
                }

                @Override // Z8.c
                public final Object invoke(Object obj4) {
                    switch (i11) {
                        case 0:
                            return PaywallView._init_$lambda$3(this.f18923b, (Map) obj4);
                        default:
                            return PaywallView._init_$lambda$4(this.f18923b, (Map) obj4);
                    }
                }
            }, new c(this) { // from class: com.revenuecat.purchases_ui_flutter.views.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PaywallView f18923b;

                {
                    this.f18923b = this;
                }

                @Override // Z8.c
                public final Object invoke(Object obj4) {
                    switch (i12) {
                        case 0:
                            return PaywallView._init_$lambda$3(this.f18923b, (Map) obj4);
                        default:
                            return PaywallView._init_$lambda$4(this.f18923b, (Map) obj4);
                    }
                }
            });
            this.purchaseLogicBridge = hybridPurchaseLogicBridge;
            this.nativePaywallView.setPurchaseLogic(hybridPurchaseLogicBridge);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D _init_$lambda$1(PaywallView paywallView) {
        paywallView.methodChannel.a("onDismiss", null, null);
        return D.f8402a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D _init_$lambda$3(PaywallView paywallView, Map eventData) {
        m.f(eventData, "eventData");
        paywallView.methodChannel.a("onPerformPurchase", eventData, null);
        return D.f8402a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D _init_$lambda$4(PaywallView paywallView, Map eventData) {
        m.f(eventData, "eventData");
        paywallView.methodChannel.a("onPerformRestore", eventData, null);
        return D.f8402a;
    }

    @Override // com.revenuecat.purchases_ui_flutter.views.BasePaywallView, io.flutter.plugin.platform.f
    public void dispose() throws IllegalAccessException, InvocationTargetException {
        HybridPurchaseLogicBridge hybridPurchaseLogicBridge = this.purchaseLogicBridge;
        if (hybridPurchaseLogicBridge != null) {
            hybridPurchaseLogicBridge.cancelPending();
        }
    }

    @Override // com.revenuecat.purchases_ui_flutter.views.BasePaywallView, io.flutter.plugin.platform.f
    public View getView() {
        return this.nativePaywallView;
    }

    @Override // com.revenuecat.purchases_ui_flutter.views.BasePaywallView, io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(View view) {
    }

    @Override // com.revenuecat.purchases_ui_flutter.views.BasePaywallView, io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
    }

    @Override // com.revenuecat.purchases_ui_flutter.views.BasePaywallView, io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // com.revenuecat.purchases_ui_flutter.views.BasePaywallView, io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }

    @Override // p161o8.q
    public void onMethodCall(o methodCall, r result) throws IllegalAccessException, InvocationTargetException {
        m.f(methodCall, "methodCall");
        m.f(result, "result");
        if (!m.b(methodCall.f23827a, "resolvePurchaseLogicResult")) {
            result.c();
            return;
        }
        Object obj = methodCall.f23828b;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("requestId") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map != null ? map.get("result") : null;
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map != null ? map.get(com.amazon.a.a.o.b.f16407f) : null;
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        if (str != null && str2 != null) {
            HybridPurchaseLogicBridge.Companion.resolveResult(str, str2, str3);
        }
        result.b(null);
    }
}
