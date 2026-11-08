package E3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3071b;

    public g(int i10, b bVar) {
        this.f3070a = i10;
        this.f3071b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f3070a, ((g) obj).f3070a);
    }
}
