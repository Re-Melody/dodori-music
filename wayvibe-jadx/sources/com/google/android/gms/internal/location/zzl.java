package com.google.android.gms.internal.location;

import I5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends a implements u {
    private final Status zzb;
    public static final zzl zza = new zzl(Status.f17829e);
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    public zzl(Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.u
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        c.V(parcel, 1, this.zzb, i10, false);
        c.d0(iC0, parcel);
    }
}
