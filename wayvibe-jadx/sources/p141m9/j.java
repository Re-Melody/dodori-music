package p141m9;

import D7.W;
import M8.D;
import Q5.b;
import S8.c;
import Z8.a;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.android.gms.common.api.f;
import p119k9.C2028n;
import p119k9.C2041z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f22531a = new i();

    public static c a(int i10, int i11, a aVar) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if (i10 == -2) {
            if (aVar != a.SUSPEND) {
                return new n(1, aVar);
            }
            g.f22529h0.getClass();
            return new c(f.f22528b);
        }
        if (i10 == -1) {
            if (aVar == a.SUSPEND) {
                return new n(1, a.DROP_OLDEST);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == 0) {
            return aVar == a.SUSPEND ? new c(0) : new n(1, aVar);
        }
        if (i10 != Integer.MAX_VALUE) {
            return aVar == a.SUSPEND ? new c(i10) : new n(i10, aVar);
        }
        return new c(f.API_PRIORITY_OTHER);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(r rVar, a aVar, c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f22536c;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                oVar.f22536c = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                oVar = new o(cVar);
            }
        } else {
            oVar = new o(cVar);
        }
        Object obj = oVar.f22535b;
        R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
        int i11 = oVar.f22536c;
        try {
            if (i11 == 0) {
                b.T(obj);
                if (oVar.getContext().get(C2041z.f21793b) != rVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                oVar.f22534a = aVar;
                oVar.f22536c = 1;
                C2028n c2028n = new C2028n(1, W.K(oVar));
                c2028n.s();
                ((q) rVar).Z(new p(c2028n));
                if (c2028n.r() == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = oVar.f22534a;
                b.T(obj);
            }
            aVar.invoke();
            return D.f8402a;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
    }
}
