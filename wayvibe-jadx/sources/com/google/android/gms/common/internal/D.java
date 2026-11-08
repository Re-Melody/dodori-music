package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC1175q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f17993a;

    public D(IBinder iBinder) {
        this.f17993a = iBinder;
    }

    public final void O(I i10, C1169k c1169k) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(i10.asBinder());
            parcelObtain.writeInt(1);
            com.google.android.gms.auth.api.identity.v.a(c1169k, parcelObtain, 0);
            this.f17993a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17993a;
    }
}
