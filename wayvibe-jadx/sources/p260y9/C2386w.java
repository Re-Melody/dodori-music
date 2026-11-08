package p260y9;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: y9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2386w extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f29337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29338b;

    @Override // p260y9.S
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f29337a, this.f29338b);
        m.e(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }

    @Override // p260y9.S
    public final void b(int i10) {
        float[] fArr = this.f29337a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
            m.e(fArrCopyOf, "copyOf(this, newSize)");
            this.f29337a = fArrCopyOf;
        }
    }

    @Override // p260y9.S
    public final int d() {
        return this.f29338b;
    }
}
