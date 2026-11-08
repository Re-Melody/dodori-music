package com.google.android.gms.internal.auth_blockstore;

import H5.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC1141h;
import com.google.android.gms.common.api.internal.InterfaceC1151s;
import com.google.android.gms.common.internal.AbstractC1170l;
import com.google.android.gms.common.internal.C1167i;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends AbstractC1170l {
    public zzf(Context context, Looper looper, C1167i c1167i, InterfaceC1141h interfaceC1141h, InterfaceC1151s interfaceC1151s) {
        super(context, looper, 258, c1167i, interfaceC1141h, interfaceC1151s);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return iInterfaceQueryLocalInterface instanceof zzg ? (zzg) iInterfaceQueryLocalInterface : new zzg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final d[] getApiFeatures() {
        return zzab.zzl;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
