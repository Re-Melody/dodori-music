package B2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p224v4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f582a;

    public /* synthetic */ d(boolean z10) {
        this.f582a = z10;
    }

    @Override // p224v4.k
    public boolean a(p195s4.g gVar) {
        return this.f582a;
    }

    @Override // p224v4.k
    public boolean b() {
        return this.f582a;
    }

    public synchronized void c() {
        this.f582a = false;
    }

    public synchronized boolean d() {
        if (this.f582a) {
            return false;
        }
        this.f582a = true;
        notifyAll();
        return true;
    }
}
