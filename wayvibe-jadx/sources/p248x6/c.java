package p248x6;

import Z4.M;

/* JADX INFO: loaded from: classes.dex */
public final class c extends z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f28604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f28605h;

    public /* synthetic */ c(Object obj, int i10) {
        this.f28604g = i10;
        this.f28605h = obj;
    }

    @Override // p248x6.z
    public final void b() {
        switch (this.f28604g) {
            case 0:
                d dVar = (d) ((M) this.f28605h).f13682b;
                dVar.f28608b.b("unlinkToDeath", new Object[0]);
                dVar.f28619n.asBinder().unlinkToDeath(dVar.k, 0);
                dVar.f28619n = null;
                dVar.f28613g = false;
                return;
            default:
                synchronized (((d) this.f28605h).f28612f) {
                    try {
                        if (((d) this.f28605h).f28617l.get() > 0 && ((d) this.f28605h).f28617l.decrementAndGet() > 0) {
                            ((d) this.f28605h).f28608b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar2 = (d) this.f28605h;
                        if (dVar2.f28619n != null) {
                            dVar2.f28608b.b("Unbind from service.", new Object[0]);
                            d dVar3 = (d) this.f28605h;
                            dVar3.f28607a.unbindService(dVar3.f28618m);
                            d dVar4 = (d) this.f28605h;
                            dVar4.f28613g = false;
                            dVar4.f28619n = null;
                            dVar4.f28618m = null;
                        }
                        ((d) this.f28605h).e();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
