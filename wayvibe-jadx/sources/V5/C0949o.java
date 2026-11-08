package V5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: V5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0949o extends AbstractC0950p {
    public static final Parcelable.Creator<C0949o> CREATOR = new W(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f12682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f12683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12684c;

    public C0949o(B b10, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.E.h(b10);
        this.f12682a = b10;
        com.google.android.gms.common.internal.E.h(uri);
        boolean z10 = true;
        com.google.android.gms.common.internal.E.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.E.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f12683b = uri;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        com.google.android.gms.common.internal.E.a("clientDataHash must be 32 bytes long", z10);
        this.f12684c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0949o)) {
            return false;
        }
        C0949o c0949o = (C0949o) obj;
        return com.google.android.gms.common.internal.E.k(this.f12682a, c0949o.f12682a) && com.google.android.gms.common.internal.E.k(this.f12683b, c0949o.f12683b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12682a, this.f12683b});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12682a);
        String strValueOf2 = String.valueOf(this.f12683b);
        return p134m1.b.m(p134m1.b.q("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", strValueOf, ", \n origin=", strValueOf2, ", \n clientDataHash="), O5.a.c(this.f12684c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.V(parcel, 2, this.f12682a, i10, false);
        p242x0.c.V(parcel, 3, this.f12683b, i10, false);
        p242x0.c.P(parcel, 4, this.f12684c, false);
        p242x0.c.d0(iC0, parcel);
    }
}
