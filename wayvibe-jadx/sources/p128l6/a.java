package p128l6;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p139m6.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22046b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f22045a = i10;
        this.f22046b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f22045a) {
            case 0:
                e eVar = (e) this.f22046b;
                float rotation = eVar.f22075q.getRotation();
                if (eVar.f22066g != rotation) {
                    eVar.f22066g = rotation;
                    b bVar = eVar.f22069j;
                    if (bVar != null) {
                        float f10 = -eVar.f22066g;
                        if (f10 != bVar.f22357m) {
                            bVar.f22357m = f10;
                            bVar.invalidateSelf();
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) this.f22046b).q(0);
                break;
        }
        return true;
    }
}
