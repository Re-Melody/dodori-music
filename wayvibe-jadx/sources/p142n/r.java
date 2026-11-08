package p142n;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class r implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f22688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f22689b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f22689b = sVar;
        this.f22688a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f22688a.onMenuItemClick(this.f22689b.g(menuItem));
    }
}
