package K1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f7305e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f7306f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f7307g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f7308h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f7309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B1.c f7310d;

    public i0() {
        this.f7309c = i();
    }

    private static WindowInsets i() {
        if (!f7306f) {
            try {
                f7305e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f7306f = true;
        }
        Field field = f7305e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!f7308h) {
            try {
                f7307g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e7);
            }
            f7308h = true;
        }
        Constructor constructor = f7307g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
            }
        }
        return null;
    }

    @Override // K1.n0
    public z0 b() {
        a();
        z0 z0VarG = z0.g(null, this.f7309c);
        B1.c[] cVarArr = this.f7324b;
        v0 v0Var = z0VarG.f7354a;
        v0Var.q(cVarArr);
        v0Var.s(this.f7310d);
        return z0VarG;
    }

    @Override // K1.n0
    public void e(B1.c cVar) {
        this.f7310d = cVar;
    }

    @Override // K1.n0
    public void g(B1.c cVar) {
        WindowInsets windowInsets = this.f7309c;
        if (windowInsets != null) {
            this.f7309c = windowInsets.replaceSystemWindowInsets(cVar.f532a, cVar.f533b, cVar.f534c, cVar.f535d);
        }
    }

    public i0(z0 z0Var) {
        super(z0Var);
        this.f7309c = z0Var.f();
    }
}
