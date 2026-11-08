package O;

import p143n0.C2096x;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8740b;

    public X(long j10, long j11) {
        this.f8739a = j10;
        this.f8740b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return C2096x.c(this.f8739a, x10.f8739a) && C2096x.c(this.f8740b, x10.f8740b);
    }

    public final int hashCode() {
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.f8740b) + (Long.hashCode(this.f8739a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        p134m1.b.u(this.f8739a, ", selectionBackgroundColor=", sb);
        sb.append((Object) C2096x.i(this.f8740b));
        sb.append(')');
        return sb.toString();
    }
}
