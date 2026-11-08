package p119k9;

import A9.A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p9.t;

/* JADX INFO: loaded from: classes2.dex */
public abstract class W implements Runnable, Comparable, Q {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21707b = -1;

    public W(long j10) {
        this.f21706a = j10;
    }

    public final int b(long j10, X x10, Y y6) {
        synchronized (this) {
            if (this._heap == F.f21671b) {
                return 2;
            }
            synchronized (x10) {
                try {
                    W[] wArr = x10.f25343a;
                    W w10 = wArr != null ? wArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y.f21709g;
                    y6.getClass();
                    if (Y.f21711i.get(y6) != 0) {
                        return 1;
                    }
                    if (w10 == null) {
                        x10.f21708c = j10;
                    } else {
                        long j11 = w10.f21706a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - x10.f21708c > 0) {
                            x10.f21708c = j10;
                        }
                    }
                    long j12 = this.f21706a;
                    long j13 = x10.f21708c;
                    if (j12 - j13 < 0) {
                        this.f21706a = j13;
                    }
                    x10.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(X x10) {
        if (this._heap == F.f21671b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = x10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f21706a - ((W) obj).f21706a;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    @Override // p119k9.Q
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                A a10 = F.f21671b;
                if (obj == a10) {
                    return;
                }
                X x10 = obj instanceof X ? (X) obj : null;
                if (x10 != null) {
                    synchronized (x10) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof t ? (t) obj2 : null) != null) {
                            x10.b(this.f21707b);
                        }
                    }
                }
                this._heap = a10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f21706a + ']';
    }
}
