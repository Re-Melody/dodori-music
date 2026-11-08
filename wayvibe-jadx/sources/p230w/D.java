package p230w;

import p140m7.C2061m;

/* JADX INFO: loaded from: classes.dex */
public interface D extends InterfaceC2280m {
    @Override // p230w.InterfaceC2280m
    default q0 a(o0 o0Var) {
        return new C2061m(this);
    }

    float b(long j10, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    default float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    float e(long j10, float f10, float f11, float f12);
}
