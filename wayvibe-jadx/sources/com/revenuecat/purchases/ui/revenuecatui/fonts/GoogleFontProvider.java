package com.revenuecat.purchases.ui.revenuecatui.fonts;

import B2.AbstractC0112b;
import U0.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleFontProvider implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GoogleFontProvider> CREATOR = new Creator();
    private final int certificates;
    private final String providerAuthority;
    private final String providerPackage;

    public static final class Creator implements Parcelable.Creator<GoogleFontProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleFontProvider createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new GoogleFontProvider(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleFontProvider[] newArray(int i10) {
            return new GoogleFontProvider[i10];
        }
    }

    public GoogleFontProvider(int i10, String providerAuthority, String providerPackage) {
        m.f(providerAuthority, "providerAuthority");
        m.f(providerPackage, "providerPackage");
        this.certificates = i10;
        this.providerAuthority = providerAuthority;
        this.providerPackage = providerPackage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleFontProvider)) {
            return false;
        }
        GoogleFontProvider googleFontProvider = (GoogleFontProvider) obj;
        return this.certificates == googleFontProvider.certificates && m.b(this.providerAuthority, googleFontProvider.providerAuthority) && m.b(this.providerPackage, googleFontProvider.providerPackage);
    }

    public final int getCertificates() {
        return this.certificates;
    }

    public final String getProviderAuthority() {
        return this.providerAuthority;
    }

    public final String getProviderPackage() {
        return this.providerPackage;
    }

    public int hashCode() {
        return this.providerPackage.hashCode() + AbstractC0112b.a(this.certificates * 31, 31, this.providerAuthority);
    }

    public final a toGoogleProvider() {
        return new a(this.providerAuthority, this.providerPackage, this.certificates);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GoogleFontProvider(certificates=");
        sb.append(this.certificates);
        sb.append(", providerAuthority=");
        sb.append(this.providerAuthority);
        sb.append(", providerPackage=");
        return AbstractC0112b.j(sb, this.providerPackage, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeInt(this.certificates);
        out.writeString(this.providerAuthority);
        out.writeString(this.providerPackage);
    }

    public /* synthetic */ GoogleFontProvider(int i10, String str, String str2, int i11, f fVar) {
        this(i10, (i11 & 2) != 0 ? "com.google.android.gms.fonts" : str, (i11 & 4) != 0 ? "com.google.android.gms" : str2);
    }
}
