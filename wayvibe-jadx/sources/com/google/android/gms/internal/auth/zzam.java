package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.AbstractC1170l;
import com.google.android.gms.common.internal.C1167i;
import p266z5.d;
import p266z5.e;
import p266z5.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzam extends AbstractC1170l {
    public zzam(Context context, Looper looper, C1167i c1167i, o oVar, p pVar) {
        super(context, looper, 120, c1167i, oVar, pVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i10 = e.f29870a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final H5.d[] getApiFeatures() {
        return new H5.d[]{p257y5.d.f29092d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
