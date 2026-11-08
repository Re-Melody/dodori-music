package p129l7;

import p170p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f22091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22093e;

    public e(String str, int i10, q qVar, int i11, long j10) {
        this.f22089a = str;
        this.f22090b = i10;
        this.f22091c = qVar;
        this.f22092d = i11;
        this.f22093e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f22090b == eVar.f22090b && this.f22092d == eVar.f22092d && this.f22093e == eVar.f22093e && this.f22089a.equals(eVar.f22089a)) {
            return this.f22091c.equals(eVar.f22091c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f22089a.hashCode() * 31) + this.f22090b) * 31) + this.f22092d) * 31;
        long j10 = this.f22093e;
        return this.f22091c.f25279a.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }
}
