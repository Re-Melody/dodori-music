package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.internal.E;

/* JADX INFO: loaded from: classes.dex */
public final class zzbv implements u {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        E.h(status);
        this.zza = status;
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.u
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        E.h(str);
        this.zzb = str;
        this.zza = Status.f17829e;
    }
}
