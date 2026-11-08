package com.google.android.gms.internal.auth;

import I5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzaq extends a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    final int zza;
    public final String zzb;

    public zzaq(int i10, String str) {
        this.zza = 1;
        E.h(str);
        this.zzb = str;
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

    public zzaq(String str) {
        this(1, str);
    }
}
