package p092i4;

import D7.W;
import M8.D;
import Q5.b;
import R8.a;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import p119k9.C2015g0;
import p119k9.C2028n;
import p119k9.F;
import p185r4.m;
import t9.f;
import t9.i;
import t9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f20492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f20493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f20494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f20495d;

    public e(p pVar, m mVar, j jVar, k kVar) {
        this.f20492a = pVar;
        this.f20493b = mVar;
        this.f20494c = jVar;
        this.f20495d = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(c cVar) throws Throwable {
        d dVar;
        j jVar;
        int andDecrement;
        int i10;
        e eVar;
        Object obj;
        Throwable th;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f20491e;
            if ((i11 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                dVar.f20491e = i11 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj2 = dVar.f20489c;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = dVar.f20491e;
        try {
            if (i12 == 0) {
                b.T(obj2);
                dVar.f20487a = this;
                jVar = this.f20494c;
                dVar.f20488b = jVar;
                dVar.f20491e = 1;
                jVar.getClass();
                do {
                    andDecrement = i.f26994g.getAndDecrement(jVar);
                    i10 = jVar.f26995a;
                } while (andDecrement > i10);
                Object obj3 = D.f8402a;
                if (andDecrement <= 0) {
                    C2028n c2028nP = F.p(W.K(dVar));
                    try {
                        if (!jVar.a(c2028nP)) {
                            while (true) {
                                int andDecrement2 = i.f26994g.getAndDecrement(jVar);
                                if (andDecrement2 <= i10) {
                                    if (andDecrement2 > 0) {
                                        c2028nP.h(obj3, jVar.f26996b);
                                        break;
                                    }
                                    if (jVar.a(c2028nP)) {
                                        break;
                                    }
                                }
                            }
                        }
                        Object objR = c2028nP.r();
                        if (objR != aVar) {
                            objR = obj3;
                        }
                        if (objR == aVar) {
                            obj3 = objR;
                        }
                    } catch (Throwable th2) {
                        c2028nP.z();
                        throw th2;
                    }
                }
                if (obj3 != aVar) {
                    eVar = this;
                }
                return aVar;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = (f) dVar.f20487a;
                try {
                    b.T(obj2);
                    g gVar = (g) obj2;
                    ((i) obj).b();
                    return gVar;
                } catch (Throwable th3) {
                    th = th3;
                    ((i) obj).b();
                    throw th;
                }
            }
            j jVar2 = dVar.f20488b;
            eVar = (e) dVar.f20487a;
            b.T(obj2);
            jVar = jVar2;
            Z0.b bVar = new Z0.b(eVar, 10);
            dVar.f20487a = jVar;
            dVar.f20488b = null;
            dVar.f20491e = 2;
            Object objG = F.G(Q8.j.f10595a, new C2015g0(bVar, null), dVar);
            if (objG != aVar) {
                obj = jVar;
                obj2 = objG;
                g gVar2 = (g) obj2;
                ((i) obj).b();
                return gVar2;
            }
            return aVar;
        } catch (Throwable th4) {
            obj = jVar;
            th = th4;
            ((i) obj).b();
            throw th;
        }
    }
}
