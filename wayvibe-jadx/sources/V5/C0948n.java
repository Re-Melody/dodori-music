package V5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: V5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0948n extends AbstractC0950p {
    public static final Parcelable.Creator<C0948n> CREATOR = new W(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0958y f12679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f12680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12681c;

    public C0948n(C0958y c0958y, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.E.h(c0958y);
        this.f12679a = c0958y;
        com.google.android.gms.common.internal.E.h(uri);
        boolean z10 = true;
        com.google.android.gms.common.internal.E.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.E.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f12680b = uri;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        com.google.android.gms.common.internal.E.a("clientDataHash must be 32 bytes long", z10);
        this.f12681c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0948n)) {
            return false;
        }
        C0948n c0948n = (C0948n) obj;
        return com.google.android.gms.common.internal.E.k(this.f12679a, c0948n.f12679a) && com.google.android.gms.common.internal.E.k(this.f12680b, c0948n.f12680b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12679a, this.f12680b});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12679a);
        String strValueOf2 = String.valueOf(this.f12680b);
        return p134m1.b.m(p134m1.b.q("BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=", strValueOf, ", \n origin=", strValueOf2, ", \n clientDataHash="), O5.a.c(this.f12681c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 2, this.f12679a, i10, false);
        p242x0.c.V(parcel, 3, this.f12680b, i10, false);
        p242x0.c.P(parcel, 4, this.f12681c, false);
        p242x0.c.d0(iC0, parcel);
    }
}
