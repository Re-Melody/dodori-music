package K1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class C0 extends D7.W {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WindowInsetsController f7231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Window f7232h;

    public C0(Window window) {
        this.f7231g = window.getInsetsController();
        this.f7232h = window;
    }

    @Override // D7.W
    public final void f0(boolean z10) {
        Window window = this.f7232h;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f7231g.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f7231g.setSystemBarsAppearance(0, 16);
    }

    @Override // D7.W
    public final void g0(boolean z10) {
        Window window = this.f7232h;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f7231g.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f7231g.setSystemBarsAppearance(0, 8);
    }
}
