package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.n;
import com.google.android.gms.common.api.k;

/* JADX INFO: loaded from: classes.dex */
public final class zbm extends zba implements IInterface {
    public zbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbs zbsVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, k kVar) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbsVar);
        zbc.zbb(parcelZba, saveAccountLinkingTokenRequest);
        zbc.zbb(parcelZba, kVar);
        zbb(1, parcelZba);
    }

    public final void zbd(zbu zbuVar, n nVar, k kVar) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbuVar);
        zbc.zbb(parcelZba, nVar);
        zbc.zbb(parcelZba, kVar);
        zbb(2, parcelZba);
    }
}
