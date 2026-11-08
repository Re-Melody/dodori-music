package com.google.android.recaptcha.internal;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
final class zzfg extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfj zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfg(zzfj zzfjVar, d dVar) {
        super(dVar);
        this.zzb = zzfjVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= MediaPlayerException.ERROR_UNKNOWN;
        return zzfj.zzc(this.zzb, null, null, this);
    }
}
