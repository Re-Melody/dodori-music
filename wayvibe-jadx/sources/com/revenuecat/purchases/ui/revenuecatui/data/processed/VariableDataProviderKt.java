package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.m;
import p025b9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class VariableDataProviderKt {
    private static final double MICRO_MULTIPLIER = 1000000.0d;

    public static final boolean endsIn00Cents(Price price) {
        m.f(price, "<this>");
        double d10 = 100;
        return ((((double) Math.round((((double) price.getAmountMicros()) / 1000000.0d) * d10)) / 100.0d) * d10) % d10 == 0.0d;
    }

    public static final String getFormatted(Price price, Locale locale) {
        m.f(price, "<this>");
        m.f(locale, "locale");
        Currency currency = Currency.getInstance(price.getCurrencyCode());
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        if (defaultFractionDigits < 0) {
            defaultFractionDigits = 0;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
        currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
        String str = currencyInstance.format(BigDecimal.valueOf(price.getAmountMicros()).divide(BigDecimal.valueOf(1000000L), defaultFractionDigits, RoundingMode.DOWN));
        m.e(str, "numberFormat.format(amount)");
        return str;
    }

    public static /* synthetic */ String getFormatted$default(Price price, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            m.e(locale, "getDefault()");
        }
        return getFormatted(price, locale);
    }

    public static final String getTruncatedFormatted(Price price, Locale locale) {
        m.f(price, "<this>");
        m.f(locale, "locale");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(price.getCurrencyCode()));
        currencyInstance.setMaximumFractionDigits(0);
        String str = currencyInstance.format(price.getAmountMicros() / 1000000.0d);
        m.e(str, "numberFormat.format(amount)");
        return str;
    }

    public static /* synthetic */ String getTruncatedFormatted$default(Price price, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            m.e(locale, "getDefault()");
        }
        return getTruncatedFormatted(price, locale);
    }

    public static final String localizedDiscount(TemplateConfiguration.PackageInfo packageInfo, ResourceProvider resourceProvider) {
        m.f(packageInfo, "<this>");
        m.f(resourceProvider, "resourceProvider");
        return localizedDiscount(resourceProvider, packageInfo.getDiscountRelativeToMostExpensivePerMonth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Period normalizedMonths(Period period) {
        if (period.getUnit() != Period.Unit.YEAR) {
            return period;
        }
        int value = period.getValue() * 12;
        return new Period(value, Period.Unit.MONTH, "P" + value + 'M');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String localizedDiscount(ResourceProvider resourceProvider, Double d10) {
        if (d10 == null) {
            return null;
        }
        return resourceProvider.getString(R.string.package_discount, Integer.valueOf(a.T(d10.doubleValue() * 100.0d)));
    }
}
