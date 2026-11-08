package G2;

import R2.D;
import p255y2.N;
import p255y2.O;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f5384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f5387g;

    public g(h hVar, String str, int i10, D d10) {
        this.f5387g = hVar;
        this.f5381a = str;
        this.f5382b = i10;
        this.f5383c = d10 == null ? -1L : d10.f10654d;
        if (d10 == null || !d10.b()) {
            return;
        }
        this.f5384d = d10;
    }

    public final boolean a(a aVar) {
        D d10 = aVar.f5354d;
        if (d10 == null) {
            return this.f5382b != aVar.f5353c;
        }
        long j10 = this.f5383c;
        if (j10 == -1) {
            return false;
        }
        if (d10.f10654d > j10) {
            return true;
        }
        D d11 = this.f5384d;
        if (d11 == null) {
            return false;
        }
        O o10 = aVar.f5352b;
        int iB = o10.b(d10.f10651a);
        int iB2 = o10.b(d11.f10651a);
        if (d10.f10654d < d11.f10654d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zB = d10.b();
        int i10 = d11.f10652b;
        if (!zB) {
            int i11 = d10.f10655e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = d10.f10652b;
        if (i12 > i10) {
            return true;
        }
        if (i12 == i10) {
            return d10.f10653c > d11.f10653c;
        }
        return false;
    }

    public final boolean b(O o10, O o11) {
        D d10;
        int i10 = this.f5382b;
        if (i10 < o10.o()) {
            h hVar = this.f5387g;
            o10.n(i10, hVar.f5390a);
            N n6 = hVar.f5390a;
            int i11 = n6.f28798n;
            while (true) {
                if (i11 > n6.f28799o) {
                    i10 = -1;
                    break;
                }
                int iB = o11.b(o10.l(i11));
                if (iB != -1) {
                    i10 = o11.f(iB, hVar.f5391b, false).f28780c;
                    break;
                }
                i11++;
            }
        } else if (i10 >= o11.o()) {
            i10 = -1;
            break;
        }
        this.f5382b = i10;
        return i10 != -1 && ((d10 = this.f5384d) == null || o11.b(d10.f10651a) != -1);
    }
}
