package com.revenuecat.purchases.common.networking;

import B2.AbstractC0112b;
import M8.InterfaceC0641c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
public final class WebBillingPrice {
    public static final Companion Companion = new Companion(null);
    private final long amountMicros;
    private final String currency;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final p219u9.a serializer() {
            return WebBillingPrice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ WebBillingPrice(int i10, long j10, String str, Y y6) {
        if (3 != (i10 & 3)) {
            O.g(i10, 3, WebBillingPrice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.amountMicros = j10;
        this.currency = str;
    }

    public static /* synthetic */ WebBillingPrice copy$default(WebBillingPrice webBillingPrice, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = webBillingPrice.amountMicros;
        }
        if ((i10 & 2) != 0) {
            str = webBillingPrice.currency;
        }
        return webBillingPrice.copy(j10, str);
    }

    public static /* synthetic */ void getAmountMicros$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(WebBillingPrice webBillingPrice, b bVar, g gVar) {
        bVar.C(gVar, 0, webBillingPrice.amountMicros);
        bVar.u(gVar, 1, webBillingPrice.currency);
    }

    public final long component1() {
        return this.amountMicros;
    }

    public final String component2() {
        return this.currency;
    }

    public final WebBillingPrice copy(long j10, String currency) {
        m.f(currency, "currency");
        return new WebBillingPrice(j10, currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebBillingPrice)) {
            return false;
        }
        WebBillingPrice webBillingPrice = (WebBillingPrice) obj;
        return this.amountMicros == webBillingPrice.amountMicros && m.b(this.currency, webBillingPrice.currency);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (Long.hashCode(this.amountMicros) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebBillingPrice(amountMicros=");
        sb.append(this.amountMicros);
        sb.append(", currency=");
        return AbstractC0112b.j(sb, this.currency, ')');
    }

    public WebBillingPrice(long j10, String currency) {
        m.f(currency, "currency");
        this.amountMicros = j10;
        this.currency = currency;
    }
}
