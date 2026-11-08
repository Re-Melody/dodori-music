package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
final class CustomerCenterScaffoldConfig {
    private final CustomerCenterState.NavigationButtonType navigationButtonType;
    private final boolean shouldUseLargeTopBar;
    private final String title;

    public CustomerCenterScaffoldConfig(String str, boolean z10, CustomerCenterState.NavigationButtonType navigationButtonType) {
        m.f(navigationButtonType, "navigationButtonType");
        this.title = str;
        this.shouldUseLargeTopBar = z10;
        this.navigationButtonType = navigationButtonType;
    }

    public static /* synthetic */ CustomerCenterScaffoldConfig copy$default(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, String str, boolean z10, CustomerCenterState.NavigationButtonType navigationButtonType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerCenterScaffoldConfig.title;
        }
        if ((i10 & 2) != 0) {
            z10 = customerCenterScaffoldConfig.shouldUseLargeTopBar;
        }
        if ((i10 & 4) != 0) {
            navigationButtonType = customerCenterScaffoldConfig.navigationButtonType;
        }
        return customerCenterScaffoldConfig.copy(str, z10, navigationButtonType);
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component2() {
        return this.shouldUseLargeTopBar;
    }

    public final CustomerCenterState.NavigationButtonType component3() {
        return this.navigationButtonType;
    }

    public final CustomerCenterScaffoldConfig copy(String str, boolean z10, CustomerCenterState.NavigationButtonType navigationButtonType) {
        m.f(navigationButtonType, "navigationButtonType");
        return new CustomerCenterScaffoldConfig(str, z10, navigationButtonType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterScaffoldConfig)) {
            return false;
        }
        CustomerCenterScaffoldConfig customerCenterScaffoldConfig = (CustomerCenterScaffoldConfig) obj;
        return m.b(this.title, customerCenterScaffoldConfig.title) && this.shouldUseLargeTopBar == customerCenterScaffoldConfig.shouldUseLargeTopBar && this.navigationButtonType == customerCenterScaffoldConfig.navigationButtonType;
    }

    public final CustomerCenterState.NavigationButtonType getNavigationButtonType() {
        return this.navigationButtonType;
    }

    public final boolean getShouldUseLargeTopBar() {
        return this.shouldUseLargeTopBar;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return this.navigationButtonType.hashCode() + b.f((str == null ? 0 : str.hashCode()) * 31, 31, this.shouldUseLargeTopBar);
    }

    public String toString() {
        return "CustomerCenterScaffoldConfig(title=" + this.title + ", shouldUseLargeTopBar=" + this.shouldUseLargeTopBar + ", navigationButtonType=" + this.navigationButtonType + ')';
    }
}
