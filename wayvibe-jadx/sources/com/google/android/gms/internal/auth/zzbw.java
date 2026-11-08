package com.google.android.gms.internal.auth;

import I5.a;
import android.os.Parcel;
import android.os.Parcelable;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbw extends a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        int i11 = this.zza;
        c.b0(parcel, 1, 4);
        parcel.writeInt(i11);
        c.W(parcel, 2, this.zzb, false);
        c.d0(iC0, parcel);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    public zzbw(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }
}
