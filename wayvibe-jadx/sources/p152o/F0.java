package p152o;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f23188a;

    public F0(G0 g3) {
        this.f23188a = g3;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        if (i10 == 1) {
            G0 g3 = this.f23188a;
            if (g3.f23219y.getInputMethodMode() == 2 || g3.f23219y.getContentView() == null) {
                return;
            }
            Handler handler = g3.f23215u;
            D0 d10 = g3.f23212q;
            handler.removeCallbacks(d10);
            d10.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
