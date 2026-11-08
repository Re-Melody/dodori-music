package com.apple.android.sdk.authentication;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public interface AuthenticationManager {
    AuthIntentBuilder createIntentBuilder(String str);

    TokenResult handleTokenResult(Intent intent);
}
