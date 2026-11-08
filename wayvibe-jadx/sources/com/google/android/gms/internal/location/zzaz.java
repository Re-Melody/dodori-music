package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C1150q;

/* JADX INFO: loaded from: classes.dex */
final class zzaz implements zzdr {
    private C1150q zza;

    public zzaz(C1150q c1150q) {
        this.zza = c1150q;
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final synchronized C1150q zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final synchronized void zzb(C1150q c1150q) {
        C1150q c1150q2 = this.zza;
        if (c1150q2 != c1150q) {
            c1150q2.a();
            this.zza = c1150q;
        }
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final void zzc() {
    }
}
