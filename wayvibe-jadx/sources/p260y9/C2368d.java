package p260y9;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: y9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2368d extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f29274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29275b;

    @Override // p260y9.S
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f29274a, this.f29275b);
        m.e(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }

    @Override // p260y9.S
    public final void b(int i10) {
        boolean[] zArr = this.f29274a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
            m.e(zArrCopyOf, "copyOf(this, newSize)");
            this.f29274a = zArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29275b;
    }
}
