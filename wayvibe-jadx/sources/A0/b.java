package A0;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f89b = new long[32];

    public void a(long j10) {
        int i10 = this.f88a;
        long[] jArr = this.f89b;
        if (i10 == jArr.length) {
            this.f89b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f89b;
        int i11 = this.f88a;
        this.f88a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long j10) {
        if (c(j10)) {
            return;
        }
        int i10 = this.f88a;
        long[] jArr = this.f89b;
        if (i10 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10 + 1, jArr.length * 2));
            m.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f89b = jArrCopyOf;
        }
        this.f89b[i10] = j10;
        if (i10 >= this.f88a) {
            this.f88a = i10 + 1;
        }
    }

    public boolean c(long j10) {
        int i10 = this.f88a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f89b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public long d(int i10) {
        if (i10 >= 0 && i10 < this.f88a) {
            return this.f89b[i10];
        }
        StringBuilder sbP = p134m1.b.p(i10, "Invalid index ", ", size is ");
        sbP.append(this.f88a);
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public void e(int i10) {
        int i11 = this.f88a;
        if (i10 < i11) {
            int i12 = i11 - 1;
            while (i10 < i12) {
                long[] jArr = this.f89b;
                int i13 = i10 + 1;
                jArr[i10] = jArr[i13];
                i10 = i13;
            }
            this.f88a--;
        }
    }
}
