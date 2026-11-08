package p257y5;

import I5.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p242x0.c;
import p255y2.J;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new J(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Account f29086d;

    public b(int i10, int i11, String str, Account account) {
        this.f29083a = i10;
        this.f29084b = i11;
        this.f29085c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f29086d = account;
        } else {
            this.f29086d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = c.c0(20293, parcel);
        c.b0(parcel, 1, 4);
        parcel.writeInt(this.f29083a);
        c.b0(parcel, 2, 4);
        parcel.writeInt(this.f29084b);
        c.W(parcel, 3, this.f29085c, false);
        c.V(parcel, 4, this.f29086d, i10, false);
        c.d0(iC0, parcel);
    }
}
