package com.google.android.gms.internal.auth;

import D5.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;

/* JADX INFO: loaded from: classes.dex */
final class zzbu implements u {
    private final Status zza;
    private b zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final b getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.u
    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(b bVar) {
        this.zzb = bVar;
        this.zza = Status.f17829e;
    }
}
