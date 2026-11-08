package d9;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends d {
    @Override // d9.d
    public final int e(int i10) {
        return ((-i10) >> 31) & (m().nextInt() >>> (32 - i10));
    }

    @Override // d9.d
    public final int f() {
        return m().nextInt();
    }

    @Override // d9.d
    public final int g(int i10) {
        return m().nextInt(i10);
    }

    @Override // d9.d
    public final long k() {
        return m().nextLong();
    }

    public abstract Random m();
}
