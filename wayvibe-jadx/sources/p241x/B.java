package p241x;

import p028c1.b;
import p028c1.k;
import p133m0.d;
import p133m0.f;
import p143n0.O;
import p143n0.Q;
import p143n0.c0;

/* JADX INFO: loaded from: classes.dex */
public final class B implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28092a;

    @Override // p143n0.c0
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Q mo6createOutlinePq9zytI(long j10, k kVar, b bVar) {
        switch (this.f28092a) {
            case 0:
                float fY = bVar.Y(C.f28102a);
                return new O(new d(0.0f, -fY, f.d(j10), f.b(j10) + fY));
            default:
                float fY2 = bVar.Y(C.f28102a);
                return new O(new d(-fY2, 0.0f, f.d(j10) + fY2, f.b(j10)));
        }
    }
}
