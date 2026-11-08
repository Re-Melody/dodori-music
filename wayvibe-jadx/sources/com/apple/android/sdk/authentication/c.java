package com.apple.android.sdk.authentication;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StartAuthenticationActivity f17680a;

    public c(StartAuthenticationActivity startAuthenticationActivity) {
        this.f17680a = startAuthenticationActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        StartAuthenticationActivity startAuthenticationActivity = this.f17680a;
        a.a(startAuthenticationActivity, startAuthenticationActivity.f17671b, this.f17680a.f17672c, this.f17680a.f17673d);
    }
}
