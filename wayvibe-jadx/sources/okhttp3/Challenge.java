package okhttp3;

import B2.AbstractC0112b;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class Challenge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f23965b;

    public Challenge(String str, Map map) {
        String lowerCase;
        this.f23964a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale US = Locale.US;
                m.e(US, "US");
                lowerCase = str2.toLowerCase(US);
                m.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        m.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f23965b = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return m.b(challenge.f23964a, this.f23964a) && m.b(challenge.f23965b, this.f23965b);
    }

    public final int hashCode() {
        return this.f23965b.hashCode() + AbstractC0112b.a(899, 31, this.f23964a);
    }

    public final String toString() {
        return this.f23964a + " authParams=" + this.f23965b;
    }
}
