package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.Flushable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import okhttp3.internal.concurrent.Lockable;

/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable, Lockable {

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public final class Editor {
    }

    public final class Entry {
    }

    public final class Snapshot implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    static {
        new Companion(0);
        m.e(Pattern.compile("[a-z0-9_-]{1,120}"), "compile(...)");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
    }
}
