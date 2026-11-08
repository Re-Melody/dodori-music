package N1;

import D8.O;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import p152o.C2161u0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f8525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListView f8526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O f8527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f8528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f8529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f8532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f8533j;
    public final float[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2161u0 f8539q;

    public d(C2161u0 c2161u0) {
        a aVar = new a();
        aVar.f8519e = Long.MIN_VALUE;
        aVar.f8521g = -1L;
        aVar.f8520f = 0L;
        this.f8524a = aVar;
        this.f8525b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f8528e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f8529f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f8532i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f8533j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr5;
        this.f8526c = c2161u0;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f8530g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f8531h = r;
        aVar.f8515a = 500;
        aVar.f8516b = 500;
        this.f8539q = c2161u0;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i10, float f10, float f11, float f12) {
        float fB;
        float interpolation;
        float fB2 = b(this.f8528e[i10] * f11, 0.0f, this.f8529f[i10]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f8525b;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f13 = this.f8532i[i10];
            float f14 = this.f8533j[i10];
            float f15 = this.k[i10];
            float f16 = f13 * f12;
            return fB > 0.0f ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f17 = this.f8532i[i10];
        float f18 = this.f8533j[i10];
        float f19 = this.k[i10];
        float f110 = f17 * f12;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i10 = this.f8530g;
            if (i10 == 0 || i10 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f8537o && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f8535m) {
            this.f8537o = false;
            return;
        }
        a aVar = this.f8524a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f8519e);
        int i12 = aVar.f8516b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f8523i = i10;
        aVar.f8522h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f8521g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C2161u0 c2161u0;
        int count;
        a aVar = this.f8524a;
        float f10 = aVar.f8518d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f8517c);
        if (iAbs != 0 && (count = (c2161u0 = this.f8539q).getCount()) != 0) {
            int childCount = c2161u0.getChildCount();
            int firstVisiblePosition = c2161u0.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c2161u0.getChildAt(0).getTop() >= 0)) : !(i10 >= count && c2161u0.getChildAt(childCount - 1).getBottom() <= c2161u0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f8538p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f8536n = r2
            r7.f8534l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f8526c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            N1.a r9 = r7.f8524a
            r9.f8517c = r0
            r9.f8518d = r8
            boolean r8 = r7.f8537o
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            D8.O r8 = r7.f8527d
            if (r8 != 0) goto L62
            D8.O r8 = new D8.O
            r9 = 19
            r8.<init>(r7, r9)
            r7.f8527d = r8
        L62:
            r7.f8537o = r2
            r7.f8535m = r2
            boolean r8 = r7.f8534l
            if (r8 != 0) goto L77
            int r8 = r7.f8531h
            if (r8 <= 0) goto L77
            D8.O r9 = r7.f8527d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = K1.T.f7251a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            D8.O r8 = r7.f8527d
            r8.run()
        L7c:
            r7.f8534l = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
