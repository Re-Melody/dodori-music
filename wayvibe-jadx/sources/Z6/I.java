package Z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0998c {
    public static final Parcelable.Creator<I> CREATOR = new Z5.u(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzait f13935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13938g;

    public I(String str, String str2, String str3, zzait zzaitVar, String str4, String str5, String str6) {
        this.f13932a = zzae.zzb(str);
        this.f13933b = str2;
        this.f13934c = str3;
        this.f13935d = zzaitVar;
        this.f13936e = str4;
        this.f13937f = str5;
        this.f13938g = str6;
    }

    public static I y(zzait zzaitVar) {
        com.google.android.gms.common.internal.E.i(zzaitVar, "Must specify a non-null webSignInCredential");
        return new I(null, null, null, zzaitVar, null, null, null);
    }

    @Override // Z6.AbstractC0998c
    public final String u() {
        return this.f13932a;
    }

    @Override // Z6.AbstractC0998c
    public final String v() {
        return this.f13932a;
    }

    @Override // Z6.AbstractC0998c
    public final AbstractC0998c w() {
        return new I(this.f13932a, this.f13933b, this.f13934c, this.f13935d, this.f13936e, this.f13937f, this.f13938g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f13932a, false);
        p242x0.c.W(parcel, 2, this.f13933b, false);
        p242x0.c.W(parcel, 3, this.f13934c, false);
        p242x0.c.V(parcel, 4, this.f13935d, i10, false);
        p242x0.c.W(parcel, 5, this.f13936e, false);
        p242x0.c.W(parcel, 6, this.f13937f, false);
        p242x0.c.W(parcel, 7, this.f13938g, false);
        p242x0.c.d0(iC0, parcel);
    }
}
