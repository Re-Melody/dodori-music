package K5;

import android.util.Log;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.E;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7376c;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(f.f16451a);
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f7375b = string;
        this.f7374a = str;
        E.b("tag \"%s\" is longer than the %d character maximum", str.length() <= 23, str, 23);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f7374a, i10)) {
            i10++;
        }
        this.f7376c = i10;
    }

    public final void a(String str, Object... objArr) {
        if (this.f7376c <= 3) {
            Log.d(this.f7374a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f7374a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f7374a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f7375b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f7376c <= 2) {
            Log.v(this.f7374a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f7374a, d(str, objArr));
    }
}
