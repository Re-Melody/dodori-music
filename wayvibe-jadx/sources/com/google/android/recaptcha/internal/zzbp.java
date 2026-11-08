package com.google.android.recaptcha.internal;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
final class zzbp extends c {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzbq zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbq zzbqVar, d dVar) {
        super(dVar);
        this.zzg = zzbqVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= MediaPlayerException.ERROR_UNKNOWN;
        return this.zzg.zza(null, 0L, 0L, 0.0d, null, this);
    }
}
