package p005a1;

import p143n0.AbstractC2091s;
import p143n0.C2096x;

/* JADX INFO: loaded from: classes.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14084a;

    public c(long j10) {
        this.f14084a = j10;
        if (j10 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // p005a1.n
    public final float a() {
        return C2096x.d(this.f14084a);
    }

    @Override // p005a1.n
    public final long b() {
        return this.f14084a;
    }

    @Override // p005a1.n
    public final AbstractC2091s c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C2096x.c(this.f14084a, ((c) obj).f14084a);
    }

    public final int hashCode() {
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.f14084a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C2096x.i(this.f14084a)) + ')';
    }
}
