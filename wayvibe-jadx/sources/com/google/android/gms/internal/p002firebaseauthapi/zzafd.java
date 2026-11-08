package com.google.android.gms.internal.p002firebaseauthapi;

import Z6.w;

/* JADX INFO: loaded from: classes.dex */
final class zzafd implements zzafe {
    private final /* synthetic */ String zza;

    public zzafd(zzaez zzaezVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(w wVar, Object... objArr) {
        wVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
