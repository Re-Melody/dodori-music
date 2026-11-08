package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n extends I5.a {
    public static final Parcelable.Creator<n> CREATOR = new v(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f17768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17770c;

    public n(r rVar, String str, int i10) {
        E.h(rVar);
        this.f17768a = rVar;
        this.f17769b = str;
        this.f17770c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return E.k(this.f17768a, nVar.f17768a) && E.k(this.f17769b, nVar.f17769b) && this.f17770c == nVar.f17770c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17768a, this.f17769b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 1, this.f17768a, i10, false);
        p242x0.c.W(parcel, 2, this.f17769b, false);
        p242x0.c.b0(parcel, 3, 4);
        parcel.writeInt(this.f17770c);
        p242x0.c.d0(iC0, parcel);
    }
}
