package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import M8.D;
import Q.AbstractC0731e0;
import Q.I;
import U.C0896l;
import U.C0906q;
import U.InterfaceC0898m;
import Z8.e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.d;
import c0.g;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.SdkConfigurationStateKt;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p036d.n;
import p047e.b;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterActivity extends n {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_WAS_LAUNCHED_THROUGH_SDK = "was_launched_through_sdk";

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Intent createIntent$revenuecatui_defaultsRelease(Context context) {
            m.f(context, "context");
            Intent intent = new Intent(context, (Class<?>) CustomerCenterActivity.class);
            intent.putExtra(CustomerCenterActivity.EXTRA_WAS_LAUNCHED_THROUGH_SDK, true);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterActivity$onCreate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n implements e {

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00641 extends kotlin.jvm.internal.n implements e {
            final /* synthetic */ CustomerCenterActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00641(CustomerCenterActivity customerCenterActivity) {
                super(2);
                this.this$0 = customerCenterActivity;
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
                FillElement fillElement = d.f14718c;
                C0906q c0906q2 = (C0906q) interfaceC0898m;
                c0906q2.T(1948489528);
                boolean zF = c0906q2.f(this.this$0);
                CustomerCenterActivity customerCenterActivity = this.this$0;
                Object objI = c0906q2.I();
                if (zF || objI == C0896l.f11886a) {
                    objI = new CustomerCenterActivity$onCreate$1$1$1$1(customerCenterActivity);
                    c0906q2.d0(objI);
                }
                c0906q2.q(false);
                CustomerCenterKt.CustomerCenter(fillElement, null, (Z8.a) objI, c0906q2, 6, 2);
            }
        }

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
            AbstractC0731e0.a(p228v8.a.d(interfaceC0898m) ? I.b(0L, 0L, 0L, 0L, 0L, 0L, -1) : I.e(0L, 0L, 0L, 0L, 0L, 0L, -1), null, null, g.b(1428363188, new C00641(CustomerCenterActivity.this), interfaceC0898m), interfaceC0898m, 3072, 6);
        }
    }

    @Override // p036d.n, androidx.core.app.AbstractActivityC1038h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SdkConfigurationStateKt.restoreSdkConfigurationIfNeeded(this, bundle);
        if (getIntent().getBooleanExtra(EXTRA_WAS_LAUNCHED_THROUGH_SDK, false) || Purchases.Companion.isConfigured()) {
            b.a(this, new c0.b(2072096008, new AnonymousClass1(), true));
        } else {
            Logger.INSTANCE.e("CustomerCenterActivity was launched incorrectly. Please use ShowCustomerCenter activity result contract, CustomerCenter composable, or CustomerCenterView to display the Customer Center.");
            finish();
        }
    }

    @Override // p036d.n, androidx.core.app.AbstractActivityC1038h, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        m.f(outState, "outState");
        SdkConfigurationStateKt.saveSdkConfiguration(outState);
        super.onSaveInstanceState(outState);
    }
}
