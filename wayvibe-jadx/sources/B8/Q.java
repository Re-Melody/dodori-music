package B8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0114a f752b = new C0114a("internal:health-checking-config");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0125l f753c = new C0125l(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0114a f754d = new C0114a("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0114a f755e = new C0114a("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f756a;

    public r0 a(N n6) {
        List list = n6.f749a;
        if (!list.isEmpty() || b()) {
            int i10 = this.f756a;
            this.f756a = i10 + 1;
            if (i10 == 0) {
                d(n6);
            }
            this.f756a = 0;
            return r0.f848e;
        }
        r0 r0VarG = r0.f856n.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + n6.f750b);
        c(r0VarG);
        return r0VarG;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(r0 r0Var);

    public void d(N n6) {
        int i10 = this.f756a;
        this.f756a = i10 + 1;
        if (i10 == 0) {
            a(n6);
        }
        this.f756a = 0;
    }

    public abstract void f();

    public void e() {
    }
}
