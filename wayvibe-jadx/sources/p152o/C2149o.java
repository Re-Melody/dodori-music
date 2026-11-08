package p152o;

import K1.K;
import K1.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p087i.a;

/* JADX INFO: renamed from: o.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2149o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f23408a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U0 f23411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U0 f23412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U0 f23413f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23410c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2158t f23409b = C2158t.a();

    public C2149o(View view) {
        this.f23408a = view;
    }

    public final void a() {
        View view = this.f23408a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f23411d != null) {
                if (this.f23413f == null) {
                    this.f23413f = new U0();
                }
                U0 u10 = this.f23413f;
                u10.f23282c = null;
                u10.f23281b = false;
                u10.f23283d = null;
                u10.f23280a = false;
                WeakHashMap weakHashMap = T.f7251a;
                ColorStateList colorStateListC = K.c(view);
                if (colorStateListC != null) {
                    u10.f23281b = true;
                    u10.f23282c = colorStateListC;
                }
                PorterDuff.Mode modeD = K.d(view);
                if (modeD != null) {
                    u10.f23280a = true;
                    u10.f23283d = modeD;
                }
                if (u10.f23281b || u10.f23280a) {
                    C2158t.d(background, u10, view.getDrawableState());
                    return;
                }
            }
            U0 u11 = this.f23412e;
            if (u11 != null) {
                C2158t.d(background, u11, view.getDrawableState());
                return;
            }
            U0 u12 = this.f23411d;
            if (u12 != null) {
                C2158t.d(background, u12, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        U0 u10 = this.f23412e;
        if (u10 != null) {
            return (ColorStateList) u10.f23282c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        U0 u10 = this.f23412e;
        if (u10 != null) {
            return (PorterDuff.Mode) u10.f23283d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListF;
        View view = this.f23408a;
        Context context = view.getContext();
        int[] iArr = a.f20390z;
        p150n8.a aVarQ0 = p150n8.a.q0(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) aVarQ0.f22980b;
        View view2 = this.f23408a;
        T.h(view2, view2.getContext(), iArr, attributeSet, (TypedArray) aVarQ0.f22980b, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f23410c = typedArray.getResourceId(0, -1);
                C2158t c2158t = this.f23409b;
                Context context2 = view.getContext();
                int i11 = this.f23410c;
                synchronized (c2158t) {
                    colorStateListF = c2158t.f23439a.f(context2, i11);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                K.i(view, aVarQ0.g0(1));
            }
            if (typedArray.hasValue(2)) {
                K.j(view, AbstractC2150o0.c(typedArray.getInt(2, -1), null));
            }
            aVarQ0.v0();
        } catch (Throwable th) {
            aVarQ0.v0();
            throw th;
        }
    }

    public final void e() {
        this.f23410c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateListF;
        this.f23410c = i10;
        C2158t c2158t = this.f23409b;
        if (c2158t != null) {
            Context context = this.f23408a.getContext();
            synchronized (c2158t) {
                colorStateListF = c2158t.f23439a.f(context, i10);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f23411d == null) {
                this.f23411d = new U0();
            }
            U0 u10 = this.f23411d;
            u10.f23282c = colorStateList;
            u10.f23281b = true;
        } else {
            this.f23411d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f23412e == null) {
            this.f23412e = new U0();
        }
        U0 u10 = this.f23412e;
        u10.f23282c = colorStateList;
        u10.f23281b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f23412e == null) {
            this.f23412e = new U0();
        }
        U0 u10 = this.f23412e;
        u10.f23283d = mode;
        u10.f23280a = true;
        a();
    }
}
