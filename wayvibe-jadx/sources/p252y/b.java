package p252y;

import p143n0.C2096x;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f28694e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f28690a = j10;
        this.f28691b = j11;
        this.f28692c = j12;
        this.f28693d = j13;
        this.f28694e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C2096x.c(this.f28690a, bVar.f28690a) && C2096x.c(this.f28691b, bVar.f28691b) && C2096x.c(this.f28692c, bVar.f28692c) && C2096x.c(this.f28693d, bVar.f28693d) && C2096x.c(this.f28694e, bVar.f28694e);
    }

    public final int hashCode() {
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.f28694e) + p134m1.b.g(this.f28693d, p134m1.b.g(this.f28692c, p134m1.b.g(this.f28691b, Long.hashCode(this.f28690a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        p134m1.b.u(this.f28690a, ", textColor=", sb);
        p134m1.b.u(this.f28691b, ", iconColor=", sb);
        p134m1.b.u(this.f28692c, ", disabledTextColor=", sb);
        p134m1.b.u(this.f28693d, ", disabledIconColor=", sb);
        sb.append((Object) C2096x.i(this.f28694e));
        sb.append(')');
        return sb.toString();
    }
}
