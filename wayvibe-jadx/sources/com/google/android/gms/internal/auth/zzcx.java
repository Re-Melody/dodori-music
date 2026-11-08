package com.google.android.gms.internal.auth;

import V0.p;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d10, boolean z10) {
        super(zzczVar, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbU = p.u("Invalid double value for ", this.zzc, ": ");
            sbU.append((String) obj);
            Log.e("PhenotypeFlag", sbU.toString());
            return null;
        }
    }
}
