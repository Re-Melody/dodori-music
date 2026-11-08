package p128l6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f22052d;

    public d(g gVar) {
        this.f22052d = gVar;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        throw null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.f22049a) {
            throw null;
        }
        valueAnimator.getAnimatedFraction();
        throw null;
    }
}
