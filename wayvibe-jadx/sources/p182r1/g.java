package p182r1;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25732m;

    public g(q qVar) {
        super(qVar);
        if (qVar instanceof k) {
            this.f25725e = e.HORIZONTAL_DIMENSION;
        } else {
            this.f25725e = e.VERTICAL_DIMENSION;
        }
    }

    @Override // p182r1.f
    public final void d(int i10) {
        if (this.f25730j) {
            return;
        }
        this.f25730j = true;
        this.f25727g = i10;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }
}
