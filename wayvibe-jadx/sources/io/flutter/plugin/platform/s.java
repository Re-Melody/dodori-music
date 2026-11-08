package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1950a f20779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f20780b;

    public s(Context context, C1950a c1950a, View view) {
        super(context);
        this.f20779a = c1950a;
        this.f20780b = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.m mVar = this.f20779a.f20710a;
        if (mVar == null) {
            return false;
        }
        return mVar.a(this.f20780b, view, accessibilityEvent);
    }
}
