package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f865b;

    public s0(r0 r0Var) {
        super(r0.b(r0Var), r0Var.f861c);
        this.f864a = r0Var;
        this.f865b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f865b ? super.fillInStackTrace() : this;
    }
}
