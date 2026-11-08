package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzakf implements zzams {
    private final zzakb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzakf(zzakb zzakbVar) {
        zzakb zzakbVar2 = (zzakb) zzalb.zza(zzakbVar, "input");
        this.zza = zzakbVar2;
        zzakbVar2.zzc = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final double zza() throws zzale {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final float zzb() throws zzale {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        return (i11 == 0 || i11 == this.zzc) ? f.API_PRIORITY_OTHER : i11 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zze() throws zzale {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzf() throws zzale {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzg() throws zzale {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzh() throws zzale {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzi() throws zzale {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final int zzj() throws zzale {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzk() throws zzale {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzl() throws zzale {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzm() throws zzale {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzn() throws zzale {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final long zzo() throws zzale {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final zzajp zzp() throws zzale {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final String zzq() throws zzale {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final String zzr() throws zzale {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final boolean zzs() throws zzale {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final boolean zzt() {
        int i10;
        if (this.zza.zzt() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzd(i10);
    }

    private final <T> void zzd(T t10, zzamv<T> zzamvVar, zzakk zzakkVar) throws zzalf {
        int iZzj = this.zza.zzj();
        this.zza.zzv();
        int iZza = this.zza.zza(iZzj);
        this.zza.zza++;
        zzamvVar.zza(t10, this, zzakkVar);
        this.zza.zzb(0);
        zzakb zzakbVar = this.zza;
        zzakbVar.zza--;
        zzakbVar.zzc(iZza);
    }

    public static zzakf zza(zzakb zzakbVar) {
        zzakf zzakfVar = zzakbVar.zzc;
        return zzakfVar != null ? zzakfVar : new zzakf(zzakbVar);
    }

    private final <T> T zzb(zzamv<T> zzamvVar, zzakk zzakkVar) throws zzalf {
        T tZza = zzamvVar.zza();
        zzd(tZza, zzamvVar, zzakkVar);
        zzamvVar.zzd(tZza);
        return tZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zze(List<Integer> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzakzVar.zzc(this.zza.zze());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 == 5) {
                do {
                    zzakzVar.zzc(this.zza.zze());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(this.zza.zze()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i11 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzf(List<Long> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalr) {
            zzalr zzalrVar = (zzalr) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzalrVar.zza(this.zza.zzk());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzalrVar.zza(this.zza.zzk());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzg(List<Float> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakx) {
            zzakx zzakxVar = (zzakx) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzakxVar.zza(this.zza.zzb());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 == 5) {
                do {
                    zzakxVar.zza(this.zza.zzb());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Float.valueOf(this.zza.zzb()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i11 == 5) {
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzh(List<Integer> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzakzVar.zzc(this.zza.zzf());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakzVar.zzc(this.zza.zzf());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzi(List<Long> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalr) {
            zzalr zzalrVar = (zzalr) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzalrVar.zza(this.zza.zzl());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalrVar.zza(this.zza.zzl());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzl()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzj(List<Integer> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzakzVar.zzc(this.zza.zzg());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 == 5) {
                do {
                    zzakzVar.zzc(this.zza.zzg());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i11 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzk(List<Long> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalr) {
            zzalr zzalrVar = (zzalr) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzalrVar.zza(this.zza.zzn());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzalrVar.zza(this.zza.zzn());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzl(List<Integer> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzakzVar.zzc(this.zza.zzh());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakzVar.zzc(this.zza.zzh());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzm(List<Long> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalr) {
            zzalr zzalrVar = (zzalr) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzalrVar.zza(this.zza.zzo());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalrVar.zza(this.zza.zzo());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzn(List<String> list) throws zzale {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzo(List<String> list) throws zzale {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzp(List<Integer> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzakzVar.zzc(this.zza.zzj());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakzVar.zzc(this.zza.zzj());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzq(List<Long> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzalr) {
            zzalr zzalrVar = (zzalr) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzalrVar.zza(this.zza.zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalrVar.zza(this.zza.zzp());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    private final Object zza(zzanw zzanwVar, Class<?> cls, zzakk zzakkVar) throws zzale {
        switch (zzake.zza[zzanwVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzamr.zza().zza((Class) cls), zzakkVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t10, zzamv<T> zzamvVar, zzakk zzakkVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzamvVar.zza(t10, this, zzakkVar);
            if (this.zzb == this.zzc) {
                this.zzc = i10;
                return;
            }
            throw zzalf.zzg();
        } catch (Throwable th) {
            this.zzc = i10;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final <T> void zzb(T t10, zzamv<T> zzamvVar, zzakk zzakkVar) throws zzalf {
        zzb(2);
        zzd(t10, zzamvVar, zzakkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzb(List<zzajp> list) throws zzale {
        int iZzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzd(List<Integer> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzakzVar.zzc(this.zza.zzd());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakzVar.zzc(this.zza.zzd());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final <T> void zzb(List<T> list, zzamv<T> zzamvVar, zzakk zzakkVar) throws zzale {
        int iZzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                list.add(zzb(zzamvVar, zzakkVar));
                if (this.zza.zzt() || this.zzd != 0) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == i10);
            this.zzd = iZzi;
            return;
        }
        throw zzalf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zzc(List<Double> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzaki) {
            zzaki zzakiVar = (zzaki) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzakiVar.zza(this.zza.zza());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzakiVar.zza(this.zza.zza());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    private final void zzb(int i10) throws zzale {
        if ((this.zzb & 7) != i10) {
            throw zzalf.zza();
        }
    }

    private final <T> T zza(zzamv<T> zzamvVar, zzakk zzakkVar) {
        T tZza = zzamvVar.zza();
        zzc(tZza, zzamvVar, zzakkVar);
        zzamvVar.zzd(tZza);
        return tZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final <T> void zza(T t10, zzamv<T> zzamvVar, zzakk zzakkVar) throws zzale {
        zzb(3);
        zzc(t10, zzamvVar, zzakkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final void zza(List<Boolean> list) throws zzalf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzajn) {
            zzajn zzajnVar = (zzajn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajnVar.zza(this.zza.zzu());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajnVar.zza(this.zza.zzu());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzalf.zza();
        }
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzalf.zza();
    }

    private static void zzd(int i10) throws zzalf {
        if ((i10 & 7) != 0) {
            throw zzalf.zzg();
        }
    }

    private static void zzc(int i10) throws zzalf {
        if ((i10 & 3) != 0) {
            throw zzalf.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    @Deprecated
    public final <T> void zza(List<T> list, zzamv<T> zzamvVar, zzakk zzakkVar) throws zzale {
        int iZzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                list.add(zza(zzamvVar, zzakkVar));
                if (this.zza.zzt() || this.zzd != 0) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == i10);
            this.zzd = iZzi;
            return;
        }
        throw zzalf.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzams
    public final <K, V> void zza(Map<K, V> map, zzalx<K, V> zzalxVar, zzakk zzakkVar) throws zzale {
        zzb(2);
        int iZza = this.zza.zza(this.zza.zzj());
        Object objZza = zzalxVar.zzb;
        Object objZza2 = zzalxVar.zzd;
        while (true) {
            try {
                int iZzc = zzc();
                if (iZzc == Integer.MAX_VALUE || this.zza.zzt()) {
                    break;
                }
                if (iZzc == 1) {
                    objZza = zza(zzalxVar.zza, (Class<?>) null, (zzakk) null);
                } else if (iZzc != 2) {
                    try {
                        if (!zzt()) {
                            throw new zzalf("Unable to parse map entry.");
                        }
                    } catch (zzale e2) {
                        if (!zzt()) {
                            throw new zzalf("Unable to parse map entry.", e2);
                        }
                    }
                } else {
                    objZza2 = zza(zzalxVar.zzc, zzalxVar.zzd.getClass(), zzakkVar);
                }
            } catch (Throwable th) {
                this.zza.zzc(iZza);
                throw th;
            }
        }
        map.put(objZza, objZza2);
        this.zza.zzc(iZza);
    }

    private final void zza(List<String> list, boolean z10) throws zzale {
        int iZzi;
        int iZzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzaln) && !z10) {
                zzaln zzalnVar = (zzaln) list;
                do {
                    zzalnVar.zza(zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            do {
                list.add(z10 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzalf.zza();
    }

    private final void zza(int i10) throws zzalf {
        if (this.zza.zzc() != i10) {
            throw zzalf.zzj();
        }
    }
}
