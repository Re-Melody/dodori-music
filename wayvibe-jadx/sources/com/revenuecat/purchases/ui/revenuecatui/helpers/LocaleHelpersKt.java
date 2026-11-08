package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.content.res.Configuration;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class LocaleHelpersKt {
    public static final Locale createLocaleFromString(String localeString) {
        m.f(localeString, "localeString");
        if (!k.m0(localeString, '-') && !k.m0(localeString, '_')) {
            return new Locale(localeString);
        }
        List listI0 = k.m0(localeString, '-') ? k.I0(localeString, new char[]{'-'}, 2) : k.I0(localeString, new char[]{'_'}, 2);
        return listI0.size() >= 2 ? new Locale((String) listI0.get(0), (String) listI0.get(1)) : new Locale((String) listI0.get(0));
    }

    public static final p028c1.k toLayoutDirection(Locale locale) {
        m.f(locale, "<this>");
        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        return configuration.getLayoutDirection() == 1 ? p028c1.k.Rtl : p028c1.k.Ltr;
    }
}
