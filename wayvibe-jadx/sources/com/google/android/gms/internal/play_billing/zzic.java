package com.google.android.gms.internal.play_billing;

import V0.p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzic {
    private static final zzic zza = new zzic(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzic(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzic zzc() {
        return zza;
    }

    public static zzic zze(zzic zzicVar, zzic zzicVar2) {
        int i10 = zzicVar.zzb + zzicVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzicVar.zzc, i10);
        System.arraycopy(zzicVar2.zzc, 0, iArrCopyOf, zzicVar.zzb, zzicVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzicVar.zzd, i10);
        System.arraycopy(zzicVar2.zzd, 0, objArrCopyOf, zzicVar.zzb, zzicVar2.zzb);
        return new zzic(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzic zzf() {
        return new zzic(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzic)) {
            return false;
        }
        zzic zzicVar = (zzic) obj;
        int i10 = this.zzb;
        if (i10 == zzicVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzicVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzicVar.zzd;
            int i12 = this.zzb;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZzy;
        int iZzz;
        int iZzy2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        int i15 = i13 << 3;
                        zzev zzevVar = (zzev) this.zzd[i11];
                        int iZzy3 = zzfc.zzy(i15);
                        int iZze = zzevVar.zze();
                        iC = p.C(iZze, iZze, iZzy3, iC);
                    } else if (i14 == 3) {
                        int iZzy4 = zzfc.zzy(i13 << 3);
                        iZzy = iZzy4 + iZzy4;
                        iZzz = ((zzic) this.zzd[i11]).zza();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException(new zzgb("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.zzd[i11]).getClass();
                        iZzy2 = zzfc.zzy(i13 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i11]).getClass();
                    iZzy2 = zzfc.zzy(i13 << 3) + 8;
                }
                iC = iZzy2 + iC;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzy = zzfc.zzy(i16);
                iZzz = zzfc.zzz(jLongValue);
            }
            iC = iZzz + iZzy + iC;
        }
        this.zze = iC;
        return iC;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzev zzevVar = (zzev) this.zzd[i11];
            int iZzy = zzfc.zzy(8);
            int iZzy2 = zzfc.zzy(i12) + zzfc.zzy(16);
            int iZzy3 = zzfc.zzy(24);
            int iZze = zzevVar.zze();
            iA += iZzy + iZzy + iZzy2 + p.a(iZze, iZze, iZzy3);
        }
        this.zze = iA;
        return iA;
    }

    public final zzic zzd(zzic zzicVar) {
        if (zzicVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzicVar.zzb;
        zzm(i10);
        System.arraycopy(zzicVar.zzc, 0, this.zzc, this.zzb, zzicVar.zzb);
        System.arraycopy(zzicVar.zzd, 0, this.zzd, this.zzb, zzicVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzhd.zzb(sb, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzit zzitVar) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzitVar.zzx(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzit zzitVar) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzitVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzitVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzitVar.zzd(i13, (zzev) obj);
                } else if (i12 == 3) {
                    zzitVar.zzG(i13);
                    ((zzic) obj).zzl(zzitVar);
                    zzitVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzgb("Protocol message tag had invalid wire type."));
                    }
                    zzitVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzic() {
        this(0, new int[8], new Object[8], true);
    }
}
