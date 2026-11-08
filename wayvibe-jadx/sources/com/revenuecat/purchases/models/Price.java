package com.revenuecat.purchases.models;

import B2.AbstractC0112b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Price implements Parcelable {
    public static final Parcelable.Creator<Price> CREATOR = new Creator();
    private final long amountMicros;
    private final String currencyCode;
    private final String formatted;

    public static final class Creator implements Parcelable.Creator<Price> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i10) {
            return new Price[i10];
        }
    }

    public Price(String formatted, long j10, String currencyCode) {
        m.f(formatted, "formatted");
        m.f(currencyCode, "currencyCode");
        this.formatted = formatted;
        this.amountMicros = j10;
        this.currencyCode = currencyCode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return m.b(this.formatted, price.formatted) && this.amountMicros == price.amountMicros && m.b(this.currencyCode, price.currencyCode);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public int hashCode() {
        return this.currencyCode.hashCode() + b.g(this.amountMicros, this.formatted.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Price(formatted=");
        sb.append(this.formatted);
        sb.append(", amountMicros=");
        sb.append(this.amountMicros);
        sb.append(", currencyCode=");
        return AbstractC0112b.j(sb, this.currencyCode, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeString(this.formatted);
        out.writeLong(this.amountMicros);
        out.writeString(this.currencyCode);
    }
}
