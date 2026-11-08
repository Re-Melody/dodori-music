package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f18320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p248x6.y f18321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f18322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.f18320c = bnVar;
        this.f18321d = new p248x6.y("OnRequestIntegrityTokenCallback");
        this.f18322e = j10;
    }

    @Override // com.google.android.play.core.integrity.bi, p248x6.q
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f18321d.b("onRequestExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f18320c.f18331f.a(bundle);
        if (jVarA != null) {
            this.f18317a.trySetException(jVarA);
            return;
        }
        bj bjVar = new bj(this, this.f18320c.f18328c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f18317a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
