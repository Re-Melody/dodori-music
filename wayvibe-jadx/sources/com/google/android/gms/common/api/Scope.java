package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends I5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new B(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17828b;

    public Scope(int i10, String str) {
        E.f(str, "scopeUri must not be null or empty");
        this.f17827a = i10;
        this.f17828b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f17828b.equals(((Scope) obj).f17828b);
    }

    public final int hashCode() {
        return this.f17828b.hashCode();
    }

    public final String toString() {
        return this.f17828b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f17827a);
        p242x0.c.W(parcel, 2, this.f17828b, false);
        p242x0.c.d0(iC0, parcel);
    }
}
