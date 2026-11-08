package okhttp3;

import M8.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import p013a9.a;
import p046da.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Headers implements Iterable<l>, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f24029b = new Companion(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Headers f24030c = new Headers(new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f24031a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f24032a = new ArrayList(20);

        public final void a(String str, String value) {
            m.f(value, "value");
            _HeadersCommonKt.b(str);
            _HeadersCommonKt.c(value, str);
            _HeadersCommonKt.a(this, str, value);
        }

        public final Headers b() {
            return new Headers((String[]) this.f24032a.toArray(new String[0]));
        }

        public final void c(String name) {
            m.f(name, "name");
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f24032a;
                if (i10 >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i10))) {
                    arrayList.remove(i10);
                    arrayList.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public Headers(String[] namesAndValues) {
        m.f(namesAndValues, "namesAndValues");
        this.f24031a = namesAndValues;
    }

    public final String a(String str) {
        String[] namesAndValues = this.f24031a;
        m.f(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int iE = b.E(length, 0, -2);
        if (iE > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(namesAndValues[length])) {
            if (length == iE) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public final String c(int i10) {
        String str = (String) N8.m.u0(i10 * 2, this.f24031a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    public final Builder d() {
        Builder builder = new Builder();
        ArrayList arrayList = builder.f24032a;
        m.f(arrayList, "<this>");
        String[] elements = this.f24031a;
        m.f(elements, "elements");
        arrayList.addAll(N8.m.e0(elements));
        return builder;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.f24031a, ((Headers) obj).f24031a);
        }
        return false;
    }

    public final String h(int i10) {
        String str = (String) N8.m.u0((i10 * 2) + 1, this.f24031a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24031a);
    }

    @Override // java.lang.Iterable
    public final Iterator<l> iterator() {
        int size = size();
        l[] lVarArr = new l[size];
        for (int i10 = 0; i10 < size; i10++) {
            lVarArr[i10] = new l(c(i10), h(i10));
        }
        return m.i(lVarArr);
    }

    public final int size() {
        return this.f24031a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strC = c(i10);
            String strH = h(i10);
            sb.append(strC);
            sb.append(": ");
            if (_UtilCommonKt.i(strC)) {
                strH = "██";
            }
            sb.append(strH);
            sb.append("\n");
        }
        return sb.toString();
    }
}
