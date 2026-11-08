package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import U.F;
import U.G;
import Z8.c;
import android.app.Activity;
import androidx.lifecycle.EnumC1119n;
import androidx.lifecycle.InterfaceC1123s;
import androidx.lifecycle.InterfaceC1125u;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalCustomerCenterKt$InternalCustomerCenter$4$1 extends n implements c {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ InterfaceC1125u $lifecycleOwner;
    final /* synthetic */ CustomerCenterViewModel $viewModel;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1119n.values().length];
            try {
                iArr[EnumC1119n.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1119n.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1119n.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$InternalCustomerCenter$4$1(InterfaceC1125u interfaceC1125u, CustomerCenterViewModel customerCenterViewModel, Activity activity) {
        super(1);
        this.$lifecycleOwner = interfaceC1125u;
        this.$viewModel = customerCenterViewModel;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CustomerCenterViewModel customerCenterViewModel, Activity activity, InterfaceC1125u interfaceC1125u, EnumC1119n event) {
        m.f(interfaceC1125u, "<anonymous parameter 0>");
        m.f(event, "event");
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            customerCenterViewModel.onActivityStopped(activity != null && activity.isChangingConfigurations());
        } else if (i10 == 2) {
            customerCenterViewModel.onActivityStarted();
        } else {
            if (i10 != 3) {
                return;
            }
            customerCenterViewModel.onActivityResumed();
        }
    }

    @Override // Z8.c
    public final F invoke(G DisposableEffect) {
        m.f(DisposableEffect, "$this$DisposableEffect");
        final CustomerCenterViewModel customerCenterViewModel = this.$viewModel;
        final Activity activity = this.$activity;
        final InterfaceC1123s interfaceC1123s = new InterfaceC1123s() { // from class: com.revenuecat.purchases.ui.revenuecatui.customercenter.a
            @Override // androidx.lifecycle.InterfaceC1123s
            public final void c(InterfaceC1125u interfaceC1125u, EnumC1119n enumC1119n) {
                InternalCustomerCenterKt$InternalCustomerCenter$4$1.invoke$lambda$0(customerCenterViewModel, activity, interfaceC1125u, enumC1119n);
            }
        };
        this.$lifecycleOwner.getLifecycle().addObserver(interfaceC1123s);
        final InterfaceC1125u interfaceC1125u = this.$lifecycleOwner;
        return new F() { // from class: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$4$1$invoke$$inlined$onDispose$1
            @Override // U.F
            public void dispose() {
                interfaceC1125u.getLifecycle().removeObserver(interfaceC1123s);
            }
        };
    }
}
