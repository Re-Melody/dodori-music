package O0;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f8968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f8969b;

    public x(w wVar, v vVar) {
        this.f8968a = wVar;
        this.f8969b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.m.b(this.f8969b, xVar.f8969b) && kotlin.jvm.internal.m.b(this.f8968a, xVar.f8968a);
    }

    public final int hashCode() {
        w wVar = this.f8968a;
        int iHashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        v vVar = this.f8969b;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f8968a + ", paragraphSyle=" + this.f8969b + ')';
    }
}
