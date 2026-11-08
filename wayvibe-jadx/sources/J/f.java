package J;

import kotlin.jvm.internal.m;
import p028c1.k;
import p143n0.O;
import p143n0.P;
import p143n0.Q;
import p143n0.c0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f6451d;

    public f(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f6448a = aVar;
        this.f6449b = aVar2;
        this.f6450c = aVar3;
        this.f6451d = aVar4;
    }

    public static f a(f fVar, b bVar, b bVar2, b bVar3, int i10) {
        a aVar = bVar;
        if ((i10 & 1) != 0) {
            aVar = fVar.f6448a;
        }
        a aVar2 = fVar.f6449b;
        a aVar3 = bVar2;
        if ((i10 & 4) != 0) {
            aVar3 = fVar.f6450c;
        }
        fVar.getClass();
        return new f(aVar, aVar2, aVar3, bVar3);
    }

    @Override // p143n0.c0
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Q mo6createOutlinePq9zytI(long j10, k kVar, p028c1.b bVar) {
        float fA = this.f6448a.a(j10, bVar);
        float fA2 = this.f6449b.a(j10, bVar);
        float fA3 = this.f6450c.a(j10, bVar);
        float fA4 = this.f6451d.a(j10, bVar);
        float fC = p133m0.f.c(j10);
        float f10 = fA + fA4;
        if (f10 > fC) {
            float f11 = fC / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fC) {
            float f13 = fC / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new O(Q5.b.c(0L, j10));
        }
        p133m0.d dVarC = Q5.b.c(0L, j10);
        k kVar2 = k.Ltr;
        float f14 = kVar == kVar2 ? fA : fA2;
        long jA = p206t6.b.a(f14, f14);
        if (kVar == kVar2) {
            fA = fA2;
        }
        long jA2 = p206t6.b.a(fA, fA);
        float f15 = kVar == kVar2 ? fA3 : fA4;
        long jA3 = p206t6.b.a(f15, f15);
        if (kVar != kVar2) {
            fA4 = fA3;
        }
        return new P(new p133m0.e(dVarC.f22184a, dVarC.f22185b, dVarC.f22186c, dVarC.f22187d, jA, jA2, jA3, p206t6.b.a(fA4, fA4)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!m.b(this.f6448a, fVar.f6448a)) {
            return false;
        }
        if (!m.b(this.f6449b, fVar.f6449b)) {
            return false;
        }
        if (m.b(this.f6450c, fVar.f6450c)) {
            return m.b(this.f6451d, fVar.f6451d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6451d.hashCode() + ((this.f6450c.hashCode() + ((this.f6449b.hashCode() + (this.f6448a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f6448a + ", topEnd = " + this.f6449b + ", bottomEnd = " + this.f6450c + ", bottomStart = " + this.f6451d + ')';
    }
}
