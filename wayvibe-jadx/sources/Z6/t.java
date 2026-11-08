package Z6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0998c implements Cloneable {
    public static final Parcelable.Creator<t> CREATOR = new Z5.u(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13997e;

    public t(String str, String str2, String str3, String str4, boolean z10) {
        com.google.android.gms.common.internal.E.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f13993a = str;
        this.f13994b = str2;
        this.f13995c = str3;
        this.f13996d = z10;
        this.f13997e = str4;
    }

    public static t y(String str, String str2) {
        return new t(str, str2, null, null, true);
    }

    public final Object clone() {
        boolean z10 = this.f13996d;
        return new t(this.f13993a, this.f13994b, this.f13995c, this.f13997e, z10);
    }

    @Override // Z6.AbstractC0998c
    public final String u() {
        return "phone";
    }

    @Override // Z6.AbstractC0998c
    public final String v() {
        return "phone";
    }

    @Override // Z6.AbstractC0998c
    public final AbstractC0998c w() {
        return (t) clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f13993a, false);
        p242x0.c.W(parcel, 2, this.f13994b, false);
        p242x0.c.W(parcel, 4, this.f13995c, false);
        boolean z10 = this.f13996d;
        p242x0.c.b0(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p242x0.c.W(parcel, 6, this.f13997e, false);
        p242x0.c.d0(iC0, parcel);
    }
}
