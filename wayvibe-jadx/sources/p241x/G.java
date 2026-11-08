package p241x;

import B.l;
import F0.InterfaceC0397o;
import F0.J;
import p067g0.q;
import p119k9.F;
import p143n0.C2096x;
import p163p0.b;
import p163p0.c;
import p163p0.e;

/* JADX INFO: loaded from: classes.dex */
public final class G extends q implements InterfaceC0397o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f28109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28112d;

    public G(l lVar) {
        this.f28109a = lVar;
    }

    @Override // F0.InterfaceC0397o
    public final void draw(c cVar) {
        J j10 = (J) cVar;
        j10.b();
        boolean z10 = this.f28110b;
        b bVar = j10.f3621a;
        if (z10) {
            e.T(j10, C2096x.b(0.3f, C2096x.f22792b), bVar.c(), 122);
        } else if (this.f28111c || this.f28112d) {
            e.T(j10, C2096x.b(0.1f, C2096x.f22792b), bVar.c(), 122);
        }
    }

    @Override // p067g0.q
    public final void onAttach() {
        F.w(getCoroutineScope(), null, null, new F(this, null), 3);
    }
}
