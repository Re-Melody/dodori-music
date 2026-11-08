package K;

/* JADX INFO: renamed from: K.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0555b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z8.c f6945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z8.c f6946b;

    public C0555b0(Z8.c cVar, Z8.c cVar2, int i10) {
        cVar = (i10 & 1) != 0 ? null : cVar;
        cVar2 = (i10 & 4) != 0 ? null : cVar2;
        this.f6945a = cVar;
        this.f6946b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0555b0)) {
            return false;
        }
        C0555b0 c0555b0 = (C0555b0) obj;
        return this.f6945a == c0555b0.f6945a && this.f6946b == c0555b0.f6946b;
    }

    public final int hashCode() {
        Z8.c cVar = this.f6945a;
        int iHashCode = (cVar != null ? cVar.hashCode() : 0) * 961;
        Z8.c cVar2 = this.f6946b;
        return (iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 29791;
    }
}
