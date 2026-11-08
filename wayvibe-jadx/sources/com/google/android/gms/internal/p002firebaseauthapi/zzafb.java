package com.google.android.gms.internal.p002firebaseauthapi;

import Z6.v;
import Z6.w;

/* JADX INFO: loaded from: classes.dex */
final class zzafb implements zzafe {
    private final /* synthetic */ String zza;

    public zzafb(zzaez zzaezVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(w wVar, Object... objArr) {
        wVar.onCodeSent(this.zza, new v());
    }
}
