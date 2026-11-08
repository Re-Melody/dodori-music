package p216u6;

import Z4.M;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27236c;

    public /* synthetic */ m(Object obj, int i10) {
        this.f27235b = i10;
        this.f27236c = obj;
    }

    @Override // p216u6.k
    public final void a() {
        switch (this.f27235b) {
            case 0:
                synchronized (((o) this.f27236c).f27245f) {
                    try {
                        if (((o) this.f27236c).k.get() > 0 && ((o) this.f27236c).k.decrementAndGet() > 0) {
                            ((o) this.f27236c).f27241b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        o oVar = (o) this.f27236c;
                        if (oVar.f27251m != null) {
                            oVar.f27241b.c("Unbind from service.", new Object[0]);
                            o oVar2 = (o) this.f27236c;
                            oVar2.f27240a.unbindService(oVar2.f27250l);
                            o oVar3 = (o) this.f27236c;
                            oVar3.f27246g = false;
                            oVar3.f27251m = null;
                            oVar3.f27250l = null;
                        }
                        ((o) this.f27236c).d();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                o oVar4 = (o) ((M) this.f27236c).f13682b;
                oVar4.f27241b.c("unlinkToDeath", new Object[0]);
                oVar4.f27251m.asBinder().unlinkToDeath(oVar4.f27249j, 0);
                oVar4.f27251m = null;
                oVar4.f27246g = false;
                return;
        }
    }
}
