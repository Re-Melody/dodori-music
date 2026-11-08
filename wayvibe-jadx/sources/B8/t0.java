package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f874b;

    public t0(r0 r0Var) {
        super(r0.b(r0Var), r0Var.f861c);
        this.f873a = r0Var;
        this.f874b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f874b ? super.fillInStackTrace() : this;
    }
}
