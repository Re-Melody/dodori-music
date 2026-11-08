package X2;

import A6.E;
import A6.W;
import B2.AbstractC0111a;
import B2.C;
import D8.RunnableC0290l;
import F2.C0420m;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p255y2.C2332h;
import p255y2.C2338n;
import p255y2.C2339o;
import p255y2.X;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2339o f13063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f13067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Executor f13068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f13069j;

    public d(e eVar, Context context) {
        this.f13069j = eVar;
        this.f13060a = context;
        this.f13061b = C.F(context) ? 1 : 5;
        this.f13062c = new ArrayList();
        this.f13064e = -9223372036854775807L;
        this.f13067h = x.f13192c0;
        this.f13068i = e.f13070m;
    }

    public final void a(boolean z10) {
        this.f13065f = false;
        this.f13064e = -9223372036854775807L;
        e eVar = this.f13069j;
        if (eVar.f13081l == 1) {
            eVar.k++;
            eVar.f13073c.a();
            B2.y yVar = eVar.f13079i;
            AbstractC0111a.i(yVar);
            yVar.c(new RunnableC0290l(eVar, 18));
        }
        if (z10) {
            o oVar = eVar.f13072b;
            s sVar = oVar.f13141b;
            sVar.f13169m = 0L;
            sVar.f13172p = -1L;
            sVar.f13170n = -1L;
            oVar.f13146g = -9223372036854775807L;
            oVar.f13144e = -9223372036854775807L;
            oVar.c(1);
            oVar.f13147h = -9223372036854775807L;
        }
    }

    public final void b(C2339o c2339o) throws y {
        e eVar = this.f13069j;
        AbstractC0111a.h(eVar.f13081l == 0);
        C2332h c2332h = c2339o.f28966z;
        if (c2332h == null || !c2332h.d()) {
            c2332h = C2332h.f28879h;
        }
        if (c2332h.f28882c != 7 || C.f560a < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0111a.i(looperMyLooper);
        eVar.f13079i = eVar.f13075e.a(looperMyLooper, null);
        try {
            b bVar = eVar.f13074d;
            A6.C c3 = E.f299b;
            W w10 = W.f329e;
            bVar.a();
            Pair pair = eVar.f13080j;
            if (pair == null) {
                throw null;
            }
            int i10 = ((B2.v) pair.second).f634a;
            throw null;
        } catch (X e2) {
            throw new y(e2, c2339o);
        }
    }

    public final void c() {
        if (this.f13063d == null) {
            return;
        }
        new ArrayList().addAll(this.f13062c);
        C2339o c2339o = this.f13063d;
        c2339o.getClass();
        AbstractC0111a.i(null);
        C2332h c2332h = c2339o.f28966z;
        if (c2332h == null || !c2332h.d()) {
            C2332h c2332h2 = C2332h.f28879h;
        }
        int i10 = c2339o.f28959s;
        AbstractC0111a.c("width must be positive, but is: " + i10, i10 > 0);
        int i11 = c2339o.f28960t;
        AbstractC0111a.c("height must be positive, but is: " + i11, i11 > 0);
        throw null;
    }

    public final void d(long j10, long j11) throws y {
        try {
            this.f13069j.a(j10, j11);
        } catch (C0420m e2) {
            C2339o c2339o = this.f13063d;
            if (c2339o == null) {
                c2339o = new C2339o(new C2338n());
            }
            throw new y(e2, c2339o);
        }
    }

    public final void e(Surface surface, B2.v vVar) {
        e eVar = this.f13069j;
        Pair pair = eVar.f13080j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((B2.v) eVar.f13080j.second).equals(vVar)) {
            return;
        }
        eVar.f13080j = Pair.create(surface, vVar);
        int i10 = vVar.f634a;
    }
}
