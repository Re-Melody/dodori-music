package com.revenuecat.purchases.data;

import com.revenuecat.purchases.CustomerInfo;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class LogInResult {
    private final boolean created;
    private final CustomerInfo customerInfo;

    public LogInResult(CustomerInfo customerInfo, boolean z10) {
        m.f(customerInfo, "customerInfo");
        this.customerInfo = customerInfo;
        this.created = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogInResult)) {
            return false;
        }
        LogInResult logInResult = (LogInResult) obj;
        return m.b(this.customerInfo, logInResult.customerInfo) && this.created == logInResult.created;
    }

    public final boolean getCreated() {
        return this.created;
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public int hashCode() {
        return Boolean.hashCode(this.created) + (this.customerInfo.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LogInResult(customerInfo=");
        sb.append(this.customerInfo);
        sb.append(", created=");
        return b.o(sb, this.created, ')');
    }
}
