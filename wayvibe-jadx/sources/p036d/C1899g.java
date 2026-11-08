package p036d;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: d.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1899g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1899g f18982a = new C1899g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        m.f(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        m.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
