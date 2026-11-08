package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzev extends zzet {
    private final zzex zza;

    public zzev(zzex zzexVar, int i10) {
        super(zzexVar.size(), i10);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.location.zzet
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
