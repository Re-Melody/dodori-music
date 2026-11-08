package androidx.fragment.app;

import K1.ViewTreeObserverOnPreDrawListenerC0619v;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f15218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15222e;

    public M(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f15222e = true;
        this.f15218a = viewGroup;
        this.f15219b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f15222e = true;
        if (this.f15220c) {
            return !this.f15221d;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f15220c = true;
            ViewTreeObserverOnPreDrawListenerC0619v.a(this.f15218a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f15220c;
        ViewGroup viewGroup = this.f15218a;
        if (z10 || !this.f15222e) {
            viewGroup.endViewTransition(this.f15219b);
            this.f15221d = true;
        } else {
            this.f15222e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f15222e = true;
        if (this.f15220c) {
            return !this.f15221d;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f15220c = true;
            ViewTreeObserverOnPreDrawListenerC0619v.a(this.f15218a, this);
        }
        return true;
    }
}
