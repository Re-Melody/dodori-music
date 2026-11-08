package com.apple.android.sdk.authentication;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationFactory {
    public static AuthenticationManager createAuthenticationManager(Context context) {
        return new b(context);
    }
}
