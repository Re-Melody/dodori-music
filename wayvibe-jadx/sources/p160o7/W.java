package p160o7;

import com.google.protobuf.AbstractC1252l;
import java.util.Objects;
import p140m7.N;
import p170p7.q;
import s7.E;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f23734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f23737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f23738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f23739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC1252l f23740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f23741h;

    public W(N n6, int i10, long j10, A a10, q qVar, q qVar2, AbstractC1252l abstractC1252l, Integer num) {
        n6.getClass();
        this.f23734a = n6;
        this.f23735b = i10;
        this.f23736c = j10;
        this.f23739f = qVar2;
        this.f23737d = a10;
        qVar.getClass();
        this.f23738e = qVar;
        abstractC1252l.getClass();
        this.f23740g = abstractC1252l;
        this.f23741h = num;
    }

    public final W a(AbstractC1252l abstractC1252l, q qVar) {
        return new W(this.f23734a, this.f23735b, this.f23736c, this.f23737d, qVar, this.f23739f, abstractC1252l, null);
    }

    public final W b(long j10) {
        return new W(this.f23734a, this.f23735b, j10, this.f23737d, this.f23738e, this.f23739f, this.f23740g, this.f23741h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W.class == obj.getClass()) {
            W w10 = (W) obj;
            if (this.f23734a.equals(w10.f23734a) && this.f23735b == w10.f23735b && this.f23736c == w10.f23736c && this.f23737d.equals(w10.f23737d) && this.f23738e.equals(w10.f23738e) && this.f23739f.equals(w10.f23739f) && this.f23740g.equals(w10.f23740g) && Objects.equals(this.f23741h, w10.f23741h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f23741h) + ((this.f23740g.hashCode() + ((this.f23739f.f25279a.hashCode() + ((this.f23738e.f25279a.hashCode() + ((this.f23737d.hashCode() + (((((this.f23734a.hashCode() * 31) + this.f23735b) * 31) + ((int) this.f23736c)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TargetData{target=" + this.f23734a + ", targetId=" + this.f23735b + ", sequenceNumber=" + this.f23736c + ", purpose=" + this.f23737d + ", snapshotVersion=" + this.f23738e + ", lastLimboFreeSnapshotVersion=" + this.f23739f + ", resumeToken=" + this.f23740g + ", expectedCount=" + this.f23741h + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public W(N n6, int i10, long j10, A a10) {
        q qVar = q.f25278b;
        this(n6, i10, j10, a10, qVar, qVar, E.f26160t, null);
    }
}
