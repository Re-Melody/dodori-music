package com.apple.android.sdk.authentication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class AuthIntentBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f17663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f17666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f17667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap f17668f;

    public AuthIntentBuilder(Context context, String str) {
        this.f17666d = context;
        this.f17665c = str;
    }

    public Intent build() {
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putString("developer_token", this.f17665c);
        if (this.f17663a) {
            intent = new Intent(this.f17666d, (Class<?>) SDKUriHandlerActivity.class);
        } else {
            intent = new Intent(this.f17666d, (Class<?>) StartAuthenticationActivity.class);
            if (!TextUtils.isEmpty(this.f17664b)) {
                bundle.putString("custom_prompt_text", this.f17664b);
            }
        }
        if (!TextUtils.isEmpty(this.f17667e)) {
            bundle.putString("contextual_upsell_id", this.f17667e);
        }
        HashMap map = this.f17668f;
        if (map != null) {
            bundle.putSerializable("custom_params", map);
        }
        intent.putExtras(bundle);
        return intent;
    }

    public AuthIntentBuilder setContextId(String str) {
        this.f17667e = str;
        return this;
    }

    public AuthIntentBuilder setCustomParams(HashMap map) {
        if (map != null && !map.isEmpty()) {
            this.f17668f = map;
        }
        return this;
    }

    public AuthIntentBuilder setHideStartScreen(boolean z10) {
        this.f17663a = z10;
        return this;
    }

    public AuthIntentBuilder setStartScreenMessage(String str) {
        this.f17664b = str;
        return this;
    }
}
