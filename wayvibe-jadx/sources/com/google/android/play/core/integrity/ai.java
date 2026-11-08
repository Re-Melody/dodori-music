package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class ai extends p248x6.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f18260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p248x6.y f18261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f18262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f18260a = ajVar;
        this.f18261b = new p248x6.y("OnRequestIntegrityTokenCallback");
        this.f18262c = taskCompletionSource;
    }

    @Override // p248x6.v
    public final void b(Bundle bundle) {
        this.f18260a.f18263a.d(this.f18262c);
        this.f18261b.b("onRequestIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f18260a.f18267e.a(bundle);
        if (jVarA != null) {
            this.f18262c.trySetException(jVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f18262c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f18260a.f18265c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f18262c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
