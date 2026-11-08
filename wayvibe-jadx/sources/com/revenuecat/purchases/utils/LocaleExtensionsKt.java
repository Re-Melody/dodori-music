package com.revenuecat.purchases.utils;

import G1.e;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.jvm.internal.m;
import p097i9.r;

/* JADX INFO: loaded from: classes2.dex */
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        m.f(locale, "<this>");
        String string = locale.toString();
        m.e(string, "toString()");
        return toLocale(string);
    }

    public static final List<Locale> getDefaultLocales() {
        return toList(e.c());
    }

    private static final String inferScript(Locale locale) {
        String country;
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            String script2 = locale.getScript();
            m.e(script2, "script");
            return script2;
        }
        if (m.b(locale.getLanguage(), "zh") && (country = locale.getCountry()) != null) {
            int iHashCode = country.hashCode();
            if (iHashCode != 2155) {
                if (iHashCode != 2307) {
                    if (iHashCode != 2466) {
                        if (iHashCode != 2644) {
                            if (iHashCode == 2691 && country.equals("TW")) {
                                return "Hant";
                            }
                        } else if (country.equals("SG")) {
                            return "Hans";
                        }
                    } else if (country.equals("MO")) {
                        return "Hant";
                    }
                } else if (country.equals("HK")) {
                    return "Hant";
                }
            } else if (country.equals("CN")) {
                return "Hans";
            }
        }
        return "";
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        m.f(locale, "<this>");
        m.f(locale2, "locale");
        try {
            return m.b(locale.getISO3Language(), locale2.getISO3Language()) && m.b(inferScript(locale), inferScript(locale2));
        } catch (MissingResourceException e2) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e2 + "). Falling back to language.", null);
            return m.b(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final List<Locale> toList(e eVar) {
        int iD = eVar.d();
        Locale[] localeArr = new Locale[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            localeArr[i10] = eVar.b(i10);
        }
        return N8.m.s0(localeArr);
    }

    public static final Locale toLocale(String str) {
        m.f(str, "<this>");
        Locale localeForLanguageTag = Locale.forLanguageTag(r.h0(str, "_", "-"));
        m.e(localeForLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return localeForLanguageTag;
    }
}
