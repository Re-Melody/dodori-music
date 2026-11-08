package com.apple.android.sdk.authentication;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StartAuthenticationActivity f17681a;

    public d(StartAuthenticationActivity startAuthenticationActivity) {
        this.f17681a = startAuthenticationActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f17681a.b();
        this.f17681a.finish();
    }
}
