package com.google.android.recaptcha.internal;

import Q8.d;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: loaded from: classes.dex */
final class zzed extends c {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;
    int zzd;
    zzef zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzef zzefVar, d dVar) {
        super(dVar);
        this.zzc = zzefVar;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= MediaPlayerException.ERROR_UNKNOWN;
        return this.zzc.zza(null, null, 0L, this);
    }
}
