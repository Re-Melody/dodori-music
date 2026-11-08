package com.revenuecat.purchases.rules;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PrintLogger implements RulesEngineLogger {
    public static final PrintLogger INSTANCE = new PrintLogger();

    private PrintLogger() {
    }

    @Override // com.revenuecat.purchases.rules.RulesEngineLogger
    public void log(String message) {
        m.f(message, "message");
        System.out.println((Object) message);
    }

    @Override // com.revenuecat.purchases.rules.RulesEngineLogger
    public void warn(String message) {
        m.f(message, "message");
        System.err.println(message);
    }
}
