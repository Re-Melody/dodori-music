package com.apple.android.sdk.authentication;

/* JADX INFO: loaded from: classes.dex */
public class TokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TokenError f17677c;

    public TokenResult(String str) {
        this.f17675a = str;
    }

    public TokenError getError() {
        return this.f17677c;
    }

    public String getMusicUserToken() {
        return this.f17675a;
    }

    public boolean isError() {
        return this.f17676b;
    }

    public TokenResult(TokenError tokenError) {
        this.f17677c = tokenError;
        if (tokenError != null) {
            this.f17676b = true;
        }
    }
}
