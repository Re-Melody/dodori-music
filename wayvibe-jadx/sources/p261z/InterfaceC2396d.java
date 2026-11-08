package p261z;

import p230w.InterfaceC2280m;

/* JADX INFO: renamed from: z.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2396d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2394c f29565a = C2394c.f29551a;

    default float a(float f10, float f11, float f12) {
        f29565a.getClass();
        float f13 = f11 + f10;
        if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
            return 0.0f;
        }
        float f14 = f13 - f12;
        return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
    }

    default InterfaceC2280m b() {
        f29565a.getClass();
        return C2394c.f29552b;
    }
}
