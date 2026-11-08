package com.google.android.recaptcha.internal;

import D7.W;
import M8.h;
import Q5.b;
import Q8.d;
import R8.a;
import com.apple.android.music.playback.model.MediaPlayerException;
import p119k9.F;

/* JADX INFO: loaded from: classes.dex */
public final class zzfj {
    private final h zza;

    public zzfj() {
        int i10 = zzav.zza;
        this.zza = W.S(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, d dVar) throws Throwable {
        zzfg zzfgVar;
        if (dVar instanceof zzfg) {
            zzfgVar = (zzfg) dVar;
            int i10 = zzfgVar.zzc;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                zzfgVar.zzc = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                zzfgVar = new zzfg(zzfjVar, dVar);
            }
        } else {
            zzfgVar = new zzfg(zzfjVar, dVar);
        }
        Object obj = zzfgVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = zzfgVar.zzc;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.T(obj);
            return obj;
        }
        b.T(obj);
        zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
        zzfgVar.zzc = 1;
        Object objH = F.h(zzfhVar, zzfgVar);
        return objH == aVar ? aVar : objH;
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, d dVar) {
        return zzc(this, zzbrVar, zzspVar, dVar);
    }
}
