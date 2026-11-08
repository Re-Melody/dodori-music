package Z3;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V3.b f13617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f13618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f13619c;

    public c(V3.b bVar, b bVar2, b bVar3) {
        this.f13617a = bVar;
        this.f13618b = bVar2;
        this.f13619c = bVar3;
        int i10 = bVar.f12550c;
        int i11 = bVar.f12548a;
        int i12 = i10 - i11;
        int i13 = bVar.f12549b;
        if (i12 == 0 && bVar.f12551d - i13 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i11 != 0 && i13 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.b(this.f13617a, cVar.f13617a) && kotlin.jvm.internal.m.b(this.f13618b, cVar.f13618b) && kotlin.jvm.internal.m.b(this.f13619c, cVar.f13619c);
    }

    public final int hashCode() {
        return this.f13619c.hashCode() + ((this.f13618b.hashCode() + (this.f13617a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f13617a + ", type=" + this.f13618b + ", state=" + this.f13619c + " }";
    }
}
