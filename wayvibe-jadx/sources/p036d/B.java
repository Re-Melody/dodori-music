package p036d;

import Z8.a;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f18946a = new B();

    public final OnBackInvokedCallback a(a onBackInvoked) {
        m.f(onBackInvoked, "onBackInvoked");
        return new A(0, onBackInvoked);
    }

    public final void b(Object dispatcher, int i10, Object callback) {
        m.f(dispatcher, "dispatcher");
        m.f(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        m.f(dispatcher, "dispatcher");
        m.f(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
