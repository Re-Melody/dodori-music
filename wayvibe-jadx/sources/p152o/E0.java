package p152o;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f23186a;

    public E0(G0 g3) {
        this.f23186a = g3;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        G0 g3 = this.f23186a;
        if (g3.f23219y.isShowing()) {
            g3.f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f23186a.dismiss();
    }
}
