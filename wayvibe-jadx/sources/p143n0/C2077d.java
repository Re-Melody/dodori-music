package p143n0;

import B2.s;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.jvm.internal.m;
import p133m0.c;
import p133m0.d;

/* JADX INFO: renamed from: n0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2077d implements InterfaceC2093u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f22749a = AbstractC2078e.f22762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f22750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f22751c;

    @Override // p143n0.InterfaceC2093u
    public final void a(float f10, float f11) {
        this.f22749a.scale(f10, f11);
    }

    @Override // p143n0.InterfaceC2093u
    public final void b(float f10, float f11, float f12, float f13, S s8) {
        this.f22749a.drawRect(f10, f11, f12, f13, (Paint) ((s) s8).f619b);
    }

    @Override // p143n0.InterfaceC2093u
    public final void c() {
        this.f22749a.save();
    }

    @Override // p143n0.InterfaceC2093u
    public final void d() {
        W.s(this.f22749a, false);
    }

    @Override // p143n0.InterfaceC2093u
    public final void e(float f10, float f11, float f12, float f13, float f14, float f15, S s8) {
        this.f22749a.drawRoundRect(f10, f11, f12, f13, f14, f15, (Paint) ((s) s8).f619b);
    }

    @Override // p143n0.InterfaceC2093u
    public final void f(C2081h c2081h, S s8) {
        this.f22749a.drawBitmap(W.n(c2081h), c.d(0L), c.e(0L), (Paint) ((s) s8).f619b);
    }

    @Override // p143n0.InterfaceC2093u
    public final void h(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                if (fArr[(i10 * 4) + i11] != (i10 == i11 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    W.x(matrix, fArr);
                    this.f22749a.concat(matrix);
                    return;
                }
                i11++;
            }
            i10++;
        }
    }

    @Override // p143n0.InterfaceC2093u
    public final void i(long j10, long j11, S s8) {
        this.f22749a.drawLine(c.d(j10), c.e(j10), c.d(j11), c.e(j11), (Paint) ((s) s8).f619b);
    }

    @Override // p143n0.InterfaceC2093u
    public final void j(float f10, float f11, float f12, float f13, float f14, float f15, S s8) {
        this.f22749a.drawArc(f10, f11, f12, f13, f14, f15, false, (Paint) ((s) s8).f619b);
    }

    @Override // p143n0.InterfaceC2093u
    public final void k(C2081h c2081h, long j10, long j11, long j12, S s8) {
        if (this.f22750b == null) {
            this.f22750b = new Rect();
            this.f22751c = new Rect();
        }
        Canvas canvas = this.f22749a;
        Bitmap bitmapN = W.n(c2081h);
        Rect rect = this.f22750b;
        m.c(rect);
        int i10 = (int) (j10 >> 32);
        rect.left = i10;
        int i11 = (int) (j10 & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j11 >> 32));
        rect.bottom = i11 + ((int) (j11 & 4294967295L));
        Rect rect2 = this.f22751c;
        m.c(rect2);
        int i12 = (int) 0;
        rect2.left = i12;
        int i13 = (int) 0;
        rect2.top = i13;
        rect2.right = i12 + ((int) (j12 >> 32));
        rect2.bottom = i13 + ((int) (4294967295L & j12));
        canvas.drawBitmap(bitmapN, rect, rect2, (Paint) ((s) s8).f619b);
    }

    @Override // p143n0.InterfaceC2093u
    public final void l(U u10, S s8) {
        Canvas canvas = this.f22749a;
        if (!(u10 instanceof C2083j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C2083j) u10).f22776a, (Paint) ((s) s8).f619b);
    }

    @Override // p143n0.InterfaceC2093u
    public final void m(d dVar, S s8) {
        Canvas canvas = this.f22749a;
        Paint paint = (Paint) ((s) s8).f619b;
        canvas.saveLayer(dVar.f22184a, dVar.f22185b, dVar.f22186c, dVar.f22187d, paint, 31);
    }

    @Override // p143n0.InterfaceC2093u
    public final void n(float f10, float f11, float f12, float f13, int i10) {
        this.f22749a.clipRect(f10, f11, f12, f13, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p143n0.InterfaceC2093u
    public final void o(float f10, float f11) {
        this.f22749a.translate(f10, f11);
    }

    @Override // p143n0.InterfaceC2093u
    public final void p() {
        this.f22749a.rotate(45.0f);
    }

    @Override // p143n0.InterfaceC2093u
    public final void q() {
        this.f22749a.restore();
    }

    @Override // p143n0.InterfaceC2093u
    public final void r(U u10, int i10) {
        Canvas canvas = this.f22749a;
        if (!(u10 instanceof C2083j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C2083j) u10).f22776a, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p143n0.InterfaceC2093u
    public final void s() {
        W.s(this.f22749a, true);
    }

    @Override // p143n0.InterfaceC2093u
    public final void t(long j10, S s8, float f10) {
        this.f22749a.drawCircle(c.d(j10), c.e(j10), f10, (Paint) ((s) s8).f619b);
    }
}
