package com.google.android.gms.internal.identity_googleid;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzi extends zzj {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzj zzc;

    public zzi(zzj zzjVar, int i10, int i11) {
        Objects.requireNonNull(zzjVar);
        this.zzc = zzjVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zza.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzj, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzj subList(int i10, int i11) {
        zza.zzc(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
