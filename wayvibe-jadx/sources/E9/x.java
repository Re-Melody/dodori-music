package E9;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f3429c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f3430d;

    public x(RandomAccessFile randomAccessFile) {
        this.f3430d = randomAccessFile;
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f3429c;
        reentrantLock.lock();
        try {
            if (this.f3427a) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f3430d.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final C0353n c(long j10) {
        ReentrantLock reentrantLock = this.f3429c;
        reentrantLock.lock();
        try {
            if (this.f3427a) {
                throw new IllegalStateException("closed");
            }
            this.f3428b++;
            reentrantLock.unlock();
            return new C0353n(this, j10);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f3429c;
        reentrantLock.lock();
        try {
            if (this.f3427a) {
                reentrantLock.unlock();
                return;
            }
            this.f3427a = true;
            if (this.f3428b != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f3430d.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
