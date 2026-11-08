package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.InterfaceC1149p;

/* JADX INFO: loaded from: classes.dex */
final class zzdw implements InterfaceC1149p {
    final /* synthetic */ Location zza;

    public zzdw(zzdy zzdyVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final /* synthetic */ void notifyListener(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1149p
    public final void onNotifyListenerFailed() {
    }
}
