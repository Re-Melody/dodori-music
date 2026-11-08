package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1169k extends I5.a {
    public static final Parcelable.Creator<C1169k> CREATOR = new com.google.android.gms.auth.api.identity.v(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope[] f18050o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final H5.d[] f18051p = new H5.d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f18056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Scope[] f18057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f18058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Account f18059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public H5.d[] f18060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H5.d[] f18061j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f18064n;

    public C1169k(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, H5.d[] dVarArr, H5.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f18050o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        H5.d[] dVarArr3 = f18051p;
        H5.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f18052a = i10;
        this.f18053b = i11;
        this.f18054c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f18055d = "com.google.android.gms";
        } else {
            this.f18055d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = AbstractBinderC1159a.f18031a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface t10 = iInterfaceQueryLocalInterface instanceof InterfaceC1172n ? (InterfaceC1172n) iInterfaceQueryLocalInterface : new T(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                if (t10 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            T t11 = (T) t10;
                            Parcel parcelZzB = t11.zzB(2, t11.zza());
                            Account account3 = (Account) zzc.zzb(parcelZzB, Account.CREATOR);
                            parcelZzB.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f18059h = account2;
        } else {
            this.f18056e = iBinder;
            this.f18059h = account;
        }
        this.f18057f = scopeArr2;
        this.f18058g = bundle2;
        this.f18060i = dVarArr4;
        this.f18061j = dVarArr3;
        this.k = z10;
        this.f18062l = i13;
        this.f18063m = z11;
        this.f18064n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.auth.api.identity.v.a(this, parcel, i10);
    }
}
