package com.google.android.gms.internal.location;

import Z5.l;
import com.google.android.gms.common.api.internal.InterfaceC1149p;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes.dex */
final class zzds implements InterfaceC1149p {
    final /* synthetic */ LocationResult zza;

    public zzds(zzdv zzdvVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final /* synthetic */ void notifyListener(Object obj) {
        ((l) obj).onLocationResult(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final void onNotifyListenerFailed() {
    }
}
