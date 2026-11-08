package D8;

import B8.EnumC0119f;
import B8.EnumC0128o;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0271e1 f2314b;

    public /* synthetic */ P0(C0271e1 c0271e1, int i10) {
        this.f2313a = i10;
        this.f2314b = c0271e1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2313a) {
            case 0:
                this.f2314b.D(true);
                break;
            case 1:
                C0271e1 c0271e1 = this.f2314b;
                if (!c0271e1.f2547J.get() && c0271e1.f2538A != null) {
                    c0271e1.D(false);
                    C0271e1.A(c0271e1);
                    break;
                }
                break;
            case 2:
                this.f2314b.E();
                if (this.f2314b.f2539B != null) {
                    this.f2314b.f2539B.getClass();
                }
                V0 v3 = this.f2314b.f2538A;
                if (v3 != null) {
                    ((B8.Q) v3.f2393d.f1502c).e();
                }
                break;
            case 3:
                C0271e1 c0271e2 = this.f2314b;
                c0271e2.f2555R.m(EnumC0119f.INFO, "Entering SHUTDOWN state");
                c0271e2.f2585u.b(EnumC0128o.SHUTDOWN);
                break;
            case 4:
                C0271e1 c0271e3 = this.f2314b;
                if (!c0271e3.f2548K) {
                    c0271e3.f2548K = true;
                    C0271e1.B(c0271e3);
                    break;
                }
                break;
            default:
                C0271e1 c0271e4 = this.f2314b;
                if (c0271e4.f2538A != null) {
                    C0271e1.A(c0271e4);
                    break;
                }
                break;
        }
    }
}
