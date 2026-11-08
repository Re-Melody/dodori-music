package K1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends v0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f7325i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f7326j;
    public static Class k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f7327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Field f7328m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f7329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B1.c[] f7330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B1.c f7331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f7332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B1.c f7333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7334h;

    public o0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var);
        this.f7331e = null;
        this.f7329c = windowInsets;
    }

    public static boolean B(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    private B1.c u(int i10, boolean z10) {
        B1.c cVarA = B1.c.f531e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVarA = B1.c.a(cVarA, v(i11, z10));
            }
        }
        return cVarA;
    }

    private B1.c w() {
        z0 z0Var = this.f7332f;
        return z0Var != null ? z0Var.f7354a.i() : B1.c.f531e;
    }

    private B1.c x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f7325i) {
            z();
        }
        Method method = f7326j;
        if (method != null && k != null && f7327l != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f7327l.get(f7328m.get(objInvoke));
                if (rect != null) {
                    return B1.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void z() {
        try {
            f7326j = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            f7327l = cls.getDeclaredField("mVisibleInsets");
            f7328m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f7327l.setAccessible(true);
            f7328m.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f7325i = true;
    }

    public void A(B1.c cVar) {
        this.f7333g = cVar;
    }

    @Override // K1.v0
    public void d(View view) {
        B1.c cVarX = x(view);
        if (cVarX == null) {
            cVarX = B1.c.f531e;
        }
        A(cVarX);
    }

    @Override // K1.v0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Objects.equals(this.f7333g, o0Var.f7333g) && B(this.f7334h, o0Var.f7334h);
    }

    @Override // K1.v0
    public B1.c f(int i10) {
        return u(i10, false);
    }

    @Override // K1.v0
    public B1.c g(int i10) {
        return u(i10, true);
    }

    @Override // K1.v0
    public final B1.c k() {
        if (this.f7331e == null) {
            WindowInsets windowInsets = this.f7329c;
            this.f7331e = B1.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f7331e;
    }

    @Override // K1.v0
    public z0 m(int i10, int i11, int i12, int i13) {
        n0 j0Var;
        z0 z0VarG = z0.g(null, this.f7329c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            j0Var = new m0(z0VarG);
        } else if (i14 >= 31) {
            j0Var = new l0(z0VarG);
        } else if (i14 >= 30) {
            j0Var = new k0(z0VarG);
        } else {
            j0Var = i14 >= 29 ? new j0(z0VarG) : new i0(z0VarG);
        }
        j0Var.g(z0.e(k(), i10, i11, i12, i13));
        j0Var.e(z0.e(i(), i10, i11, i12, i13));
        return j0Var.b();
    }

    @Override // K1.v0
    public boolean o() {
        return this.f7329c.isRound();
    }

    @Override // K1.v0
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !y(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // K1.v0
    public void q(B1.c[] cVarArr) {
        this.f7330d = cVarArr;
    }

    @Override // K1.v0
    public void r(z0 z0Var) {
        this.f7332f = z0Var;
    }

    @Override // K1.v0
    public void t(int i10) {
        this.f7334h = i10;
    }

    public B1.c v(int i10, boolean z10) {
        B1.c cVarI;
        int i11;
        B1.c cVar = B1.c.f531e;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    B1.c[] cVarArr = this.f7330d;
                    cVarI = cVarArr != null ? cVarArr[p242x0.c.C(8)] : null;
                    if (cVarI != null) {
                        return cVarI;
                    }
                    B1.c cVarK = k();
                    B1.c cVarW = w();
                    int i12 = cVarK.f535d;
                    if (i12 > cVarW.f535d) {
                        return B1.c.b(0, 0, 0, i12);
                    }
                    B1.c cVar2 = this.f7333g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i11 = this.f7333g.f535d) > cVarW.f535d) {
                        return B1.c.b(0, 0, 0, i11);
                    }
                } else {
                    if (i10 == 16) {
                        return j();
                    }
                    if (i10 == 32) {
                        return h();
                    }
                    if (i10 == 64) {
                        return l();
                    }
                    if (i10 == 128) {
                        z0 z0Var = this.f7332f;
                        C0606h c0606hE = z0Var != null ? z0Var.f7354a.e() : e();
                        if (c0606hE != null) {
                            int i13 = Build.VERSION.SDK_INT;
                            return B1.c.b(i13 >= 28 ? C1.b.i(c0606hE.f7303a) : 0, i13 >= 28 ? C1.b.k(c0606hE.f7303a) : 0, i13 >= 28 ? C1.b.j(c0606hE.f7303a) : 0, i13 >= 28 ? C1.b.h(c0606hE.f7303a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    B1.c cVarW2 = w();
                    B1.c cVarI2 = i();
                    return B1.c.b(Math.max(cVarW2.f532a, cVarI2.f532a), 0, Math.max(cVarW2.f534c, cVarI2.f534c), Math.max(cVarW2.f535d, cVarI2.f535d));
                }
                if ((this.f7334h & 2) == 0) {
                    B1.c cVarK2 = k();
                    z0 z0Var2 = this.f7332f;
                    cVarI = z0Var2 != null ? z0Var2.f7354a.i() : null;
                    int iMin = cVarK2.f535d;
                    if (cVarI != null) {
                        iMin = Math.min(iMin, cVarI.f535d);
                    }
                    return B1.c.b(cVarK2.f532a, 0, cVarK2.f534c, iMin);
                }
            }
        } else {
            if (z10) {
                return B1.c.b(0, Math.max(w().f533b, k().f533b), 0, 0);
            }
            if ((this.f7334h & 4) == 0) {
                return B1.c.b(0, k().f533b, 0, 0);
            }
        }
        return cVar;
    }

    public boolean y(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !v(i10, false).equals(B1.c.f531e);
    }
}
