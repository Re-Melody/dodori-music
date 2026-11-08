package com.google.android.gms.internal.p002firebaseauthapi;

import B2.AbstractC0112b;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzoh extends zzce {
    private final zzqd zza;

    public zzoh(zzqd zzqdVar) {
        this.zza = zzqdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoh)) {
            return false;
        }
        zzqd zzqdVar = ((zzoh) obj).zza;
        return this.zza.zza().zzd().equals(zzqdVar.zza().zzd()) && this.zza.zza().zzf().equals(zzqdVar.zza().zzf()) && this.zza.zza().zze().equals(zzqdVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        String str;
        String strZzf = this.zza.zza().zzf();
        int i10 = zzok.zza[this.zza.zza().zzd().ordinal()];
        if (i10 == 1) {
            str = "TINK";
        } else if (i10 == 2) {
            str = "LEGACY";
        } else if (i10 != 3) {
            str = i10 != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return AbstractC0112b.h("(typeUrl=", strZzf, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxu.RAW;
    }

    public final zzqd zzb() {
        return this.zza;
    }
}
