package com.google.android.gms.internal.p002firebaseauthapi;

import Z6.t;
import Z6.w;

/* JADX INFO: loaded from: classes.dex */
final class zzafa implements zzafe {
    private final /* synthetic */ t zza;

    public zzafa(zzaez zzaezVar, t tVar) {
        this.zza = tVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(w wVar, Object... objArr) {
        wVar.onVerificationCompleted(this.zza);
    }
}
