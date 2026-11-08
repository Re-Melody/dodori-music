package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1150q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f17952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f17953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C1148o f17954c;

    public C1150q(Looper looper, Object obj, String str) {
        this.f17952a = new P5.a(looper);
        com.google.android.gms.common.internal.E.i(obj, "Listener must not be null");
        this.f17953b = obj;
        com.google.android.gms.common.internal.E.e(str);
        this.f17954c = new C1148o(obj, str);
    }

    public final void a() {
        this.f17953b = null;
        this.f17954c = null;
    }

    public final void b(InterfaceC1149p interfaceC1149p) {
        this.f17952a.execute(new e0(this, interfaceC1149p));
    }

    public C1150q(Object obj, String str, Executor executor) {
        com.google.android.gms.common.internal.E.i(executor, "Executor must not be null");
        this.f17952a = executor;
        com.google.android.gms.common.internal.E.i(obj, "Listener must not be null");
        this.f17953b = obj;
        com.google.android.gms.common.internal.E.e(str);
        this.f17954c = new C1148o(obj, str);
    }
}
