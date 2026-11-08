package p152o;

import C1.d;
import C1.e;
import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2150o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f23414a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f23415b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f23416c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f23414a);
        } else {
            drawable.setState(f23415b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        Object obj;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets insetsA = AbstractC2148n0.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        if (drawable instanceof d) {
            obj = drawable;
            ((e) ((d) drawable)).getClass();
            obj = null;
        }
        if (i10 >= 29) {
            boolean z10 = AbstractC2146m0.f23398a;
        } else if (AbstractC2146m0.f23398a) {
            try {
                Object objInvoke = AbstractC2146m0.f23399b.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(AbstractC2146m0.f23400c.getInt(objInvoke), AbstractC2146m0.f23401d.getInt(objInvoke), AbstractC2146m0.f23402e.getInt(objInvoke), AbstractC2146m0.f23403f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f23416c;
    }

    public static PorterDuff.Mode c(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
