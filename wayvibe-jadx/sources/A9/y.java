package A9;

import M8.C0640b;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends S8.h implements Z8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ C0640b f499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A1.d f500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A1.d dVar, Q8.d dVar2) {
        super(3, dVar2);
        this.f500c = dVar;
    }

    @Override // Z8.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = new y(this.f500c, (Q8.d) obj3);
        yVar.f499b = (C0640b) obj;
        return yVar.invokeSuspend(M8.D.f8402a);
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i10 = this.f498a;
        if (i10 == 0) {
            Q5.b.T(obj);
            C0640b c0640b = this.f499b;
            A1.d dVar = this.f500c;
            G g3 = (G) dVar.f117c;
            byte bV = g3.v();
            if (bV == 1) {
                return dVar.m(true);
            }
            if (bV == 0) {
                return dVar.m(false);
            }
            if (bV != 6) {
                if (bV == 8) {
                    return dVar.k();
                }
                G.p(g3, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f498a = 1;
            obj = A1.d.a(dVar, c0640b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q5.b.T(obj);
        }
        return (p270z9.k) obj;
    }
}
