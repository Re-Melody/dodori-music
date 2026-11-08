package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

/* JADX INFO: loaded from: classes.dex */
final class as extends p248x6.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f18281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p248x6.d f18282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p248x6.y f18283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f18285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f18286f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, p248x6.d dVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.f18283c = new p248x6.y("RequestDialogCallbackImpl");
        this.f18284d = context.getPackageName();
        this.f18285e = kVar;
        this.f18281a = taskCompletionSource;
        this.f18286f = activity;
        this.f18282b = dVar;
    }

    @Override // p248x6.x
    public final void b(Bundle bundle) {
        this.f18282b.d(this.f18281a);
        this.f18283c.b("onRequestDialog(%s)", this.f18284d);
        com.google.android.gms.common.api.j jVarA = this.f18285e.a(bundle);
        if (jVarA != null) {
            this.f18281a.trySetException(jVarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            p248x6.y yVar = this.f18283c;
            Object[] objArr = {this.f18284d};
            yVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", p248x6.y.c(yVar.f28629a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f18281a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f18286f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, new ar(this, this.f18282b.a()));
        p248x6.y yVar2 = this.f18283c;
        Object[] objArr2 = new Object[0];
        yVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", p248x6.y.c(yVar2.f28629a, "Starting dialog intent...", objArr2));
        }
        this.f18286f.startActivityForResult(intent, 0);
    }
}
