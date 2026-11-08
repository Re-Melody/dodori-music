package J2;

import B2.AbstractC0111a;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6517d;

    public j(String str, long j10, long j11) {
        this.f6516c = str == null ? "" : str;
        this.f6514a = j10;
        this.f6515b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String strU = AbstractC0111a.u(str, this.f6516c);
        if (jVar == null || !strU.equals(AbstractC0111a.u(str, jVar.f6516c))) {
            return null;
        }
        long j10 = this.f6515b;
        long j11 = jVar.f6515b;
        if (j10 != -1) {
            long j12 = this.f6514a;
            jVar2 = null;
            if (j12 + j10 == jVar.f6514a) {
                return new j(strU, j12, j11 != -1 ? j10 + j11 : -1L);
            }
        } else {
            jVar2 = null;
        }
        if (j11 == -1) {
            return jVar2;
        }
        long j13 = jVar.f6514a;
        if (j13 + j11 == this.f6514a) {
            return new j(strU, j13, j10 != -1 ? j11 + j10 : -1L);
        }
        return jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f6514a == jVar.f6514a && this.f6515b == jVar.f6515b && this.f6516c.equals(jVar.f6516c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6517d == 0) {
            this.f6517d = this.f6516c.hashCode() + ((((527 + ((int) this.f6514a)) * 31) + ((int) this.f6515b)) * 31);
        }
        return this.f6517d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f6516c);
        sb.append(", start=");
        sb.append(this.f6514a);
        sb.append(", length=");
        return V0.p.k(this.f6515b, ")", sb);
    }
}
