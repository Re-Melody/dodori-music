package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizationRequest extends I5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new J(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Account f17701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f17705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17706j;
    public final int k;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z10, boolean z11, Account account, String str2, String str3, boolean z12, Bundle bundle, boolean z13, int i10) {
        boolean z14 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z14 = true;
        }
        E.a("requestedScopes cannot be null or empty", z14);
        this.f17697a = arrayList;
        this.f17698b = str;
        this.f17699c = z10;
        this.f17700d = z11;
        this.f17701e = account;
        this.f17702f = str2;
        this.f17703g = str3;
        this.f17704h = z12;
        this.f17705i = bundle;
        this.f17706j = z13;
        this.k = i10;
    }

    public static b a(AuthorizationRequest authorizationRequest) {
        c cVar;
        E.h(authorizationRequest);
        b bVar = new b();
        bVar.f17727j = 0;
        ArrayList arrayList = authorizationRequest.f17697a;
        E.a("requestedScopes cannot be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        bVar.f17718a = arrayList;
        Bundle bundle = authorizationRequest.f17705i;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                c[] cVarArrValues = c.values();
                int length = cVarArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = cVarArrValues[i10];
                    if (cVar.zba.equals(str)) {
                        break;
                    }
                    i10++;
                }
                if (string != null && cVar != null) {
                    if (bVar.f17725h == null) {
                        bVar.f17725h = new Bundle();
                    }
                    bVar.f17725h.putString(cVar.zba, string);
                }
            }
        }
        String str2 = authorizationRequest.f17703g;
        String str3 = authorizationRequest.f17702f;
        if (str3 != null) {
            E.e(str3);
            bVar.f17723f = str3;
        }
        Account account = authorizationRequest.f17701e;
        if (account != null) {
            bVar.f17722e = account;
        }
        boolean z10 = authorizationRequest.f17700d;
        String str4 = authorizationRequest.f17698b;
        if (z10 && str4 != null) {
            bVar.a(str4);
            bVar.f17719b = str4;
            bVar.f17721d = true;
        }
        if (authorizationRequest.f17699c && str4 != null) {
            bVar.a(str4);
            bVar.f17719b = str4;
            bVar.f17720c = true;
            boolean z11 = authorizationRequest.f17704h;
            bVar.f17724g = z11;
            if (z11) {
                bVar.f17727j |= 1;
            }
        }
        bVar.f17726i = authorizationRequest.f17706j;
        bVar.f17727j = authorizationRequest.k;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        ArrayList arrayList = this.f17697a;
        int size = arrayList.size();
        ArrayList arrayList2 = authorizationRequest.f17697a;
        if (size != arrayList2.size() || !arrayList.containsAll(arrayList2)) {
            return false;
        }
        Bundle bundle = authorizationRequest.f17705i;
        Bundle bundle2 = this.f17705i;
        if (bundle2 == null) {
            if (bundle != null) {
                return false;
            }
            bundle = null;
        }
        if (bundle2 != null && bundle == null) {
            return false;
        }
        if (bundle2 != null) {
            if (bundle2.size() != bundle.size()) {
                return false;
            }
            for (String str : bundle2.keySet()) {
                if (!E.k(bundle2.getString(str), bundle.getString(str))) {
                    return false;
                }
            }
        }
        return this.f17699c == authorizationRequest.f17699c && this.f17704h == authorizationRequest.f17704h && this.f17700d == authorizationRequest.f17700d && this.f17706j == authorizationRequest.f17706j && this.k == authorizationRequest.k && E.k(this.f17698b, authorizationRequest.f17698b) && E.k(this.f17701e, authorizationRequest.f17701e) && E.k(this.f17702f, authorizationRequest.f17702f) && E.k(this.f17703g, authorizationRequest.f17703g);
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f17699c);
        Boolean boolValueOf2 = Boolean.valueOf(this.f17704h);
        Boolean boolValueOf3 = Boolean.valueOf(this.f17700d);
        Boolean boolValueOf4 = Boolean.valueOf(this.f17706j);
        Integer numValueOf = Integer.valueOf(this.k);
        return Arrays.hashCode(new Object[]{this.f17697a, this.f17698b, boolValueOf, boolValueOf2, boolValueOf3, this.f17701e, this.f17702f, this.f17703g, this.f17705i, boolValueOf4, numValueOf});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.Z(parcel, 1, this.f17697a, false);
        p242x0.c.W(parcel, 2, this.f17698b, false);
        p242x0.c.b0(parcel, 3, 4);
        parcel.writeInt(this.f17699c ? 1 : 0);
        p242x0.c.b0(parcel, 4, 4);
        parcel.writeInt(this.f17700d ? 1 : 0);
        p242x0.c.V(parcel, 5, this.f17701e, i10, false);
        p242x0.c.W(parcel, 6, this.f17702f, false);
        p242x0.c.W(parcel, 7, this.f17703g, false);
        p242x0.c.b0(parcel, 8, 4);
        parcel.writeInt(this.f17704h ? 1 : 0);
        p242x0.c.O(parcel, 9, this.f17705i, false);
        p242x0.c.b0(parcel, 10, 4);
        parcel.writeInt(this.f17706j ? 1 : 0);
        p242x0.c.b0(parcel, 11, 4);
        parcel.writeInt(this.k);
        p242x0.c.d0(iC0, parcel);
    }
}
