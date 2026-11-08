package p255y2;

import B2.C;
import J2.t;

/* JADX INFO: renamed from: y2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2342s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28974e;

    static {
        new t().a();
        C.D(0);
        C.D(1);
        C.D(2);
        C.D(3);
        C.D(4);
    }

    public C2342s(t tVar) {
        long j10 = tVar.f6542a;
        long j11 = tVar.f6543b;
        long j12 = tVar.f6544c;
        float f10 = tVar.f6545d;
        float f11 = tVar.f6546e;
        this.f28970a = j10;
        this.f28971b = j11;
        this.f28972c = j12;
        this.f28973d = f10;
        this.f28974e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2342s)) {
            return false;
        }
        C2342s c2342s = (C2342s) obj;
        return this.f28970a == c2342s.f28970a && this.f28971b == c2342s.f28971b && this.f28972c == c2342s.f28972c && this.f28973d == c2342s.f28973d && this.f28974e == c2342s.f28974e;
    }

    public final int hashCode() {
        long j10 = this.f28970a;
        long j11 = this.f28971b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f28972c;
        int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f28973d;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f28974e;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
