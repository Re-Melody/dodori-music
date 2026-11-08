package com.google.android.gms.internal.location;

import Z5.I;
import android.location.Location;
import com.google.android.gms.common.api.internal.C1150q;

/* JADX INFO: loaded from: classes.dex */
final class zzdy extends I {
    private final zzdr zza;

    public zzdy(zzdr zzdrVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.zza = zzdrVar;
    }

    public final zzdy zzc(C1150q c1150q) {
        this.zza.zzb(c1150q);
        return this;
    }

    @Override // Z5.J
    public final void zzd(Location location) {
        this.zza.zza().b(new zzdw(this, location));
    }

    @Override // Z5.J
    public final void zze() {
        this.zza.zza().b(new zzdx(this));
    }

    public final void zzf() {
        this.zza.zza().a();
    }

    public final /* synthetic */ zzdr zzg() {
        return this.zza;
    }
}
