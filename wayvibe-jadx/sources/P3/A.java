package P3;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f9530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0717c f9531b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f9530a = new C();
        } else {
            f9530a = new B();
        }
        f9531b = new C0717c(Float.class, "translationAlpha", 5);
        new C0717c(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f9530a.a0(view, i10, i11, i12, i13);
    }
}
