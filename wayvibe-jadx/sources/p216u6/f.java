package p216u6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p206t6.h;
import p206t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f27229a;

    public f(IBinder iBinder) {
        this.f27229a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f27229a;
    }

    @Override // p216u6.h
    public final void h(String str, Bundle bundle, i iVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i10 = e.f27228a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(iVar);
        try {
            this.f27229a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p216u6.h
    public final void z(String str, Bundle bundle, h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i10 = e.f27228a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        try {
            this.f27229a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
