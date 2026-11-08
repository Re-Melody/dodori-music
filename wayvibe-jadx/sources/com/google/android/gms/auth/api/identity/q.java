package com.google.android.gms.auth.api.identity;

import V5.C0957x;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q extends I5.a {
    public static final Parcelable.Creator<q> CREATOR = new v(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f17776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0957x f17780i;

    public q(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C0957x c0957x) {
        E.h(str);
        this.f17772a = str;
        this.f17773b = str2;
        this.f17774c = str3;
        this.f17775d = str4;
        this.f17776e = uri;
        this.f17777f = str5;
        this.f17778g = str6;
        this.f17779h = str7;
        this.f17780i = c0957x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return E.k(this.f17772a, qVar.f17772a) && E.k(this.f17773b, qVar.f17773b) && E.k(this.f17774c, qVar.f17774c) && E.k(this.f17775d, qVar.f17775d) && E.k(this.f17776e, qVar.f17776e) && E.k(this.f17777f, qVar.f17777f) && E.k(this.f17778g, qVar.f17778g) && E.k(this.f17779h, qVar.f17779h) && E.k(this.f17780i, qVar.f17780i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17772a, this.f17773b, this.f17774c, this.f17775d, this.f17776e, this.f17777f, this.f17778g, this.f17779h, this.f17780i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f17772a, false);
        p242x0.c.W(parcel, 2, this.f17773b, false);
        p242x0.c.W(parcel, 3, this.f17774c, false);
        p242x0.c.W(parcel, 4, this.f17775d, false);
        p242x0.c.V(parcel, 5, this.f17776e, i10, false);
        p242x0.c.W(parcel, 6, this.f17777f, false);
        p242x0.c.W(parcel, 7, this.f17778g, false);
        p242x0.c.W(parcel, 8, this.f17779h, false);
        p242x0.c.V(parcel, 9, this.f17780i, i10, false);
        p242x0.c.d0(iC0, parcel);
    }
}
