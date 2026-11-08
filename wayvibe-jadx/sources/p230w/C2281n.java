package p230w;

import U.C0880d;
import U.C0891i0;
import U.U;
import U.Y0;

/* JADX INFO: renamed from: w.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2281n implements Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f27745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0891i0 f27746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC2285s f27747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27750f;

    public /* synthetic */ C2281n(o0 o0Var, Object obj, AbstractC2285s abstractC2285s, int i10) {
        this(o0Var, obj, (i10 & 4) != 0 ? null : abstractC2285s, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object a() {
        return this.f27745a.f27756b.invoke(this.f27747c);
    }

    @Override // U.Y0
    public final Object getValue() {
        return this.f27746b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f27746b.getValue() + ", velocity=" + a() + ", isRunning=" + this.f27750f + ", lastFrameTimeNanos=" + this.f27748d + ", finishedTimeNanos=" + this.f27749e + ')';
    }

    public C2281n(o0 o0Var, Object obj, AbstractC2285s abstractC2285s, long j10, long j11, boolean z10) {
        AbstractC2285s abstractC2285sJ;
        this.f27745a = o0Var;
        this.f27746b = C0880d.K(obj, U.f11815f);
        if (abstractC2285s != null) {
            abstractC2285sJ = AbstractC2272e.j(abstractC2285s);
        } else {
            abstractC2285sJ = (AbstractC2285s) o0Var.f27755a.invoke(obj);
            abstractC2285sJ.d();
        }
        this.f27747c = abstractC2285sJ;
        this.f27748d = j10;
        this.f27749e = j11;
        this.f27750f = z10;
    }
}
