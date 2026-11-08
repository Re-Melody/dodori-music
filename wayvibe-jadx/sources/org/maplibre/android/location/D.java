package org.maplibre.android.location;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f24650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f24653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24655f;

    public D(Object[] objArr, C c3, int i10) {
        this.f24653d = 1.0E9d / ((double) i10);
        setObjectValues(objArr);
        setEvaluator(a());
        this.f24650a = c3;
        this.f24651b = objArr[objArr.length - 1];
        addUpdateListener(this);
        addListener(new P3.p(this, 5));
    }

    public abstract TypeEvaluator a();

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f24652c = valueAnimator.getAnimatedValue();
        long jNanoTime = System.nanoTime();
        if (jNanoTime - this.f24654e < this.f24653d) {
            return;
        }
        if (!this.f24655f) {
            this.f24650a.a(this.f24652c);
        }
        this.f24654e = jNanoTime;
    }
}
