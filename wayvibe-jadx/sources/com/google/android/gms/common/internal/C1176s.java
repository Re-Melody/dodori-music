package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1176s extends I5.a {
    public static final Parcelable.Creator<C1176s> CREATOR = new com.google.android.gms.auth.api.identity.v(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18080i;

    public C1176s(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f18072a = i10;
        this.f18073b = i11;
        this.f18074c = i12;
        this.f18075d = j10;
        this.f18076e = j11;
        this.f18077f = str;
        this.f18078g = str2;
        this.f18079h = i13;
        this.f18080i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f18072a);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f18073b);
        p242x0.c.b0(parcel, 3, 4);
        parcel.writeInt(this.f18074c);
        p242x0.c.b0(parcel, 4, 8);
        parcel.writeLong(this.f18075d);
        p242x0.c.b0(parcel, 5, 8);
        parcel.writeLong(this.f18076e);
        p242x0.c.W(parcel, 6, this.f18077f, false);
        p242x0.c.W(parcel, 7, this.f18078g, false);
        p242x0.c.b0(parcel, 8, 4);
        parcel.writeInt(this.f18079h);
        p242x0.c.b0(parcel, 9, 4);
        parcel.writeInt(this.f18080i);
        p242x0.c.d0(iC0, parcel);
    }
}
