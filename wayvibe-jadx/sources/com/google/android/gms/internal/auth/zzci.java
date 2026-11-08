package com.google.android.gms.internal.auth;

import android.net.Uri;
import p199t.G;

/* JADX INFO: loaded from: classes.dex */
public final class zzci {
    private final G zza;

    public zzci(G g3) {
        this.zza = g3;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        G g3;
        if (uri != null) {
            g3 = (G) this.zza.get(uri.toString());
        } else {
            g3 = null;
        }
        if (g3 == null) {
            return null;
        }
        return (String) g3.get("".concat(str3));
    }
}
