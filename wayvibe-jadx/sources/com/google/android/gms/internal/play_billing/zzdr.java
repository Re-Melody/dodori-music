package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class zzdr extends zzfu implements zzhc {
    private static final zzdr zzb;
    private int zzd;
    private zzeb zze;
    private zzeb zzf;
    private int zzg;

    static {
        zzdr zzdrVar = new zzdr();
        zzb = zzdrVar;
        zzfu.zzB(zzdr.class, zzdrVar);
    }

    private zzdr() {
    }

    public static zzdq zza() {
        return (zzdq) zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzdr zzdrVar, zzeb zzebVar) {
        zzebVar.getClass();
        zzdrVar.zze = zzebVar;
        zzdrVar.zzd |= 1;
    }

    public static /* synthetic */ void zze(zzdr zzdrVar, zzeb zzebVar) {
        zzebVar.getClass();
        zzdrVar.zzf = zzebVar;
        zzdrVar.zzd |= 2;
    }

    public static /* synthetic */ void zzf(zzdr zzdrVar, int i10) {
        zzdrVar.zzg = i10 - 1;
        zzdrVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzee.zza()});
        }
        if (i11 == 3) {
            return new zzdr();
        }
        zzdu zzduVar = null;
        if (i11 == 4) {
            return new zzdq(zzduVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
