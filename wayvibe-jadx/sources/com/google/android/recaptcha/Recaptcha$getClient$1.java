package com.google.android.recaptcha;

import M8.o;
import Q8.d;
import R8.a;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // S8.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= MediaPlayerException.ERROR_UNKNOWN;
        Object objM16getClientBWLJW6A = this.zzb.m16getClientBWLJW6A(null, null, 0L, this);
        return objM16getClientBWLJW6A == a.COROUTINE_SUSPENDED ? objM16getClientBWLJW6A : new o(objM16getClientBWLJW6A);
    }
}
