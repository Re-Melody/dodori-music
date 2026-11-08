package p170p7;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f25269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f25270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f25271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f25272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f25273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f25274f;

    public n(h hVar) {
        this.f25269a = hVar;
        this.f25272d = q.f25278b;
    }

    public static n g(h hVar) {
        m mVar = m.INVALID;
        q qVar = q.f25278b;
        return new n(hVar, mVar, qVar, qVar, new o(), l.SYNCED);
    }

    public static n h(h hVar, q qVar) {
        n nVar = new n(hVar);
        nVar.b(qVar);
        return nVar;
    }

    public final void a(q qVar, o oVar) {
        this.f25271c = qVar;
        this.f25270b = m.FOUND_DOCUMENT;
        this.f25273e = oVar;
        this.f25274f = l.SYNCED;
    }

    public final void b(q qVar) {
        this.f25271c = qVar;
        this.f25270b = m.NO_DOCUMENT;
        this.f25273e = new o();
        this.f25274f = l.SYNCED;
    }

    public final boolean c() {
        return this.f25274f.equals(l.HAS_LOCAL_MUTATIONS);
    }

    public final boolean d() {
        return this.f25270b.equals(m.FOUND_DOCUMENT);
    }

    public final boolean e() {
        return this.f25270b.equals(m.NO_DOCUMENT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f25269a.equals(nVar.f25269a) && this.f25271c.equals(nVar.f25271c) && this.f25270b.equals(nVar.f25270b) && this.f25274f.equals(nVar.f25274f)) {
            return this.f25273e.equals(nVar.f25273e);
        }
        return false;
    }

    public final n f() {
        return new n(this.f25269a, this.f25270b, this.f25271c, this.f25272d, new o(this.f25273e.b()), this.f25274f);
    }

    public final int hashCode() {
        return this.f25269a.f25264a.hashCode();
    }

    public final String toString() {
        return "Document{key=" + this.f25269a + ", version=" + this.f25271c + ", readTime=" + this.f25272d + ", type=" + this.f25270b + ", documentState=" + this.f25274f + ", value=" + this.f25273e + '}';
    }

    public n(h hVar, m mVar, q qVar, q qVar2, o oVar, l lVar) {
        this.f25269a = hVar;
        this.f25271c = qVar;
        this.f25272d = qVar2;
        this.f25270b = mVar;
        this.f25274f = lVar;
        this.f25273e = oVar;
    }
}
