package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC1147n;

/* JADX INFO: loaded from: classes.dex */
public final class y implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f18095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18096c;

    public /* synthetic */ y(Intent intent, Object obj, int i10) {
        this.f18094a = i10;
        this.f18095b = intent;
        this.f18096c = obj;
    }

    public final void a() {
        switch (this.f18094a) {
            case 0:
                Intent intent = this.f18095b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f18096c).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f18095b;
                if (intent2 != null) {
                    ((InterfaceC1147n) this.f18096c).startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e2) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e2);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
