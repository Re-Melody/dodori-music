package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
class bi extends p248x6.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f18317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f18318b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f18318b = bnVar;
        this.f18317a = taskCompletionSource;
    }

    @Override // p248x6.q
    public final void b(Bundle bundle) {
        this.f18318b.f18326a.d(this.f18317a);
    }

    @Override // p248x6.q
    public void c(Bundle bundle) {
        this.f18318b.f18326a.d(this.f18317a);
    }

    @Override // p248x6.q
    public final void d(Bundle bundle) {
        this.f18318b.f18326a.d(this.f18317a);
    }

    @Override // p248x6.q
    public void e(Bundle bundle) {
        this.f18318b.f18326a.d(this.f18317a);
    }
}
