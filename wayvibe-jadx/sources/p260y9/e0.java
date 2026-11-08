package p260y9;

import M8.u;
import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f29281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29282b;

    @Override // p260y9.S
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f29281a, this.f29282b);
        m.e(bArrCopyOf, "copyOf(this, newSize)");
        return new u(bArrCopyOf);
    }

    @Override // p260y9.S
    public final void b(int i10) {
        byte[] bArr = this.f29281a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            m.e(bArrCopyOf, "copyOf(this, newSize)");
            this.f29281a = bArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29282b;
    }
}
