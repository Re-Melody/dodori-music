package X2;

import B2.C;
import F2.C0420m;
import H2.C0546p;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f13095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f13096b;

    public k(l lVar, O2.k kVar) {
        this.f13096b = lVar;
        Handler handlerN = C.n(this);
        this.f13095a = handlerN;
        kVar.D(this, handlerN);
    }

    public final void a(long j10) {
        Surface surface;
        l lVar = this.f13096b;
        if (this != lVar.z1 || lVar.f9107K == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            lVar.f9116O0 = true;
            return;
        }
        try {
            lVar.v0(j10);
            lVar.B0(lVar.f13125u1);
            lVar.f9120Q0.f4118e++;
            o oVar = lVar.f13106a1;
            boolean z10 = oVar.f13143d != 3;
            oVar.f13143d = 3;
            oVar.k.getClass();
            oVar.f13145f = C.I(SystemClock.elapsedRealtime());
            if (z10 && (surface = lVar.f13113i1) != null) {
                C0546p c0546p = lVar.f13103X0;
                Handler handler = c0546p.f5931a;
                if (handler != null) {
                    handler.post(new v(c0546p, surface, SystemClock.elapsedRealtime()));
                }
                lVar.f13116l1 = true;
            }
            lVar.d0(j10);
        } catch (C0420m e2) {
            lVar.f9118P0 = e2;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = C.f560a;
        a(((((long) i10) & 4294967295L) << 32) | (4294967295L & ((long) i11)));
        return true;
    }
}
