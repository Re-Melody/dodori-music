package G0;

import U.C0893j0;
import android.view.Choreographer;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.ArrayList;
import p119k9.C2028n;

/* JADX INFO: renamed from: G0.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0479j0 implements U.V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5239c;

    public C0479j0(Choreographer choreographer, C0473h0 c0473h0) {
        this.f5237a = 0;
        this.f5238b = choreographer;
        this.f5239c = c0473h0;
    }

    @Override // Q8.i
    public final Object fold(Object obj, Z8.e eVar) {
        switch (this.f5237a) {
            case 0:
                break;
        }
        return eVar.invoke(obj, this);
    }

    @Override // Q8.i
    public final Q8.g get(Q8.h hVar) {
        switch (this.f5237a) {
            case 0:
                break;
        }
        return p025b9.a.z(this, hVar);
    }

    @Override // Q8.i
    public final Q8.i minusKey(Q8.h hVar) {
        switch (this.f5237a) {
            case 0:
                break;
        }
        return p025b9.a.G(this, hVar);
    }

    @Override // Q8.i
    public final Q8.i plus(Q8.i iVar) {
        switch (this.f5237a) {
            case 0:
                break;
        }
        return p025b9.a.Q(this, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // U.V
    public final Object q(Z8.c cVar, S8.c cVar2) {
        C0893j0 c0893j0;
        boolean z10;
        Object objR;
        C0479j0 c0479j0;
        C0473h0 c0473h0 = null;
        switch (this.f5237a) {
            case 0:
                C0473h0 c0473h1 = (C0473h0) this.f5239c;
                if (c0473h1 == null) {
                    Q8.g gVar = cVar2.getContext().get(Q8.e.f10594a);
                    if (gVar instanceof C0473h0) {
                        c0473h0 = (C0473h0) gVar;
                    }
                } else {
                    c0473h0 = c0473h1;
                }
                C2028n c2028n = new C2028n(1, D7.W.K(cVar2));
                c2028n.s();
                ChoreographerFrameCallbackC0476i0 choreographerFrameCallbackC0476i0 = new ChoreographerFrameCallbackC0476i0(c2028n, this, cVar);
                if (c0473h0 == null || !kotlin.jvm.internal.m.b(c0473h0.f5221c, (Choreographer) this.f5238b)) {
                    ((Choreographer) this.f5238b).postFrameCallback(choreographerFrameCallbackC0476i0);
                    c2028n.u(new C.w0(8, this, choreographerFrameCallbackC0476i0));
                } else {
                    synchronized (c0473h0.f5223e) {
                        c0473h0.f5225g.add(choreographerFrameCallbackC0476i0);
                        if (!c0473h0.f5228j) {
                            c0473h0.f5228j = true;
                            c0473h0.f5221c.postFrameCallback(c0473h0.k);
                        }
                        break;
                    }
                    c2028n.u(new C.w0(7, c0473h0, choreographerFrameCallbackC0476i0));
                }
                Object objR2 = c2028n.r();
                R8.a aVar = R8.a.COROUTINE_SUSPENDED;
                return objR2;
            default:
                if (cVar2 instanceof C0893j0) {
                    c0893j0 = (C0893j0) cVar2;
                    int i10 = c0893j0.f11878e;
                    if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        c0893j0.f11878e = i10 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        c0893j0 = new C0893j0(this, cVar2);
                    }
                } else {
                    c0893j0 = new C0893j0(this, cVar2);
                }
                Object obj = c0893j0.f11876c;
                R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
                int i11 = c0893j0.f11878e;
                if (i11 == 0) {
                    Q5.b.T(obj);
                    U.P p10 = (U.P) this.f5239c;
                    c0893j0.f11874a = this;
                    c0893j0.f11875b = cVar;
                    c0893j0.f11878e = 1;
                    synchronized (p10.f11786c) {
                        z10 = p10.f11785b;
                    }
                    if (z10) {
                        objR = M8.D.f8402a;
                    } else {
                        C2028n c2028n2 = new C2028n(1, D7.W.K(c0893j0));
                        c2028n2.s();
                        synchronized (p10.f11786c) {
                            ((ArrayList) p10.f11787d).add(c2028n2);
                        }
                        c2028n2.u(new C.w0(26, p10, c2028n2));
                        objR = c2028n2.r();
                        if (objR != aVar2) {
                            objR = M8.D.f8402a;
                        }
                    }
                    if (objR != aVar2) {
                        c0479j0 = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q5.b.T(obj);
                    return obj;
                }
                cVar = c0893j0.f11875b;
                c0479j0 = c0893j0.f11874a;
                Q5.b.T(obj);
                U.V v3 = (U.V) c0479j0.f5238b;
                c0893j0.f11874a = null;
                c0893j0.f11875b = null;
                c0893j0.f11878e = 2;
                Object objQ = v3.q(cVar, c0893j0);
                if (objQ != aVar2) {
                    return objQ;
                }
                return aVar2;
        }
    }

    public C0479j0(U.V v3) {
        this.f5237a = 1;
        this.f5238b = v3;
        this.f5239c = new U.P(0);
    }
}
