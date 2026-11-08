package D8;

import java.io.Closeable;

/* JADX INFO: renamed from: D8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0299o implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E8.i f2720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U0 f2721b;

    public C0299o(E8.i iVar, U0 u10) {
        this.f2720a = iVar;
        this.f2721b = u10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2720a.close();
    }
}
