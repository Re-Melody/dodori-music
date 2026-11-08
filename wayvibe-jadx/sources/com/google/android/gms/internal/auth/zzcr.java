package com.google.android.gms.internal.auth;

import android.net.Uri;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class zzcr {
    private static final C2230e zza = new C2230e(0);

    public static synchronized Uri zza(String str) {
        C2230e c2230e = zza;
        Uri uri = (Uri) c2230e.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        c2230e.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
