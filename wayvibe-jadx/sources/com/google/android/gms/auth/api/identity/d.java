package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends I5.a {
    public static final Parcelable.Creator<d> CREATOR = new J(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f17732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f17733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f17734g;

    public d(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent, Bundle bundle) {
        this.f17728a = str;
        this.f17729b = str2;
        this.f17730c = str3;
        E.h(arrayList);
        this.f17731d = arrayList;
        this.f17732e = googleSignInAccount;
        this.f17733f = pendingIntent;
        this.f17734g = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return E.k(this.f17728a, dVar.f17728a) && E.k(this.f17729b, dVar.f17729b) && E.k(this.f17730c, dVar.f17730c) && E.k(this.f17731d, dVar.f17731d) && E.k(this.f17733f, dVar.f17733f) && E.k(this.f17732e, dVar.f17732e) && E.k(this.f17734g, dVar.f17734g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17728a, this.f17729b, this.f17730c, this.f17731d, this.f17733f, this.f17732e, this.f17734g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f17728a, false);
        p242x0.c.W(parcel, 2, this.f17729b, false);
        p242x0.c.W(parcel, 3, this.f17730c, false);
        p242x0.c.X(parcel, 4, this.f17731d);
        p242x0.c.V(parcel, 5, this.f17732e, i10, false);
        p242x0.c.V(parcel, 6, this.f17733f, i10, false);
        p242x0.c.O(parcel, 7, this.f17734g, false);
        p242x0.c.d0(iC0, parcel);
    }
}
