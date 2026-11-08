package p152o;

import K1.B;
import K1.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p046da.b;
import p087i.a;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f23286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U0 f23287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public U0 f23288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U0 f23289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U0 f23290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U0 f23291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public U0 f23292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U0 f23293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2136h0 f23294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23295j = 0;
    public int k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f23296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23297m;

    public Y(TextView textView) {
        this.f23286a = textView;
        this.f23294i = new C2136h0(textView);
    }

    public static U0 c(Context context, C2158t c2158t, int i10) {
        ColorStateList colorStateListF;
        synchronized (c2158t) {
            colorStateListF = c2158t.f23439a.f(context, i10);
        }
        if (colorStateListF == null) {
            return null;
        }
        U0 u10 = new U0();
        u10.f23281b = true;
        u10.f23282c = colorStateListF;
        return u10;
    }

    public final void a(Drawable drawable, U0 u10) {
        if (drawable == null || u10 == null) {
            return;
        }
        C2158t.d(drawable, u10, this.f23286a.getDrawableState());
    }

    public final void b() {
        U0 u10 = this.f23287b;
        TextView textView = this.f23286a;
        if (u10 != null || this.f23288c != null || this.f23289d != null || this.f23290e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f23287b);
            a(compoundDrawables[1], this.f23288c);
            a(compoundDrawables[2], this.f23289d);
            a(compoundDrawables[3], this.f23290e);
        }
        if (this.f23291f == null && this.f23292g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f23291f);
        a(compoundDrawablesRelative[2], this.f23292g);
    }

    public final ColorStateList d() {
        U0 u10 = this.f23293h;
        if (u10 != null) {
            return (ColorStateList) u10.f23282c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        U0 u10 = this.f23293h;
        if (u10 != null) {
            return (PorterDuff.Mode) u10.f23283d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:227:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:229:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:232:0x03ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:235:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:237:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:239:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String string;
        String string2;
        int i11;
        float dimensionPixelSize;
        int i12;
        ColorStateList colorStateList;
        int resourceId;
        int i13;
        int resourceId2;
        TextView textView = this.f23286a;
        Context context = textView.getContext();
        C2158t c2158tA = C2158t.a();
        int[] iArr = a.f20374h;
        p150n8.a aVarQ0 = p150n8.a.q0(context, attributeSet, iArr, i10);
        T.h(textView, textView.getContext(), iArr, attributeSet, (TypedArray) aVarQ0.f22980b, i10);
        TypedArray typedArray = (TypedArray) aVarQ0.f22980b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f23287b = c(context, c2158tA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f23288c = c(context, c2158tA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f23289d = c(context, c2158tA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f23290e = c(context, c2158tA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f23291f = c(context, c2158tA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f23292g = c(context, c2158tA, typedArray.getResourceId(6, 0));
        }
        aVarQ0.v0();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = a.f20387w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            p150n8.a aVar = new p150n8.a(context, typedArrayObtainStyledAttributes);
            if (z12 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            m(context, aVar);
            int i14 = Build.VERSION.SDK_INT;
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i14 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            aVar.v0();
        } else {
            z10 = false;
            z11 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        p150n8.a aVar2 = new p150n8.a(context, typedArrayObtainStyledAttributes2);
        if (!z12 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z11 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        int i15 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i15 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i15 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, aVar2);
        aVar2.v0();
        if (!z12 && z10) {
            textView.setAllCaps(z13);
        }
        Typeface typeface = this.f23296l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.f23295j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            W.d(textView, string);
        }
        if (string2 != null) {
            V.b(textView, V.a(string2));
        }
        int[] iArr3 = a.f20375i;
        C2136h0 c2136h0 = this.f23294i;
        Context context2 = c2136h0.f23355j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = c2136h0.f23354i;
        T.h(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i10);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c2136h0.f23346a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i16 = 0; i16 < length; i16++) {
                    iArr4[i16] = typedArrayObtainTypedArray.getDimensionPixelSize(i16, -1);
                }
                c2136h0.f23351f = C2136h0.b(iArr4);
                c2136h0.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c2136h0.j()) {
            c2136h0.f23346a = 0;
        } else if (c2136h0.f23346a == 1) {
            if (!c2136h0.f23352g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i13 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                float f10 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c2136h0.k(dimension2, f10, dimension);
            }
            c2136h0.h();
        }
        if (l1.f23397c && c2136h0.f23346a != 0) {
            int[] iArr5 = c2136h0.f23351f;
            if (iArr5.length > 0) {
                if (W.a(textView) != -1.0f) {
                    W.b(textView, Math.round(c2136h0.f23349d), Math.round(c2136h0.f23350e), Math.round(c2136h0.f23348c), 0);
                } else {
                    W.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? c2158tA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c2158tA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c2158tA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c2158tA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c2158tA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c2158tA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = p254y1.a.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC2150o0.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i11 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i17 = typedValuePeekValue.data;
                i12 = i17 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i17);
                i11 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i11) {
                b.Y(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i11) {
                b.Z(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i12 == i11) {
                    b.a0(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    B.j(textView, i12, dimensionPixelSize);
                } else {
                    b.a0(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i11 = -1;
        dimensionPixelSize = -1.0f;
        i12 = i11;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i11) {
            b.Y(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i11) {
            b.Z(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i12 == i11) {
                b.a0(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                B.j(textView, i12, dimensionPixelSize);
            } else {
                b.a0(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, a.f20387w);
        p150n8.a aVar = new p150n8.a(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f23286a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, aVar);
        if (i11 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            W.d(textView, string);
        }
        aVar.v0();
        Typeface typeface = this.f23296l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f23295j);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        C2136h0 c2136h0 = this.f23294i;
        if (c2136h0.j()) {
            DisplayMetrics displayMetrics = c2136h0.f23355j.getResources().getDisplayMetrics();
            c2136h0.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (c2136h0.h()) {
                c2136h0.a();
            }
        }
    }

    public final void i(int[] iArr, int i10) {
        C2136h0 c2136h0 = this.f23294i;
        if (c2136h0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c2136h0.f23355j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                c2136h0.f23351f = C2136h0.b(iArrCopyOf);
                if (!c2136h0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c2136h0.f23352g = false;
            }
            if (c2136h0.h()) {
                c2136h0.a();
            }
        }
    }

    public final void j(int i10) {
        C2136h0 c2136h0 = this.f23294i;
        if (c2136h0.j()) {
            if (i10 == 0) {
                c2136h0.f23346a = 0;
                c2136h0.f23349d = -1.0f;
                c2136h0.f23350e = -1.0f;
                c2136h0.f23348c = -1.0f;
                c2136h0.f23351f = new int[0];
                c2136h0.f23347b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(p134m1.b.j(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c2136h0.f23355j.getResources().getDisplayMetrics();
            c2136h0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c2136h0.h()) {
                c2136h0.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f23293h == null) {
            this.f23293h = new U0();
        }
        U0 u10 = this.f23293h;
        u10.f23282c = colorStateList;
        u10.f23281b = colorStateList != null;
        this.f23287b = u10;
        this.f23288c = u10;
        this.f23289d = u10;
        this.f23290e = u10;
        this.f23291f = u10;
        this.f23292g = u10;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f23293h == null) {
            this.f23293h = new U0();
        }
        U0 u10 = this.f23293h;
        u10.f23283d = mode;
        u10.f23280a = mode != null;
        this.f23287b = u10;
        this.f23288c = u10;
        this.f23289d = u10;
        this.f23290e = u10;
        this.f23291f = u10;
        this.f23292g = u10;
    }

    public final void m(Context context, p150n8.a aVar) {
        String string;
        int i10 = this.f23295j;
        TypedArray typedArray = (TypedArray) aVar.f22980b;
        this.f23295j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.k = i12;
            if (i12 != -1) {
                this.f23295j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f23297m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.f23296l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f23296l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f23296l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f23296l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.k;
        int i16 = this.f23295j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ0 = aVar.j0(i14, this.f23295j, new U(this, i15, i16, new WeakReference(this.f23286a)));
                if (typefaceJ0 != null) {
                    if (i11 < 28 || this.k == -1) {
                        this.f23296l = typefaceJ0;
                    } else {
                        this.f23296l = X.a(Typeface.create(typefaceJ0, 0), this.k, (this.f23295j & 2) != 0);
                    }
                }
                this.f23297m = this.f23296l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f23296l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.f23296l = Typeface.create(string, this.f23295j);
        } else {
            this.f23296l = X.a(Typeface.create(string, 0), this.k, (this.f23295j & 2) != 0);
        }
    }
}
