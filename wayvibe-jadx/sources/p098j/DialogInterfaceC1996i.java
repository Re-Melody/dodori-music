package p098j;

import K1.InterfaceC0607i;
import K1.L;
import K1.T;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.U;
import app.nagakiba.wayvibe.R;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.WeakHashMap;
import org.slf4j.helpers.i;
import p036d.p;
import p132m.a;
import p206t6.b;

/* JADX INFO: renamed from: j.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC1996i extends p implements DialogInterface, InterfaceC1999l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C f21350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D f21351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1995h f21352f;

    /* JADX WARN: Type inference failed for: r2v2, types: [j.D] */
    public DialogInterfaceC1996i(ContextThemeWrapper contextThemeWrapper, int i10) {
        int i11;
        int iF = f(contextThemeWrapper, i10);
        if (iF == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = iF;
        }
        super(contextThemeWrapper, i11);
        this.f21351e = new InterfaceC0607i() { // from class: j.D
            @Override // K1.InterfaceC0607i
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f21261a.h(keyEvent);
            }
        };
        q qVarC = c();
        if (iF == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iF = typedValue2.resourceId;
        }
        ((C) qVarC).f21232Z = iF;
        qVarC.d();
        this.f21352f = new C1995h(getContext(), this, getWindow());
    }

    public static int f(Context context, int i10) {
        if (((i10 >>> 24) & ColorExtractionConstants.COLOR_COMPONENT_MASK) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p036d.p, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C c3 = (C) c();
        c3.x();
        ((ViewGroup) c3.f21213A.findViewById(android.R.id.content)).addView(view, layoutParams);
        c3.f21236m.a(c3.f21234l.getCallback());
    }

    public final q c() {
        if (this.f21350d == null) {
            o oVar = q.f21358a;
            this.f21350d = new C(getContext(), getWindow(), this, this);
        }
        return this.f21350d;
    }

    public final void d() {
        U.i(getWindow().getDecorView(), this);
        b.Z(getWindow().getDecorView(), this);
        i.I(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return p046da.b.t(this.f21351e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        C c3 = (C) c();
        c3.x();
        return c3.f21234l.findViewById(i10);
    }

    public final void g(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().l(charSequence);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().b();
    }

    @Override // p036d.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i10;
        ListAdapter listAdapter;
        View viewFindViewById;
        e(bundle);
        C1995h c1995h = this.f21352f;
        c1995h.f21330b.setContentView(c1995h.f21344q);
        Window window = c1995h.f21331c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = C1995h.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = C1995h.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = C1995h.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1995h.f21337i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1995h.f21337i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        c1995h.f21340m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c1995h.f21337i.removeView(c1995h.f21340m);
            if (c1995h.f21333e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c1995h.f21337i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c1995h.f21337i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c1995h.f21333e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        c1995h.f21334f = button;
        ViewOnClickListenerC1990c viewOnClickListenerC1990c = c1995h.f21349w;
        button.setOnClickListener(viewOnClickListenerC1990c);
        if (TextUtils.isEmpty(null)) {
            c1995h.f21334f.setVisibility(8);
            i10 = 0;
        } else {
            c1995h.f21334f.setText((CharSequence) null);
            c1995h.f21334f.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        c1995h.f21335g = button2;
        button2.setOnClickListener(viewOnClickListenerC1990c);
        if (TextUtils.isEmpty(null)) {
            c1995h.f21335g.setVisibility(8);
        } else {
            c1995h.f21335g.setText((CharSequence) null);
            c1995h.f21335g.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        c1995h.f21336h = button3;
        button3.setOnClickListener(viewOnClickListenerC1990c);
        if (TextUtils.isEmpty(null)) {
            c1995h.f21336h.setVisibility(8);
        } else {
            c1995h.f21336h.setText((CharSequence) null);
            c1995h.f21336h.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c1995h.f21329a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = c1995h.f21334f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = c1995h.f21335g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = c1995h.f21336h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (c1995h.f21341n != null) {
            viewGroupA.addView(c1995h.f21341n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c1995h.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c1995h.f21332d) || !c1995h.f21347u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c1995h.k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c1995h.f21339l = textView2;
                textView2.setText(c1995h.f21332d);
                Drawable drawable = c1995h.f21338j;
                if (drawable != null) {
                    c1995h.k.setImageDrawable(drawable);
                } else {
                    c1995h.f21339l.setPadding(c1995h.k.getPaddingLeft(), c1995h.k.getPaddingTop(), c1995h.k.getPaddingRight(), c1995h.k.getPaddingBottom());
                    c1995h.k.setVisibility(8);
                }
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i11 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z11 = viewGroupA3.getVisibility() != 8;
        if (!z11 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = c1995h.f21337i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c1995h.f21333e != null ? viewGroupA.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c1995h.f21333e;
        if (alertController$RecycleListView != null && (!z11 || i11 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f14414a, alertController$RecycleListView.getPaddingRight(), z11 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f14415b);
        }
        if (!z10) {
            View view = c1995h.f21333e;
            if (view == null) {
                view = c1995h.f21337i;
            }
            if (view != null) {
                int i12 = (z11 ? 2 : 0) | i11;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = T.f7251a;
                L.b(view, i12, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c1995h.f21333e;
        if (alertController$RecycleListView2 == null || (listAdapter = c1995h.f21342o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i13 = c1995h.f21343p;
        if (i13 > -1) {
            alertController$RecycleListView2.setItemChecked(i13, true);
            alertController$RecycleListView2.setSelection(i13);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f21352f.f21337i;
        if (nestedScrollView == null || !nestedScrollView.k(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f21352f.f21337i;
        if (nestedScrollView == null || !nestedScrollView.k(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // p036d.p, android.app.Dialog
    public final void onStop() {
        super.onStop();
        C c3 = (C) c();
        c3.B();
        AbstractC1988a abstractC1988a = c3.f21240o;
        if (abstractC1988a != null) {
            abstractC1988a.n(false);
        }
    }

    @Override // p098j.InterfaceC1999l
    public final p132m.b onWindowStartingSupportActionMode(a aVar) {
        return null;
    }

    @Override // p036d.p, android.app.Dialog
    public final void setContentView(int i10) {
        d();
        c().i(i10);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        c().l(getContext().getString(i10));
    }

    @Override // p036d.p, android.app.Dialog
    public final void setContentView(View view) {
        d();
        c().j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        g(charSequence);
        C1995h c1995h = this.f21352f;
        c1995h.f21332d = charSequence;
        TextView textView = c1995h.f21339l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // p036d.p, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c().k(view, layoutParams);
    }

    @Override // p098j.InterfaceC1999l
    public final void onSupportActionModeFinished(p132m.b bVar) {
    }

    @Override // p098j.InterfaceC1999l
    public final void onSupportActionModeStarted(p132m.b bVar) {
    }
}
