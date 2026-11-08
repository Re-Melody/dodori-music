package com.apple.android.sdk.authentication;

import V0.p;

/* JADX INFO: loaded from: classes.dex */
public enum TokenError {
    USER_CANCELLED(0),
    NO_SUBSCRIPTION(1),
    SUBSCRIPTION_EXPIRED(2),
    TOKEN_FETCH_ERROR(3),
    UNKNOWN(4);

    private final int errorCode;

    TokenError(int i10) {
        this.errorCode = i10;
    }

    public static TokenError getErrorFromValue(int i10) {
        for (TokenError tokenError : values()) {
            if (tokenError.getErrorCode() == i10) {
                return tokenError;
            }
        }
        p.v(i10, "getErrorFromValue: mapping not found for error value :", "TokenError");
        return UNKNOWN;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
