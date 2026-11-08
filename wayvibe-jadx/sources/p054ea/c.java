package p054ea;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RectF f19653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f19658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f19660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Path f19661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Path f19662j;

    public final void a(RectF rectF, Path path, float f10) {
        path.moveTo(rectF.left + f10, rectF.top + f10);
        path.lineTo(rectF.right - f10, rectF.top + f10);
        float f11 = rectF.right - f10;
        float f12 = rectF.bottom;
        float f13 = this.f19655c;
        path.lineTo(f11, (f12 - f13) - f10);
        float f14 = rectF.left;
        float f15 = this.f19654b;
        float f16 = this.f19656d;
        float f17 = f10 / 2.0f;
        path.lineTo(((f14 + f15) + f16) - f17, (rectF.bottom - f13) - f10);
        path.lineTo((f15 / 2.0f) + rectF.left + f16, (rectF.bottom - f10) - f10);
        path.lineTo(rectF.left + f16 + f17, (rectF.bottom - f13) - f10);
        path.lineTo(rectF.left + f16 + f10, (rectF.bottom - f13) - f10);
        path.lineTo(rectF.left + f10, (rectF.bottom - f13) - f10);
        path.lineTo(rectF.left + f10, rectF.top + f10);
        path.close();
    }

    public final void b(RectF rectF, Path path, float f10) {
        float f11 = rectF.left;
        float f12 = this.f19654b;
        path.moveTo(f11 + f12 + f10, rectF.top + f10);
        path.lineTo(rectF.width() - f10, rectF.top + f10);
        path.lineTo(rectF.right - f10, rectF.bottom - f10);
        path.lineTo(rectF.left + f12 + f10, rectF.bottom - f10);
        float f13 = rectF.left + f12 + f10;
        float f14 = this.f19655c;
        float f15 = this.f19656d;
        float f16 = f10 / 2.0f;
        path.lineTo(f13, (f14 + f15) - f16);
        path.lineTo(rectF.left + f10 + f10, (f14 / 2.0f) + f15);
        path.lineTo(rectF.left + f12 + f10, f15 + f16);
        path.lineTo(rectF.left + f12 + f10, rectF.top + f10);
        path.close();
    }

    public final void c(b bVar, Path path, float f10) {
        int i10 = bVar.f19652a;
        float f11 = this.f19656d;
        float f12 = this.f19654b;
        float f13 = this.f19655c;
        float f14 = this.f19657e;
        RectF rectF = this.f19653a;
        if (i10 == 0) {
            if (f14 <= 0.0f) {
                b(rectF, path, f10);
                return;
            }
            if (f10 > 0.0f && f10 > f14) {
                b(rectF, path, f10);
                return;
            }
            path.moveTo(rectF.left + f12 + f14 + f10, rectF.top + f10);
            path.lineTo((rectF.width() - f14) - f10, rectF.top + f10);
            float f15 = rectF.right;
            float f16 = rectF.top;
            path.arcTo(new RectF(f15 - f14, f16 + f10, f15 - f10, f16 + f14), 270.0f, 90.0f);
            path.lineTo(rectF.right - f10, (rectF.bottom - f14) - f10);
            float f17 = rectF.right;
            float f18 = rectF.bottom;
            path.arcTo(new RectF(f17 - f14, f18 - f14, f17 - f10, f18 - f10), 0.0f, 90.0f);
            path.lineTo(rectF.left + f12 + f14 + f10, rectF.bottom - f10);
            float f19 = rectF.left;
            float f20 = rectF.bottom;
            path.arcTo(new RectF(f19 + f12 + f10, f20 - f14, f19 + f14 + f12, f20 - f10), 90.0f, 90.0f);
            float f21 = f10 / 2.0f;
            path.lineTo(rectF.left + f12 + f10, (f13 + f11) - f21);
            path.lineTo(rectF.left + f10 + f10, (f13 / 2.0f) + f11);
            path.lineTo(rectF.left + f12 + f10, f11 + f21);
            path.lineTo(rectF.left + f12 + f10, rectF.top + f14 + f10);
            float f22 = rectF.left;
            float f23 = rectF.top;
            path.arcTo(new RectF(f22 + f12 + f10, f10 + f23, f22 + f14 + f12, f14 + f23), 180.0f, 90.0f);
            path.close();
            return;
        }
        if (i10 == 1) {
            if (f14 <= 0.0f) {
                d(rectF, path, f10);
                return;
            }
            if (f10 > 0.0f && f10 > f14) {
                d(rectF, path, f10);
                return;
            }
            path.moveTo(rectF.left + f14 + f10, rectF.top + f10);
            path.lineTo(((rectF.width() - f14) - f12) - f10, rectF.top + f10);
            float f24 = rectF.right;
            float f25 = rectF.top;
            path.arcTo(new RectF((f24 - f14) - f12, f25 + f10, (f24 - f12) - f10, f25 + f14), 270.0f, 90.0f);
            float f26 = f10 / 2.0f;
            path.lineTo((rectF.right - f12) - f10, f11 + f26);
            path.lineTo((rectF.right - f10) - f10, (f13 / 2.0f) + f11);
            path.lineTo((rectF.right - f12) - f10, (f11 + f13) - f26);
            path.lineTo((rectF.right - f12) - f10, (rectF.bottom - f14) - f10);
            float f27 = rectF.right;
            float f28 = rectF.bottom;
            path.arcTo(new RectF((f27 - f14) - f12, f28 - f14, (f27 - f12) - f10, f28 - f10), 0.0f, 90.0f);
            path.lineTo(rectF.left + f12 + f10, rectF.bottom - f10);
            float f29 = rectF.left;
            float f30 = rectF.bottom;
            path.arcTo(new RectF(f29 + f10, f30 - f14, f29 + f14, f30 - f10), 90.0f, 90.0f);
            float f31 = rectF.left;
            float f32 = rectF.top;
            path.arcTo(new RectF(f31 + f10, f10 + f32, f31 + f14, f14 + f32), 180.0f, 90.0f);
            path.close();
            return;
        }
        if (i10 == 2) {
            if (f14 <= 0.0f) {
                e(rectF, path, f10);
                return;
            }
            if (f10 > 0.0f && f10 > f14) {
                e(rectF, path, f10);
                return;
            }
            path.moveTo(Math.min(f11, f14) + rectF.left + f10, rectF.top + f13 + f10);
            float f33 = f10 / 2.0f;
            path.lineTo(rectF.left + f11 + f33, rectF.top + f13 + f10);
            path.lineTo((f12 / 2.0f) + rectF.left + f11, rectF.top + f10 + f10);
            path.lineTo(((rectF.left + f12) + f11) - f33, rectF.top + f13 + f10);
            path.lineTo((rectF.right - f14) - f10, rectF.top + f13 + f10);
            float f34 = rectF.right;
            float f35 = rectF.top;
            path.arcTo(new RectF(f34 - f14, f35 + f13 + f10, f34 - f10, f35 + f14 + f13), 270.0f, 90.0f);
            path.lineTo(rectF.right - f10, (rectF.bottom - f14) - f10);
            float f36 = rectF.right;
            float f37 = rectF.bottom;
            path.arcTo(new RectF(f36 - f14, f37 - f14, f36 - f10, f37 - f10), 0.0f, 90.0f);
            path.lineTo(rectF.left + f14 + f10, rectF.bottom - f10);
            float f38 = rectF.left;
            float f39 = rectF.bottom;
            path.arcTo(new RectF(f38 + f10, f39 - f14, f38 + f14, f39 - f10), 90.0f, 90.0f);
            path.lineTo(rectF.left + f10, rectF.top + f13 + f14 + f10);
            float f40 = rectF.left;
            float f41 = rectF.top;
            path.arcTo(new RectF(f40 + f10, f41 + f13 + f10, f40 + f14, f14 + f41 + f13), 180.0f, 90.0f);
            path.close();
            return;
        }
        if (i10 != 3) {
            return;
        }
        if (f14 <= 0.0f) {
            a(rectF, path, f10);
            return;
        }
        if (f10 > 0.0f && f10 > f14) {
            a(rectF, path, f10);
            return;
        }
        path.moveTo(rectF.left + f14 + f10, rectF.top + f10);
        path.lineTo((rectF.width() - f14) - f10, rectF.top + f10);
        float f42 = rectF.right;
        float f43 = rectF.top;
        path.arcTo(new RectF(f42 - f14, f43 + f10, f42 - f10, f43 + f14), 270.0f, 90.0f);
        path.lineTo(rectF.right - f10, ((rectF.bottom - f13) - f14) - f10);
        float f44 = rectF.right;
        float f45 = rectF.bottom;
        path.arcTo(new RectF(f44 - f14, (f45 - f14) - f13, f44 - f10, (f45 - f13) - f10), 0.0f, 90.0f);
        float f46 = f10 / 2.0f;
        path.lineTo(((rectF.left + f12) + f11) - f46, (rectF.bottom - f13) - f10);
        path.lineTo((f12 / 2.0f) + rectF.left + f11, (rectF.bottom - f10) - f10);
        path.lineTo(rectF.left + f11 + f46, (rectF.bottom - f13) - f10);
        path.lineTo(Math.min(f14, f11) + rectF.left + f10, (rectF.bottom - f13) - f10);
        float f47 = rectF.left;
        float f48 = rectF.bottom;
        path.arcTo(new RectF(f47 + f10, (f48 - f14) - f13, f47 + f14, (f48 - f13) - f10), 90.0f, 90.0f);
        path.lineTo(rectF.left + f10, rectF.top + f14 + f10);
        float f49 = rectF.left;
        float f50 = rectF.top;
        path.arcTo(new RectF(f49 + f10, f10 + f50, f49 + f14, f14 + f50), 180.0f, 90.0f);
        path.close();
    }

    public final void d(RectF rectF, Path path, float f10) {
        path.moveTo(rectF.left + f10, rectF.top + f10);
        float fWidth = rectF.width();
        float f11 = this.f19654b;
        path.lineTo((fWidth - f11) - f10, rectF.top + f10);
        float f12 = (rectF.right - f11) - f10;
        float f13 = f10 / 2.0f;
        float f14 = this.f19656d;
        path.lineTo(f12, f14 + f13);
        float f15 = (rectF.right - f10) - f10;
        float f16 = this.f19655c;
        path.lineTo(f15, (f16 / 2.0f) + f14);
        path.lineTo((rectF.right - f11) - f10, (f14 + f16) - f13);
        path.lineTo((rectF.right - f11) - f10, rectF.bottom - f10);
        path.lineTo(rectF.left + f10, rectF.bottom - f10);
        path.lineTo(rectF.left + f10, rectF.top + f10);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f19659g > 0.0f) {
            canvas.drawPath(this.f19661i, this.f19660h);
        }
        canvas.drawPath(this.f19662j, this.f19658f);
    }

    public final void e(RectF rectF, Path path, float f10) {
        float f11 = rectF.left;
        float f12 = this.f19656d;
        float f13 = rectF.top;
        float f14 = this.f19655c;
        path.moveTo(f11 + f12 + f10, f13 + f14 + f10);
        float f15 = f10 / 2.0f;
        path.lineTo(rectF.left + f12 + f15, rectF.top + f14 + f10);
        float f16 = rectF.left;
        float f17 = this.f19654b;
        path.lineTo((f17 / 2.0f) + f16 + f12, rectF.top + f10 + f10);
        path.lineTo(((rectF.left + f17) + f12) - f15, rectF.top + f14 + f10);
        path.lineTo(rectF.right - f10, rectF.top + f14 + f10);
        path.lineTo(rectF.right - f10, rectF.bottom - f10);
        path.lineTo(rectF.left + f10, rectF.bottom - f10);
        path.lineTo(rectF.left + f10, rectF.top + f14 + f10);
        path.lineTo(rectF.left + f12 + f10, rectF.top + f14 + f10);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f19653a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f19653a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f19658f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19658f.setColorFilter(colorFilter);
    }
}
