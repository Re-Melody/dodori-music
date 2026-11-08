package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f15455e;

    public w0(y0 y0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f15455e = y0Var;
        this.f15451a = obj;
        this.f15452b = arrayList;
        this.f15453c = obj2;
        this.f15454d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        y0 y0Var = this.f15455e;
        Object obj = this.f15451a;
        if (obj != null) {
            y0Var.u(obj, this.f15452b, null);
        }
        Object obj2 = this.f15453c;
        if (obj2 != null) {
            y0Var.u(obj2, this.f15454d, null);
        }
    }
}
