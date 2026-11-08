package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.models.Price;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceFactory {
    public static final PriceFactory INSTANCE = new PriceFactory();

    private PriceFactory() {
    }

    public final Price createPrice$purchases_defaultsRelease(long j10, String currencyCode, Locale locale) {
        m.f(currencyCode, "currencyCode");
        m.f(locale, "locale");
        Currency currency = Currency.getInstance(currencyCode);
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        if (defaultFractionDigits < 0) {
            defaultFractionDigits = 0;
        }
        double dRoundToDecimalPlaces = DoubleExtensionsKt.roundToDecimalPlaces(j10 / 1000000.0d, defaultFractionDigits);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
        currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
        String formatted = currencyInstance.format(dRoundToDecimalPlaces);
        m.e(formatted, "formatted");
        return new Price(formatted, j10, currencyCode);
    }
}
