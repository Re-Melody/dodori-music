package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y f20699i = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f20700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f20701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1950a f20702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f20705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f20706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VirtualDisplay f20707h;

    public B(Activity activity, C1950a c1950a, VirtualDisplay virtualDisplay, f fVar, h hVar, m mVar, int i10) {
        this.f20701b = activity;
        this.f20702c = c1950a;
        this.f20705f = hVar;
        this.f20706g = mVar;
        this.f20704e = i10;
        this.f20707h = virtualDisplay;
        this.f20703d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f20707h.getDisplay(), fVar, c1950a, i10, mVar);
        this.f20700a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f20700a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
