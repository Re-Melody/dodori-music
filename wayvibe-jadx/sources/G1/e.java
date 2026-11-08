package G1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f5347b = e(new LocaleList(new Locale[0]));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5348a;

    public e(f fVar) {
        this.f5348a = fVar;
    }

    public static e a(String str) {
        if (str == null || str.isEmpty()) {
            return f5347b;
        }
        String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f16451a, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArrSplit[i10];
            int i11 = d.f5346a;
            localeArr[i10] = Locale.forLanguageTag(str2);
        }
        return e(new LocaleList(localeArr));
    }

    public static e c() {
        return e(LocaleList.getDefault());
    }

    public static e e(LocaleList localeList) {
        return new e(new f(localeList));
    }

    public final Locale b(int i10) {
        return this.f5348a.f5349a.get(i10);
    }

    public final int d() {
        return this.f5348a.f5349a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f5348a.equals(((e) obj).f5348a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5348a.f5349a.hashCode();
    }

    public final String toString() {
        return this.f5348a.f5349a.toString();
    }
}
