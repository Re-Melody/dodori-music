package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1178u extends I5.a {
    public static final Parcelable.Creator<C1178u> CREATOR = new com.google.android.gms.auth.api.identity.v(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18088e;

    public C1178u(boolean z10, int i10, int i11, boolean z11, int i12) {
        this.f18084a = i10;
        this.f18085b = z10;
        this.f18086c = z11;
        this.f18087d = i11;
        this.f18088e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f18084a);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f18085b ? 1 : 0);
        p242x0.c.b0(parcel, 3, 4);
        parcel.writeInt(this.f18086c ? 1 : 0);
        p242x0.c.b0(parcel, 4, 4);
        parcel.writeInt(this.f18087d);
        p242x0.c.b0(parcel, 5, 4);
        parcel.writeInt(this.f18088e);
        p242x0.c.d0(iC0, parcel);
    }
}
