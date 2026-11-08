package com.google.android.gms.internal.p002firebaseauthapi;

import Z6.H;
import Z6.I;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzahc {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahs zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private I zzk;
    private List<zzahq> zzl;
    private zzaj<H> zzm;

    public zzahc() {
        this.zzf = new zzahs();
        this.zzm = zzaj.zzh();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzaj<H> zzd() {
        return this.zzm;
    }

    public final I zze() {
        return this.zzk;
    }

    public final zzahs zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzahq> zzk() {
        return this.zzl;
    }

    public final List<zzaht> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final zzahc zza(I i10) {
        this.zzk = i10;
        return this;
    }

    public final zzahc zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzahc zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzahc zzc(String str) {
        this.zze = str;
        return this;
    }

    public zzahc(String str, String str2, boolean z10, String str3, String str4, zzahs zzahsVar, String str5, String str6, long j10, long j11, boolean z11, I i10, List<zzahq> list, zzaj<H> zzajVar) {
        zzahs zzahsVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        if (zzahsVar == null) {
            zzahsVar2 = new zzahs();
        } else {
            List<zzaht> listZza = zzahsVar.zza();
            zzahs zzahsVar3 = new zzahs();
            if (listZza != null) {
                zzahsVar3.zza().addAll(listZza);
            }
            zzahsVar2 = zzahsVar3;
        }
        this.zzf = zzahsVar2;
        this.zzg = str6;
        this.zzh = j10;
        this.zzi = j11;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzajVar;
    }

    public final zzahc zza(boolean z10) {
        this.zzj = z10;
        return this;
    }

    public final zzahc zza(zzaj<H> zzajVar) {
        E.h(zzajVar);
        this.zzm = zzajVar;
        return this;
    }

    public final zzahc zza(List<zzaht> list) {
        E.h(list);
        zzahs zzahsVar = new zzahs();
        this.zzf = zzahsVar;
        zzahsVar.zza().addAll(list);
        return this;
    }
}
