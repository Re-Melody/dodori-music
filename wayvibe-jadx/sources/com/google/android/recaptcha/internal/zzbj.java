package com.google.android.recaptcha.internal;

import R3.a;
import V0.p;
import p097i9.k;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strB0 = k.B0(10, String.valueOf(this.zzb / ((long) this.zza)));
        String strB1 = k.B0(10, String.valueOf(this.zzc));
        return p.r(b.q("avgExecutionTime: ", strB0, " us| maxExecutionTime: ", strB1, " us| totalTime: "), k.B0(10, String.valueOf(this.zzb)), " us| #Usages: ", k.B0(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return a.v(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
