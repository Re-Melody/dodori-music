package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f15135b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean c(long j10, Object obj) {
        switch (this.f15135b) {
            case 0:
                return p0.f15147g ? p0.b(j10, obj) : p0.c(j10, obj);
            default:
                return p0.f15147g ? p0.b(j10, obj) : p0.c(j10, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final double d(long j10, Object obj) {
        switch (this.f15135b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final float e(long j10, Object obj) {
        switch (this.f15135b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void j(Object obj, long j10, boolean z10) {
        switch (this.f15135b) {
            case 0:
                if (!p0.f15147g) {
                    p0.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    p0.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!p0.f15147g) {
                    p0.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    p0.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void k(Object obj, long j10, byte b10) {
        switch (this.f15135b) {
            case 0:
                if (!p0.f15147g) {
                    p0.l(obj, j10, b10);
                } else {
                    p0.k(obj, j10, b10);
                }
                break;
            default:
                if (!p0.f15147g) {
                    p0.l(obj, j10, b10);
                } else {
                    p0.k(obj, j10, b10);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void l(Object obj, long j10, double d10) {
        switch (this.f15135b) {
            case 0:
                o(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                o(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void m(Object obj, long j10, float f10) {
        switch (this.f15135b) {
            case 0:
                n(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                n(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean r() {
        switch (this.f15135b) {
        }
        return false;
    }
}
