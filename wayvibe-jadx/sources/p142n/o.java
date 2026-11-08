package p142n;

import Y7.e;
import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f22682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f22683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f22684c;

    public o(s sVar, ActionProvider actionProvider) {
        this.f22684c = sVar;
        this.f22683b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        e eVar = this.f22682a;
        if (eVar != null) {
            l lVar = ((n) eVar.f13395b).f22670n;
            lVar.f22637h = true;
            lVar.p(true);
        }
    }
}
