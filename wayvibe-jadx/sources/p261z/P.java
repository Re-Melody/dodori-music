package p261z;

import B.b;
import B.m;
import F0.AbstractC0395m;
import F0.InterfaceC0393k;
import F0.u0;
import M8.D;
import R8.a;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.n;
import p141m9.c;
import p262z0.G;
import p262z0.i;
import p262z0.j;
import p262z0.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class P extends AbstractC0395m implements u0, InterfaceC0393k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC2391a0 f29474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f29475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f29477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f29478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f29479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public G f29481j;

    /* JADX WARN: Multi-variable type inference failed */
    public P(Z8.c cVar, boolean z10, m mVar, EnumC2391a0 enumC2391a0) {
        this.f29474c = enumC2391a0;
        this.f29475d = (n) cVar;
        this.f29476e = z10;
        this.f29477f = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object r0(P p10, S8.c cVar) {
        K k;
        p10.getClass();
        if (cVar instanceof K) {
            k = (K) cVar;
            int i10 = k.f29433d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                k.f29433d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                k = new K(p10, cVar);
            }
        } else {
            k = new K(p10, cVar);
        }
        Object obj = k.f29431b;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = k.f29433d;
        if (i11 == 0) {
            Q5.b.T(obj);
            b bVar = p10.f29479h;
            if (bVar != null) {
                m mVar = p10.f29477f;
                if (mVar != null) {
                    B.a aVar2 = new B.a(bVar);
                    k.f29430a = p10;
                    k.f29433d = 1;
                    if (((B.n) mVar).a(aVar2, k) == aVar) {
                        return aVar;
                    }
                }
            }
            p10.x0(0L);
            return D.f8402a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p10 = k.f29430a;
        Q5.b.T(obj);
        p10.f29479h = null;
        p10.x0(0L);
        return D.f8402a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object s0(P p10, C2435x c2435x, S8.c cVar) {
        L l10;
        m mVar;
        b bVar;
        P p11;
        b bVar2;
        p10.getClass();
        if (cVar instanceof L) {
            l10 = (L) cVar;
            int i10 = l10.f29445f;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                l10.f29445f = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                l10 = new L(p10, cVar);
            }
        } else {
            l10 = new L(p10, cVar);
        }
        Object obj = l10.f29443d;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = l10.f29445f;
        if (i11 == 0) {
            Q5.b.T(obj);
            b bVar3 = p10.f29479h;
            if (bVar3 != null && (mVar = p10.f29477f) != null) {
                B.a aVar2 = new B.a(bVar3);
                l10.f29440a = p10;
                l10.f29441b = c2435x;
                l10.f29445f = 1;
                if (((B.n) mVar).a(aVar2, l10) != aVar) {
                }
                return aVar;
            }
            p10.f29479h = bVar;
            p10.w0(c2435x.f29693a);
            return D.f8402a;
        }
        if (i11 == 1) {
            c2435x = l10.f29441b;
            p10 = l10.f29440a;
            Q5.b.T(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = l10.f29442c;
            c2435x = l10.f29441b;
            p11 = l10.f29440a;
            Q5.b.T(obj);
        }
        bVar = bVar2;
        p10 = p11;
        p10.f29479h = bVar;
        p10.w0(c2435x.f29693a);
        return D.f8402a;
        bVar = new b();
        m mVar2 = p10.f29477f;
        if (mVar2 != null) {
            l10.f29440a = p10;
            l10.f29441b = c2435x;
            l10.f29442c = bVar;
            l10.f29445f = 2;
            if (((B.n) mVar2).a(bVar, l10) != aVar) {
                p11 = p10;
                bVar2 = bVar;
                bVar = bVar2;
                p10 = p11;
            }
            return aVar;
        }
        p10.f29479h = bVar;
        p10.w0(c2435x.f29693a);
        return D.f8402a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object t0(P p10, C2437y c2437y, S8.c cVar) {
        M m8;
        p10.getClass();
        if (cVar instanceof M) {
            m8 = (M) cVar;
            int i10 = m8.f29456e;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                m8.f29456e = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                m8 = new M(p10, cVar);
            }
        } else {
            m8 = new M(p10, cVar);
        }
        Object obj = m8.f29454c;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = m8.f29456e;
        if (i11 == 0) {
            Q5.b.T(obj);
            b bVar = p10.f29479h;
            if (bVar != null) {
                m mVar = p10.f29477f;
                if (mVar != null) {
                    B.c cVar2 = new B.c(bVar);
                    m8.f29452a = p10;
                    m8.f29453b = c2437y;
                    m8.f29456e = 1;
                    if (((B.n) mVar).a(cVar2, m8) == aVar) {
                        return aVar;
                    }
                }
            }
            p10.x0(c2437y.f29696a);
            return D.f8402a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c2437y = m8.f29453b;
        p10 = m8.f29452a;
        Q5.b.T(obj);
        p10.f29479h = null;
        p10.x0(c2437y.f29696a);
        return D.f8402a;
    }

    @Override // F0.u0
    public void L(i iVar, j jVar, long j10) {
        if (this.f29476e && this.f29481j == null) {
            J j11 = new J(this, null);
            i iVar2 = z.f29799a;
            G g3 = new G(null, null, j11);
            o0(g3);
            this.f29481j = g3;
        }
        G g10 = this.f29481j;
        if (g10 != null) {
            g10.L(iVar, jVar, j10);
        }
    }

    @Override // p067g0.q
    public final void onDetach() {
        this.f29480i = false;
        u0();
    }

    @Override // F0.u0
    public final void s() {
        G g3 = this.f29481j;
        if (g3 != null) {
            g3.s();
        }
    }

    public final void u0() {
        b bVar = this.f29479h;
        if (bVar != null) {
            m mVar = this.f29477f;
            if (mVar != null) {
                ((B.n) mVar).b(new B.a(bVar));
            }
            this.f29479h = null;
        }
    }

    public abstract Object v0(N n6, O o10);

    public abstract void w0(long j10);

    public abstract void x0(long j10);

    public abstract boolean y0();

    /* JADX WARN: Multi-variable type inference failed */
    public final void z0(Z8.c cVar, boolean z10, m mVar, EnumC2391a0 enumC2391a0, boolean z11) {
        G g3;
        this.f29475d = (n) cVar;
        boolean z12 = true;
        if (this.f29476e != z10) {
            this.f29476e = z10;
            if (!z10) {
                u0();
                G g10 = this.f29481j;
                if (g10 != null) {
                    p0(g10);
                }
                this.f29481j = null;
            }
            z11 = true;
        }
        if (!kotlin.jvm.internal.m.b(this.f29477f, mVar)) {
            u0();
            this.f29477f = mVar;
        }
        if (this.f29474c != enumC2391a0) {
            this.f29474c = enumC2391a0;
        } else {
            z12 = z11;
        }
        if (!z12 || (g3 = this.f29481j) == null) {
            return;
        }
        g3.q0();
    }
}
