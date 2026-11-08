package androidx.core.app;

import B2.AbstractC0112b;
import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f14888c;

    public B(String str, int i10, Notification notification) {
        this.f14886a = str;
        this.f14887b = i10;
        this.f14888c = notification;
    }

    public final void a(p015b.c cVar) {
        String str = this.f14886a;
        int i10 = this.f14887b;
        p015b.a aVar = (p015b.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(p015b.c.k);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(null);
            Notification notification = this.f14888c;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            aVar.f15711a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f14886a);
        sb.append(", id:");
        return AbstractC0112b.i(sb, this.f14887b, ", tag:null]");
    }
}
