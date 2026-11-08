package com.google.android.gms.internal.p002firebaseauthapi;

import H5.f;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzael {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iC = f.f6043b.c(context, 12451000);
            zza = Boolean.valueOf(iC == 0 || iC == 2);
        }
        return zza.booleanValue();
    }
}
