package p260y9;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f29222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29223b;

    @Override // p260y9.S
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f29222a, this.f29223b);
        m.e(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }

    @Override // p260y9.S
    public final void b(int i10) {
        int[] iArr = this.f29222a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            m.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f29222a = iArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29223b;
    }
}
