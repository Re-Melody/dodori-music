package p045d8;

import android.window.OnBackInvokedCallback;
import p098j.C;

/* JADX INFO: renamed from: d8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1930b implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19347b;

    public /* synthetic */ C1930b(Object obj, int i10) {
        this.f19346a = i10;
        this.f19347b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f19346a) {
            case 0:
                ((AbstractActivityC1932d) this.f19347b).onBackPressed();
                break;
            case 1:
                ((C) this.f19347b).E();
                break;
            default:
                ((Runnable) this.f19347b).run();
                break;
        }
    }
}
