package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20718a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f20719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f20720c;

    public i(View.OnFocusChangeListener onFocusChangeListener, p107j8.a aVar) {
        this.f20719b = onFocusChangeListener;
        this.f20720c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f20718a) {
            case 0:
                j jVar = (j) this.f20720c;
                this.f20719b.onFocusChange(jVar, S9.b.B0(jVar, new A8.c(0)));
                break;
            default:
                p107j8.a aVar = (p107j8.a) this.f20720c;
                this.f20719b.onFocusChange(aVar, S9.b.B0(aVar, new A8.c(0)));
                break;
        }
    }

    public i(j jVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f20720c = jVar;
        this.f20719b = onFocusChangeListener;
    }
}
