package p152o;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f23185b;

    public /* synthetic */ D0(G0 g3, int i10) {
        this.f23184a = i10;
        this.f23185b = g3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23184a) {
            case 0:
                C2161u0 c2161u0 = this.f23185b.f23199c;
                if (c2161u0 != null) {
                    c2161u0.setListSelectionHidden(true);
                    c2161u0.requestLayout();
                }
                break;
            default:
                G0 g3 = this.f23185b;
                C2161u0 c2161u1 = g3.f23199c;
                if (c2161u1 != null && c2161u1.isAttachedToWindow() && g3.f23199c.getCount() > g3.f23199c.getChildCount() && g3.f23199c.getChildCount() <= g3.f23208m) {
                    g3.f23219y.setInputMethodMode(2);
                    g3.f();
                    break;
                }
                break;
        }
    }
}
