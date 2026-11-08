package com.google.android.gms.internal.auth;

import A5.b;
import A5.c;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.InterfaceC1141h;
import com.google.android.gms.common.api.internal.InterfaceC1151s;
import com.google.android.gms.common.internal.AbstractC1170l;
import com.google.android.gms.common.internal.C1167i;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe extends AbstractC1170l {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C1167i c1167i, c cVar, InterfaceC1141h interfaceC1141h, InterfaceC1151s interfaceC1151s) {
        super(context, looper, 16, c1167i, interfaceC1141h, interfaceC1151s);
        this.zze = cVar == null ? new Bundle() : new Bundle(cVar.f286a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        C1167i clientSettings = getClientSettings();
        clientSettings.getClass();
        if (TextUtils.isEmpty(null)) {
            return false;
        }
        if (clientSettings.f18039c.get(b.f284a) == null) {
            return !clientSettings.f18037a.isEmpty();
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1164f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
