package K1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7263c;

    public /* synthetic */ Y(int i10, View view, Object obj) {
        this.f7261a = i10;
        this.f7263c = obj;
        this.f7262b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7261a) {
            case 0:
                ((InterfaceC0596a0) this.f7263c).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7261a) {
            case 0:
                ((InterfaceC0596a0) this.f7263c).c();
                break;
            case 1:
                h0 h0Var = (h0) this.f7263c;
                h0Var.f7304a.c(1.0f);
                C0602d0.d((View) this.f7262b, h0Var);
                break;
            default:
                ((C2230e) this.f7263c).remove(animator);
                ((P3.s) this.f7262b).k.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f7261a) {
            case 0:
                ((InterfaceC0596a0) this.f7263c).b();
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                ((P3.s) this.f7262b).k.add(animator);
                break;
        }
    }

    public Y(P3.s sVar, C2230e c2230e) {
        this.f7261a = 2;
        this.f7262b = sVar;
        this.f7263c = c2230e;
    }
}
