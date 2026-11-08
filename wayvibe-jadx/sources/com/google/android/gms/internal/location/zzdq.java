package com.google.android.gms.internal.location;

import Z5.C;
import Z5.C0990e;
import com.google.android.gms.common.api.internal.C1150q;

/* JADX INFO: loaded from: classes.dex */
final class zzdq extends C {
    private C1150q zza;

    public zzdq(C1150q c1150q) {
        super("com.google.android.gms.location.IDeviceOrientationListener");
        this.zza = c1150q;
    }

    public final synchronized void zzc(C1150q c1150q) {
        C1150q c1150q2 = this.zza;
        if (c1150q2 != c1150q) {
            c1150q2.a();
            this.zza = c1150q;
        }
    }

    @Override // Z5.D
    public final void zzd(C0990e c0990e) {
        C1150q c1150q;
        synchronized (this) {
            c1150q = this.zza;
        }
        c1150q.b(new zzdp(this, c0990e));
    }

    public final synchronized void zze() {
        this.zza.a();
    }
}
