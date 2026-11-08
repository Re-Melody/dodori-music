package okhttp3;

import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public interface Interceptor {

    public interface Chain {
    }

    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    Response a(RealInterceptorChain realInterceptorChain);
}
