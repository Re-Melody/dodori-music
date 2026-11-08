package com.google.android.recaptcha.internal;

import M8.D;
import Q5.b;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.m;
import t9.a;
import t9.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzcb {
    private Object zza;
    private final a zzb = new d();

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zza(Object obj, Q8.d dVar) {
        zzby zzbyVar;
        zzcb zzcbVar;
        a aVar;
        if (dVar instanceof zzby) {
            zzbyVar = (zzby) dVar;
            int i10 = zzbyVar.zzd;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                zzbyVar.zzd = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                zzbyVar = new zzby(this, dVar);
            }
        } else {
            zzbyVar = new zzby(this, dVar);
        }
        Object obj2 = zzbyVar.zzb;
        R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
        int i11 = zzbyVar.zzd;
        if (i11 == 0) {
            b.T(obj2);
            a aVar3 = this.zzb;
            zzbyVar.zze = this;
            zzbyVar.zzf = (zzje) obj;
            zzbyVar.zza = aVar3;
            zzbyVar.zzd = 1;
            d dVar2 = (d) aVar3;
            if (dVar2.c(zzbyVar) == aVar2) {
                return aVar2;
            }
            zzcbVar = this;
            aVar = dVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar4 = (a) zzbyVar.zza;
            zzje zzjeVar = zzbyVar.zzf;
            zzcbVar = zzbyVar.zze;
            b.T(obj2);
            aVar = aVar4;
            obj = zzjeVar;
        }
        try {
            return Boolean.valueOf(m.b(zzcbVar.zza, obj));
        } finally {
            ((d) aVar).e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzb(Object[] objArr, Q8.d dVar) {
        zzbz zzbzVar;
        zzcb zzcbVar;
        a aVar;
        if (dVar instanceof zzbz) {
            zzbzVar = (zzbz) dVar;
            int i10 = zzbzVar.zzd;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                zzbzVar.zzd = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                zzbzVar = new zzbz(this, dVar);
            }
        } else {
            zzbzVar = new zzbz(this, dVar);
        }
        Object obj = zzbzVar.zzb;
        R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
        int i11 = zzbzVar.zzd;
        if (i11 == 0) {
            b.T(obj);
            a aVar3 = this.zzb;
            zzbzVar.zze = this;
            zzbzVar.zzf = (zzje[]) objArr;
            zzbzVar.zza = aVar3;
            zzbzVar.zzd = 1;
            d dVar2 = (d) aVar3;
            if (dVar2.c(zzbzVar) == aVar2) {
                return aVar2;
            }
            zzcbVar = this;
            aVar = dVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar4 = (a) zzbzVar.zza;
            zzje[] zzjeVarArr = zzbzVar.zzf;
            zzcbVar = zzbzVar.zze;
            b.T(obj);
            aVar = aVar4;
            objArr = zzjeVarArr;
        }
        try {
            return Boolean.valueOf(N8.m.g0(zzcbVar.zza, objArr));
        } finally {
            ((d) aVar).e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzc(Object obj, Q8.d dVar) {
        zzca zzcaVar;
        zzcb zzcbVar;
        a aVar;
        if (dVar instanceof zzca) {
            zzcaVar = (zzca) dVar;
            int i10 = zzcaVar.zzd;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                zzcaVar.zzd = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                zzcaVar = new zzca(this, dVar);
            }
        } else {
            zzcaVar = new zzca(this, dVar);
        }
        Object obj2 = zzcaVar.zzb;
        R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
        int i11 = zzcaVar.zzd;
        if (i11 == 0) {
            b.T(obj2);
            a aVar3 = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzje) obj;
            zzcaVar.zza = aVar3;
            zzcaVar.zzd = 1;
            d dVar2 = (d) aVar3;
            if (dVar2.c(zzcaVar) == aVar2) {
                return aVar2;
            }
            zzcbVar = this;
            aVar = dVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar4 = (a) zzcaVar.zza;
            zzje zzjeVar = zzcaVar.zzf;
            zzcbVar = zzcaVar.zze;
            b.T(obj2);
            aVar = aVar4;
            obj = zzjeVar;
        }
        try {
            zzcbVar.zza = obj;
            return D.f8402a;
        } finally {
            ((d) aVar).e(null);
        }
    }
}
