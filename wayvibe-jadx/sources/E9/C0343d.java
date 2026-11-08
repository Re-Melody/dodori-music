package E9;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: E9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0343d implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3372c;

    public /* synthetic */ C0343d(int i10, Object obj, Object obj2) {
        this.f3370a = i10;
        this.f3371b = obj;
        this.f3372c = obj2;
    }

    @Override // E9.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3370a) {
            case 0:
                C0343d c0343d = (C0343d) this.f3372c;
                F9.j jVar = (F9.j) this.f3371b;
                jVar.h();
                try {
                    try {
                        c0343d.close();
                        if (jVar.i()) {
                            throw jVar.k(null);
                        }
                        return;
                    } catch (IOException e2) {
                        if (!jVar.i()) {
                            throw e2;
                        }
                        throw jVar.k(e2);
                    }
                } catch (Throwable th) {
                    jVar.i();
                    throw th;
                }
            default:
                ((OutputStream) this.f3371b).close();
                return;
        }
    }

    @Override // E9.K
    public final O f() {
        switch (this.f3370a) {
            case 0:
                return (F9.j) this.f3371b;
            default:
                return (O) this.f3372c;
        }
    }

    @Override // E9.K, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f3370a) {
            case 0:
                C0343d c0343d = (C0343d) this.f3372c;
                F9.j jVar = (F9.j) this.f3371b;
                jVar.h();
                try {
                    try {
                        c0343d.flush();
                        if (jVar.i()) {
                            throw jVar.k(null);
                        }
                        return;
                    } catch (IOException e2) {
                        if (!jVar.i()) {
                            throw e2;
                        }
                        throw jVar.k(e2);
                    }
                } catch (Throwable th) {
                    jVar.i();
                    throw th;
                }
            default:
                ((OutputStream) this.f3371b).flush();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e A[LOOP:1: B:12:0x0065->B:25:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[SYNTHETIC] */
    @Override // E9.K
    public final void r(long j10, C0348i source) {
        F9.j jVar;
        switch (this.f3370a) {
            case 0:
                kotlin.jvm.internal.m.f(source, "source");
                AbstractC0341b.e(source.f3387b, 0L, j10);
                long j11 = j10;
                while (true) {
                    long j12 = 0;
                    if (j11 <= 0) {
                        return;
                    }
                    H h10 = source.f3386a;
                    kotlin.jvm.internal.m.c(h10);
                    try {
                        try {
                            while (j12 < 65536) {
                                j12 += (long) (h10.f3350c - h10.f3349b);
                                if (j12 >= j11) {
                                    j12 = j11;
                                    C0343d c0343d = (C0343d) this.f3372c;
                                    jVar = (F9.j) this.f3371b;
                                    jVar.h();
                                    c0343d.r(j12, source);
                                    if (!jVar.i()) {
                                        throw jVar.k(null);
                                    }
                                    j11 -= j12;
                                } else {
                                    h10 = h10.f3353f;
                                    kotlin.jvm.internal.m.c(h10);
                                }
                            }
                            c0343d.r(j12, source);
                            if (!jVar.i()) {
                                throw jVar.k(null);
                            }
                            j11 -= j12;
                        } catch (IOException e2) {
                            if (!jVar.i()) {
                                throw e2;
                            }
                            throw jVar.k(e2);
                        }
                    } catch (Throwable th) {
                        jVar.i();
                        throw th;
                    }
                    C0343d c0343d2 = (C0343d) this.f3372c;
                    jVar = (F9.j) this.f3371b;
                    jVar.h();
                }
                break;
            default:
                kotlin.jvm.internal.m.f(source, "source");
                AbstractC0341b.e(source.f3387b, 0L, j10);
                while (j10 > 0) {
                    ((O) this.f3372c).f();
                    H h11 = source.f3386a;
                    kotlin.jvm.internal.m.c(h11);
                    int iMin = (int) Math.min(j10, h11.f3350c - h11.f3349b);
                    ((OutputStream) this.f3371b).write(h11.f3348a, h11.f3349b, iMin);
                    int i10 = h11.f3349b + iMin;
                    h11.f3349b = i10;
                    long j13 = iMin;
                    j10 -= j13;
                    source.f3387b -= j13;
                    if (i10 == h11.f3350c) {
                        source.f3386a = h11.a();
                        I.a(h11);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f3370a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0343d) this.f3372c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f3371b) + ')';
        }
    }
}
