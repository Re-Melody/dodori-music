package K1;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f7323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B1.c[] f7324b;

    public n0() {
        this(new z0());
    }

    public final void a() {
        B1.c[] cVarArr = this.f7324b;
        if (cVarArr != null) {
            B1.c cVarF = cVarArr[0];
            B1.c cVarF2 = cVarArr[1];
            z0 z0Var = this.f7323a;
            if (cVarF2 == null) {
                cVarF2 = z0Var.f7354a.f(2);
            }
            if (cVarF == null) {
                cVarF = z0Var.f7354a.f(1);
            }
            g(B1.c.a(cVarF, cVarF2));
            B1.c cVar = this.f7324b[p242x0.c.C(16)];
            if (cVar != null) {
                f(cVar);
            }
            B1.c cVar2 = this.f7324b[p242x0.c.C(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            B1.c cVar3 = this.f7324b[p242x0.c.C(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract z0 b();

    public void c(int i10, B1.c cVar) {
        if (this.f7324b == null) {
            this.f7324b = new B1.c[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f7324b[p242x0.c.C(i11)] = cVar;
            }
        }
    }

    public abstract void e(B1.c cVar);

    public abstract void g(B1.c cVar);

    public n0(z0 z0Var) {
        this.f7323a = z0Var;
    }

    public void d(B1.c cVar) {
    }

    public void f(B1.c cVar) {
    }

    public void h(B1.c cVar) {
    }
}
