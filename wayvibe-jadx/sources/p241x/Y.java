package p241x;

import B.h;
import B.i;
import B.m;
import B.n;
import F0.u0;
import M8.D;
import Q5.b;
import R8.a;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import p067g0.q;
import p119k9.F;
import p262z0.j;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends q implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f28162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f28163b;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object o0(Y y6, c cVar) {
        U u10;
        h hVar;
        y6.getClass();
        if (cVar instanceof U) {
            u10 = (U) cVar;
            int i10 = u10.f28153e;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                u10.f28153e = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                u10 = new U(y6, cVar);
            }
        } else {
            u10 = new U(y6, cVar);
        }
        Object obj = u10.f28151c;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = u10.f28153e;
        if (i11 == 0) {
            b.T(obj);
            if (y6.f28163b == null) {
                hVar = new h();
                m mVar = y6.f28162a;
                u10.f28149a = y6;
                u10.f28150b = hVar;
                u10.f28153e = 1;
                if (((n) mVar).a(hVar, u10) == aVar) {
                    return aVar;
                }
            }
            return D.f8402a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h hVar2 = u10.f28150b;
        Y y10 = u10.f28149a;
        b.T(obj);
        hVar = hVar2;
        y6 = y10;
        y6.f28163b = hVar;
        return D.f8402a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object p0(Y y6, c cVar) {
        V v3;
        y6.getClass();
        if (cVar instanceof V) {
            v3 = (V) cVar;
            int i10 = v3.f28157d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                v3.f28157d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                v3 = new V(y6, cVar);
            }
        } else {
            v3 = new V(y6, cVar);
        }
        Object obj = v3.f28155b;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = v3.f28157d;
        if (i11 == 0) {
            b.T(obj);
            h hVar = y6.f28163b;
            if (hVar != null) {
                i iVar = new i(hVar);
                m mVar = y6.f28162a;
                v3.f28154a = y6;
                v3.f28157d = 1;
                if (((n) mVar).a(iVar, v3) == aVar) {
                    return aVar;
                }
            }
            return D.f8402a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y6 = v3.f28154a;
        b.T(obj);
        y6.f28163b = null;
        return D.f8402a;
    }

    @Override // F0.u0
    public final void L(p262z0.i iVar, j jVar, long j10) {
        if (jVar == j.Main) {
            int i10 = iVar.f29758d;
            if (i10 == 4) {
                F.w(getCoroutineScope(), null, null, new W(this, null), 3);
            } else if (i10 == 5) {
                F.w(getCoroutineScope(), null, null, new X(this, null), 3);
            }
        }
    }

    @Override // p067g0.q
    public final void onDetach() {
        q0();
    }

    public final void q0() {
        h hVar = this.f28163b;
        if (hVar != null) {
            ((n) this.f28162a).b(new i(hVar));
            this.f28163b = null;
        }
    }

    @Override // F0.u0
    public final void s() {
        q0();
    }
}
