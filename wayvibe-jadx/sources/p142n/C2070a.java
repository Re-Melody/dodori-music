package p142n;

import D1.a;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: n.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2070a implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f22571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f22572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f22573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f22574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f22576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f22578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f22579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f22580j;
    public CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f22581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f22582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22585p;

    @Override // D1.a
    public final o a() {
        return null;
    }

    @Override // D1.a
    public final a b(o oVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f22578h;
        if (drawable != null) {
            if (this.f22583n || this.f22584o) {
                this.f22578h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f22578h = drawableMutate;
                if (this.f22583n) {
                    drawableMutate.setTintList(this.f22581l);
                }
                if (this.f22584o) {
                    this.f22578h.setTintMode(this.f22582m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // D1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f22577g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f22576f;
    }

    @Override // D1.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f22580j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f22578h;
    }

    @Override // D1.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f22581l;
    }

    @Override // D1.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f22582m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f22573c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // D1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f22575e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f22574d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f22571a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f22572b;
        return charSequence != null ? charSequence : this.f22571a;
    }

    @Override // D1.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f22585p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f22585p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f22585p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f22585p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f22576f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f22585p = (z10 ? 1 : 0) | (this.f22585p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f22585p = (z10 ? 2 : 0) | (this.f22585p & (-3));
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final a setContentDescription(CharSequence charSequence) {
        this.f22580j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f22585p = (z10 ? 16 : 0) | (this.f22585p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f22578h = drawable;
        c();
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22581l = colorStateList;
        this.f22583n = true;
        c();
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f22582m = mode;
        this.f22584o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f22573c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.f22574d = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c9) {
        this.f22574d = c3;
        this.f22576f = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f22571a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22572b = charSequence;
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final a setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f22585p = (this.f22585p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        this.f22576f = Character.toLowerCase(c3);
        this.f22577g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f22580j = charSequence;
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i10) {
        this.f22574d = c3;
        this.f22575e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f22571a = this.f22579i.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f22578h = p254y1.a.getDrawable(this.f22579i, i10);
        c();
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c9, int i10, int i11) {
        this.f22574d = c3;
        this.f22575e = KeyEvent.normalizeMetaState(i10);
        this.f22576f = Character.toLowerCase(c9);
        this.f22577g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
