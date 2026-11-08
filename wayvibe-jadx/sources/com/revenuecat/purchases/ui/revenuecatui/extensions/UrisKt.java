package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Z8.c;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class UrisKt {
    public static final void openUriOrElse(Context context, String uri, c fallbackAction) {
        m.f(context, "<this>");
        m.f(uri, "uri");
        m.f(fallbackAction, "fallbackAction");
        try {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
            } catch (ActivityNotFoundException e2) {
                fallbackAction.invoke(e2);
            }
        } catch (IllegalArgumentException e4) {
            fallbackAction.invoke(e4);
        }
    }
}
