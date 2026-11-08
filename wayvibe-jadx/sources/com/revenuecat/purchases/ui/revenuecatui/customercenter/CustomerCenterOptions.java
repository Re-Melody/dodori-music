package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterOptions {
    public static final int $stable = 8;
    private final CustomerCenterListener listener;

    public static final class Builder {
        public static final int $stable = 8;
        private CustomerCenterListener listener;

        public final CustomerCenterOptions build() {
            return new CustomerCenterOptions(this);
        }

        public final CustomerCenterListener getListener$revenuecatui_defaultsRelease() {
            return this.listener;
        }

        public final Builder setListener(CustomerCenterListener customerCenterListener) {
            this.listener = customerCenterListener;
            return this;
        }

        public final void setListener$revenuecatui_defaultsRelease(CustomerCenterListener customerCenterListener) {
            this.listener = customerCenterListener;
        }
    }

    public CustomerCenterOptions(CustomerCenterListener customerCenterListener) {
        this.listener = customerCenterListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CustomerCenterOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterOptions");
        return m.b(this.listener, ((CustomerCenterOptions) obj).listener);
    }

    public final CustomerCenterListener getListener$revenuecatui_defaultsRelease() {
        return this.listener;
    }

    public int hashCode() {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            return customerCenterListener.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CustomerCenterOptions(listener=" + this.listener + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerCenterOptions(Builder builder) {
        this(builder.getListener$revenuecatui_defaultsRelease());
        m.f(builder, "builder");
    }
}
