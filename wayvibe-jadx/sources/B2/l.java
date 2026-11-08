package B2;

import A9.C0108h;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0108h f597b = new C0108h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f599d;

    public l(Object obj) {
        this.f596a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f596a.equals(((l) obj).f596a);
    }

    public final int hashCode() {
        return this.f596a.hashCode();
    }
}
