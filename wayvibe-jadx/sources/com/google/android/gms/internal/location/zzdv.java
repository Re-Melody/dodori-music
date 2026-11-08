package com.google.android.gms.internal.location;

import Z5.F;
import com.google.android.gms.common.api.internal.C1150q;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes.dex */
final class zzdv extends F {
    private final zzdr zza;

    public zzdv(zzdr zzdrVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.zza = zzdrVar;
    }

    public final zzdv zzc(C1150q c1150q) {
        this.zza.zzb(c1150q);
        return this;
    }

    @Override // Z5.G
    public final void zzd(LocationResult locationResult) {
        this.zza.zza().b(new zzds(this, locationResult));
    }

    @Override // Z5.G
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.zza().b(new zzdt(this, locationAvailability));
    }

    @Override // Z5.G
    public final void zzf() {
        this.zza.zza().b(new zzdu(this));
    }

    public final void zzg() {
        this.zza.zza().a();
    }

    public final /* synthetic */ zzdr zzh() {
        return this.zza;
    }
}
