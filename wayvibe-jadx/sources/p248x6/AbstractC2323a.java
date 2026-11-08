package p248x6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: x6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2323a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f28600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28601b;

    public AbstractC2323a(IBinder iBinder, String str) {
        this.f28600a = iBinder;
        this.f28601b = str;
    }

    public final void O(int i10, Parcel parcel) {
        try {
            this.f28600a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28600a;
    }
}
