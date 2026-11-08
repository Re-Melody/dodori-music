package com.revenuecat.purchases.common;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributeError {
    private final String keyName;
    private final String message;

    public SubscriberAttributeError(String keyName, String message) {
        m.f(keyName, "keyName");
        m.f(message, "message");
        this.keyName = keyName;
        this.message = message;
    }

    public static /* synthetic */ SubscriberAttributeError copy$default(SubscriberAttributeError subscriberAttributeError, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriberAttributeError.keyName;
        }
        if ((i10 & 2) != 0) {
            str2 = subscriberAttributeError.message;
        }
        return subscriberAttributeError.copy(str, str2);
    }

    public final String component1() {
        return this.keyName;
    }

    public final String component2() {
        return this.message;
    }

    public final SubscriberAttributeError copy(String keyName, String message) {
        m.f(keyName, "keyName");
        m.f(message, "message");
        return new SubscriberAttributeError(keyName, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriberAttributeError)) {
            return false;
        }
        SubscriberAttributeError subscriberAttributeError = (SubscriberAttributeError) obj;
        return m.b(this.keyName, subscriberAttributeError.keyName) && m.b(this.message, subscriberAttributeError.message);
    }

    public final String getKeyName() {
        return this.keyName;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.keyName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriberAttributeError(keyName=");
        sb.append(this.keyName);
        sb.append(", message=");
        return AbstractC0112b.j(sb, this.message, ')');
    }
}
