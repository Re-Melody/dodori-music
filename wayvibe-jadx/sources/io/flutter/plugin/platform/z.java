package io.flutter.plugin.platform;

import G0.x1;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20796b;

    public /* synthetic */ z(Object obj, int i10) {
        this.f20795a = i10;
        this.f20796b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20795a) {
            case 0:
                x1 x1Var = (x1) this.f20796b;
                ((View) x1Var.f5329b).postDelayed((n) x1Var.f5330c, 128L);
                break;
            default:
                A a10 = (A) this.f20796b;
                a10.f20697a.getViewTreeObserver().removeOnDrawListener(a10);
                break;
        }
    }
}
