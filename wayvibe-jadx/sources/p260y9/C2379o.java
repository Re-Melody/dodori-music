package p260y9;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: y9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2379o extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f29311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29312b;

    @Override // p260y9.S
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f29311a, this.f29312b);
        m.e(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }

    @Override // p260y9.S
    public final void b(int i10) {
        double[] dArr = this.f29311a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
            m.e(dArrCopyOf, "copyOf(this, newSize)");
            this.f29311a = dArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29312b;
    }
}
