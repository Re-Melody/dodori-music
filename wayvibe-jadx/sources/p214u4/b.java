package p214u4;

import p080h4.q;
import p114k4.a;
import p185r4.e;
import p185r4.j;
import p185r4.o;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f27219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f27220b;

    public b(q qVar, j jVar) {
        this.f27219a = qVar;
        this.f27220b = jVar;
    }

    @Override // p214u4.f
    public final void a() {
        this.f27219a.getClass();
        j jVar = this.f27220b;
        boolean z10 = jVar instanceof o;
        new a(jVar.a(), jVar.b().f25943w, (z10 && ((o) jVar).f25968g) ? false : true);
        if (z10) {
            return;
        }
        boolean z11 = jVar instanceof e;
    }
}
