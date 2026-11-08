package okhttp3;

import E9.C0348i;
import E9.C0351l;
import E9.InterfaceC0350k;
import V0.p;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilCommonKt;
import p242x0.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResponseBody$Companion$asResponseBody$1 f24144a;

    public static final class BomAwareReader extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i10, int i11) throws IOException {
            m.f(cbuf, "cbuf");
            throw new IOException("Stream closed");
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [okhttp3.ResponseBody$Companion$asResponseBody$1] */
    static {
        new Companion(0);
        C0351l c0351l = C0351l.f3388d;
        m.f(c0351l, "<this>");
        final C0348i c0348i = new C0348i();
        c0348i.H(c0351l);
        final long length = c0351l.f3389a.length;
        f24144a = new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
            @Override // okhttp3.ResponseBody
            public final long c() {
                return length;
            }

            @Override // okhttp3.ResponseBody
            public final MediaType e() {
                return null;
            }

            @Override // okhttp3.ResponseBody
            public final InterfaceC0350k g() {
                return c0348i;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final byte[] b() throws IllegalAccessException, IOException, InvocationTargetException {
        long jC = c();
        if (jC > 2147483647L) {
            throw new IOException(p.j(jC, "Cannot buffer entire body for content length: "));
        }
        InterfaceC0350k interfaceC0350kG = g();
        byte[] th = null;
        try {
            byte[] bArrK = interfaceC0350kG.k();
            try {
                interfaceC0350kG.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = bArrK;
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC0350kG != null) {
                try {
                    interfaceC0350kG.close();
                } catch (Throwable th4) {
                    c.e(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jC == -1 || jC == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jC + ") and stream length (" + length + ") disagree");
    }

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.a(g());
    }

    public abstract MediaType e();

    public abstract InterfaceC0350k g();
}
