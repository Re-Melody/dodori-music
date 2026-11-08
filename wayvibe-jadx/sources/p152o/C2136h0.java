package p152o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2136h0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f23344l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f23345m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23346a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23347b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23348c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23349d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23350e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f23351f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23352g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f23353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f23354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f23355j;
    public final C2130e0 k;

    public C2136h0(TextView textView) {
        this.f23354i = textView;
        this.f23355j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = new C2132f0();
        } else {
            this.k = new C2130e0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f23345m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f23347b) {
                if (this.f23354i.getMeasuredHeight() <= 0 || this.f23354i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.f23354i) ? 1048576 : (this.f23354i.getMeasuredWidth() - this.f23354i.getTotalPaddingLeft()) - this.f23354i.getTotalPaddingRight();
                int height = (this.f23354i.getHeight() - this.f23354i.getCompoundPaddingBottom()) - this.f23354i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f23344l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f23354i.getTextSize()) {
                            g(fC, 0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f23347b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f23351f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f23351f[i13];
            TextView textView = this.f23354i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f23353h;
            if (textPaint == null) {
                this.f23353h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f23353h.set(textView.getPaint());
            this.f23353h.setTextSize(i14);
            StaticLayout staticLayoutA = AbstractC2128d0.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f23354i, this.f23353h, this.k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f23351f[i11];
    }

    public final boolean f() {
        return j() && this.f23346a != 0;
    }

    public final void g(float f10, int i10) {
        Context context = this.f23355j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f23354i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f23347b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f23346a == 1) {
            if (!this.f23352g || this.f23351f.length == 0) {
                int iFloor = ((int) Math.floor((this.f23350e - this.f23349d) / this.f23348c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f23348c) + this.f23349d);
                }
                this.f23351f = b(iArr);
            }
            this.f23347b = true;
        } else {
            this.f23347b = false;
        }
        return this.f23347b;
    }

    public final boolean i() {
        int[] iArr = this.f23351f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f23352g = z10;
        if (z10) {
            this.f23346a = 1;
            this.f23349d = iArr[0];
            this.f23350e = iArr[length - 1];
            this.f23348c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f23354i instanceof C2162v);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f23346a = 1;
        this.f23349d = f10;
        this.f23350e = f11;
        this.f23348c = f12;
        this.f23352g = false;
    }
}
