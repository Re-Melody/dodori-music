package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC1149p;

/* JADX INFO: loaded from: classes.dex */
final class zzdx implements InterfaceC1149p {
    final /* synthetic */ zzdy zza;

    public zzdx(zzdy zzdyVar) {
        this.zza = zzdyVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final /* synthetic */ void notifyListener(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        this.zza.zzg().zzc();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final void onNotifyListenerFailed() {
    }
}
