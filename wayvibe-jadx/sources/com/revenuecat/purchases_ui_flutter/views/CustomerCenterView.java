package com.revenuecat.purchases_ui_flutter.views;

import F9.h;
import M8.D;
import M8.l;
import N8.y;
import android.content.Context;
import android.view.View;
import com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper;
import io.flutter.plugin.platform.f;
import java.util.Map;
import kotlin.jvm.internal.m;
import p134m1.b;
import p161o8.o;
import p161o8.q;
import p161o8.r;
import p161o8.s;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterView implements f, q {
    private final s methodChannel;
    private final com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView nativeCustomerCenterView;

    public CustomerCenterView(Context context, int i10, p161o8.f messenger, Map<String, ? extends Object> creationParams) {
        m.f(context, "context");
        m.f(messenger, "messenger");
        m.f(creationParams, "creationParams");
        s sVar = new s(messenger, b.j(i10, "com.revenuecat.purchasesui/CustomerCenterView/"));
        this.methodChannel = sVar;
        sVar.b(this);
        com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView customerCenterView = new com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView(context, new h(this, 4));
        this.nativeCustomerCenterView = customerCenterView;
        customerCenterView.setCustomerCenterListener(createCustomerCenterListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D _init_$lambda$0(CustomerCenterView customerCenterView) {
        customerCenterView.methodChannel.a("onDismiss", null, null);
        return D.f8402a;
    }

    private final CustomerCenterListenerWrapper createCustomerCenterListener() {
        return new CustomerCenterListenerWrapper() { // from class: com.revenuecat.purchases_ui_flutter.views.CustomerCenterView.createCustomerCenterListener.1
            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onCustomActionSelectedWrapper(String actionId, String str) {
                m.f(actionId, "actionId");
                CustomerCenterView.this.methodChannel.a("onCustomActionSelected", y.g0(new l("actionId", actionId), new l("purchaseIdentifier", str)), null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onFeedbackSurveyCompletedWrapper(String feedbackSurveyOptionId) {
                m.f(feedbackSurveyOptionId, "feedbackSurveyOptionId");
                CustomerCenterView.this.methodChannel.a("onFeedbackSurveyCompleted", y.f0(new l("optionId", feedbackSurveyOptionId)), null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onManagementOptionSelectedWrapper(String action, String str, String str2) {
                m.f(action, "action");
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onPromotionalOfferSucceededWrapper(Map<String, ? extends Object> customerInfo, Map<String, ? extends Object> transaction, String offerId) {
                m.f(customerInfo, "customerInfo");
                m.f(transaction, "transaction");
                m.f(offerId, "offerId");
                CustomerCenterView.this.methodChannel.a("onPromotionalOfferSucceeded", y.g0(new l("customerInfo", customerInfo), new l("transaction", transaction), new l("offerId", offerId)), null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onRestoreCompletedWrapper(Map<String, ? extends Object> customerInfo) {
                m.f(customerInfo, "customerInfo");
                CustomerCenterView.this.methodChannel.a("onRestoreCompleted", customerInfo, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onRestoreFailedWrapper(Map<String, ? extends Object> error) {
                m.f(error, "error");
                CustomerCenterView.this.methodChannel.a("onRestoreFailed", error, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onRestoreStartedWrapper() {
                CustomerCenterView.this.methodChannel.a("onRestoreStarted", null, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onShowingManageSubscriptionsWrapper() {
                CustomerCenterView.this.methodChannel.a("onShowingManageSubscriptions", null, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onManagementOptionSelectedWrapper(String action, String str) {
                m.f(action, "action");
                CustomerCenterView.this.methodChannel.a("onManagementOptionSelected", y.g0(new l("optionId", action), new l("url", str)), null);
            }
        };
    }

    @Override // io.flutter.plugin.platform.f
    public void dispose() {
        this.methodChannel.b(null);
    }

    @Override // io.flutter.plugin.platform.f
    public View getView() {
        return this.nativeCustomerCenterView;
    }

    @Override // io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(View view) {
    }

    @Override // io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }

    @Override // p161o8.q
    public void onMethodCall(o methodCall, r result) {
        m.f(methodCall, "methodCall");
        m.f(result, "result");
        result.c();
    }
}
