package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC1149p;

/* JADX INFO: loaded from: classes.dex */
final class zzdu implements InterfaceC1149p {
    final /* synthetic */ zzdv zza;

    public zzdu(zzdv zzdvVar) {
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.zza.zzh().zzc();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final void onNotifyListenerFailed() {
    }
}
