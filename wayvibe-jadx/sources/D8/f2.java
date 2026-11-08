package D8;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f2633d;

    public f2(float f10, float f11) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f2633d = atomicInteger;
        this.f2632c = (int) (f11 * 1000.0f);
        int i10 = (int) (f10 * 1000.0f);
        this.f2630a = i10;
        this.f2631b = i10 / 2;
        atomicInteger.set(i10);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = this.f2633d;
            i10 = atomicInteger.get();
            if (i10 == 0) {
                return false;
            }
            i11 = i10 - 1000;
        } while (!atomicInteger.compareAndSet(i10, Math.max(i11, 0)));
        return i11 > this.f2631b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return this.f2630a == f2Var.f2630a && this.f2632c == f2Var.f2632c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2630a), Integer.valueOf(this.f2632c)});
    }
}
