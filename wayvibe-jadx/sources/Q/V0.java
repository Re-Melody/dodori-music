package Q;

import U.C0880d;
import U.C0891i0;
import com.apple.android.music.playback.model.MediaPlayerException;
import p119k9.C2028n;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9.d f9989a = new t9.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0891i0 f9990b = C0880d.K(null, U.U.f11815f);

    public static Object b(V0 v3, String str, S8.i iVar) {
        M0 m8 = M0.Short;
        v3.getClass();
        return v3.a(new T0(str, m8), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(T0 t10, S8.c cVar) {
        U0 u10;
        V0 v3;
        t9.a aVar;
        T0 t11;
        Throwable th;
        V0 v10;
        t9.a aVar2;
        if (cVar instanceof U0) {
            u10 = (U0) cVar;
            int i10 = u10.f9983f;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                u10.f9983f = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                u10 = new U0(this, cVar);
            }
        } else {
            u10 = new U0(this, cVar);
        }
        Object obj = u10.f9981d;
        R8.a aVar3 = R8.a.COROUTINE_SUSPENDED;
        int i11 = u10.f9983f;
        try {
            try {
                if (i11 == 0) {
                    Q5.b.T(obj);
                    u10.f9978a = this;
                    u10.f9979b = t10;
                    t9.d dVar = this.f9989a;
                    u10.f9980c = dVar;
                    u10.f9983f = 1;
                    if (dVar.c(u10) != aVar3) {
                        v3 = this;
                        t11 = t10;
                        aVar = dVar;
                    }
                    return aVar3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.a aVar4 = u10.f9980c;
                    v10 = u10.f9978a;
                    try {
                        Q5.b.T(obj);
                        aVar2 = aVar4;
                        v10.f9990b.setValue(null);
                        ((t9.d) aVar2).e(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        v10.f9990b.setValue(null);
                        throw th;
                    }
                }
                t9.a aVar5 = u10.f9980c;
                T0 t12 = u10.f9979b;
                v3 = u10.f9978a;
                Q5.b.T(obj);
                aVar = aVar5;
                t11 = t12;
                u10.f9978a = v3;
                u10.f9979b = t11;
                u10.f9980c = aVar;
                u10.f9983f = 2;
                C2028n c2028n = new C2028n(1, D7.W.K(u10));
                c2028n.s();
                v3.f9990b.setValue(new S0(t11, c2028n));
                Object objR = c2028n.r();
                if (objR != aVar3) {
                    t9.a aVar6 = aVar;
                    obj = objR;
                    aVar2 = aVar6;
                    v10 = v3;
                    v10.f9990b.setValue(null);
                    ((t9.d) aVar2).e(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th3) {
                th = th3;
                v10 = v3;
                v10.f9990b.setValue(null);
                throw th;
            }
        } catch (Throwable th4) {
            ((t9.d) t10).e(null);
            throw th4;
        }
    }
}
