package p142n;

import D1.a;
import Y7.e;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class n implements a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public o f22655A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f22656B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f22662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f22663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f22664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f22665h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f22667j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f22668l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f22670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public D f22671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f22672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f22673q;
    public CharSequence r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f22680y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f22681z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22666i = 4096;
    public int k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22669m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f22674s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f22675t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22676u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22677v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22678w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22679x = 16;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f22657C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f22670n = lVar;
        this.f22658a = i11;
        this.f22659b = i10;
        this.f22660c = i12;
        this.f22661d = i13;
        this.f22662e = charSequence;
        this.f22680y = i14;
    }

    public static void c(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override // D1.a
    public final o a() {
        return this.f22655A;
    }

    @Override // D1.a
    public final a b(o oVar) {
        this.f22681z = null;
        this.f22655A = oVar;
        this.f22670n.p(true);
        o oVar2 = this.f22655A;
        if (oVar2 != null) {
            oVar2.f22682a = new e(this, 17);
            oVar2.f22683b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f22680y & 8) == 0) {
            return false;
        }
        if (this.f22681z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f22656B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f22670n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f22678w && (this.f22676u || this.f22677v)) {
            drawable = drawable.mutate();
            if (this.f22676u) {
                drawable.setTintList(this.f22674s);
            }
            if (this.f22677v) {
                drawable.setTintMode(this.f22675t);
            }
            this.f22678w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f22680y & 8) != 0) {
            if (this.f22681z == null && (oVar = this.f22655A) != null) {
                this.f22681z = oVar.f22683b.onCreateActionView(this);
            }
            if (this.f22681z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f22656B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f22670n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f22679x |= 32;
        } else {
            this.f22679x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f22681z;
        if (view != null) {
            return view;
        }
        o oVar = this.f22655A;
        if (oVar == null) {
            return null;
        }
        View viewOnCreateActionView = oVar.f22683b.onCreateActionView(this);
        this.f22681z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // D1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f22667j;
    }

    @Override // D1.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f22673q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f22659b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f22668l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f22669m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableR = c.r(this.f22670n.f22630a, i10);
        this.f22669m = 0;
        this.f22668l = drawableR;
        return d(drawableR);
    }

    @Override // D1.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f22674s;
    }

    @Override // D1.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f22675t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f22664g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f22658a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // D1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f22666i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f22665h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f22660c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f22671o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f22662e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f22663f;
        return charSequence != null ? charSequence : this.f22662e;
    }

    @Override // D1.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f22671o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f22657C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f22679x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f22679x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f22679x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.f22655A;
        if (oVar == null || !oVar.f22683b.overridesItemVisibility()) {
            return (this.f22679x & 8) == 0;
        }
        return (this.f22679x & 8) == 0 && this.f22655A.f22683b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f22681z = view;
        this.f22655A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f22658a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f22670n;
        lVar.k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f22667j == c3) {
            return this;
        }
        this.f22667j = Character.toLowerCase(c3);
        this.f22670n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f22679x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f22679x = i11;
        if (i10 != i11) {
            this.f22670n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f22679x;
        if ((i10 & 4) == 0) {
            int i11 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f22679x = i11;
            if (i10 != i11) {
                this.f22670n.p(false);
            }
            return this;
        }
        l lVar = this.f22670n;
        lVar.getClass();
        ArrayList arrayList = lVar.f22635f;
        int size = arrayList.size();
        lVar.w();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f22659b == this.f22659b && (nVar.f22679x & 4) != 0 && nVar.isCheckable()) {
                boolean z11 = nVar == this;
                int i13 = nVar.f22679x;
                int i14 = (z11 ? 2 : 0) | (i13 & (-3));
                nVar.f22679x = i14;
                if (i13 != i14) {
                    nVar.f22670n.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f22679x |= 16;
        } else {
            this.f22679x &= -17;
        }
        this.f22670n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f22669m = 0;
        this.f22668l = drawable;
        this.f22678w = true;
        this.f22670n.p(false);
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22674s = colorStateList;
        this.f22676u = true;
        this.f22678w = true;
        this.f22670n.p(false);
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f22675t = mode;
        this.f22677v = true;
        this.f22678w = true;
        this.f22670n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f22664g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f22665h == c3) {
            return this;
        }
        this.f22665h = c3;
        this.f22670n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f22656B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f22672p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c9) {
        this.f22665h = c3;
        this.f22667j = Character.toLowerCase(c9);
        this.f22670n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f22680y = i10;
        l lVar = this.f22670n;
        lVar.k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f22662e = charSequence;
        this.f22670n.p(false);
        D d10 = this.f22671o;
        if (d10 != null) {
            d10.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22663f = charSequence;
        this.f22670n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f22679x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f22679x = i11;
        if (i10 != i11) {
            l lVar = this.f22670n;
            lVar.f22637h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f22662e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // D1.a, android.view.MenuItem
    public final a setContentDescription(CharSequence charSequence) {
        this.f22673q = charSequence;
        this.f22670n.p(false);
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final a setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f22670n.p(false);
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        if (this.f22667j == c3 && this.k == i10) {
            return this;
        }
        this.f22667j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i10);
        this.f22670n.p(false);
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i10) {
        if (this.f22665h == c3 && this.f22666i == i10) {
            return this;
        }
        this.f22665h = c3;
        this.f22666i = KeyEvent.normalizeMetaState(i10);
        this.f22670n.p(false);
        return this;
    }

    @Override // D1.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c9, int i10, int i11) {
        this.f22665h = c3;
        this.f22666i = KeyEvent.normalizeMetaState(i10);
        this.f22667j = Character.toLowerCase(c9);
        this.k = KeyEvent.normalizeMetaState(i11);
        this.f22670n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f22668l = null;
        this.f22669m = i10;
        this.f22678w = true;
        this.f22670n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f22670n.f22630a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f22670n.f22630a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f22681z = viewInflate;
        this.f22655A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f22658a) > 0) {
            viewInflate.setId(i11);
        }
        l lVar = this.f22670n;
        lVar.k = true;
        lVar.p(true);
        return this;
    }
}
