package K1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import app.nagakiba.wayvibe.R;

/* JADX INFO: renamed from: K1.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0602d0 extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f7282d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p145n2.a f7283e = new p145n2.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f7284f = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AccelerateInterpolator f7285g = new AccelerateInterpolator(1.5f);

    public static void d(View view, h0 h0Var) {
        C.N nI = i(view);
        if (nI != null) {
            nI.a(h0Var);
            if (nI.f939b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                d(viewGroup.getChildAt(i10), h0Var);
            }
        }
    }

    public static void e(View view, z0 z0Var, boolean z10) {
        C.N nI = i(view);
        if (nI != null) {
            nI.f938a = z0Var;
            if (!z10) {
                z10 = true;
                nI.f941d = true;
                nI.f942e = true;
                if (nI.f939b != 0) {
                    z10 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z0Var, z10);
            }
        }
    }

    public static void f(View view, z0 z0Var) {
        C.N nI = i(view);
        if (nI != null) {
            C.x0 x0Var = nI.f940c;
            C.x0.a(x0Var, z0Var);
            if (x0Var.f1112s) {
                z0Var = z0.f7353b;
            }
            if (nI.f939b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), z0Var);
            }
        }
    }

    public static void g(View view) {
        C.N nI = i(view);
        if (nI != null) {
            nI.f941d = false;
            if (nI.f939b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10));
            }
        }
    }

    public static WindowInsets h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C.N i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0600c0) {
            return ((ViewOnApplyWindowInsetsListenerC0600c0) tag).f7274a;
        }
        return null;
    }
}
