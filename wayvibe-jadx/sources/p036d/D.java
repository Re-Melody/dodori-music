package p036d;

import Z8.a;
import Z8.c;
import android.window.OnBackInvokedCallback;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f18951a = new D();

    public final OnBackInvokedCallback a(c onBackStarted, c onBackProgressed, a onBackInvoked, a onBackCancelled) {
        m.f(onBackStarted, "onBackStarted");
        m.f(onBackProgressed, "onBackProgressed");
        m.f(onBackInvoked, "onBackInvoked");
        m.f(onBackCancelled, "onBackCancelled");
        return new C(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
