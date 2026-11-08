package p255y2;

import B2.AbstractC0111a;
import B2.C;
import C3.e;

/* JADX INFO: renamed from: y2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2334j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28888b;

    static {
        e eVar = new e(7);
        AbstractC0111a.d(eVar.f1189b <= eVar.f1190c);
        new C2334j(eVar);
        C.D(0);
        C.D(1);
        C.D(2);
        C.D(3);
    }

    public C2334j(e eVar) {
        eVar.getClass();
        this.f28887a = eVar.f1189b;
        this.f28888b = eVar.f1190c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2334j)) {
            return false;
        }
        C2334j c2334j = (C2334j) obj;
        c2334j.getClass();
        if (this.f28887a != c2334j.f28887a || this.f28888b != c2334j.f28888b) {
            return false;
        }
        int i10 = C.f560a;
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f28887a) * 31) + this.f28888b) * 31;
    }
}
