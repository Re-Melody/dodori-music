package com.revenuecat.purchases.hybridcommon;

import B2.AbstractC0112b;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorContainer {
    private final int code;
    private final Map<String, Object> info;
    private final String message;

    public ErrorContainer(int i10, String message, Map<String, ? extends Object> info) {
        m.f(message, "message");
        m.f(info, "info");
        this.code = i10;
        this.message = message;
        this.info = info;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorContainer copy$default(ErrorContainer errorContainer, int i10, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = errorContainer.code;
        }
        if ((i11 & 2) != 0) {
            str = errorContainer.message;
        }
        if ((i11 & 4) != 0) {
            map = errorContainer.info;
        }
        return errorContainer.copy(i10, str, map);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final Map<String, Object> component3() {
        return this.info;
    }

    public final ErrorContainer copy(int i10, String message, Map<String, ? extends Object> info) {
        m.f(message, "message");
        m.f(info, "info");
        return new ErrorContainer(i10, message, info);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorContainer)) {
            return false;
        }
        ErrorContainer errorContainer = (ErrorContainer) obj;
        return this.code == errorContainer.code && m.b(this.message, errorContainer.message) && m.b(this.info, errorContainer.info);
    }

    public final int getCode() {
        return this.code;
    }

    public final Map<String, Object> getInfo() {
        return this.info;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.info.hashCode() + AbstractC0112b.a(Integer.hashCode(this.code) * 31, 31, this.message);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorContainer(code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", info=");
        return p134m1.b.n(sb, this.info, ')');
    }
}
