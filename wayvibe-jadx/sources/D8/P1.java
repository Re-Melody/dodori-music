package D8;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class P1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p096i8.d f2316b;

    public /* synthetic */ P1(p096i8.d dVar, int i10) {
        this.f2315a = i10;
        this.f2316b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2315a) {
            case 0:
                p096i8.d dVar = this.f2316b;
                if (!dVar.f20557b) {
                    dVar.f20562g = null;
                } else {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA = dVar.f20556a - ((Z1) dVar.f20561f).a();
                    if (jA <= 0) {
                        dVar.f20557b = false;
                        dVar.f20562g = null;
                        ((P0) dVar.f20560e).run();
                    } else {
                        dVar.f20562g = ((ScheduledExecutorService) dVar.f20558c).schedule(new P1(dVar, 1), jA, timeUnit);
                    }
                }
                break;
            default:
                p096i8.d dVar2 = this.f2316b;
                ((B8.x0) dVar2.f20559d).execute(new P1(dVar2, 0));
                break;
        }
    }
}
