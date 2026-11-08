package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends X0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f18706b = i10;
    }

    @Override // com.google.protobuf.X0
    public final void c(long j10, byte[] bArr, long j11, long j12) {
        switch (this.f18706b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.X0
    public final boolean d(long j10, Object obj) {
        switch (this.f18706b) {
            case 0:
                if (Y0.f18725h) {
                    if (Y0.h(j10, obj) == 0) {
                        return false;
                    }
                } else if (Y0.i(j10, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (Y0.f18725h) {
                    if (Y0.h(j10, obj) == 0) {
                        return false;
                    }
                } else if (Y0.i(j10, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.X0
    public final byte e(long j10) {
        switch (this.f18706b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.X0
    public final byte f(long j10, Object obj) {
        switch (this.f18706b) {
            case 0:
                return Y0.f18725h ? Y0.h(j10, obj) : Y0.i(j10, obj);
            default:
                return Y0.f18725h ? Y0.h(j10, obj) : Y0.i(j10, obj);
        }
    }

    @Override // com.google.protobuf.X0
    public final double g(long j10, Object obj) {
        switch (this.f18706b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(j(j10, obj));
    }

    @Override // com.google.protobuf.X0
    public final float h(long j10, Object obj) {
        switch (this.f18706b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(i(j10, obj));
    }

    @Override // com.google.protobuf.X0
    public final void m(Object obj, long j10, boolean z10) {
        switch (this.f18706b) {
            case 0:
                if (!Y0.f18725h) {
                    Y0.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    Y0.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!Y0.f18725h) {
                    Y0.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    Y0.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.X0
    public final void n(Object obj, long j10, byte b10) {
        switch (this.f18706b) {
            case 0:
                if (!Y0.f18725h) {
                    Y0.m(obj, j10, b10);
                } else {
                    Y0.l(obj, j10, b10);
                }
                break;
            default:
                if (!Y0.f18725h) {
                    Y0.m(obj, j10, b10);
                } else {
                    Y0.l(obj, j10, b10);
                }
                break;
        }
    }

    @Override // com.google.protobuf.X0
    public final void o(Object obj, long j10, double d10) {
        switch (this.f18706b) {
            case 0:
                r(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                r(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.protobuf.X0
    public final void p(Object obj, long j10, float f10) {
        switch (this.f18706b) {
            case 0:
                q(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                q(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.protobuf.X0
    public final boolean u() {
        switch (this.f18706b) {
        }
        return false;
    }
}
