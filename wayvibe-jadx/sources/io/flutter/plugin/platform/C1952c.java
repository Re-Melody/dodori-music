package io.flutter.plugin.platform;

import android.view.MotionEvent;
import p045d8.C1940l;

/* JADX INFO: renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1952c extends C1940l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1950a f20712h;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1950a c1950a = this.f20712h;
        if (c1950a != null) {
            io.flutter.view.m mVar = c1950a.f20710a;
            if (mVar == null ? false : mVar.f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
