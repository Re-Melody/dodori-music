package W0;

import android.util.Log;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f12770a;

    public a(Locale locale) {
        this.f12770a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m.b(this.f12770a.toLanguageTag(), ((a) obj).f12770a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f12770a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f12770a.toLanguageTag();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str) {
        c.f12774a.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (m.b(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        this(localeForLanguageTag);
    }
}
