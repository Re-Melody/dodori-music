package p262z0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends CancellationException {
    public k(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(p.f29765c);
        return this;
    }
}
