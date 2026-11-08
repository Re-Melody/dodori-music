package com.google.android.gms.internal.play_billing;

import B2.AbstractC0112b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzev implements Iterable, Serializable {
    public static final zzev zza = new zzet(zzga.zzb);
    private int zzb = 0;

    static {
        int i10 = zzei.zza;
    }

    public static int zzj(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0112b.d(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("Beginning index larger than ending index: ", i10, i11, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0112b.e("End index: ", i11, i12, " >= "));
    }

    public static zzev zzk(byte[] bArr, int i10, int i11) {
        try {
            zzj(i10, i10 + i11, bArr.length);
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return new zzet(bArr2);
        } catch (zzgc e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzl(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzj(i10, i13, bArr.length);
        zzj(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzev)) {
            return false;
        }
        zzev zzevVar = (zzev) obj;
        int iZze = zze();
        if (iZze != zzevVar.zze()) {
            return false;
        }
        if (iZze == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzevVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzh(zzevVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzd = this.zzb;
        if (iZzd == 0) {
            int iZze = zze();
            iZzd = zzd(iZze, 0, iZze);
            if (iZzd == 0) {
                iZzd = 1;
            }
            this.zzb = iZzd;
        }
        return iZzd;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzen(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZze = zze();
        String strZza = zze() <= 50 ? zzhz.zza(this) : zzhz.zza(zzf(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iZze);
        sb.append(" contents=\"");
        return b.m(sb, strZza, "\">");
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd(int i10, int i11, int i12);

    public abstract int zze();

    public abstract zzev zzf(int i10, int i11);

    public abstract void zzg(zzem zzemVar);

    public abstract boolean zzh(zzev zzevVar);
}
