package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o extends I5.a {
    public static final Parcelable.Creator<o> CREATOR = new v(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f17771a;

    public o(PendingIntent pendingIntent) {
        E.h(pendingIntent);
        this.f17771a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return E.k(this.f17771a, ((o) obj).f17771a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17771a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 1, this.f17771a, i10, false);
        p242x0.c.d0(iC0, parcel);
    }
}
