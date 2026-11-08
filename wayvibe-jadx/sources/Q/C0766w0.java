package Q;

import p143n0.C2096x;

/* JADX INFO: renamed from: Q.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0766w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10523a = C2096x.f22802m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0766w0) {
            return C2096x.c(this.f10523a, ((C0766w0) obj).f10523a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.f10523a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C2096x.i(this.f10523a)) + ", rippleAlpha=null)";
    }
}
