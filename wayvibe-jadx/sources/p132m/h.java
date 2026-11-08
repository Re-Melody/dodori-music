package p132m;

import D1.a;
import V0.p;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p142n.n;
import p142n.o;
import p142n.s;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f22137A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f22138B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ i f22141E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f22142a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22151j;
    public CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f22152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f22154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f22156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22157q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22159t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22160u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22161v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22162w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f22163x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f22164y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f22165z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f22139C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f22140D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22143b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22144c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22145d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22146e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22147f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22148g = true;

    public h(i iVar, Menu menu) {
        this.f22141E = iVar;
        this.f22142a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f22141E.f22170c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z10 = false;
        menuItem.setChecked(this.f22158s).setVisible(this.f22159t).setEnabled(this.f22160u).setCheckable(this.r >= 1).setTitleCondensed(this.f22152l).setIcon(this.f22153m);
        int i10 = this.f22161v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f22164y;
        i iVar = this.f22141E;
        if (str != null) {
            if (iVar.f22170c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (iVar.f22171d == null) {
                iVar.f22171d = i.a(iVar.f22170c);
            }
            Object obj = iVar.f22171d;
            String str2 = this.f22164y;
            g gVar = new g();
            gVar.f22135a = obj;
            Class<?> cls = obj.getClass();
            try {
                gVar.f22136b = cls.getMethod(str2, g.f22134c);
                menuItem.setOnMenuItemClickListener(gVar);
            } catch (Exception e2) {
                StringBuilder sbU = p.u("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbU.append(cls.getName());
                InflateException inflateException = new InflateException(sbU.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f22679x = (nVar.f22679x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.f22691d;
                    a aVar = sVar.f22690c;
                    if (method == null) {
                        sVar.f22691d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f22691d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e4) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
                }
            }
        }
        String str3 = this.f22163x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, i.f22166e, iVar.f22168a));
            z10 = true;
        }
        int i11 = this.f22162w;
        if (i11 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        o oVar = this.f22165z;
        if (oVar != null) {
            if (menuItem instanceof a) {
                ((a) menuItem).b(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f22137A;
        boolean z11 = menuItem instanceof a;
        if (z11) {
            ((a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1.a.n(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f22138B;
        if (z11) {
            ((a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1.a.r(menuItem, charSequence2);
        }
        char c3 = this.f22154n;
        int i12 = this.f22155o;
        if (z11) {
            ((a) menuItem).setAlphabeticShortcut(c3, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1.a.m(menuItem, c3, i12);
        }
        char c9 = this.f22156p;
        int i13 = this.f22157q;
        if (z11) {
            ((a) menuItem).setNumericShortcut(c9, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1.a.q(menuItem, c9, i13);
        }
        PorterDuff.Mode mode = this.f22140D;
        if (mode != null) {
            if (z11) {
                ((a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C1.a.p(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f22139C;
        if (colorStateList != null) {
            if (z11) {
                ((a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C1.a.o(menuItem, colorStateList);
            }
        }
    }
}
