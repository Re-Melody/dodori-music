package androidx.credentials.playservices.controllers.identitycredentials;

import U1.a;
import U1.d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public class IdentityCredentialApiHiddenActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f15021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15022b;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        ResultReceiver resultReceiver = this.f15021a;
        if (resultReceiver != null) {
            a aVar = d.f12053a;
            a.c(resultReceiver, i10, i11, intent);
        }
        this.f15022b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f15021a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_ERROR_NAME");
        if (stringExtra == null) {
            finish();
            return;
        }
        if (bundle != null) {
            this.f15022b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f15022b) {
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
        if (pendingIntent != null) {
            this.f15022b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), d.f12055c, null, 0, 0, 0, null);
            return;
        }
        ResultReceiver resultReceiver2 = this.f15021a;
        if (resultReceiver2 != null) {
            a aVar = d.f12053a;
            a.b(resultReceiver2, stringExtra, "Internal error");
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        m.f(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f15022b);
        super.onSaveInstanceState(outState);
    }
}
