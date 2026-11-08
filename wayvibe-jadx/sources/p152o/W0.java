package p152o;

import androidx.appcompat.widget.Toolbar;
import p142n.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f23285b;

    public /* synthetic */ W0(Toolbar toolbar, int i10) {
        this.f23284a = i10;
        this.f23285b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23284a) {
            case 0:
                Y0 y6 = this.f23285b.f14581M;
                n nVar = y6 == null ? null : y6.f23299b;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f23285b.m();
                break;
        }
    }
}
