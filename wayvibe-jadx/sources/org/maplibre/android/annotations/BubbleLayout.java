package org.maplibre.android.annotations;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p046da.d;
import p054ea.b;
import p054ea.c;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class BubbleLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f24626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24629i;

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f19442a);
        this.f24621a = new b(typedArrayObtainStyledAttributes.getInt(0, 0));
        this.f24622b = typedArrayObtainStyledAttributes.getDimension(3, (context.getResources().getDisplayMetrics().densityDpi / 160) * 8.0f);
        this.f24623c = typedArrayObtainStyledAttributes.getDimension(1, 8.0f * (context.getResources().getDisplayMetrics().densityDpi / 160));
        this.f24624d = typedArrayObtainStyledAttributes.getDimension(2, 12.0f * (context.getResources().getDisplayMetrics().densityDpi / 160));
        this.f24625e = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f24627g = typedArrayObtainStyledAttributes.getColor(4, -1);
        this.f24628h = typedArrayObtainStyledAttributes.getDimension(7, -1.0f);
        this.f24629i = typedArrayObtainStyledAttributes.getColor(6, -7829368);
        typedArrayObtainStyledAttributes.recycle();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i10 = this.f24621a.f19652a;
        float f10 = this.f24622b;
        if (i10 == 0) {
            paddingLeft = (int) (paddingLeft + f10);
        } else if (i10 != 1) {
            float f11 = this.f24623c;
            if (i10 == 2) {
                paddingTop = (int) (paddingTop + f11);
            } else if (i10 == 3) {
                paddingBottom = (int) (paddingBottom + f11);
            }
        } else {
            paddingRight = (int) (paddingRight + f10);
        }
        float f12 = this.f24628h;
        if (f12 > 0.0f) {
            paddingLeft = (int) (paddingLeft + f12);
            paddingRight = (int) (paddingRight + f12);
            paddingTop = (int) (paddingTop + f12);
            paddingBottom = (int) (paddingBottom + f12);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c cVar = this.f24626f;
        if (cVar != null) {
            cVar.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public b getArrowDirection() {
        return this.f24621a;
    }

    public float getArrowHeight() {
        return this.f24623c;
    }

    public float getArrowPosition() {
        return this.f24624d;
    }

    public float getArrowWidth() {
        return this.f24622b;
    }

    public int getBubbleColor() {
        return this.f24627g;
    }

    public float getCornersRadius() {
        return this.f24625e;
    }

    public int getStrokeColor() {
        return this.f24629i;
    }

    public float getStrokeWidth() {
        return this.f24628h;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int width = getWidth();
        int height = getHeight();
        if (width < 0 || height < 0) {
            return;
        }
        float f10 = 0;
        RectF rectF = new RectF(f10, f10, width, height);
        float f11 = this.f24624d;
        c cVar = new c();
        Paint paint = new Paint(1);
        cVar.f19658f = paint;
        Path path = new Path();
        cVar.f19662j = path;
        cVar.f19653a = rectF;
        cVar.f19654b = this.f24622b;
        cVar.f19655c = this.f24623c;
        cVar.f19656d = f11;
        cVar.f19657e = this.f24625e;
        paint.setColor(this.f24627g);
        float f12 = this.f24628h;
        cVar.f19659g = f12;
        b bVar = this.f24621a;
        if (f12 > 0.0f) {
            Paint paint2 = new Paint(1);
            cVar.f19660h = paint2;
            paint2.setColor(this.f24629i);
            Path path2 = new Path();
            cVar.f19661i = path2;
            cVar.c(bVar, path, f12);
            cVar.c(bVar, path2, 0.0f);
        } else {
            cVar.c(bVar, path, 0.0f);
        }
        this.f24626f = cVar;
    }
}
