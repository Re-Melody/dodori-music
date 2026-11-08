package p197s6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f26154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f26155c;

    public b(boolean z10, View view, View view2) {
        this.f26153a = z10;
        this.f26154b = view;
        this.f26155c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f26153a) {
            return;
        }
        this.f26154b.setVisibility(4);
        View view = this.f26155c;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f26153a) {
            this.f26154b.setVisibility(0);
            View view = this.f26155c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
