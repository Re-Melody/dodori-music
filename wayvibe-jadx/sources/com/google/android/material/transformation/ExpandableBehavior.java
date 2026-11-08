package com.google.android.material.transformation;

import K1.T;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p232w1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExpandableBehavior extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18226a = 0;

    public ExpandableBehavior() {
    }

    @Override // p232w1.a
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p232w1.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (p116k6.a) view2;
        boolean z10 = ((FloatingActionButton) obj).f18203o.f824c;
        if (z10) {
            int i10 = this.f18226a;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (this.f18226a != 1) {
            return false;
        }
        this.f18226a = z10 ? 1 : 2;
        s((View) obj, view, z10, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p232w1.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i10) {
        p116k6.a aVar;
        boolean z10;
        int i11;
        WeakHashMap weakHashMap = T.f7251a;
        if (!view.isLaidOut()) {
            ArrayList arrayListK = coordinatorLayout.k(view);
            int size = arrayListK.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) arrayListK.get(i12);
                if (b(view, view2)) {
                    aVar = (p116k6.a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null && (!(z10 = ((FloatingActionButton) aVar).f18203o.f824c) ? this.f18226a == 1 : !((i11 = this.f18226a) != 0 && i11 != 2))) {
                int i13 = z10 ? 1 : 2;
                this.f18226a = i13;
                view.getViewTreeObserver().addOnPreDrawListener(new p197s6.a(this, view, i13, aVar));
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
