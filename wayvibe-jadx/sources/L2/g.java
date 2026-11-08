package L2;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends U2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7504g;

    @Override // U2.c
    public final int f() {
        return this.f7504g;
    }

    @Override // U2.c
    public final Object g() {
        return null;
    }

    @Override // U2.c
    public final int h() {
        return 0;
    }

    @Override // U2.c
    public final void m(long j10, long j11, List list, S2.k[] kVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(this.f7504g, jElapsedRealtime)) {
            for (int i10 = this.f12079b - 1; i10 >= 0; i10--) {
                if (!k(i10, jElapsedRealtime)) {
                    this.f7504g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
