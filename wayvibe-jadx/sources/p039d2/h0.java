package p039d2;

import Q5.b;
import Y5.h;
import Z8.c;
import Z8.e;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.concurrent.atomic.AtomicInteger;
import t9.a;
import t9.d;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f19202a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f19203b = new h(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1921s f19204c = new C1921s(new g0(2, null));

    public h0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f19203b.f13385b).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar, S8.c cVar2) {
        e0 e0Var;
        d dVar;
        Throwable th;
        a aVar;
        if (cVar2 instanceof e0) {
            e0Var = (e0) cVar2;
            int i10 = e0Var.f19189e;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                e0Var.f19189e = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                e0Var = new e0(this, cVar2);
            }
        } else {
            e0Var = new e0(this, cVar2);
        }
        Object obj = e0Var.f19187c;
        R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
        int i11 = e0Var.f19189e;
        try {
            if (i11 == 0) {
                b.T(obj);
                e0Var.f19185a = cVar;
                dVar = this.f19202a;
                e0Var.f19186b = dVar;
                e0Var.f19189e = 1;
                if (dVar.c(e0Var) != aVar2) {
                }
                return aVar2;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) e0Var.f19185a;
                try {
                    b.T(obj);
                    ((d) aVar).e(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    ((d) aVar).e(null);
                    throw th;
                }
            }
            d dVar2 = e0Var.f19186b;
            c cVar3 = (c) e0Var.f19185a;
            b.T(obj);
            dVar = dVar2;
            cVar = cVar3;
            e0Var.f19185a = dVar;
            e0Var.f19186b = null;
            e0Var.f19189e = 2;
            Object objInvoke = cVar.invoke(e0Var);
            if (objInvoke != aVar2) {
                d dVar3 = dVar;
                obj = objInvoke;
                aVar = dVar3;
                ((d) aVar).e(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th3) {
            d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((d) aVar).e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(e eVar, S8.c cVar) throws Throwable {
        f0 f0Var;
        d dVar;
        Throwable th;
        boolean z10;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i10 = f0Var.f19195e;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                f0Var.f19195e = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj = f0Var.f19193c;
        Object obj2 = R8.a.COROUTINE_SUSPENDED;
        int i11 = f0Var.f19195e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = f0Var.f19192b;
            dVar = f0Var.f19191a;
            try {
                b.T(obj);
                if (z10) {
                    dVar.e(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z10) {
                    dVar.e(null);
                }
                throw th;
            }
        }
        b.T(obj);
        d dVar2 = this.f19202a;
        boolean zD = dVar2.d();
        try {
            Object objValueOf = Boolean.valueOf(zD);
            f0Var.f19191a = dVar2;
            f0Var.f19192b = zD;
            f0Var.f19195e = 1;
            Object objInvoke = eVar.invoke(objValueOf, f0Var);
            if (objInvoke == obj2) {
                return obj2;
            }
            dVar = dVar2;
            obj = objInvoke;
            z10 = zD;
            if (z10) {
                dVar.e(null);
            }
            return obj;
        } catch (Throwable th3) {
            dVar = dVar2;
            th = th3;
            z10 = zD;
            if (z10) {
                dVar.e(null);
            }
            throw th;
        }
    }
}
