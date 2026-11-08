package com.google.android.gms.internal.location;

import H5.d;
import Z5.A;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC1141h;
import com.google.android.gms.common.api.internal.InterfaceC1151s;
import com.google.android.gms.common.internal.AbstractC1170l;
import com.google.android.gms.common.internal.C1167i;
import com.google.android.gms.common.internal.E;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends AbstractC1170l {
    public zzg(Context context, Looper looper, C1167i c1167i, InterfaceC1141h interfaceC1141h, InterfaceC1151s interfaceC1151s) {
        super(context, looper, 23, c1167i, interfaceC1141h, interfaceC1151s);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof zzv ? (zzv) iInterfaceQueryLocalInterface : new zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final d[] getApiFeatures() {
        return A.f13825i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "activity_recognition");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(PendingIntent pendingIntent) {
        E.h(pendingIntent);
        ((zzv) getService()).zzl(pendingIntent);
    }
}
