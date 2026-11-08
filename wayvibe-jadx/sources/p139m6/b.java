package p139m6;

import B1.a;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22346a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f22355j;
    public int k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f22357m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f22347b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f22348c = new RectF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f22349d = new a(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22356l = true;

    public b() {
        Paint paint = new Paint(1);
        this.f22346a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.f22356l;
        Paint paint = this.f22346a;
        Rect rect = this.f22347b;
        if (z10) {
            copyBounds(rect);
            float fHeight = this.f22350e / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{a.b(this.f22351f, this.k), a.b(this.f22352g, this.k), a.b(a.d(this.f22352g, 0), this.k), a.b(a.d(this.f22354i, 0), this.k), a.b(this.f22354i, this.k), a.b(this.f22353h, this.k)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f22356l = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        RectF rectF = this.f22348c;
        copyBounds(rect);
        rectF.set(rect);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f22357m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f22349d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f22350e > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Rect rect = this.f22347b;
        copyBounds(rect);
        outline.setOval(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int iRound = Math.round(this.f22350e);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f22355j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f22356l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f22355j;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.k)) != this.k) {
            this.f22356l = true;
            this.k = colorForState;
        }
        if (this.f22356l) {
            invalidateSelf();
        }
        return this.f22356l;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f22346a.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22346a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
