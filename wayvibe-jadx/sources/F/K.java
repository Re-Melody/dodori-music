package F;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.n f3465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f3466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.support.v4.media.session.t f3467c;

    /* JADX WARN: Multi-variable type inference failed */
    public K(Z8.c cVar) {
        this.f3465a = (kotlin.jvm.internal.n) cVar;
        Z z10 = new Z();
        int i10 = p199t.D.f26263a;
        z10.f3514c = new p199t.x(6);
        z10.f3515d = new p199t.x(6);
        this.f3466b = z10;
    }

    public final J a(int i10, long j10) {
        android.support.v4.media.session.t tVar = this.f3467c;
        if (tVar == null) {
            return C0362g.f3532a;
        }
        Y y6 = new Y(tVar, i10, j10, this.f3466b);
        RunnableC0357b runnableC0357b = (RunnableC0357b) tVar.f14413d;
        runnableC0357b.f3520b.b(y6);
        if (!runnableC0357b.f3521c) {
            runnableC0357b.f3521c = true;
            runnableC0357b.f3519a.post(runnableC0357b);
        }
        return y6;
    }
}
