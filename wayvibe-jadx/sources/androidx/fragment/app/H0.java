package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {
    public static J0 a(View view) {
        kotlin.jvm.internal.m.f(view, "<this>");
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? J0.INVISIBLE : b(view.getVisibility());
    }

    public static J0 b(int i10) {
        if (i10 == 0) {
            return J0.VISIBLE;
        }
        if (i10 == 4) {
            return J0.INVISIBLE;
        }
        if (i10 == 8) {
            return J0.GONE;
        }
        throw new IllegalArgumentException(p134m1.b.j(i10, "Unknown visibility "));
    }
}
