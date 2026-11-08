package com.google.android.gms.internal.p002firebaseauthapi;

import O5.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.E;

/* JADX INFO: loaded from: classes.dex */
public final class zzafp {
    private final String zza;
    private final String zzb;

    public zzafp(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzafp(Context context, String str) {
        E.h(context);
        E.e(str);
        this.zza = str;
        try {
            byte[] bArrE = a.e(context, str);
            if (bArrE != null) {
                this.zzb = a.a(bArrE);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
