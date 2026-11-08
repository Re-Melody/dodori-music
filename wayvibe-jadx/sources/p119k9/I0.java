package p119k9;

import S8.c;
import p9.p;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends p implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21687e;

    public I0(long j10, c cVar) {
        super(cVar, cVar.getContext());
        this.f21687e = j10;
    }

    @Override // p119k9.u0
    public final String K() {
        return super.K() + "(timeMillis=" + this.f21687e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        F.m(this.f21716c);
        o(new H0(V0.p.k(this.f21687e, " ms", new StringBuilder("Timed out waiting for ")), this));
    }
}
