package p142n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class D extends l implements SubMenu {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final n f22569A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l f22570z;

    public D(Context context, l lVar, n nVar) {
        super(context);
        this.f22570z = lVar;
        this.f22569A = nVar;
    }

    @Override // p142n.l
    public final boolean d(n nVar) {
        return this.f22570z.d(nVar);
    }

    @Override // p142n.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f22570z.e(lVar, menuItem);
    }

    @Override // p142n.l
    public final boolean f(n nVar) {
        return this.f22570z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f22569A;
    }

    @Override // p142n.l
    public final String j() {
        n nVar = this.f22569A;
        int i10 = nVar != null ? nVar.f22658a : 0;
        if (i10 == 0) {
            return null;
        }
        return b.j(i10, "android:menu:actionviewstates:");
    }

    @Override // p142n.l
    public final l k() {
        return this.f22570z.k();
    }

    @Override // p142n.l
    public final boolean m() {
        return this.f22570z.m();
    }

    @Override // p142n.l
    public final boolean n() {
        return this.f22570z.n();
    }

    @Override // p142n.l
    public final boolean o() {
        return this.f22570z.o();
    }

    @Override // p142n.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f22570z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f22569A.setIcon(drawable);
        return this;
    }

    @Override // p142n.l, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f22570z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f22569A.setIcon(i10);
        return this;
    }
}
