package T0;

import F0.z0;

/* JADX INFO: loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(Object obj, int i10) {
        super(1);
        this.f11474a = i10;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f11474a) {
            case 0:
                E e2 = (E) obj;
                return "'" + e2.b() + "' " + e2.a();
            case 1:
                p099j0.e eVar = (p099j0.e) obj;
                if (!eVar.getNode().isAttached()) {
                    return z0.SkipSubtreeAndContinueTraversal;
                }
                eVar.f21387a = null;
                return z0.ContinueTraversal;
            default:
                ((p262z0.l) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
