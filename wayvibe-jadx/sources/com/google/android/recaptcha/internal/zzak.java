package com.google.android.recaptcha.internal;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
final class zzak extends c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzan zzc;
    int zzd;
    zzan zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzan zzanVar, d dVar) {
        super(dVar);
        this.zzc = zzanVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= MediaPlayerException.ERROR_UNKNOWN;
        return this.zzc.zze(this);
    }
}
