package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p036d.C1894b;

/* JADX INFO: renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1082h extends E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1078f f15302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f15303d;

    public C1082h(C1078f c1078f) {
        this.f15302c = c1078f;
    }

    @Override // androidx.fragment.app.E0
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        AnimatorSet animatorSet = this.f15303d;
        F0 f10 = this.f15302c.f15354a;
        if (animatorSet == null) {
            f10.c(this);
            return;
        }
        if (!f10.f15202g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1086j.f15345a.a(animatorSet);
        }
        if (AbstractC1083h0.J(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(f10);
            sb.append(" has been canceled");
            sb.append(f10.f15202g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // androidx.fragment.app.E0
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        F0 f10 = this.f15302c.f15354a;
        AnimatorSet animatorSet = this.f15303d;
        if (animatorSet == null) {
            f10.c(this);
            return;
        }
        animatorSet.start();
        if (AbstractC1083h0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + f10 + " has started.");
        }
    }

    @Override // androidx.fragment.app.E0
    public final void d(C1894b backEvent, ViewGroup container) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        kotlin.jvm.internal.m.f(container, "container");
        F0 f10 = this.f15302c.f15354a;
        AnimatorSet animatorSet = this.f15303d;
        if (animatorSet == null) {
            f10.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !f10.f15198c.mTransitioning) {
            return;
        }
        if (AbstractC1083h0.J(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + f10);
        }
        long jA = C1084i.f15344a.a(animatorSet);
        long j10 = (long) (backEvent.f18975c * jA);
        if (j10 == 0) {
            j10 = 1;
        }
        if (j10 == jA) {
            j10 = jA - 1;
        }
        if (AbstractC1083h0.J(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j10 + " for Animator " + animatorSet + " on operation " + f10);
        }
        C1086j.f15345a.b(animatorSet, j10);
    }

    @Override // androidx.fragment.app.E0
    public final void e(ViewGroup container) {
        C1082h c1082h;
        kotlin.jvm.internal.m.f(container, "container");
        C1078f c1078f = this.f15302c;
        if (c1078f.a()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.m.e(context, "context");
        L lB = c1078f.b(context);
        this.f15303d = lB != null ? (AnimatorSet) lB.f15216b : null;
        F0 f10 = c1078f.f15354a;
        F f11 = f10.f15198c;
        boolean z10 = f10.f15196a == J0.GONE;
        View view = f11.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f15303d;
        if (animatorSet != null) {
            c1082h = this;
            animatorSet.addListener(new C1080g(container, view, z10, f10, c1082h));
        } else {
            c1082h = this;
        }
        AnimatorSet animatorSet2 = c1082h.f15303d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
