package com.revenuecat.purchases.ui.revenuecatui.views;

import M8.D;
import U.C0896l;
import U.C0906q;
import U.InterfaceC0898m;
import Z8.a;
import Z8.e;
import android.content.Context;
import android.util.AttributeSet;
import c0.g;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;
import com.revenuecat.purchases.customercenter.Resumable;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterOptions;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterView extends CompatComposeView {
    public static final int $stable = 8;
    private CustomerCenterListener customerCenterListener;
    private final CustomerCenterOptions customerCenterOptions;
    private a dismissHandler;
    private final CustomerCenterView$internalListener$1 internalListener;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$Content$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements e {
        public AnonymousClass1() {
            super(2);
        }

        @Override // Z8.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC0898m) obj, ((Number) obj2).intValue());
            return D.f8402a;
        }

        public final void invoke(InterfaceC0898m interfaceC0898m, int i10) {
            if ((i10 & 3) == 2) {
                C0906q c0906q = (C0906q) interfaceC0898m;
                if (c0906q.z()) {
                    c0906q.N();
                    return;
                }
            }
            CustomerCenterOptions customerCenterOptions = CustomerCenterView.this.customerCenterOptions;
            C0906q c0906q2 = (C0906q) interfaceC0898m;
            c0906q2.T(573881428);
            boolean zH = c0906q2.h(CustomerCenterView.this);
            CustomerCenterView customerCenterView = CustomerCenterView.this;
            Object objI = c0906q2.I();
            if (zH || objI == C0896l.f11886a) {
                objI = new CustomerCenterView$Content$1$1$1(customerCenterView);
                c0906q2.d0(objI);
            }
            c0906q2.q(false);
            CustomerCenterKt.CustomerCenter(null, customerCenterOptions, (a) objI, c0906q2, 0, 1);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context) {
        this(context, null, null, 6, null);
        m.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss() {
        a aVar = this.dismissHandler;
        if (aVar != null) {
            aVar.invoke();
        }
        destroy();
    }

    private final void init() {
        Logger.INSTANCE.d("Initialized CustomerCenterView");
    }

    @Override // G0.AbstractC0451a
    public void Content(InterfaceC0898m interfaceC0898m, int i10) {
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.T(1372663828);
        RevenueCatThemeKt.RevenueCatTheme(g.b(1061986288, new AnonymousClass1(), c0906q), c0906q, 6);
        c0906q.q(false);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.views.CompatComposeView
    public void onBackPressed() {
        D d10;
        if (this.dismissHandler != null) {
            dismiss();
            d10 = D.f8402a;
        } else {
            d10 = null;
        }
        if (d10 == null) {
            super.onBackPressed();
        }
    }

    public final void setCustomerCenterListener(CustomerCenterListener customerCenterListener) {
        this.customerCenterListener = customerCenterListener;
    }

    public final void setDismissHandler(a aVar) {
        this.dismissHandler = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context, CustomerCenterListener customerCenterListener) {
        this(context, customerCenterListener, null, 4, null);
        m.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.revenuecat.purchases.customercenter.CustomerCenterListener, com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1] */
    public CustomerCenterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        m.f(context, "context");
        ?? r10 = new CustomerCenterListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1
            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onCustomActionSelected(String actionIdentifier, String str) {
                m.f(actionIdentifier, "actionIdentifier");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onCustomActionSelected(actionIdentifier, str);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
                m.f(feedbackSurveyOptionId, "feedbackSurveyOptionId");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onManagementOptionSelected(CustomerCenterManagementOption action) {
                m.f(action, "action");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onManagementOptionSelected(action);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
                m.f(customerInfo, "customerInfo");
                m.f(transaction, "transaction");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onPromotionalOfferSucceeded(customerInfo, transaction);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                m.f(customerInfo, "customerInfo");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreFailed(PurchasesError error) {
                m.f(error, "error");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreFailed(error);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreInitiated(Resumable resume) {
                D d10;
                m.f(resume, "resume");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreInitiated(resume);
                    d10 = D.f8402a;
                } else {
                    d10 = null;
                }
                if (d10 == null) {
                    Resumable.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreStarted() {
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreStarted();
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onShowingManageSubscriptions() {
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onShowingManageSubscriptions();
                }
            }
        };
        this.internalListener = r10;
        this.customerCenterOptions = new CustomerCenterOptions.Builder().setListener(r10).build();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.revenuecat.purchases.customercenter.CustomerCenterListener, com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1] */
    public CustomerCenterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m.f(context, "context");
        ?? r10 = new CustomerCenterListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1
            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onCustomActionSelected(String actionIdentifier, String str) {
                m.f(actionIdentifier, "actionIdentifier");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onCustomActionSelected(actionIdentifier, str);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
                m.f(feedbackSurveyOptionId, "feedbackSurveyOptionId");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onManagementOptionSelected(CustomerCenterManagementOption action) {
                m.f(action, "action");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onManagementOptionSelected(action);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
                m.f(customerInfo, "customerInfo");
                m.f(transaction, "transaction");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onPromotionalOfferSucceeded(customerInfo, transaction);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                m.f(customerInfo, "customerInfo");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreFailed(PurchasesError error) {
                m.f(error, "error");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreFailed(error);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreInitiated(Resumable resume) {
                D d10;
                m.f(resume, "resume");
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreInitiated(resume);
                    d10 = D.f8402a;
                } else {
                    d10 = null;
                }
                if (d10 == null) {
                    Resumable.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreStarted() {
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onRestoreStarted();
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onShowingManageSubscriptions() {
                CustomerCenterListener customerCenterListener = this.this$0.customerCenterListener;
                if (customerCenterListener != null) {
                    customerCenterListener.onShowingManageSubscriptions();
                }
            }
        };
        this.internalListener = r10;
        this.customerCenterOptions = new CustomerCenterOptions.Builder().setListener(r10).build();
        init();
    }

    public /* synthetic */ CustomerCenterView(Context context, a aVar, int i10, f fVar) {
        this(context, (i10 & 2) != 0 ? null : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterView(Context context, a aVar) {
        this(context, (CustomerCenterListener) null, aVar);
        m.f(context, "context");
    }

    public /* synthetic */ CustomerCenterView(Context context, CustomerCenterListener customerCenterListener, a aVar, int i10, f fVar) {
        this(context, (i10 & 2) != 0 ? null : customerCenterListener, (i10 & 4) != 0 ? null : aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.revenuecat.purchases.customercenter.CustomerCenterListener, com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1] */
    public CustomerCenterView(Context context, CustomerCenterListener customerCenterListener, a aVar) {
        super(context, null, 0, 6, null);
        m.f(context, "context");
        ?? r10 = new CustomerCenterListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView$internalListener$1
            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onCustomActionSelected(String actionIdentifier, String str) {
                m.f(actionIdentifier, "actionIdentifier");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onCustomActionSelected(actionIdentifier, str);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
                m.f(feedbackSurveyOptionId, "feedbackSurveyOptionId");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onManagementOptionSelected(CustomerCenterManagementOption action) {
                m.f(action, "action");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onManagementOptionSelected(action);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
                m.f(customerInfo, "customerInfo");
                m.f(transaction, "transaction");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onPromotionalOfferSucceeded(customerInfo, transaction);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                m.f(customerInfo, "customerInfo");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreFailed(PurchasesError error) {
                m.f(error, "error");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onRestoreFailed(error);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreInitiated(Resumable resume) {
                D d10;
                m.f(resume, "resume");
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onRestoreInitiated(resume);
                    d10 = D.f8402a;
                } else {
                    d10 = null;
                }
                if (d10 == null) {
                    Resumable.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onRestoreStarted() {
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onRestoreStarted();
                }
            }

            @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
            public void onShowingManageSubscriptions() {
                CustomerCenterListener customerCenterListener2 = this.this$0.customerCenterListener;
                if (customerCenterListener2 != null) {
                    customerCenterListener2.onShowingManageSubscriptions();
                }
            }
        };
        this.internalListener = r10;
        this.customerCenterOptions = new CustomerCenterOptions.Builder().setListener(r10).build();
        this.customerCenterListener = customerCenterListener;
        this.dismissHandler = aVar;
        init();
    }
}
