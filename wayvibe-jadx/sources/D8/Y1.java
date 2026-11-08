package D8;

import B8.AbstractC0124k;

/* JADX INFO: loaded from: classes2.dex */
public final class Y1 extends AbstractC0124k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f2416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S0 f2418d;

    public Y1(S0 s8, e2 e2Var) {
        this.f2418d = s8;
        this.f2416b = e2Var;
    }

    @Override // B8.AbstractC0124k
    public final void l(long j10) {
        if (this.f2418d.f2352o.f2491f != null) {
            return;
        }
        synchronized (this.f2418d.f2347i) {
            try {
                if (this.f2418d.f2352o.f2491f == null) {
                    e2 e2Var = this.f2416b;
                    if (!e2Var.f2592b) {
                        long j11 = this.f2417c + j10;
                        this.f2417c = j11;
                        S0 s8 = this.f2418d;
                        long j12 = s8.f2356t;
                        if (j11 <= j12) {
                            return;
                        }
                        if (j11 > s8.k) {
                            e2Var.f2593c = true;
                        } else {
                            long jAddAndGet = s8.f2348j.f2650a.addAndGet(j11 - j12);
                            S0 s10 = this.f2418d;
                            s10.f2356t = this.f2417c;
                            if (jAddAndGet > s10.f2349l) {
                                this.f2416b.f2593c = true;
                            }
                        }
                        e2 e2Var2 = this.f2416b;
                        R1 r1O = e2Var2.f2593c ? this.f2418d.o(e2Var2) : null;
                        if (r1O != null) {
                            r1O.run();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
