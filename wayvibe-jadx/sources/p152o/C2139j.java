package p152o;

import Y7.e;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import app.nagakiba.wayvibe.R;
import java.util.ArrayList;
import p142n.D;
import p142n.l;
import p142n.n;
import p142n.o;
import p142n.t;
import p142n.w;
import p142n.x;
import p142n.y;
import p142n.z;

/* JADX INFO: renamed from: o.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2139j implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f23369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f23370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f23371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f23372e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f23375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2137i f23376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f23377j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23383q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2131f f23384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C2131f f23385t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RunnableC2135h f23386u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C2133g f23387v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23373f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23374g = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray r = new SparseBooleanArray();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f23388w = new e(this, 25);

    public C2139j(Context context) {
        this.f23368a = context;
        this.f23371d = LayoutInflater.from(context);
    }

    @Override // p142n.x
    public final void a(l lVar, boolean z10) {
        f();
        C2131f c2131f = this.f23385t;
        if (c2131f != null && c2131f.b()) {
            c2131f.f22702i.dismiss();
        }
        w wVar = this.f23372e;
        if (wVar != null) {
            wVar.a(lVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(n nVar, View view, ViewGroup viewGroup) {
        y yVar;
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            if (view instanceof y) {
                yVar = (y) view;
            } else {
                yVar = (y) this.f23371d.inflate(this.f23374g, viewGroup, false);
            }
            yVar.a(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f23375h);
            if (this.f23387v == null) {
                this.f23387v = new C2133g(this);
            }
            actionMenuItemView.setPopupCallback(this.f23387v);
            actionView = (View) yVar;
        }
        actionView.setVisibility(nVar.f22657C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C2143l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // p142n.x
    public final void c(Context context, l lVar) {
        this.f23369b = context;
        LayoutInflater.from(context);
        this.f23370c = lVar;
        Resources resources = context.getResources();
        if (!this.f23379m) {
            this.f23378l = true;
        }
        int i10 = 2;
        this.f23380n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f23382p = i10;
        int measuredWidth = this.f23380n;
        if (this.f23378l) {
            if (this.f23376i == null) {
                C2137i c2137i = new C2137i(this, this.f23368a);
                this.f23376i = c2137i;
                if (this.k) {
                    c2137i.setImageDrawable(this.f23377j);
                    this.f23377j = null;
                    this.k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f23376i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f23376i.getMeasuredWidth();
        } else {
            this.f23376i = null;
        }
        this.f23381o = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p142n.x
    public final boolean d(D d10) {
        boolean z10;
        if (d10.hasVisibleItems()) {
            D d11 = d10;
            while (true) {
                l lVar = d11.f22570z;
                if (lVar == this.f23370c) {
                    break;
                }
                d11 = (D) lVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f23375h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof y) && ((y) childAt).getItemData() == d11.f22569A) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                d10.f22569A.getClass();
                int size = d10.f22635f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = d10.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                C2131f c2131f = new C2131f(this, this.f23369b, d10, view);
                this.f23385t = c2131f;
                c2131f.f22700g = z10;
                t tVar = c2131f.f22702i;
                if (tVar != null) {
                    tVar.o(z10);
                }
                C2131f c2131f2 = this.f23385t;
                if (!c2131f2.b()) {
                    if (c2131f2.f22698e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c2131f2.d(0, 0, false, false);
                }
                w wVar = this.f23372e;
                if (wVar != null) {
                    wVar.b(d10);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p142n.x
    public final boolean e() {
        int size;
        ArrayList arrayListL;
        int i10;
        boolean z10;
        C2139j c2139j = this;
        l lVar = c2139j.f23370c;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i11 = c2139j.f23382p;
        int i12 = c2139j.f23381o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c2139j.f23375h;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            n nVar = (n) arrayListL.get(i13);
            int i16 = nVar.f22680y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (c2139j.f23383q && nVar.f22657C) {
                i11 = 0;
            }
            i13++;
        }
        if (c2139j.f23378l && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = c2139j.r;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            n nVar2 = (n) arrayListL.get(i18);
            int i20 = nVar2.f22680y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = nVar2.f22659b;
            if (z12) {
                View viewB = c2139j.b(nVar2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                nVar2.f(z10);
            } else {
                if ((i20 & 1) == z10) {
                    boolean z13 = sparseBooleanArray.get(i21);
                    boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                    if (z14) {
                        View viewB2 = c2139j.b(nVar2, null, viewGroup);
                        viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewB2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z14 &= i12 + i19 > 0;
                    }
                    if (z14 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            n nVar3 = (n) arrayListL.get(i22);
                            if (nVar3.f22659b == i21) {
                                if ((nVar3.f22679x & 32) == 32) {
                                    i17++;
                                }
                                nVar3.f(false);
                            }
                        }
                    }
                    if (z14) {
                        i17--;
                    }
                    nVar2.f(z14);
                } else {
                    nVar2.f(false);
                }
                i18++;
                i10 = 2;
                c2139j = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            c2139j = this;
            z10 = true;
        }
        return z10;
    }

    public final boolean f() {
        Object obj;
        RunnableC2135h runnableC2135h = this.f23386u;
        if (runnableC2135h != null && (obj = this.f23375h) != null) {
            ((View) obj).removeCallbacks(runnableC2135h);
            this.f23386u = null;
            return true;
        }
        C2131f c2131f = this.f23384s;
        if (c2131f == null) {
            return false;
        }
        if (c2131f.b()) {
            c2131f.f22702i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p142n.x
    public final void g() {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f23375h;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l lVar = this.f23370c;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.f23370c.l();
                int size = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    n nVar = (n) arrayListL.get(i11);
                    if ((nVar.f22679x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        n itemData = childAt instanceof y ? ((y) childAt).getItemData() : null;
                        View viewB = b(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.f23375h).addView(viewB, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f23376i) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f23375h).requestLayout();
        l lVar2 = this.f23370c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f22638i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                o oVar = ((n) arrayList2.get(i12)).f22655A;
            }
        }
        l lVar3 = this.f23370c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f22639j;
        }
        if (this.f23378l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((n) arrayList.get(0)).f22657C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f23376i == null) {
                this.f23376i = new C2137i(this, this.f23368a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f23376i.getParent();
            if (viewGroup3 != this.f23375h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f23376i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f23375h;
                C2137i c2137i = this.f23376i;
                actionMenuView.getClass();
                C2143l c2143lJ = ActionMenuView.j();
                c2143lJ.f23389a = true;
                actionMenuView.addView(c2137i, c2143lJ);
            }
        } else {
            C2137i c2137i2 = this.f23376i;
            if (c2137i2 != null) {
                Object parent = c2137i2.getParent();
                Object obj = this.f23375h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f23376i);
                }
            }
        }
        ((ActionMenuView) this.f23375h).setOverflowReserved(this.f23378l);
    }

    public final boolean h() {
        C2131f c2131f = this.f23384s;
        return c2131f != null && c2131f.b();
    }

    @Override // p142n.x
    public final boolean i(n nVar) {
        return false;
    }

    @Override // p142n.x
    public final void j(w wVar) {
        throw null;
    }

    @Override // p142n.x
    public final boolean k(n nVar) {
        return false;
    }

    public final boolean l() {
        l lVar;
        if (!this.f23378l || h() || (lVar = this.f23370c) == null || this.f23375h == null || this.f23386u != null) {
            return false;
        }
        lVar.i();
        if (lVar.f22639j.isEmpty()) {
            return false;
        }
        RunnableC2135h runnableC2135h = new RunnableC2135h(this, new C2131f(this, this.f23369b, this.f23370c, this.f23376i));
        this.f23386u = runnableC2135h;
        ((View) this.f23375h).post(runnableC2135h);
        return true;
    }
}
