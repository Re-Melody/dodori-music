package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p039d2.C1921s;
import p151n9.J;
import p151n9.M;
import p151n9.S;

/* JADX INFO: loaded from: classes2.dex */
public final class VirtualCurrencyBalancesScreenViewModel extends Z {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final long STOP_TIMEOUT_MILLIS = 5000;
    private final PurchasesType purchases;
    private final S viewState;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public VirtualCurrencyBalancesScreenViewModel(PurchasesType purchases) {
        m.f(purchases, "purchases");
        this.purchases = purchases;
        this.viewState = J.l(new C1921s(new VirtualCurrencyBalancesScreenViewModel$viewState$1(this, null)), U.h(this), M.a(2), VirtualCurrencyBalancesScreenViewState.Loading.INSTANCE);
    }

    public final S getViewState() {
        return this.viewState;
    }
}
