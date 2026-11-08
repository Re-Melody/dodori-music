package com.google.android.gms.internal.location;

import Z5.r;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaa extends zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        r rVar = (r) zzc.zza(parcel, r.CREATOR);
        zzc.zzd(parcel);
        zzb(rVar);
        return true;
    }
}
