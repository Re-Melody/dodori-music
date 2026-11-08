package E9;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: E9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0353n implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f3395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3397c;

    public C0353n(x fileHandle, long j10) {
        kotlin.jvm.internal.m.f(fileHandle, "fileHandle");
        this.f3395a = fileHandle;
        this.f3396b = j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3397c) {
            return;
        }
        this.f3397c = true;
        x xVar = this.f3395a;
        ReentrantLock reentrantLock = xVar.f3429c;
        reentrantLock.lock();
        try {
            int i10 = xVar.f3428b - 1;
            xVar.f3428b = i10;
            if (i10 == 0 && xVar.f3427a) {
                reentrantLock.unlock();
                synchronized (xVar) {
                    xVar.f3430d.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // E9.M
    public final long d(long j10, C0348i sink) {
        long j11;
        long j12;
        int i10;
        kotlin.jvm.internal.m.f(sink, "sink");
        if (this.f3397c) {
            throw new IllegalStateException("closed");
        }
        x xVar = this.f3395a;
        long j13 = this.f3396b;
        xVar.getClass();
        if (j10 < 0) {
            throw new IllegalArgumentException(V0.p.j(j10, "byteCount < 0: ").toString());
        }
        long j14 = j10 + j13;
        long j15 = j13;
        while (true) {
            if (j15 < j14) {
                H hG = sink.G(1);
                byte[] array = hG.f3348a;
                int i11 = hG.f3350c;
                j11 = -1;
                int iMin = (int) Math.min(j14 - j15, 8192 - i11);
                synchronized (xVar) {
                    kotlin.jvm.internal.m.f(array, "array");
                    xVar.f3430d.seek(j15);
                    i10 = 0;
                    while (true) {
                        if (i10 < iMin) {
                            int i12 = xVar.f3430d.read(array, i11, iMin - i10);
                            if (i12 != -1) {
                                i10 += i12;
                            } else if (i10 == 0) {
                                i10 = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i10 == -1) {
                    if (hG.f3349b == hG.f3350c) {
                        sink.f3386a = hG.a();
                        I.a(hG);
                    }
                    if (j13 == j15) {
                        j12 = -1;
                        break;
                    }
                } else {
                    hG.f3350c += i10;
                    long j16 = i10;
                    j15 += j16;
                    sink.f3387b += j16;
                }
            } else {
                j11 = -1;
            }
            j12 = j15 - j13;
            break;
        }
        if (j12 != j11) {
            this.f3396b += j12;
        }
        return j12;
    }

    @Override // E9.M
    public final O f() {
        return O.f3360d;
    }
}
