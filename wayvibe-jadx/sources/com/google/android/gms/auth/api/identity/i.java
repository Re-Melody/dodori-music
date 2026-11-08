package com.google.android.gms.auth.api.identity;

import Z6.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i extends I5.a {
    public static final Parcelable.Creator<i> CREATOR = new J(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f17751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f17755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f17756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17757h;

    public i(h hVar, e eVar, String str, boolean z10, int i10, g gVar, f fVar, boolean z11) {
        E.h(hVar);
        this.f17750a = hVar;
        E.h(eVar);
        this.f17751b = eVar;
        this.f17752c = str;
        this.f17753d = z10;
        this.f17754e = i10;
        this.f17755f = gVar == null ? new g(null, false, null) : gVar;
        this.f17756g = fVar == null ? new f(false, null) : fVar;
        this.f17757h = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return E.k(this.f17750a, iVar.f17750a) && E.k(this.f17751b, iVar.f17751b) && E.k(this.f17755f, iVar.f17755f) && E.k(this.f17756g, iVar.f17756g) && E.k(this.f17752c, iVar.f17752c) && this.f17753d == iVar.f17753d && this.f17754e == iVar.f17754e && this.f17757h == iVar.f17757h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17750a, this.f17751b, this.f17755f, this.f17756g, this.f17752c, Boolean.valueOf(this.f17753d), Integer.valueOf(this.f17754e), Boolean.valueOf(this.f17757h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 1, this.f17750a, i10, false);
        p242x0.c.V(parcel, 2, this.f17751b, i10, false);
        p242x0.c.W(parcel, 3, this.f17752c, false);
        p242x0.c.b0(parcel, 4, 4);
        parcel.writeInt(this.f17753d ? 1 : 0);
        p242x0.c.b0(parcel, 5, 4);
        parcel.writeInt(this.f17754e);
        p242x0.c.V(parcel, 6, this.f17755f, i10, false);
        p242x0.c.V(parcel, 7, this.f17756g, i10, false);
        p242x0.c.b0(parcel, 8, 4);
        parcel.writeInt(this.f17757h ? 1 : 0);
        p242x0.c.d0(iC0, parcel);
    }
}
