package p151n9;

import M8.D;
import Q5.b;
import Q8.d;
import R8.a;
import S8.i;
import U.C0901n0;
import U.InterfaceC0877b0;
import Z8.e;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y;
import o9.c;
import p230w.k0;
import p259y8.J;
import p259y8.K;
import p259y8.p;

/* JADX INFO: renamed from: n9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2103e implements InterfaceC2106h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f23106d;

    public /* synthetic */ C2103e(Object obj, Object obj2, Object obj3, int i10) {
        this.f23103a = i10;
        this.f23105c = obj;
        this.f23106d = obj2;
        this.f23104b = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r9v14, types: [S8.i, Z8.e] */
    @Override // p151n9.InterfaceC2106h
    public final Object emit(Object obj, d dVar) {
        C2102d c2102d;
        C2113o c2113o;
        C2103e c2103e;
        boolean zBooleanValue;
        p pVar;
        switch (this.f23103a) {
            case 0:
                if (dVar instanceof C2102d) {
                    c2102d = (C2102d) dVar;
                    int i10 = c2102d.f23102c;
                    if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        c2102d.f23102c = i10 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        c2102d = new C2102d(this, dVar);
                    }
                } else {
                    c2102d = new C2102d(this, dVar);
                }
                Object obj2 = c2102d.f23100a;
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = c2102d.f23102c;
                D d10 = D.f8402a;
                if (i11 == 0) {
                    b.T(obj2);
                    ((C2104f) this.f23105c).getClass();
                    y yVar = (y) this.f23106d;
                    Object obj3 = yVar.f21873a;
                    if (obj3 == c.f23848b || !m.b(obj3, obj)) {
                        yVar.f21873a = obj;
                        c2102d.f23102c = 1;
                        if (((InterfaceC2106h) this.f23104b).emit(obj, c2102d) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.T(obj2);
                }
                return d10;
            case 1:
                if (dVar instanceof C2113o) {
                    c2113o = (C2113o) dVar;
                    int i12 = c2113o.f23137e;
                    if ((i12 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        c2113o.f23137e = i12 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        c2113o = new C2113o(this, dVar);
                    }
                } else {
                    c2113o = new C2113o(this, dVar);
                }
                Object objInvoke = c2113o.f23135c;
                a aVar2 = a.COROUTINE_SUSPENDED;
                int i13 = c2113o.f23137e;
                D d11 = D.f8402a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            obj = c2113o.f23134b;
                            c2103e = c2113o.f23133a;
                            b.T(objInvoke);
                            if (!((Boolean) objInvoke).booleanValue()) {
                                ((u) c2103e.f23105c).f21869a = true;
                                c2113o.f23133a = null;
                                c2113o.f23134b = null;
                                c2113o.f23137e = 3;
                                if (((InterfaceC2106h) c2103e.f23104b).emit(obj, c2113o) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    b.T(objInvoke);
                } else {
                    b.T(objInvoke);
                    if (((u) this.f23105c).f21869a) {
                        c2113o.f23137e = 1;
                        if (((InterfaceC2106h) this.f23104b).emit(obj, c2113o) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        c2113o.f23133a = this;
                        c2113o.f23134b = obj;
                        c2113o.f23137e = 2;
                        objInvoke = ((i) this.f23106d).invoke(obj, c2113o);
                        if (objInvoke == aVar2) {
                            return aVar2;
                        }
                        c2103e = this;
                        if (!((Boolean) objInvoke).booleanValue()) {
                            ((u) c2103e.f23105c).f21869a = true;
                            c2113o.f23133a = null;
                            c2113o.f23134b = null;
                            c2113o.f23137e = 3;
                            if (((InterfaceC2106h) c2103e.f23104b).emit(obj, c2113o) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                }
                return d11;
            case 2:
                Object objB = c.b((Q8.i) this.f23105c, obj, this.f23106d, (o9.y) this.f23104b, dVar);
                return objB == a.COROUTINE_SUSPENDED ? objB : D.f8402a;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    e eVar = (e) ((InterfaceC0877b0) this.f23104b).getValue();
                    k0 k0Var = (k0) this.f23106d;
                    zBooleanValue = ((Boolean) eVar.invoke(k0Var.c(), k0Var.f27727d.getValue())).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                ((C0901n0) this.f23105c).setValue(Boolean.valueOf(zBooleanValue));
                return D.f8402a;
            default:
                if (dVar instanceof p) {
                    pVar = (p) dVar;
                    int i14 = pVar.f29177b;
                    if ((i14 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        pVar.f29177b = i14 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        pVar = new p(this, dVar);
                    }
                } else {
                    pVar = new p(this, dVar);
                }
                Object obj4 = pVar.f29176a;
                a aVar3 = a.COROUTINE_SUSPENDED;
                int i15 = pVar.f29177b;
                if (i15 == 0) {
                    b.T(obj4);
                    Double d12 = (Double) K.c(((p069g2.b) obj).c((p069g2.d) this.f23105c), ((J) this.f23106d).f29133c);
                    pVar.f29177b = 1;
                    if (((InterfaceC2106h) this.f23104b).emit(d12, pVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.T(obj4);
                }
                return D.f8402a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2103e(u uVar, InterfaceC2106h interfaceC2106h, e eVar) {
        this.f23103a = 1;
        this.f23105c = uVar;
        this.f23104b = interfaceC2106h;
        this.f23106d = (i) eVar;
    }

    public C2103e(InterfaceC2106h interfaceC2106h, p069g2.d dVar, J j10) {
        this.f23103a = 4;
        this.f23104b = interfaceC2106h;
        this.f23105c = dVar;
        this.f23106d = j10;
    }

    public C2103e(InterfaceC2106h interfaceC2106h, Q8.i iVar) {
        this.f23103a = 2;
        this.f23105c = iVar;
        this.f23106d = p9.a.k(iVar);
        this.f23104b = new o9.y(interfaceC2106h, null);
    }
}
