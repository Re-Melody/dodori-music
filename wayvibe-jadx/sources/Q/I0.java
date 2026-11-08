package Q;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J.f f9907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J.f f9908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J.f f9909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J.f f9910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J.f f9911e;

    public I0() {
        J.f fVar = H0.f9900a;
        J.f fVar2 = H0.f9901b;
        J.f fVar3 = H0.f9902c;
        J.f fVar4 = H0.f9903d;
        J.f fVar5 = H0.f9904e;
        this.f9907a = fVar;
        this.f9908b = fVar2;
        this.f9909c = fVar3;
        this.f9910d = fVar4;
        this.f9911e = fVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i10 = (I0) obj;
        return kotlin.jvm.internal.m.b(this.f9907a, i10.f9907a) && kotlin.jvm.internal.m.b(this.f9908b, i10.f9908b) && kotlin.jvm.internal.m.b(this.f9909c, i10.f9909c) && kotlin.jvm.internal.m.b(this.f9910d, i10.f9910d) && kotlin.jvm.internal.m.b(this.f9911e, i10.f9911e);
    }

    public final int hashCode() {
        return this.f9911e.hashCode() + ((this.f9910d.hashCode() + ((this.f9909c.hashCode() + ((this.f9908b.hashCode() + (this.f9907a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f9907a + ", small=" + this.f9908b + ", medium=" + this.f9909c + ", large=" + this.f9910d + ", extraLarge=" + this.f9911e + ')';
    }
}
