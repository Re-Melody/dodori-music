package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExpirationOrRenewal {
    public static final int $stable = 0;

    public static final class Expiration extends ExpirationOrRenewal {
        public static final int $stable = 0;
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Expiration(String date) {
            super(null);
            m.f(date, "date");
            this.date = date;
        }

        public static /* synthetic */ Expiration copy$default(Expiration expiration, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = expiration.date;
            }
            return expiration.copy(str);
        }

        public final String component1() {
            return this.date;
        }

        public final Expiration copy(String date) {
            m.f(date, "date");
            return new Expiration(date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Expiration) && m.b(this.date, ((Expiration) obj).date);
        }

        public final String getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC0112b.j(new StringBuilder("Expiration(date="), this.date, ')');
        }
    }

    public static final class Renewal extends ExpirationOrRenewal {
        public static final int $stable = 0;
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Renewal(String date) {
            super(null);
            m.f(date, "date");
            this.date = date;
        }

        public static /* synthetic */ Renewal copy$default(Renewal renewal, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = renewal.date;
            }
            return renewal.copy(str);
        }

        public final String component1() {
            return this.date;
        }

        public final Renewal copy(String date) {
            m.f(date, "date");
            return new Renewal(date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Renewal) && m.b(this.date, ((Renewal) obj).date);
        }

        public final String getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC0112b.j(new StringBuilder("Renewal(date="), this.date, ')');
        }
    }

    public /* synthetic */ ExpirationOrRenewal(f fVar) {
        this();
    }

    private ExpirationOrRenewal() {
    }
}
