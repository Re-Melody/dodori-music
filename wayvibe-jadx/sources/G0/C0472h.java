package G0;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: G0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0472h implements InterfaceC0469g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f5218a;

    public C0472h(Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f5218a = (AccessibilityManager) systemService;
    }
}
