package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f18460b = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean c(long j10, Object obj) {
        switch (this.f18460b) {
            case 0:
                if (n0.f18476g) {
                    if (n0.h(j10, obj) == 0) {
                        return false;
                    }
                } else if (n0.i(j10, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (n0.f18476g) {
                    if (n0.h(j10, obj) == 0) {
                        return false;
                    }
                } else if (n0.i(j10, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final byte d(long j10, Object obj) {
        switch (this.f18460b) {
            case 0:
                return n0.f18476g ? n0.h(j10, obj) : n0.i(j10, obj);
            default:
                return n0.f18476g ? n0.h(j10, obj) : n0.i(j10, obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final double e(long j10, Object obj) {
        switch (this.f18460b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j10, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final float f(long j10, Object obj) {
        switch (this.f18460b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j10, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void k(Object obj, long j10, boolean z10) {
        switch (this.f18460b) {
            case 0:
                if (!n0.f18476g) {
                    n0.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    n0.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!n0.f18476g) {
                    n0.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    n0.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void l(Object obj, long j10, byte b10) {
        switch (this.f18460b) {
            case 0:
                if (!n0.f18476g) {
                    n0.m(obj, j10, b10);
                } else {
                    n0.l(obj, j10, b10);
                }
                break;
            default:
                if (!n0.f18476g) {
                    n0.m(obj, j10, b10);
                } else {
                    n0.l(obj, j10, b10);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void m(Object obj, long j10, double d10) {
        switch (this.f18460b) {
            case 0:
                p(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                p(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void n(Object obj, long j10, float f10) {
        switch (this.f18460b) {
            case 0:
                o(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                o(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean s() {
        switch (this.f18460b) {
        }
        return false;
    }
}
