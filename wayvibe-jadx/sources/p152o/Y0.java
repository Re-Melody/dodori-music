package p152o;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p132m.c;
import p142n.D;
import p142n.l;
import p142n.n;
import p142n.p;
import p142n.x;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f23298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f23299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f23300c;

    public Y0(Toolbar toolbar) {
        this.f23300c = toolbar;
    }

    @Override // p142n.x
    public final void c(Context context, l lVar) {
        n nVar;
        l lVar2 = this.f23298a;
        if (lVar2 != null && (nVar = this.f23299b) != null) {
            lVar2.d(nVar);
        }
        this.f23298a = lVar;
    }

    @Override // p142n.x
    public final boolean d(D d10) {
        return false;
    }

    @Override // p142n.x
    public final boolean e() {
        return false;
    }

    @Override // p142n.x
    public final void g() {
        if (this.f23299b != null) {
            l lVar = this.f23298a;
            if (lVar != null) {
                int size = lVar.f22635f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f23298a.getItem(i10) == this.f23299b) {
                        return;
                    }
                }
            }
            k(this.f23299b);
        }
    }

    @Override // p142n.x
    public final boolean i(n nVar) {
        Toolbar toolbar = this.f23300c;
        toolbar.c();
        ViewParent parent = toolbar.f14593h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f14593h);
            }
            toolbar.addView(toolbar.f14593h);
        }
        View actionView = nVar.getActionView();
        toolbar.f14594i = actionView;
        this.f23299b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f14594i);
            }
            Z0 z0H = Toolbar.h();
            z0H.f23301a = (toolbar.f14600n & 112) | 8388611;
            z0H.f23302b = 2;
            toolbar.f14594i.setLayoutParams(z0H);
            toolbar.addView(toolbar.f14594i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Z0) childAt.getLayoutParams()).f23302b != 2 && childAt != toolbar.f14586a) {
                toolbar.removeViewAt(childCount);
                toolbar.f14573E.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f22657C = true;
        nVar.f22670n.p(false);
        KeyEvent.Callback callback = toolbar.f14594i;
        if (callback instanceof c) {
            ((p) ((c) callback)).f22685a.onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // p142n.x
    public final boolean k(n nVar) {
        Toolbar toolbar = this.f23300c;
        KeyEvent.Callback callback = toolbar.f14594i;
        if (callback instanceof c) {
            ((p) ((c) callback)).f22685a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f14594i);
        toolbar.removeView(toolbar.f14593h);
        toolbar.f14594i = null;
        ArrayList arrayList = toolbar.f14573E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f23299b = null;
        toolbar.requestLayout();
        nVar.f22657C = false;
        nVar.f22670n.p(false);
        toolbar.v();
        return true;
    }

    @Override // p142n.x
    public final void a(l lVar, boolean z10) {
    }
}
