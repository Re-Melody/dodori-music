package p260y9;

import M8.y;
import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f29300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29301b;

    @Override // p260y9.S
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f29300a, this.f29301b);
        m.e(jArrCopyOf, "copyOf(this, newSize)");
        return new y(jArrCopyOf);
    }

    @Override // p260y9.S
    public final void b(int i10) {
        long[] jArr = this.f29300a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            m.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f29300a = jArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29301b;
    }
}
