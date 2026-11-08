package okhttp3;

import E9.InterfaceC0350k;
import E9.r;
import E9.s;
import java.io.Closeable;
import java.io.Flushable;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class Cache implements Closeable, Flushable {

    public static final class CacheResponseBody extends ResponseBody {

        /* JADX INFO: renamed from: okhttp3.Cache$CacheResponseBody$1, reason: invalid class name */
        public final class AnonymousClass1 extends s {
            @Override // E9.s, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }

        @Override // okhttp3.ResponseBody
        public final long c() {
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType e() {
            return null;
        }

        @Override // okhttp3.ResponseBody
        public final InterfaceC0350k g() {
            return null;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Entry {

        public static final class Companion {
            public /* synthetic */ Companion(int i10) {
                this();
            }

            private Companion() {
            }
        }

        static {
            new Companion(0);
            Platform.f24547a.getClass();
            Platform.f24548b.getClass();
            Platform.f24548b.getClass();
        }
    }

    public final class RealCacheRequest implements CacheRequest {

        /* JADX INFO: renamed from: okhttp3.Cache$RealCacheRequest$1, reason: invalid class name */
        public final class AnonymousClass1 extends r {
            @Override // E9.r, E9.K, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }
    }

    static {
        new Companion(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
        throw null;
    }
}
