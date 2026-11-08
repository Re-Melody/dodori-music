package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import M8.D;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;
import p076h.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ShowCustomerCenter extends b {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: parseResult, reason: collision with other method in class */
    public void m649parseResult(int i10, Intent intent) {
    }

    @Override // p076h.b
    public Intent createIntent(Context context, D input) {
        m.f(context, "context");
        m.f(input, "input");
        return CustomerCenterActivity.Companion.createIntent$revenuecatui_defaultsRelease(context);
    }

    @Override // p076h.b
    public /* bridge */ /* synthetic */ Object parseResult(int i10, Intent intent) {
        m649parseResult(i10, intent);
        return D.f8402a;
    }
}
