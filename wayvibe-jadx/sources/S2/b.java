package S2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11021c;

    public b(long j10, long j11) {
        this.f11019a = j10;
        this.f11020b = j11;
        this.f11021c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f11021c;
        if (j10 < this.f11019a || j10 > this.f11020b) {
            throw new NoSuchElementException();
        }
    }

    @Override // S2.k
    public final boolean next() {
        long j10 = this.f11021c + 1;
        this.f11021c = j10;
        return !(j10 > this.f11020b);
    }
}
