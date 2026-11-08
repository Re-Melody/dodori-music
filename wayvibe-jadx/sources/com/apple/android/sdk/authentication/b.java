package com.apple.android.sdk.authentication;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class b implements AuthenticationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17679a;

    public b(Context context) {
        this.f17679a = context;
    }

    @Override // com.apple.android.sdk.authentication.AuthenticationManager
    public AuthIntentBuilder createIntentBuilder(String str) {
        return new AuthIntentBuilder(this.f17679a, str);
    }

    @Override // com.apple.android.sdk.authentication.AuthenticationManager
    public TokenResult handleTokenResult(Intent intent) {
        if (intent != null) {
            if (intent.hasExtra("music_user_token")) {
                return new TokenResult(intent.getStringExtra("music_user_token"));
            }
            if (intent.hasExtra("music_user_token_error")) {
                return new TokenResult(TokenError.getErrorFromValue(intent.getIntExtra("music_user_token_error", TokenError.UNKNOWN.getErrorCode())));
            }
        }
        return new TokenResult(TokenError.UNKNOWN);
    }
}
