package K1;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: K1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0619v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f7345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f7346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f7347c;

    public ViewTreeObserverOnPreDrawListenerC0619v(View view, Runnable runnable) {
        this.f7345a = view;
        this.f7346b = view.getViewTreeObserver();
        this.f7347c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0619v viewTreeObserverOnPreDrawListenerC0619v = new ViewTreeObserverOnPreDrawListenerC0619v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0619v);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0619v);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f7346b.isAlive();
        View view = this.f7345a;
        if (zIsAlive) {
            this.f7346b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f7347c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f7346b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f7346b.isAlive();
        View view2 = this.f7345a;
        if (zIsAlive) {
            this.f7346b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
