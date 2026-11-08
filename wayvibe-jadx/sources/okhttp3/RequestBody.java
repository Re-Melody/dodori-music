package okhttp3;

import E9.C0351l;
import E9.E;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RequestBody {

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        final C0351l c0351l = C0351l.f3388d;
        m.f(c0351l, "<this>");
        new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
            @Override // okhttp3.RequestBody
            public final long a() {
                return c0351l.k();
            }

            @Override // okhttp3.RequestBody
            public final MediaType b() {
                return null;
            }

            @Override // okhttp3.RequestBody
            public final void d(E e2) {
                e2.o(c0351l);
            }
        };
    }

    public long a() {
        return -1L;
    }

    public abstract MediaType b();

    public boolean c() {
        return this instanceof RequestBody$Companion$toRequestBody$2;
    }

    public abstract void d(E e2);
}
