package p260y9;

import M8.w;
import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f29291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29292b;

    @Override // p260y9.S
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f29291a, this.f29292b);
        m.e(iArrCopyOf, "copyOf(this, newSize)");
        return new w(iArrCopyOf);
    }

    @Override // p260y9.S
    public final void b(int i10) {
        int[] iArr = this.f29291a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f29291a = iArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29292b;
    }
}
