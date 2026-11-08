package p023b7;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15792b;

    public h(q qVar, boolean z10) {
        this.f15791a = qVar;
        this.f15792b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f15791a.equals(this.f15791a) && hVar.f15792b == this.f15792b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15791a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f15792b).hashCode();
    }
}
