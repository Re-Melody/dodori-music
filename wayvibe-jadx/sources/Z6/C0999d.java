package Z6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: Z6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0999d extends AbstractC0998c {
    public static final Parcelable.Creator<C0999d> CREATOR = new J(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13978e;

    public C0999d(String str, String str2, String str3, String str4, boolean z10) {
        com.google.android.gms.common.internal.E.e(str);
        this.f13974a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f13975b = str2;
        this.f13976c = str3;
        this.f13977d = str4;
        this.f13978e = z10;
    }

    @Override // Z6.AbstractC0998c
    public final String u() {
        return "password";
    }

    @Override // Z6.AbstractC0998c
    public final String v() {
        return !TextUtils.isEmpty(this.f13975b) ? "password" : "emailLink";
    }

    @Override // Z6.AbstractC0998c
    public final AbstractC0998c w() {
        return new C0999d(this.f13974a, this.f13975b, this.f13976c, this.f13977d, this.f13978e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f13974a, false);
        p242x0.c.W(parcel, 2, this.f13975b, false);
        p242x0.c.W(parcel, 3, this.f13976c, false);
        p242x0.c.W(parcel, 4, this.f13977d, false);
        boolean z10 = this.f13978e;
        p242x0.c.b0(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p242x0.c.d0(iC0, parcel);
    }
}
