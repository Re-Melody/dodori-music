package P3;

import U.W0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import org.maplibre.android.maps.C2211i;
import org.maplibre.android.maps.C2216n;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9587b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f9586a = i10;
        this.f9587b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f9586a) {
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f9587b;
                actionBarOverlayLayout.f14496w = null;
                actionBarOverlayLayout.f14485j = false;
                break;
            case 5:
            default:
                super.onAnimationCancel(animator);
                break;
            case 6:
                ((C2216n) this.f9587b).f24986a.c();
                break;
            case 7:
                ((C2211i) this.f9587b).f24972f.f24986a.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9586a) {
            case 0:
                ((s) this.f9587b).m();
                animator.removeListener(this);
                break;
            case 1:
                ((HideBottomViewOnScrollBehavior) this.f9587b).f18161c = null;
                break;
            case 2:
                p128l6.e eVar = (p128l6.e) this.f9587b;
                eVar.f22060a = 0;
                eVar.f22061b = null;
                break;
            case 3:
                W0 w10 = (W0) this.f9587b;
                if (((ValueAnimator) w10.f11832b) == animator) {
                    w10.f11832b = null;
                }
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f9587b;
                actionBarOverlayLayout.f14496w = null;
                actionBarOverlayLayout.f14485j = false;
                break;
            case 5:
                org.maplibre.android.location.D d10 = (org.maplibre.android.location.D) this.f9587b;
                if (!d10.f24655f) {
                    d10.f24650a.a(d10.f24652c);
                }
                break;
            case 6:
                ((C2216n) this.f9587b).c();
                break;
            case 7:
                ((C2211i) this.f9587b).f24972f.c();
                break;
            default:
                ((ExpandableTransformationBehavior) this.f9587b).f18227b = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9586a) {
            case 2:
                p128l6.e eVar = (p128l6.e) this.f9587b;
                eVar.f22075q.a(0, false);
                eVar.f22060a = 2;
                eVar.f22061b = animator;
                break;
            case 6:
                C2216n c2216n = (C2216n) this.f9587b;
                c2216n.f24986a.c();
                c2216n.f24990e.r(1);
                break;
            case 7:
                C2211i c2211i = (C2211i) this.f9587b;
                c2211i.f24972f.f24986a.c();
                c2211i.f24972f.f24990e.r(1);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
