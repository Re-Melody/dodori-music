package com.google.android.gms.internal.play_billing;

import V0.p;

/* JADX INFO: loaded from: classes.dex */
public final class zzgu {
    private final zzgt zza;

    private zzgu(zzir zzirVar, Object obj, zzir zzirVar2, Object obj2) {
        this.zza = new zzgt(zzirVar, "", zzirVar2, obj2);
    }

    public static int zzb(zzgt zzgtVar, Object obj, Object obj2) {
        return zzfm.zza(zzgtVar.zza, 1, obj) + zzfm.zza(zzgtVar.zzc, 2, obj2);
    }

    public static zzgu zzd(zzir zzirVar, Object obj, zzir zzirVar2, Object obj2) {
        return new zzgu(zzirVar, "", zzirVar2, obj2);
    }

    public static void zze(zzfc zzfcVar, zzgt zzgtVar, Object obj, Object obj2) {
        zzfm.zzi(zzfcVar, zzgtVar.zza, 1, obj);
        zzfm.zzi(zzfcVar, zzgtVar.zzc, 2, obj2);
    }

    public final int zza(int i10, Object obj, Object obj2) {
        zzgt zzgtVar = this.zza;
        int iZzy = zzfc.zzy(i10 << 3);
        int iZzb = zzb(zzgtVar, obj, obj2);
        return p.a(iZzb, iZzb, iZzy);
    }

    public final zzgt zzc() {
        return this.zza;
    }
}
