package K1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class J implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f7244a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0617t f7246c;

    public J(View view, InterfaceC0617t interfaceC0617t) {
        this.f7245b = view;
        this.f7246c = interfaceC0617t;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        z0 z0VarG = z0.g(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        InterfaceC0617t interfaceC0617t = this.f7246c;
        if (i10 < 30) {
            K.a(windowInsets, this.f7245b);
            if (z0VarG.equals(this.f7244a)) {
                return interfaceC0617t.d(view, z0VarG).f();
            }
        }
        this.f7244a = z0VarG;
        z0 z0VarD = interfaceC0617t.d(view, z0VarG);
        if (i10 >= 30) {
            return z0VarD.f();
        }
        WeakHashMap weakHashMap = T.f7251a;
        I.c(view);
        return z0VarD.f();
    }
}
