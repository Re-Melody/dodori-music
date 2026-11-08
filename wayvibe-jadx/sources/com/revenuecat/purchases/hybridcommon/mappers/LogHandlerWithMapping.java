package com.revenuecat.purchases.hybridcommon.mappers;

import M8.l;
import N8.y;
import Z8.c;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class LogHandlerWithMapping implements LogHandler {
    private final c callback;

    public LogHandlerWithMapping(c callback) {
        m.f(callback, "callback");
        this.callback = callback;
    }

    private final void invokeCallback(LogLevel logLevel, String str) {
        c cVar = this.callback;
        String upperCase = logLevel.name().toUpperCase(Locale.ROOT);
        m.e(upperCase, "toUpperCase(...)");
        cVar.invoke(y.g0(new l("logLevel", upperCase), new l("message", str)));
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void d(String tag, String msg) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        invokeCallback(LogLevel.DEBUG, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void e(String tag, String msg, Throwable th) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        if (th != null) {
            String str = msg + ". Throwable: " + th;
            if (str != null) {
                msg = str;
            }
        }
        invokeCallback(LogLevel.ERROR, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void i(String tag, String msg) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        invokeCallback(LogLevel.INFO, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void v(String tag, String msg) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        invokeCallback(LogLevel.VERBOSE, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void w(String tag, String msg) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        invokeCallback(LogLevel.WARN, msg);
    }
}
