package com.revenuecat.purchases_ui_flutter.views;

import F9.h;
import M8.D;
import M8.l;
import N8.y;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases_ui_flutter.MapHelper;
import java.util.Map;
import kotlin.jvm.internal.m;
import p134m1.b;
import p161o8.f;
import p161o8.s;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallFooterView extends BasePaywallView {
    private final s methodChannel;
    private final com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView nativePaywallFooterView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, int i10, f messenger, Map<String, ? extends Object> creationParams) {
        PresentedOfferingContext presentedOfferingContextMapPresentedOfferingContext;
        super(context);
        m.f(context, "context");
        m.f(messenger, "messenger");
        m.f(creationParams, "creationParams");
        this.methodChannel = new s(messenger, b.j(i10, "com.revenuecat.purchasesui/PaywallFooterView/"));
        String str = (String) creationParams.get("offeringIdentifier");
        Object obj = creationParams.get("presentedOfferingContext");
        PresentedOfferingContext presentedOfferingContext = null;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null && (presentedOfferingContextMapPresentedOfferingContext = MapHelper.INSTANCE.mapPresentedOfferingContext(map)) != null) {
            presentedOfferingContext = presentedOfferingContextMapPresentedOfferingContext;
        } else if (str != null) {
            presentedOfferingContext = new PresentedOfferingContext(str);
        }
        com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView paywallFooterView = new com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView(context, new h(this, 5)) { // from class: com.revenuecat.purchases_ui_flutter.views.PaywallFooterView.1
            {
                int i11 = 30;
                kotlin.jvm.internal.f fVar = null;
                Offering offering = null;
                PaywallListener paywallListener = null;
                FontProvider fontProvider = null;
                boolean z10 = false;
            }

            @Override // android.widget.FrameLayout, android.view.View
            public void onMeasure(int i11, int i12) {
                super.onMeasure(i11, i12);
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (!(i15 < getChildCount())) {
                        int suggestedMinimumWidth = getSuggestedMinimumWidth();
                        if (i13 < suggestedMinimumWidth) {
                            i13 = suggestedMinimumWidth;
                        }
                        int suggestedMinimumHeight = getSuggestedMinimumHeight();
                        if (i14 < suggestedMinimumHeight) {
                            i14 = suggestedMinimumHeight;
                        }
                        setMeasuredDimension(i13, i14);
                        this.updateHeight(i14);
                        return;
                    }
                    int i16 = i15 + 1;
                    View childAt = getChildAt(i15);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    childAt.measure(i11, 0);
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (i13 < measuredWidth) {
                        i13 = measuredWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (i14 < measuredHeight) {
                        i14 = measuredHeight;
                    }
                    i15 = i16;
                }
            }
        };
        this.nativePaywallFooterView = paywallFooterView;
        paywallFooterView.setPaywallListener(new PaywallListenerWrapper() { // from class: com.revenuecat.purchases_ui_flutter.views.PaywallFooterView.3
            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                PaywallFooterView.this.methodChannel.a("onPurchaseCancelled", null, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseCompleted(Map<String, ? extends Object> customerInfo, Map<String, ? extends Object> storeTransaction) {
                m.f(customerInfo, "customerInfo");
                m.f(storeTransaction, "storeTransaction");
                PaywallFooterView.this.methodChannel.a("onPurchaseCompleted", y.g0(new l("customerInfo", customerInfo), new l("storeTransaction", storeTransaction)), null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseError(Map<String, ? extends Object> error) {
                m.f(error, "error");
                PaywallFooterView.this.methodChannel.a("onPurchaseError", error, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseStarted(Map<String, ? extends Object> rcPackage) {
                m.f(rcPackage, "rcPackage");
                PaywallFooterView.this.methodChannel.a("onPurchaseStarted", rcPackage, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreCompleted(Map<String, ? extends Object> customerInfo) {
                m.f(customerInfo, "customerInfo");
                PaywallFooterView.this.methodChannel.a("onRestoreCompleted", customerInfo, null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreError(Map<String, ? extends Object> error) {
                m.f(error, "error");
                PaywallFooterView.this.methodChannel.a("onRestoreError", error, null);
            }
        });
        paywallFooterView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 80));
        if (str == null || presentedOfferingContext == null) {
            return;
        }
        paywallFooterView.setOfferingIdAndPresentedOfferingContext(str, presentedOfferingContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D _init_$lambda$2(PaywallFooterView paywallFooterView) {
        paywallFooterView.methodChannel.a("onDismiss", null, null);
        return D.f8402a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHeight(double d10) {
        this.methodChannel.a("onHeightChanged", Double.valueOf(d10), null);
    }

    @Override // com.revenuecat.purchases_ui_flutter.views.BasePaywallView, io.flutter.plugin.platform.f
    public void dispose() {
    }

    @Override // com.revenuecat.purchases_ui_flutter.views.BasePaywallView, io.flutter.plugin.platform.f
    public View getView() {
        return this.nativePaywallFooterView;
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
}
