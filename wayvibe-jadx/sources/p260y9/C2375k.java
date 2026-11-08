package p260y9;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: y9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2375k extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f29298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29299b;

    @Override // p260y9.S
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f29298a, this.f29299b);
        m.e(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }

    @Override // p260y9.S
    public final void b(int i10) {
        char[] cArr = this.f29298a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            m.e(cArrCopyOf, "copyOf(this, newSize)");
            this.f29298a = cArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29299b;
    }
}
