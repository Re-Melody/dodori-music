package p142n;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f22686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f22687b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f22687b = sVar;
        this.f22686a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f22686a.onMenuItemActionCollapse(this.f22687b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f22686a.onMenuItemActionExpand(this.f22687b.g(menuItem));
    }
}
