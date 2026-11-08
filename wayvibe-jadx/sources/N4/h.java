package N4;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p256y4.d implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8607h;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (c(4) != hVar.c(4)) {
            return c(4) ? 1 : -1;
        }
        long j10 = this.f29075f - hVar.f29075f;
        if (j10 == 0) {
            return 0;
        }
        return j10 > 0 ? 1 : -1;
    }
}
