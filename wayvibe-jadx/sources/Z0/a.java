package Z0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.m;
import p163p0.f;
import p163p0.h;
import p163p0.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f13448a;

    public a(f fVar) {
        this.f13448a = fVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            h hVar = h.f25151a;
            f fVar = this.f13448a;
            if (m.b(fVar, hVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (fVar instanceof i) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((i) fVar).f25152a);
                textPaint.setStrokeMiter(((i) fVar).f25153b);
                int i10 = ((i) fVar).f25155d;
                if (i10 == 0) {
                    join = Paint.Join.MITER;
                } else if (i10 == 1) {
                    join = Paint.Join.ROUND;
                } else {
                    join = i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i11 = ((i) fVar).f25154c;
                if (i11 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i11 == 1) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = i11 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                ((i) fVar).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
