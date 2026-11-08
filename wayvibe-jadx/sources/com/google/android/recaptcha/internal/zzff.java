package com.google.android.recaptcha.internal;

import D7.W;
import M8.h;
import Q8.d;
import p097i9.r;
import p119k9.F;

/* JADX INFO: loaded from: classes.dex */
public final class zzff {
    private final h zza;
    private final h zzb;
    private final h zzc;

    public zzff() {
        int i10 = zzav.zza;
        this.zza = W.S(zzfc.zza);
        this.zzb = W.S(zzfd.zza);
        this.zzc = W.S(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, d dVar) throws Exception {
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    String strZza = zzffVar.zzf().zza(strZzM);
                    if (strZza != null) {
                        zzenVarZzf.zza();
                        strZzb = strZza;
                    } else {
                        zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                    }
                } catch (Exception e2) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e2.getMessage()));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e4) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e4.getMessage()));
                    }
                } catch (zzbd e7) {
                    zzenVarZzf2.zzb(e7);
                    throw e7;
                }
            }
            return r.h0(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb);
        } catch (Exception e10) {
            if (e10 instanceof zzbd) {
                throw e10;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e10.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, d dVar) {
        return F.h(new zzfb(this, str, zztoVar, null), dVar);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, d dVar) {
        return zze(this, zzscVar, zzekVar, dVar);
    }
}
