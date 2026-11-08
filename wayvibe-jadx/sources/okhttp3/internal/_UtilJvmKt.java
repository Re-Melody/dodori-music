package okhttp3.internal;

import B2.AbstractC0112b;
import E9.C0348i;
import E9.M;
import N8.s;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;
import org.apache.tika.metadata.HttpHeaders;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class _UtilJvmKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f24160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24161b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        m.c(timeZone);
        f24160a = timeZone;
        String strE0 = k.E0(OkHttpClient.class.getName(), "okhttp3.");
        if (k.q0(strE0, "Client")) {
            strE0 = strE0.substring(0, strE0.length() - 6);
            m.e(strE0, "substring(...)");
        }
        f24161b = strE0;
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl other) {
        m.f(httpUrl, "<this>");
        m.f(other, "other");
        return m.b(httpUrl.f24037d, other.f24037d) && httpUrl.f24038e == other.f24038e && m.b(httpUrl.f24034a, other.f24034a);
    }

    public static final void b(Socket socket) {
        m.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e4) {
            if (!m.b(e4.getMessage(), "bio == null")) {
                throw e4;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean c(M m8) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m.f(timeUnit, "timeUnit");
        try {
            return f(m8, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String d(String format, Object... objArr) {
        m.f(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(Response response) {
        String strA = response.f24119f.a(HttpHeaders.CONTENT_LENGTH);
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = _UtilCommonKt.f24159a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final boolean f(M m8, int i10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = m8.f().e() ? m8.f().c() - jNanoTime : Long.MAX_VALUE;
        m8.f().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C0348i c0348i = new C0348i();
            while (m8.d(8192L, c0348i) != -1) {
                c0348i.b();
            }
            if (jC == Long.MAX_VALUE) {
                m8.f().a();
                return true;
            }
            m8.f().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                m8.f().a();
                return false;
            }
            m8.f().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                m8.f().a();
            } else {
                m8.f().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final Headers g(List list) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            _HeadersCommonKt.a(builder, header.f24390a.A(), header.f24391b.A());
        }
        return builder.b();
    }

    public static final String h(HttpUrl httpUrl, boolean z10) {
        m.f(httpUrl, "<this>");
        String strC = httpUrl.f24037d;
        if (k.n0(strC, ":")) {
            strC = AbstractC0112b.c(']', "[", strC);
        }
        int i10 = httpUrl.f24038e;
        if (!z10) {
            HttpUrl.f24033i.getClass();
            if (i10 == HttpUrl.Companion.b(httpUrl.f24034a)) {
                return strC;
            }
        }
        return strC + ':' + i10;
    }

    public static final List i(List list) {
        m.f(list, "<this>");
        if (list.isEmpty()) {
            return s.f8650a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            m.e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        m.e(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(N8.m.e0(array));
        m.e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final List j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return s.f8650a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            m.e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(N8.m.e0((Object[]) objArr.clone()));
        m.e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
