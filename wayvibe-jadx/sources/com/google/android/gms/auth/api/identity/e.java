package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p011a7.C1016d;

/* JADX INFO: loaded from: classes.dex */
public final class e extends I5.a {
    public static final Parcelable.Creator<e> CREATOR = new J(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f17740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f17742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17743i;

    public e(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12, ArrayList arrayList2, String str4) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        E.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f17735a = z10;
        if (z10) {
            E.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f17736b = str;
        this.f17737c = str2;
        this.f17738d = z11;
        ArrayList arrayList3 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList3 = new ArrayList(arrayList);
            Collections.sort(arrayList3);
        }
        this.f17740f = arrayList3;
        this.f17739e = str3;
        this.f17741g = z12;
        this.f17742h = arrayList2;
        this.f17743i = str4;
    }

    public static C1016d u() {
        C1016d c1016d = new C1016d();
        c1016d.f14226a = false;
        c1016d.f14227b = null;
        c1016d.f14228c = null;
        c1016d.f14229d = true;
        return c1016d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f17735a == eVar.f17735a && E.k(this.f17736b, eVar.f17736b) && E.k(this.f17737c, eVar.f17737c) && this.f17738d == eVar.f17738d && E.k(this.f17739e, eVar.f17739e) && E.k(this.f17740f, eVar.f17740f) && this.f17741g == eVar.f17741g && E.k(this.f17742h, eVar.f17742h) && E.k(this.f17743i, eVar.f17743i);
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f17735a);
        Boolean boolValueOf2 = Boolean.valueOf(this.f17738d);
        Boolean boolValueOf3 = Boolean.valueOf(this.f17741g);
        return Arrays.hashCode(new Object[]{boolValueOf, this.f17736b, this.f17737c, boolValueOf2, this.f17739e, this.f17740f, boolValueOf3, this.f17742h, this.f17743i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f17735a ? 1 : 0);
        p242x0.c.W(parcel, 2, this.f17736b, false);
        p242x0.c.W(parcel, 3, this.f17737c, false);
        p242x0.c.b0(parcel, 4, 4);
        parcel.writeInt(this.f17738d ? 1 : 0);
        p242x0.c.W(parcel, 5, this.f17739e, false);
        p242x0.c.X(parcel, 6, this.f17740f);
        p242x0.c.b0(parcel, 7, 4);
        parcel.writeInt(this.f17741g ? 1 : 0);
        p242x0.c.Z(parcel, 8, this.f17742h, false);
        p242x0.c.W(parcel, 9, this.f17743i, false);
        p242x0.c.d0(iC0, parcel);
    }
}
