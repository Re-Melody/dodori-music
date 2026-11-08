package com.google.android.gms.internal.auth;

import I5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i10, String str, int i11) {
        this.zza = 1;
        E.h(str);
        this.zzb = str;
        this.zzc = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        int i11 = this.zza;
        c.b0(parcel, 1, 4);
        parcel.writeInt(i11);
        c.W(parcel, 2, this.zzb, false);
        int i12 = this.zzc;
        c.b0(parcel, 3, 4);
        parcel.writeInt(i12);
        c.d0(iC0, parcel);
    }

    public zzav(String str, int i10) {
        this(1, str, i10);
    }
}
