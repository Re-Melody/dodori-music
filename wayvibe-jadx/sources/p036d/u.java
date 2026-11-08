package p036d;

import D7.W;
import K1.A0;
import K1.B0;
import K1.C0;
import K1.D0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.m;
import p206t6.b;

/* JADX INFO: loaded from: classes.dex */
public class u extends t {
    @Override // p036d.s, p046da.b
    public void c0(K statusBarStyle, K navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        W b10;
        m.f(statusBarStyle, "statusBarStyle");
        m.f(navigationBarStyle, "navigationBarStyle");
        m.f(window, "window");
        m.f(view, "view");
        b.a0(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            b10 = new D0(window);
        } else if (i10 >= 30) {
            b10 = new C0(window);
        } else {
            b10 = i10 >= 26 ? new B0(window) : new A0(window);
        }
        b10.g0(!z10);
        b10.f0(!z11);
    }
}
