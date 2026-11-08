package p152o;

import Ca.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.android.gms.common.api.f;
import java.lang.reflect.Method;
import p087i.a;
import p142n.B;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class G0 implements B {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Method f23195A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Method f23196z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f23198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2161u0 f23199c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23203g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23206j;
    public boolean k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public E0 f23209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f23210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f23211p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Handler f23215u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rect f23217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23218x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final A f23219y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23200d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23201e = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23204h = 1002;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23207l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f23208m = f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final D0 f23212q = new D0(this, 1);
    public final j r = new j(this, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F0 f23213s = new F0(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D0 f23214t = new D0(this, 0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f23216v = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f23196z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f23195A = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        this.f23197a = context;
        this.f23215u = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f20380o, i10, 0);
        this.f23202f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f23203g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f23205i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        A a10 = new A(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f20383s, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            a10.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        a10.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : c.r(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f23219y = a10;
        a10.setInputMethodMode(1);
    }

    public final int a() {
        return this.f23202f;
    }

    @Override // p142n.B
    public final boolean b() {
        return this.f23219y.isShowing();
    }

    public final void c(int i10) {
        this.f23202f = i10;
    }

    @Override // p142n.B
    public final void dismiss() {
        A a10 = this.f23219y;
        a10.dismiss();
        a10.setContentView(null);
        this.f23199c = null;
        this.f23215u.removeCallbacks(this.f23212q);
    }

    public final Drawable e() {
        return this.f23219y.getBackground();
    }

    @Override // p142n.B
    public final void f() {
        int i10;
        int iMakeMeasureSpec;
        int paddingBottom;
        C2161u0 c2161u0;
        C2161u0 c2161u1 = this.f23199c;
        A a10 = this.f23219y;
        Context context = this.f23197a;
        if (c2161u1 == null) {
            C2161u0 c2161u0P = p(context, !this.f23218x);
            this.f23199c = c2161u0P;
            c2161u0P.setAdapter(this.f23198b);
            this.f23199c.setOnItemClickListener(this.f23211p);
            this.f23199c.setFocusable(true);
            this.f23199c.setFocusableInTouchMode(true);
            this.f23199c.setOnItemSelectedListener(new A0(this));
            this.f23199c.setOnScrollListener(this.f23213s);
            a10.setContentView(this.f23199c);
        }
        Drawable background = a10.getBackground();
        Rect rect = this.f23216v;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f23205i) {
                this.f23203g = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iA = B0.a(a10, this.f23210o, this.f23203g, a10.getInputMethodMode() == 2);
        int i12 = this.f23200d;
        if (i12 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i13 = this.f23201e;
            if (i13 != -2) {
                iMakeMeasureSpec = i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), MediaPlayerException.ERROR_UNKNOWN);
            }
            int iA2 = this.f23199c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f23199c.getPaddingBottom() + this.f23199c.getPaddingTop() + i10 : 0);
        }
        boolean z10 = this.f23219y.getInputMethodMode() == 2;
        a10.setWindowLayoutType(this.f23204h);
        if (a10.isShowing()) {
            if (this.f23210o.isAttachedToWindow()) {
                int width = this.f23201e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f23210o.getWidth();
                }
                if (i12 == -1) {
                    i12 = z10 ? paddingBottom : -1;
                    if (z10) {
                        a10.setWidth(this.f23201e == -1 ? -1 : 0);
                        a10.setHeight(0);
                    } else {
                        a10.setWidth(this.f23201e == -1 ? -1 : 0);
                        a10.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                a10.setOutsideTouchable(true);
                View view = this.f23210o;
                int i14 = this.f23202f;
                int i15 = this.f23203g;
                if (width < 0) {
                    width = -1;
                }
                a10.update(view, i14, i15, width, i12 < 0 ? -1 : i12);
                return;
            }
            return;
        }
        int width2 = this.f23201e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f23210o.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        a10.setWidth(width2);
        a10.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f23196z;
            if (method != null) {
                try {
                    method.invoke(a10, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0.b(a10, true);
        }
        a10.setOutsideTouchable(true);
        a10.setTouchInterceptor(this.r);
        if (this.k) {
            a10.setOverlapAnchor(this.f23206j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f23195A;
            if (method2 != null) {
                try {
                    method2.invoke(a10, this.f23217w);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            C0.a(a10, this.f23217w);
        }
        a10.showAsDropDown(this.f23210o, this.f23202f, this.f23203g, this.f23207l);
        this.f23199c.setSelection(-1);
        if ((!this.f23218x || this.f23199c.isInTouchMode()) && (c2161u0 = this.f23199c) != null) {
            c2161u0.setListSelectionHidden(true);
            c2161u0.requestLayout();
        }
        if (this.f23218x) {
            return;
        }
        this.f23215u.post(this.f23214t);
    }

    @Override // p142n.B
    public final C2161u0 h() {
        return this.f23199c;
    }

    public final void i(Drawable drawable) {
        this.f23219y.setBackgroundDrawable(drawable);
    }

    public final void j(int i10) {
        this.f23203g = i10;
        this.f23205i = true;
    }

    public final int m() {
        if (this.f23205i) {
            return this.f23203g;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        E0 e1 = this.f23209n;
        if (e1 == null) {
            this.f23209n = new E0(this);
        } else {
            ListAdapter listAdapter2 = this.f23198b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(e1);
            }
        }
        this.f23198b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f23209n);
        }
        C2161u0 c2161u0 = this.f23199c;
        if (c2161u0 != null) {
            c2161u0.setAdapter(this.f23198b);
        }
    }

    public C2161u0 p(Context context, boolean z10) {
        return new C2161u0(context, z10);
    }

    public final void q(int i10) {
        Drawable background = this.f23219y.getBackground();
        if (background == null) {
            this.f23201e = i10;
            return;
        }
        Rect rect = this.f23216v;
        background.getPadding(rect);
        this.f23201e = rect.left + rect.right + i10;
    }
}
