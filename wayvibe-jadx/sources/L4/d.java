package L4;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class d extends V4.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7781g;

    @Override // V4.g
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void mo7a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f7781g;
        long[] jArr = this.f12575e;
        if (jArr[i10] > jElapsedRealtime) {
            for (int i11 = this.f12572b - 1; i11 >= 0; i11--) {
                if (jArr[i11] <= jElapsedRealtime) {
                    this.f7781g = i11;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // V4.g
    public final int b() {
        return 0;
    }

    @Override // V4.g
    public final Object c() {
        return null;
    }

    @Override // V4.g
    public final int a() {
        return this.f7781g;
    }
}
