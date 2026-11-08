package com.google.android.gms.internal.p002firebaseauthapi;

import W6.i;
import Z6.t;
import Z6.v;
import Z6.w;

/* JADX INFO: loaded from: classes.dex */
final class zzafs extends w {
    private final /* synthetic */ w zza;
    private final /* synthetic */ String zzb;

    public zzafs(w wVar, String str) {
        this.zza = wVar;
        this.zzb = str;
    }

    @Override // Z6.w
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzaft.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // Z6.w
    public final void onCodeSent(String str, v vVar) {
        this.zza.onCodeSent(str, vVar);
    }

    @Override // Z6.w
    public final void onVerificationCompleted(t tVar) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(tVar);
    }

    @Override // Z6.w
    public final void onVerificationFailed(i iVar) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationFailed(iVar);
    }
}
