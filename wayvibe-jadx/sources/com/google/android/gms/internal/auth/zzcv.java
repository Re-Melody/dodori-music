package com.google.android.gms.internal.auth;

import V0.p;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l10, boolean z10) {
        super(zzczVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbU = p.u("Invalid long value for ", this.zzc, ": ");
            sbU.append((String) obj);
            Log.e("PhenotypeFlag", sbU.toString());
            return null;
        }
    }
}
