package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextExtensionsKt {
    public static final /* synthetic */ Activity getActivity(Context context) {
        m.f(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            m.e(context, "currentContext.baseContext");
        }
        return null;
    }
}
