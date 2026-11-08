package p105j6;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import p159o6.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f21513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ColorStateList f21514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f21515j;
    public ColorStateList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f21516l = new Paint(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GradientDrawable f21517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GradientDrawable f21518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GradientDrawable f21519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21520p;

    public c(a aVar) {
        new Rect();
        new RectF();
        this.f21520p = false;
        this.f21506a = aVar;
    }

    public final b a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f21517m = gradientDrawable;
        gradientDrawable.setCornerRadius(this.f21511f + 1.0E-5f);
        this.f21517m.setColor(-1);
        b();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.f21518n = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.f21511f + 1.0E-5f);
        this.f21518n.setColor(0);
        this.f21518n.setStroke(this.f21512g, this.f21515j);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{this.f21517m, this.f21518n}), this.f21507b, this.f21509d, this.f21508c, this.f21510e);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.f21519o = gradientDrawable3;
        gradientDrawable3.setCornerRadius(this.f21511f + 1.0E-5f);
        this.f21519o.setColor(-1);
        return new b(a.a(this.k), insetDrawable, this.f21519o);
    }

    public final void b() {
        GradientDrawable gradientDrawable = this.f21517m;
        if (gradientDrawable != null) {
            gradientDrawable.setTintList(this.f21514i);
            PorterDuff.Mode mode = this.f21513h;
            if (mode != null) {
                this.f21517m.setTintMode(mode);
            }
        }
    }
}
