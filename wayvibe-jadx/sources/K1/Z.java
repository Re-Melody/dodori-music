package K1;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f7264a;

    public Z(View view) {
        this.f7264a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f7264a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f7264a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = (View) this.f7264a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(InterfaceC0596a0 interfaceC0596a0) {
        View view = (View) this.f7264a.get();
        if (view != null) {
            if (interfaceC0596a0 != null) {
                view.animate().setListener(new Y(0, view, interfaceC0596a0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f7264a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
