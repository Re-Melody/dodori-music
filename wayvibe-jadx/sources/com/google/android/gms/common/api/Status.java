package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends I5.a implements u, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f17836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H5.b f17837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f17829e = new Status(0, null, null, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f17830f = new Status(14, null, null, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f17831g = new Status(8, null, null, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f17832h = new Status(15, null, null, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f17833i = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new B(3);

    public Status(int i10, String str, PendingIntent pendingIntent, H5.b bVar) {
        this.f17834a = i10;
        this.f17835b = str;
        this.f17836c = pendingIntent;
        this.f17837d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f17834a == status.f17834a && E.k(this.f17835b, status.f17835b) && E.k(this.f17836c, status.f17836c) && E.k(this.f17837d, status.f17837d);
    }

    @Override // com.google.android.gms.common.api.u
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17834a), this.f17835b, this.f17836c, this.f17837d});
    }

    public final String toString() {
        W9.j jVar = new W9.j(this);
        String strA = this.f17835b;
        if (strA == null) {
            strA = Z5.A.a(this.f17834a);
        }
        jVar.E(strA, "statusCode");
        jVar.E(this.f17836c, "resolution");
        return jVar.toString();
    }

    public final boolean u() {
        return this.f17834a <= 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(this.f17834a);
        p242x0.c.W(parcel, 2, this.f17835b, false);
        p242x0.c.V(parcel, 3, this.f17836c, i10, false);
        p242x0.c.V(parcel, 4, this.f17837d, i10, false);
        p242x0.c.d0(iC0, parcel);
    }
}
