package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k extends I5.a {
    public static final Parcelable.Creator<k> CREATOR = B.f17823b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f17964d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17967c;

    static {
        k kVar = new k(null, false);
        kVar.f17967c = false;
        f17964d = kVar;
    }

    public k(l lVar, boolean z10) {
        this.f17965a = lVar;
        this.f17966b = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return E.k(this.f17965a, kVar.f17965a) && this.f17967c == kVar.f17967c && this.f17966b == kVar.f17966b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17965a, Boolean.valueOf(this.f17967c), Boolean.valueOf(this.f17966b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17965a);
        return V0.p.r(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f17967c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 1, this.f17965a, i10, false);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f17966b ? 1 : 0);
        p242x0.c.d0(iC0, parcel);
    }
}
