package G0;

import java.util.List;

/* JADX INFO: renamed from: G0.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0453a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M0.j f5183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p199t.r f5184b;

    public C0453a1(M0.o oVar, p199t.q qVar) {
        this.f5183a = oVar.f8057d;
        int[] iArr = p199t.j.f26292a;
        this.f5184b = new p199t.r();
        List listH = M0.o.h(oVar, 4);
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            M0.o oVar2 = (M0.o) listH.get(i10);
            if (qVar.b(oVar2.f8060g)) {
                this.f5184b.a(oVar2.f8060g);
            }
        }
    }
}
