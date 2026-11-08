package com.google.android.gms.internal.auth;

import I5.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb extends a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(int i10, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        E.h(str);
        this.zzb = str;
        E.h(pendingIntent);
        this.zzc = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        int i11 = this.zza;
        c.b0(parcel, 1, 4);
        parcel.writeInt(i11);
        c.W(parcel, 2, this.zzb, false);
        c.V(parcel, 3, this.zzc, i10, false);
        c.d0(iC0, parcel);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
