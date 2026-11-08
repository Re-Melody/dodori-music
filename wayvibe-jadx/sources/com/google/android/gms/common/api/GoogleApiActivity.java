package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.internal.C1142i;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.internal.base.zau;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17825b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17826a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f17826a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                C1142i c1142iH = C1142i.h(this);
                if (i11 == -1) {
                    zau zauVar = c1142iH.f17947n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                } else if (i11 == 0) {
                    c1142iH.j(new H5.b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f17826a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f17826a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f17826a = bundle.getInt("resolution");
        }
        if (this.f17826a == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get(DiagnosticsTracker.ERROR_CODE_KEY);
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            E.h(num);
            H5.e.f6041d.d(this, num.intValue(), this);
            this.f17826a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f17826a = 1;
            } catch (ActivityNotFoundException e2) {
                e = e2;
                if (extras.getBoolean("notify_manager", true)) {
                    C1142i.h(this).j(new H5.b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strO = V0.p.o("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strO = strO.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strO, e);
                }
                googleApiActivity.f17826a = 1;
                finish();
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e7) {
            e = e7;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f17826a);
        super.onSaveInstanceState(bundle);
    }
}
