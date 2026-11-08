package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PriceDetails {
    public static final int $stable = 0;

    public static final class Free extends PriceDetails {
        public static final int $stable = 0;
        public static final Free INSTANCE = new Free();

        private Free() {
            super(null);
        }
    }

    public static final class Paid extends PriceDetails {
        public static final int $stable = 0;
        private final String price;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paid(String price) {
            super(null);
            m.f(price, "price");
            this.price = price;
        }

        public static /* synthetic */ Paid copy$default(Paid paid, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paid.price;
            }
            return paid.copy(str);
        }

        public final String component1() {
            return this.price;
        }

        public final Paid copy(String price) {
            m.f(price, "price");
            return new Paid(price);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paid) && m.b(this.price, ((Paid) obj).price);
        }

        public final String getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.price.hashCode();
        }

        public String toString() {
            return AbstractC0112b.j(new StringBuilder("Paid(price="), this.price, ')');
        }
    }

    public static final class Unknown extends PriceDetails {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(null);
        }
    }

    public /* synthetic */ PriceDetails(f fVar) {
        this();
    }

    private PriceDetails() {
    }
}
