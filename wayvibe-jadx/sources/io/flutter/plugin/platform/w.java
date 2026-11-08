package io.flutter.plugin.platform;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements io.flutter.view.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f20788a;

    public w(x xVar) {
        this.f20788a = xVar;
    }

    @Override // io.flutter.view.u
    public final void onTrimMemory(int i10) {
        if (i10 != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f20788a.f20794f = true;
    }
}
