package p098j;

import G1.e;
import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static e b(Configuration configuration) {
        return e.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(e eVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f5348a.f5349a.toLanguageTags()));
    }

    public static void d(Configuration configuration, e eVar) {
        configuration.setLocales(LocaleList.forLanguageTags(eVar.f5348a.f5349a.toLanguageTags()));
    }
}
