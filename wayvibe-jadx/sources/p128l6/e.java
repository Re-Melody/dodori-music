package p128l6;

import P3.C0716b;
import U.W0;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p061f6.c;
import p061f6.d;
import p139m6.b;
import p145n2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Animator f22061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f22062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f22063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f22064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f22065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GradientDrawable f22067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f22068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f22069j;
    public LayerDrawable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f22070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f22071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f22072n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22073o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FloatingActionButton f22075q;
    public final p012a8.b r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f22080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f22057x = p061f6.a.f19833b;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f22058y = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f22059z = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f22053A = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f22054B = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f22055C = {R.attr.state_enabled};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f22056D = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22060a = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f22074p = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f22076s = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RectF f22077t = new RectF();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f22078u = new RectF();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Matrix f22079v = new Matrix();

    public e(FloatingActionButton floatingActionButton, p012a8.b bVar) {
        this.f22075q = floatingActionButton;
        this.r = bVar;
        W0 w10 = new W0(26);
        g gVar = (g) this;
        w10.d(f22058y, c(new c(gVar, 1)));
        w10.d(f22059z, c(new c(gVar, 0)));
        w10.d(f22053A, c(new c(gVar, 0)));
        w10.d(f22054B, c(new c(gVar, 0)));
        w10.d(f22055C, c(new c(gVar, 2)));
        w10.d(f22056D, c(new b(gVar)));
        this.f22066g = floatingActionButton.getRotation();
    }

    public static ValueAnimator c(d dVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f22057x);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(dVar);
        valueAnimator.addUpdateListener(dVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f22075q.getDrawable();
        if (drawable == null || this.f22073o == 0) {
            return;
        }
        RectF rectF = this.f22077t;
        RectF rectF2 = this.f22078u;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f11 = this.f22073o;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f22073o / 2.0f;
        matrix.postScale(f10, f10, f12, f12);
    }

    public final AnimatorSet b(d dVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f22075q;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        dVar.c("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        dVar.c("scale").a(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        dVar.c("scale").a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f22079v;
        a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new C0716b(), new c(), new Matrix(matrix));
        dVar.c("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        Q5.b.L(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract float d();

    public abstract void e(Rect rect);

    public abstract void f();

    public abstract b g();

    public abstract void h();

    public abstract void i(int[] iArr);

    public abstract void j(float f10, float f11, float f12);

    public abstract void k(Rect rect);

    public abstract void l(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10);

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f22068i;
        if (drawable != null) {
            drawable.setTintList(p159o6.a.a(colorStateList));
        }
    }

    public final void n() {
        Rect rect = this.f22076s;
        e(rect);
        k(rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.r.f14302b;
        floatingActionButton.f18200l.set(i10, i11, i12, i13);
        int i14 = floatingActionButton.f18198i;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
