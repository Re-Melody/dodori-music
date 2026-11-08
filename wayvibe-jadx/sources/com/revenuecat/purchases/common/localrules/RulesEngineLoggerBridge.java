package com.revenuecat.purchases.common.localrules;

import V0.p;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.rules.RulesEngineLogger;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class RulesEngineLoggerBridge implements RulesEngineLogger {
    public static final RulesEngineLoggerBridge INSTANCE = new RulesEngineLoggerBridge();
    private static final String LOG_PREFIX = "Rules engine: ";

    private RulesEngineLoggerBridge() {
    }

    @Override // com.revenuecat.purchases.rules.RulesEngineLogger
    public void log(String message) {
        m.f(message, "message");
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v(p.l(logLevel, new StringBuilder("[Purchases] - ")), LOG_PREFIX.concat(message));
        }
    }

    @Override // com.revenuecat.purchases.rules.RulesEngineLogger
    public void warn(String message) {
        m.f(message, "message");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(p.l(logLevel, new StringBuilder("[Purchases] - ")), LOG_PREFIX.concat(message));
        }
    }
}
