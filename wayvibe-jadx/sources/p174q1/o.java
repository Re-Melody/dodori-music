package p174q1;

import p182r1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends m {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f25645p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f25646q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f25647r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f25648s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f25649t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f25650u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f25651v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final b f25652w0 = new b();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public p089i1.o f25653x0 = null;

    public abstract void P(int i10, int i11, int i12, int i13);

    public final void Q(g gVar, f fVar, int i10, f fVar2, int i11) {
        p089i1.o oVar;
        h hVar;
        while (true) {
            oVar = this.f25653x0;
            if (oVar != null || (hVar = this.f25534R) == null) {
                break;
            } else {
                this.f25653x0 = hVar.f25587r0;
            }
        }
        b bVar = this.f25652w0;
        bVar.f25710a = fVar;
        bVar.f25711b = fVar2;
        bVar.f25712c = i10;
        bVar.f25713d = i11;
        oVar.a(gVar, bVar);
        gVar.K(bVar.f25714e);
        gVar.H(bVar.f25715f);
        gVar.f25521E = bVar.f25717h;
        gVar.E(bVar.f25716g);
    }
}
