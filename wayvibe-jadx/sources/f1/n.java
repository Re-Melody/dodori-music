package f1;

import D4.u;
import F0.AbstractC0388f;
import F0.AbstractC0395m;
import F0.p0;
import G0.A;
import G0.r;
import android.view.View;
import android.view.ViewTreeObserver;
import p067g0.q;
import p122l0.y;

/* JADX INFO: loaded from: classes.dex */
public final class n extends q implements p122l0.p, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f19730a;

    @Override // p122l0.p
    public final void J(p122l0.m mVar) {
        mVar.d(false);
        mVar.b(new r(1, this, n.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 3));
        mVar.c(new r(1, this, n.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 4));
    }

    public final y o0() {
        if (!getNode().isAttached()) {
            p206t6.b.g0("visitLocalDescendants called on an unattached node");
            throw null;
        }
        q node = getNode();
        if ((node.getAggregateChildKindSet$ui_release() & 1024) != 0) {
            boolean z10 = false;
            for (q child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                    q qVarF = child$ui_release;
                    W.d dVar = null;
                    while (qVarF != null) {
                        if (qVarF instanceof y) {
                            y yVar = (y) qVarF;
                            if (z10) {
                                return yVar;
                            }
                            z10 = true;
                        } else if ((qVarF.getKindSet$ui_release() & 1024) != 0 && (qVarF instanceof AbstractC0395m)) {
                            int i10 = 0;
                            for (q child$ui_release2 = ((AbstractC0395m) qVarF).f3813b; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        qVarF = child$ui_release2;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new W.d(new q[16]);
                                        }
                                        if (qVarF != null) {
                                            dVar.b(qVarF);
                                            qVarF = null;
                                        }
                                        dVar.b(child$ui_release2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        qVarF = AbstractC0388f.f(dVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // p067g0.q
    public final void onAttach() {
        super.onAttach();
        j.c(this).addOnAttachStateChangeListener(this);
    }

    @Override // p067g0.q
    public final void onDetach() {
        j.c(this).removeOnAttachStateChangeListener(this);
        this.f19730a = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC0388f.r(this).f3595i == null) {
            return;
        }
        View viewC = j.c(this);
        p122l0.j focusOwner = ((A) AbstractC0388f.s(this)).getFocusOwner();
        p0 p0VarS = AbstractC0388f.s(this);
        boolean z10 = (view == null || view.equals(p0VarS) || !j.a(viewC, view)) ? false : true;
        boolean z11 = (view2 == null || view2.equals(p0VarS) || !j.a(viewC, view2)) ? false : true;
        if (z10 && z11) {
            this.f19730a = view2;
            return;
        }
        if (!z11) {
            if (!z10) {
                this.f19730a = null;
                return;
            }
            this.f19730a = null;
            if (o0().p0().g()) {
                ((androidx.compose.ui.focus.b) focusOwner).a(8, false, false);
                return;
            }
            return;
        }
        this.f19730a = view2;
        y yVarO0 = o0();
        if (yVarO0.p0().f()) {
            return;
        }
        u uVar = ((androidx.compose.ui.focus.b) focusOwner).f14812h;
        try {
            if (uVar.f2105b) {
                u.c(uVar);
            }
            uVar.f2105b = true;
            p122l0.f.y(yVarO0);
        } finally {
            u.d(uVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
