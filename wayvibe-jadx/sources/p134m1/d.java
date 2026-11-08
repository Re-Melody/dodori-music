package p134m1;

import V0.p;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f22198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22199b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22200c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f22201d;

    public d(char[] cArr) {
        this.f22198a = cArr;
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String c() {
        String str = new String(this.f22198a);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.f22200c;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f22199b;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f22199b;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public float d() {
        if (this instanceof f) {
            return ((f) this).d();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f22199b == dVar.f22199b && this.f22200c == dVar.f22200c && Arrays.equals(this.f22198a, dVar.f22198a)) {
            return Objects.equals(this.f22201d, dVar.f22201d);
        }
        return false;
    }

    public int f() {
        if (this instanceof f) {
            return ((f) this).f();
        }
        return 0;
    }

    public final String h() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f22198a) * 31;
        long j10 = this.f22199b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f22200c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        c cVar = this.f22201d;
        return (i11 + (cVar != null ? cVar.hashCode() : 0)) * 31;
    }

    public final void i(long j10) {
        if (this.f22200c != Long.MAX_VALUE) {
            return;
        }
        this.f22200c = j10;
        c cVar = this.f22201d;
        if (cVar != null) {
            cVar.j(this);
        }
    }

    public String toString() {
        long j10 = this.f22199b;
        long j11 = this.f22200c;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.f22199b);
            sb.append("-");
            return p.k(this.f22200c, ")", sb);
        }
        return h() + " (" + this.f22199b + " : " + this.f22200c + ") <<" + new String(this.f22198a).substring((int) this.f22199b, ((int) this.f22200c) + 1) + ">>";
    }
}
