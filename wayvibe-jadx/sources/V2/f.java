package V2;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12490a;

    public final void a(int i10) {
        g gVar = this.f12490a;
        synchronized (gVar) {
            int i11 = gVar.f12508m;
            if (i11 == 0 || gVar.f12500d) {
                if (i11 == i10) {
                    return;
                }
                gVar.f12508m = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    gVar.k = gVar.a(i10);
                    gVar.f12499c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    gVar.b(gVar.f12502f > 0 ? (int) (jElapsedRealtime - gVar.f12503g) : 0, gVar.f12504h, gVar.k);
                    gVar.f12503g = jElapsedRealtime;
                    gVar.f12504h = 0L;
                    gVar.f12506j = 0L;
                    gVar.f12505i = 0L;
                    s sVar = gVar.f12501e;
                    sVar.f12541b.clear();
                    sVar.f12543d = -1;
                    sVar.f12544e = 0;
                    sVar.f12545f = 0;
                }
            }
        }
    }
}
