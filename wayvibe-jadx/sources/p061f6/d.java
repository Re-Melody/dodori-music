package p061f6;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p199t.G;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f19840a = new G(0);

    public static d a(Context context, int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e2);
            return null;
        }
    }

    public static d b(ArrayList arrayList) {
        d dVar = new d();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f19832a;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f19833b;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f19834c;
            }
            e eVar = new e();
            eVar.f19844d = 0;
            eVar.f19845e = 1;
            eVar.f19841a = startDelay;
            eVar.f19842b = duration;
            eVar.f19843c = interpolator;
            eVar.f19844d = objectAnimator.getRepeatCount();
            eVar.f19845e = objectAnimator.getRepeatMode();
            dVar.f19840a.put(propertyName, eVar);
        }
        return dVar;
    }

    public final e c(String str) {
        G g3 = this.f19840a;
        if (g3.get(str) != null) {
            return (e) g3.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f19840a.equals(((d) obj).f19840a);
    }

    public final int hashCode() {
        return this.f19840a.hashCode();
    }

    public final String toString() {
        return "\n" + d.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f19840a + "}\n";
    }
}
