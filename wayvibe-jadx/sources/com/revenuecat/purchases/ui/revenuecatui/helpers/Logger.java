package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.util.Log;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class Logger {
    public static final int $stable = 0;
    public static final Logger INSTANCE = new Logger();
    private static final String TAG = "[Purchases]";

    private Logger() {
    }

    public final void d(String message) {
        m.f(message, "message");
        Log.d(TAG, message);
    }

    public final void e(String message) {
        m.f(message, "message");
        Log.e(TAG, message);
    }

    public final void i(String message) {
        m.f(message, "message");
        Log.i(TAG, message);
    }

    public final void w(String message) {
        m.f(message, "message");
        Log.w(TAG, message);
    }

    public final void e(String message, Throwable throwable) {
        m.f(message, "message");
        m.f(throwable, "throwable");
        Log.e(TAG, message, throwable);
    }
}
