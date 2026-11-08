package com.google.android.gms.internal.identity_googleid;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends zzd {
    public zzg() {
        super(4);
    }

    public final zzg zza(Object obj) {
        int i10;
        int length = this.zza.length;
        int i11 = this.zzb;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = f.API_PRIORITY_OTHER;
            }
        }
        if (i10 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i10);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i13 = this.zzb;
        this.zzb = i13 + 1;
        objArr[i13] = obj;
        return this;
    }

    public final zzj zzb() {
        this.zzc = true;
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = zzj.zzd;
        return i10 == 0 ? zzk.zza : new zzk(objArr, i10);
    }
}
