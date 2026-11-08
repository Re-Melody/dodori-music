package p260y9;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: y9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2371g extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f29286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29287b;

    @Override // p260y9.S
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f29286a, this.f29287b);
        m.e(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @Override // p260y9.S
    public final void b(int i10) {
        byte[] bArr = this.f29286a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            m.e(bArrCopyOf, "copyOf(this, newSize)");
            this.f29286a = bArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29287b;
    }
}
