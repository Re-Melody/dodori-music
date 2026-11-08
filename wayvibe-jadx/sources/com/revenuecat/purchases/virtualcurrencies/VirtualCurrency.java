package com.revenuecat.purchases.virtualcurrencies;

import B2.AbstractC0112b;
import M8.InterfaceC0641c;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class VirtualCurrency implements Parcelable {
    private final int balance;
    private final String code;
    private final String name;
    private final String serverDescription;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VirtualCurrency> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return VirtualCurrency$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<VirtualCurrency> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VirtualCurrency createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new VirtualCurrency(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VirtualCurrency[] newArray(int i10) {
            return new VirtualCurrency[i10];
        }
    }

    @InterfaceC0641c
    public /* synthetic */ VirtualCurrency(int i10, int i11, String str, String str2, String str3, Y y6) {
        if (7 != (i10 & 7)) {
            O.g(i10, 7, VirtualCurrency$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.balance = i11;
        this.name = str;
        this.code = str2;
        if ((i10 & 8) == 0) {
            this.serverDescription = null;
        } else {
            this.serverDescription = str3;
        }
    }

    public static /* synthetic */ void getServerDescription$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(VirtualCurrency virtualCurrency, b bVar, g gVar) {
        bVar.p(0, virtualCurrency.balance, gVar);
        bVar.u(gVar, 1, virtualCurrency.name);
        bVar.u(gVar, 2, virtualCurrency.code);
        if (!bVar.l(gVar) && virtualCurrency.serverDescription == null) {
            return;
        }
        bVar.t(gVar, 3, c0.f29272a, virtualCurrency.serverDescription);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualCurrency)) {
            return false;
        }
        VirtualCurrency virtualCurrency = (VirtualCurrency) obj;
        return this.balance == virtualCurrency.balance && m.b(this.name, virtualCurrency.name) && m.b(this.code, virtualCurrency.code) && m.b(this.serverDescription, virtualCurrency.serverDescription);
    }

    public final int getBalance() {
        return this.balance;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public int hashCode() {
        int iA = AbstractC0112b.a(AbstractC0112b.a(this.balance * 31, 31, this.name), 31, this.code);
        String str = this.serverDescription;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VirtualCurrency(balance=");
        sb.append(this.balance);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", serverDescription=");
        return AbstractC0112b.j(sb, this.serverDescription, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeInt(this.balance);
        out.writeString(this.name);
        out.writeString(this.code);
        out.writeString(this.serverDescription);
    }

    @InternalRevenueCatAPI
    public VirtualCurrency(int i10, String name, String code, String str) {
        m.f(name, "name");
        m.f(code, "code");
        this.balance = i10;
        this.name = name;
        this.code = code;
        this.serverDescription = str;
    }

    public /* synthetic */ VirtualCurrency(int i10, String str, String str2, String str3, int i11, f fVar) {
        this(i10, str, str2, (i11 & 8) != 0 ? null : str3);
    }
}
