package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.internal.InterfaceC1144k;
import com.google.android.gms.common.api.k;

/* JADX INFO: loaded from: classes.dex */
public final class zbj extends zba implements IInterface {
    public zbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbi zbiVar, AuthorizationRequest authorizationRequest, k kVar) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbiVar);
        zbc.zbb(parcelZba, authorizationRequest);
        zbc.zbb(parcelZba, kVar);
        zbb(1, parcelZba);
    }

    public final void zbd(InterfaceC1144k interfaceC1144k, RevokeAccessRequest revokeAccessRequest, k kVar) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, interfaceC1144k);
        zbc.zbb(parcelZba, revokeAccessRequest);
        zbc.zbb(parcelZba, kVar);
        zbb(3, parcelZba);
    }

    public final void zbe(InterfaceC1144k interfaceC1144k, ClearTokenRequest clearTokenRequest, k kVar) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, interfaceC1144k);
        zbc.zbb(parcelZba, clearTokenRequest);
        zbc.zbb(parcelZba, kVar);
        zbb(4, parcelZba);
    }
}
