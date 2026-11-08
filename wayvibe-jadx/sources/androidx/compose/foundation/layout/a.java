package androidx.compose.foundation.layout;

import A9.C0102b;
import C.C0144c0;
import C.C0146d0;
import C.U;
import C.Z;
import C.f0;
import C.g0;
import p028c1.k;
import p067g0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static g0 a(float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return new g0(f10, f11, f10, f11);
    }

    public static final g0 b(float f10, float f11, float f12, float f13) {
        return new g0(f10, f11, f12, f13);
    }

    public static g0 c(float f10, float f11, int i10) {
        float f12 = 0;
        float f13 = 0;
        if ((i10 & 4) != 0) {
            f10 = 0;
        }
        if ((i10 & 8) != 0) {
            f11 = 0;
        }
        return new g0(f12, f13, f10, f11);
    }

    public static final r d(r rVar, float f10, boolean z10) {
        return rVar.then(new AspectRatioElement(f10, z10));
    }

    public static final float e(f0 f0Var, k kVar) {
        return kVar == k.Ltr ? f0Var.c(kVar) : f0Var.b(kVar);
    }

    public static final float f(f0 f0Var, k kVar) {
        return kVar == k.Ltr ? f0Var.b(kVar) : f0Var.c(kVar);
    }

    public static final r g(r rVar, U u10) {
        return rVar.then(new IntrinsicHeightElement(u10));
    }

    public static final r h(r rVar, float f10, float f11) {
        return rVar.then(new OffsetElement(f10, f11, new Z(f10, f11, 0)));
    }

    public static final r i(r rVar, f0 f0Var) {
        return rVar.then(new PaddingValuesElement(f0Var, new C0102b(f0Var, 1)));
    }

    public static final r j(r rVar, float f10) {
        return rVar.then(new PaddingElement(f10, f10, f10, f10, new C0146d0(f10)));
    }

    public static final r k(r rVar, float f10, float f11) {
        return rVar.then(new PaddingElement(f10, f11, f10, f11, new Z(f10, f11, 1)));
    }

    public static r l(r rVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return k(rVar, f10, f11);
    }

    public static r m(r rVar, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        float f17 = f13;
        return rVar.then(new PaddingElement(f14, f15, f16, f17, new C0144c0(f14, f15, f16, f17)));
    }

    public static final r n(r rVar, U u10) {
        return rVar.then(new IntrinsicWidthElement(u10));
    }
}
