package p128l6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import app.nagakiba.wayvibe.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p139m6.b;
import p169p6.a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {
    @Override // p128l6.e
    public final float d() {
        return this.f22075q.getElevation();
    }

    @Override // p128l6.e
    public final void e(Rect rect) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.r.f14302b;
        if (!floatingActionButton.k) {
            rect.set(0, 0, 0, 0);
            return;
        }
        floatingActionButton.getSizeDimension();
        float elevation = this.f22075q.getElevation() + this.f22072n;
        int i10 = a.f25242a;
        int iCeil = (int) Math.ceil(elevation);
        int iCeil2 = (int) Math.ceil(elevation * 1.5f);
        rect.set(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p128l6.e
    public final b g() {
        return new b();
    }

    @Override // p128l6.e
    public final void h() {
        n();
    }

    @Override // p128l6.e
    public final void j(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(e.f22058y, o(f10, f12));
        stateListAnimator.addState(e.f22059z, o(f10, f11));
        stateListAnimator.addState(e.f22053A, o(f10, f11));
        stateListAnimator.addState(e.f22054B, o(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f22075q;
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L));
        if (i10 <= 24) {
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(e.f22057x);
        stateListAnimator.addState(e.f22055C, animatorSet);
        stateListAnimator.addState(e.f22056D, o(0.0f, 0.0f));
        floatingActionButton.setStateListAnimator(stateListAnimator);
        if (((FloatingActionButton) this.r.f14302b).k) {
            n();
        }
    }

    @Override // p128l6.e
    public final void k(Rect rect) {
        p012a8.b bVar = this.r;
        FloatingActionButton floatingActionButton = (FloatingActionButton) bVar.f14302b;
        if (!floatingActionButton.k) {
            super/*android.view.View*/.setBackgroundDrawable(this.f22068i);
        } else {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable(this.f22068i, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    @Override // p128l6.e
    public final void l(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        f fVar = new f();
        fVar.setShape(1);
        fVar.setColor(-1);
        this.f22067h = fVar;
        fVar.setTintList(colorStateList);
        if (mode != null) {
            this.f22067h.setTintMode(mode);
        }
        if (i10 > 0) {
            Context context = this.f22075q.getContext();
            b bVarG = g();
            int color = p254y1.a.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = p254y1.a.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = p254y1.a.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = p254y1.a.getColor(context, R.color.design_fab_stroke_end_outer_color);
            bVarG.f22351f = color;
            bVarG.f22352g = color2;
            bVarG.f22353h = color3;
            bVarG.f22354i = color4;
            float f10 = i10;
            if (bVarG.f22350e != f10) {
                bVarG.f22350e = f10;
                bVarG.f22346a.setStrokeWidth(f10 * 1.3333f);
                bVarG.f22356l = true;
                bVarG.invalidateSelf();
            }
            if (colorStateList != null) {
                bVarG.k = colorStateList.getColorForState(bVarG.getState(), bVarG.k);
            }
            bVarG.f22355j = colorStateList;
            bVarG.f22356l = true;
            bVarG.invalidateSelf();
            this.f22069j = bVarG;
            layerDrawable = new LayerDrawable(new Drawable[]{this.f22069j, this.f22067h});
        } else {
            this.f22069j = null;
            layerDrawable = this.f22067h;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(p159o6.a.a(colorStateList2), layerDrawable, null);
        this.f22068i = rippleDrawable;
        this.k = rippleDrawable;
        super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
    }

    @Override // p128l6.e
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f22068i;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(p159o6.a.a(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    public final AnimatorSet o(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f22075q;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(e.f22057x);
        return animatorSet;
    }

    @Override // p128l6.e
    public final void f() {
    }

    @Override // p128l6.e
    public final void i(int[] iArr) {
    }
}
