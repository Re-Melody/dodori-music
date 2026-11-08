package F2;

import B2.AbstractC0111a;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f4185c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4187b;

    static {
        k0 k0Var = new k0(0L, 0L);
        new k0(Long.MAX_VALUE, Long.MAX_VALUE);
        new k0(Long.MAX_VALUE, 0L);
        new k0(0L, Long.MAX_VALUE);
        f4185c = k0Var;
    }

    public k0(long j10, long j11) {
        AbstractC0111a.d(j10 >= 0);
        AbstractC0111a.d(j11 >= 0);
        this.f4186a = j10;
        this.f4187b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d A[RETURN] */
    public final long a(long j10, long j11, long j12) {
        long j13 = this.f4186a;
        long j14 = this.f4187b;
        if (j13 == 0 && j14 == 0) {
            return j10;
        }
        int i10 = B2.C.f560a;
        long j15 = j10 - j13;
        if (((j13 ^ j10) & (j10 ^ j15)) < 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j10 + j14;
        if (((j14 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z10 = false;
        boolean z11 = j15 <= j11 && j11 <= j16;
        if (j15 <= j12 && j12 <= j16) {
            z10 = true;
        }
        if (z11 && z10) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (!z11) {
            if (z10) {
                return j12;
            }
            return j15;
        }
        return j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f4186a == k0Var.f4186a && this.f4187b == k0Var.f4187b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4186a) * 31) + ((int) this.f4187b);
    }
}
