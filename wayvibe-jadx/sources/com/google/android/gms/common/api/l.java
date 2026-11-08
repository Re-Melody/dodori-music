package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends I5.a {
    public static final Parcelable.Creator<l> CREATOR = new B(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17971d;

    public l(int i10, int i11, int i12, boolean z10) {
        this.f17968a = i10;
        this.f17969b = i11;
        this.f17970c = i12;
        this.f17971d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f17968a == lVar.f17968a && this.f17969b == lVar.f17969b && this.f17970c == lVar.f17970c && this.f17971d == lVar.f17971d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17968a), Integer.valueOf(this.f17969b), Integer.valueOf(this.f17970c), Boolean.valueOf(this.f17971d)});
    }

    public final String toString() {
        int i10 = this.f17968a;
        int length = String.valueOf(i10).length();
        int i11 = this.f17969b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f17970c;
        int length3 = String.valueOf(i12).length();
        boolean z10 = this.f17971d;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z10).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i10);
        sb.append(", dataOwnerProductId=");
        sb.append(i11);
        sb.append(", processingReason=");
        sb.append(i12);
        sb.append(", isUserData=");
        sb.append(z10);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f17968a);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f17969b);
        p242x0.c.b0(parcel, 3, 4);
        parcel.writeInt(this.f17970c);
        p242x0.c.b0(parcel, 4, 4);
        parcel.writeInt(this.f17971d ? 1 : 0);
        p242x0.c.d0(iC0, parcel);
    }
}
