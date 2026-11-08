package p053e9;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d9.a {
    @Override // d9.d
    public final long l(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // d9.a
    public final Random m() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        m.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
