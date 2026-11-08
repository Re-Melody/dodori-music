package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f20697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f20698b;

    public A(View view, z zVar) {
        this.f20697a = view;
        this.f20698b = zVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        z zVar = this.f20698b;
        if (zVar == null) {
            return;
        }
        zVar.run();
        this.f20698b = null;
        this.f20697a.post(new z(this, 1));
    }
}
