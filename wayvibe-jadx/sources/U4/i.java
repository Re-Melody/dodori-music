package U4;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f12216b;

    public i(int i10, d dVar) {
        this.f12215a = i10;
        this.f12216b = dVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12215a - ((i) obj).f12215a;
    }
}
