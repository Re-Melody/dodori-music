package com.google.android.gms.internal.identity_googleid;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzk extends zzj {
    static final zzj zza = new zzk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzk(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zza.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzj, com.google.android.gms.internal.identity_googleid.zzf
    public final int zza(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final Object[] zze() {
        return this.zzb;
    }
}
