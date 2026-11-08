package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class I extends zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1164f f18000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18001b;

    public I(AbstractC1164f abstractC1164f, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f18000a = abstractC1164f;
        this.f18001b = i10;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12 = this.f18001b;
        if (i10 == 1) {
            int i13 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
            zzc.zzf(parcel);
            E.i(this.f18000a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f18000a.onPostInitHandler(i13, strongBinder, bundle, i12);
            this.f18000a = null;
        } else if (i10 == 2) {
            parcel.readInt();
            zzc.zzf(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            M m8 = (M) zzc.zzb(parcel, M.CREATOR);
            zzc.zzf(parcel);
            AbstractC1164f abstractC1164f = this.f18000a;
            E.i(abstractC1164f, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            E.h(m8);
            abstractC1164f.zzc(m8);
            Bundle bundle2 = m8.f18007a;
            E.i(this.f18000a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f18000a.onPostInitHandler(i14, strongBinder2, bundle2, i12);
            this.f18000a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
