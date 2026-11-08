package p152o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p142n.ViewTreeObserverOnGlobalLayoutListenerC2073d;

/* JADX INFO: loaded from: classes.dex */
public final class M implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2073d f23234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f23235b;

    public M(N n6, ViewTreeObserverOnGlobalLayoutListenerC2073d viewTreeObserverOnGlobalLayoutListenerC2073d) {
        this.f23235b = n6;
        this.f23234a = viewTreeObserverOnGlobalLayoutListenerC2073d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f23235b.f23240F.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f23234a);
        }
    }
}
