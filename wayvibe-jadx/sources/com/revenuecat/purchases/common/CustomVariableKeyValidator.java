package com.revenuecat.purchases.common;

import V0.p;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class CustomVariableKeyValidator {
    public static final CustomVariableKeyValidator INSTANCE = new CustomVariableKeyValidator();

    private CustomVariableKeyValidator() {
    }

    public final boolean isValidKey(String key) {
        m.f(key, "key");
        if (key.length() > 0) {
            if (key.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (Character.isLetter(key.charAt(0))) {
                for (int i10 = 0; i10 < key.length(); i10++) {
                    char cCharAt = key.charAt(i10);
                    if (Character.isLetter(cCharAt) || Character.isDigit(cCharAt) || cCharAt == '_') {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final <T> Map<String, T> validateAndFilter(Map<String, ? extends T> variables) {
        m.f(variables, "variables");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends T> entry : variables.entrySet()) {
            String key = entry.getKey();
            boolean zIsValidKey = INSTANCE.isValidKey(key);
            if (!zIsValidKey) {
                LogLevel logLevel = LogLevel.WARN;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.w(p.l(logLevel, new StringBuilder("[Purchases] - ")), "Custom variable key '" + key + "' is invalid and will be ignored. Keys must start with a letter and contain only letters, numbers, and underscores.");
                }
            }
            if (zIsValidKey) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
