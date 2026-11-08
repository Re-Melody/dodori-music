package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.i;
import com.google.android.gms.auth.api.identity.l;
import com.google.android.gms.common.api.internal.InterfaceC1144k;
import com.google.android.gms.common.api.k;

/* JADX INFO: loaded from: classes.dex */
public final class zbv extends zba implements IInterface {
    public zbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbl zblVar, i iVar, k kVar) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zblVar);
        zbc.zbb(parcelZba, iVar);
        zbc.zbb(parcelZba, kVar);
        zbb(1, parcelZba);
    }

    public final void zbd(InterfaceC1144k interfaceC1144k, String str, k kVar) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, interfaceC1144k);
        parcelZba.writeString(str);
        zbc.zbb(parcelZba, kVar);
        zbb(2, parcelZba);
    }

    public final void zbe(zbq zbqVar, l lVar, k kVar) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbqVar);
        zbc.zbb(parcelZba, lVar);
        zbc.zbb(parcelZba, kVar);
        zbb(3, parcelZba);
    }

    public final void zbf(zbo zboVar, com.google.android.gms.auth.api.identity.k kVar, String str, k kVar2) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zboVar);
        zbc.zbb(parcelZba, kVar);
        parcelZba.writeString(str);
        zbc.zbb(parcelZba, kVar2);
        zbb(4, parcelZba);
    }
}
