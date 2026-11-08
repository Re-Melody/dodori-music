package com.revenuecat.purchases.ui.revenuecatui.utils;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDateFormatter implements DateFormatter {
    public static final int $stable = 0;

    private final String formatUsingDateTimeFormatter(Date date, Locale locale) {
        String str = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().format(DateTimeFormatter.ofPattern("dd MMM yyyy", locale));
        m.e(str, "localDate.format(formatter)");
        return str;
    }

    private final String formatUsingSimpleDateFormat(Date date, Locale locale) {
        String str = new SimpleDateFormat("dd MMM yyyy", locale).format(date);
        m.e(str, "formatter.format(date)");
        return str;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter
    public String format(Date date, Locale locale) {
        m.f(date, "date");
        m.f(locale, "locale");
        return Build.VERSION.SDK_INT >= 26 ? formatUsingDateTimeFormatter(date, locale) : formatUsingSimpleDateFormat(date, locale);
    }
}
