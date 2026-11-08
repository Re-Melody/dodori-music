package p152o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2123b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f23306b;

    public /* synthetic */ RunnableC2123b(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f23305a = i10;
        this.f23306b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23305a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f23306b;
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.f14496w = actionBarOverlayLayout.f14479d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f14497x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f23306b;
                actionBarOverlayLayout2.c();
                actionBarOverlayLayout2.f14496w = actionBarOverlayLayout2.f14479d.animate().translationY(-actionBarOverlayLayout2.f14479d.getHeight()).setListener(actionBarOverlayLayout2.f14497x);
                break;
        }
    }
}
