package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends I5.a {
    public static final Parcelable.Creator<l> CREATOR = new J(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f17766g;

    public l(String str, String str2, String str3, String str4, boolean z10, int i10, ArrayList arrayList) {
        E.h(str);
        this.f17760a = str;
        this.f17761b = str2;
        this.f17762c = str3;
        this.f17763d = str4;
        this.f17764e = z10;
        this.f17765f = i10;
        this.f17766g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return E.k(this.f17760a, lVar.f17760a) && E.k(this.f17763d, lVar.f17763d) && E.k(this.f17761b, lVar.f17761b) && E.k(Boolean.valueOf(this.f17764e), Boolean.valueOf(lVar.f17764e)) && this.f17765f == lVar.f17765f && E.k(this.f17766g, lVar.f17766g);
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f17764e);
        Integer numValueOf = Integer.valueOf(this.f17765f);
        return Arrays.hashCode(new Object[]{this.f17760a, this.f17761b, this.f17763d, boolValueOf, numValueOf, this.f17766g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f17760a, false);
        p242x0.c.W(parcel, 2, this.f17761b, false);
        p242x0.c.W(parcel, 3, this.f17762c, false);
        p242x0.c.W(parcel, 4, this.f17763d, false);
        p242x0.c.b0(parcel, 5, 4);
        parcel.writeInt(this.f17764e ? 1 : 0);
        p242x0.c.b0(parcel, 6, 4);
        parcel.writeInt(this.f17765f);
        p242x0.c.Z(parcel, 7, this.f17766g, false);
        p242x0.c.d0(iC0, parcel);
    }
}
