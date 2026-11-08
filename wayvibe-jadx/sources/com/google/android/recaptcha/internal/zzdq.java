package com.google.android.recaptcha.internal;

import Z8.a;
import android.app.Application;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzdq extends n implements a {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // Z8.a
    public final Object invoke() throws zzbd {
        int i10 = zzav.zza;
        Object objZzb = zzau.zza().zzb(735120228);
        if (objZzb != null) {
            return (Application) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
