package K1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static z0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        z0 z0VarG = z0.g(null, rootWindowInsets);
        v0 v0Var = z0VarG.f7354a;
        v0Var.r(z0VarG);
        v0Var.d(view.getRootView());
        return z0VarG;
    }

    public static void b(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
