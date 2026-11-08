package com.google.android.gms.internal.location;

import Z5.l;
import com.google.android.gms.common.api.internal.InterfaceC1149p;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes.dex */
final class zzdt implements InterfaceC1149p {
    final /* synthetic */ LocationAvailability zza;

    public zzdt(zzdv zzdvVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final /* synthetic */ void notifyListener(Object obj) {
        ((l) obj).onLocationAvailability(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final void onNotifyListenerFailed() {
    }
}
