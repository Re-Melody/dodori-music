package p260y9;

import M8.B;
import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f29309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29310b;

    @Override // p260y9.S
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f29309a, this.f29310b);
        m.e(sArrCopyOf, "copyOf(this, newSize)");
        return new B(sArrCopyOf);
    }

    @Override // p260y9.S
    public final void b(int i10) {
        short[] sArr = this.f29309a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            m.e(sArrCopyOf, "copyOf(this, newSize)");
            this.f29309a = sArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29310b;
    }
}
