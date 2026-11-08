package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;

/* JADX INFO: loaded from: classes.dex */
public final class j extends I5.a {
    public static final Parcelable.Creator<j> CREATOR = new J(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f17758a;

    public j(PendingIntent pendingIntent) {
        E.h(pendingIntent);
        this.f17758a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 1, this.f17758a, i10, false);
        p242x0.c.d0(iC0, parcel);
    }
}
