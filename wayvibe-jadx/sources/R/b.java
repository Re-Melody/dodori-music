package R;

import B8.V;
import M8.D;
import Z3.l;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.ArrayList;
import java.util.Set;
import org.slf4j.helpers.i;
import p039d2.C1906c;
import p039d2.Y;
import p039d2.a0;
import p039d2.i0;
import p039d2.j0;
import p039d2.r;
import p080h4.m;
import p080h4.s;
import p151n9.InterfaceC2106h;
import p195s4.g;
import p259y8.z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC2106h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2106h f10602b;

    public /* synthetic */ b(InterfaceC2106h interfaceC2106h, int i10) {
        this.f10601a = i10;
        this.f10602b = interfaceC2106h;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // p151n9.InterfaceC2106h
    public final Object emit(Object obj, Q8.d dVar) throws Throwable {
        a aVar;
        r rVar;
        m mVar;
        g gVar;
        s sVar;
        g gVar2;
        z zVar;
        switch (this.f10601a) {
            case 0:
                if (dVar instanceof a) {
                    aVar = (a) dVar;
                    int i10 = aVar.f10599b;
                    if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        aVar.f10599b = i10 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        aVar = new a(this, dVar);
                    }
                } else {
                    aVar = new a(this, dVar);
                }
                Object obj2 = aVar.f10598a;
                R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
                int i11 = aVar.f10599b;
                if (i11 == 0) {
                    Q5.b.T(obj2);
                    ?? r10 = ((l) obj).f13640a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : r10) {
                        if (obj3 instanceof Z3.c) {
                            arrayList.add(obj3);
                        }
                    }
                    aVar.f10599b = 1;
                    if (this.f10602b.emit(arrayList, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q5.b.T(obj2);
                }
                return D.f8402a;
            case 1:
                if (dVar instanceof r) {
                    rVar = (r) dVar;
                    int i12 = rVar.f19246b;
                    if ((i12 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        rVar.f19246b = i12 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        rVar = new r(this, dVar);
                    }
                } else {
                    rVar = new r(this, dVar);
                }
                Object obj4 = rVar.f19245a;
                R8.a aVar3 = R8.a.COROUTINE_SUSPENDED;
                int i13 = rVar.f19246b;
                if (i13 == 0) {
                    Q5.b.T(obj4);
                    i0 i0Var = (i0) obj;
                    if (i0Var instanceof a0) {
                        throw ((a0) i0Var).f19164b;
                    }
                    if (!(i0Var instanceof C1906c)) {
                        if (i0Var instanceof Y ? true : i0Var instanceof j0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new V();
                    }
                    Object obj5 = ((C1906c) i0Var).f19170b;
                    rVar.f19246b = 1;
                    if (this.f10602b.emit(obj5, rVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q5.b.T(obj4);
                }
                return D.f8402a;
            case 2:
                if (dVar instanceof m) {
                    mVar = (m) dVar;
                    int i14 = mVar.f20279b;
                    if ((i14 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        mVar.f20279b = i14 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        mVar = new m(this, dVar);
                    }
                } else {
                    mVar = new m(this, dVar);
                }
                Object obj6 = mVar.f20278a;
                R8.a aVar4 = R8.a.COROUTINE_SUSPENDED;
                int i15 = mVar.f20279b;
                if (i15 == 0) {
                    Q5.b.T(obj6);
                    long j10 = ((p133m0.f) obj).f22196a;
                    if (j10 == 9205357640488583168L) {
                        gVar = g.f26119c;
                    } else if (p133m0.f.d(j10) < 0.5d || p133m0.f.b(j10) < 0.5d) {
                        gVar = null;
                    } else {
                        float fD = p133m0.f.d(j10);
                        boolean zIsInfinite = Float.isInfinite(fD);
                        i aVar5 = p195s4.b.f26117e;
                        i aVar6 = (zIsInfinite || Float.isNaN(fD)) ? aVar5 : new p195s4.a(p025b9.a.U(p133m0.f.d(j10)));
                        float fB = p133m0.f.b(j10);
                        if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                            aVar5 = new p195s4.a(p025b9.a.U(p133m0.f.b(j10)));
                        }
                        gVar = new g(aVar6, aVar5);
                    }
                    if (gVar != null) {
                        mVar.f20279b = 1;
                        if (this.f10602b.emit(gVar, mVar) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q5.b.T(obj6);
                }
                return D.f8402a;
            case 3:
                if (dVar instanceof s) {
                    sVar = (s) dVar;
                    int i16 = sVar.f20299b;
                    if ((i16 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        sVar.f20299b = i16 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        sVar = new s(this, dVar);
                    }
                } else {
                    sVar = new s(this, dVar);
                }
                Object obj7 = sVar.f20298a;
                R8.a aVar7 = R8.a.COROUTINE_SUSPENDED;
                int i17 = sVar.f20299b;
                if (i17 == 0) {
                    Q5.b.T(obj7);
                    long j11 = ((p028c1.a) obj).f15843a;
                    if (p028c1.a.k(j11)) {
                        gVar2 = null;
                    } else {
                        boolean zD = p028c1.a.d(j11);
                        i aVar8 = p195s4.b.f26117e;
                        i aVar9 = zD ? new p195s4.a(p028c1.a.h(j11)) : aVar8;
                        if (p028c1.a.c(j11)) {
                            aVar8 = new p195s4.a(p028c1.a.g(j11));
                        }
                        gVar2 = new g(aVar9, aVar8);
                    }
                    if (gVar2 != null) {
                        sVar.f20299b = 1;
                        if (this.f10602b.emit(gVar2, sVar) == aVar7) {
                            return aVar7;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q5.b.T(obj7);
                }
                return D.f8402a;
            default:
                if (dVar instanceof z) {
                    zVar = (z) dVar;
                    int i18 = zVar.f29218b;
                    if ((i18 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        zVar.f29218b = i18 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        zVar = new z(this, dVar);
                    }
                } else {
                    zVar = new z(this, dVar);
                }
                Object obj8 = zVar.f29217a;
                R8.a aVar10 = R8.a.COROUTINE_SUSPENDED;
                int i19 = zVar.f29218b;
                if (i19 == 0) {
                    Q5.b.T(obj8);
                    Set setKeySet = ((p069g2.b) obj).a().keySet();
                    zVar.f29218b = 1;
                    if (this.f10602b.emit(setKeySet, zVar) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q5.b.T(obj8);
                }
                return D.f8402a;
        }
    }
}
