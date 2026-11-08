package okhttp3.internal.cache;

import E9.C0348i;
import E9.r;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public class FaultHidingSink extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24172b;

    @Override // E9.r, E9.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException unused) {
            this.f24172b = true;
            throw null;
        }
    }

    @Override // E9.r, E9.K, java.io.Flushable
    public final void flush() {
        if (this.f24172b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f24172b = true;
            throw null;
        }
    }

    @Override // E9.r, E9.K
    public final void r(long j10, C0348i source) throws EOFException {
        m.f(source, "source");
        if (this.f24172b) {
            source.skip(j10);
            return;
        }
        try {
            super.r(j10, source);
        } catch (IOException unused) {
            this.f24172b = true;
            throw null;
        }
    }
}
