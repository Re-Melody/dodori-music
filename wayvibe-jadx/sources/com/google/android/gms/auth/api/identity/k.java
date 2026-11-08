package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k extends I5.a {
    public static final Parcelable.Creator<k> CREATOR = new J(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17759a;

    public k(int i10) {
        this.f17759a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return E.k(Integer.valueOf(this.f17759a), Integer.valueOf(((k) obj).f17759a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17759a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f17759a);
        p242x0.c.d0(iC0, parcel);
    }
}
