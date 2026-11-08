package okhttp3;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public interface CookieJar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CookieJar f24011a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f24012a = 0;

        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public final void a(HttpUrl url, List list) {
                m.f(url, "url");
            }

            @Override // okhttp3.CookieJar
            public final void b(HttpUrl url) {
                m.f(url, "url");
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i10 = Companion.f24012a;
        f24011a = new Companion.NoCookies();
    }

    void a(HttpUrl httpUrl, List list);

    void b(HttpUrl httpUrl);
}
