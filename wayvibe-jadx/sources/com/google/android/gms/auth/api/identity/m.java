package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m extends I5.a {
    public static final Parcelable.Creator<m> CREATOR = new v(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f17767a;

    public m(PendingIntent pendingIntent) {
        this.f17767a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return E.k(this.f17767a, ((m) obj).f17767a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17767a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 1, this.f17767a, i10, false);
        p242x0.c.d0(iC0, parcel);
    }
}
