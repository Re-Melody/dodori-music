package p142n;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p152o.L0;
import p152o.N;
import p152o.Q;

/* JADX INFO: renamed from: n.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2073d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22588b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2073d(Object obj, int i10) {
        this.f22587a = i10;
        this.f22588b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f22587a) {
            case 0:
                f fVar = (f) this.f22588b;
                if (fVar.b()) {
                    ArrayList arrayList = fVar.f22598h;
                    if (arrayList.size() > 0 && !((e) arrayList.get(0)).f22589a.f23218x) {
                        View view = fVar.f22604o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).f22589a.f();
                            }
                        } else {
                            fVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                C c3 = (C) this.f22588b;
                if (c3.b()) {
                    L0 l10 = c3.f22558h;
                    if (!l10.f23218x) {
                        View view2 = c3.f22562m;
                        if (view2 != null && view2.isShown()) {
                            l10.f();
                        } else {
                            c3.dismiss();
                        }
                    }
                }
                break;
            case 2:
                Q q5 = (Q) this.f22588b;
                if (!q5.getInternalPopup().b()) {
                    q5.f23264f.l(q5.getTextDirection(), q5.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = q5.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                N n6 = (N) this.f22588b;
                Q q9 = n6.f23240F;
                n6.getClass();
                if (q9.isAttachedToWindow() && q9.getGlobalVisibleRect(n6.f23238D)) {
                    n6.r();
                    n6.f();
                } else {
                    n6.dismiss();
                }
                break;
        }
    }
}
