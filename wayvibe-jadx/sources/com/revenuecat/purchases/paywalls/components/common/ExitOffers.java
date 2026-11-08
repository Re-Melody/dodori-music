package com.revenuecat.purchases.paywalls.components.common;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ExitOffers {
    public static final Companion Companion = new Companion(null);
    private final ExitOffer dismiss;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return ExitOffers$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExitOffers() {
        this((ExitOffer) null, 1, (f) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(ExitOffers exitOffers, b bVar, g gVar) {
        if (!bVar.l(gVar) && exitOffers.dismiss == null) {
            return;
        }
        bVar.t(gVar, 0, ExitOffer$$serializer.INSTANCE, exitOffers.dismiss);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExitOffers) && m.b(this.dismiss, ((ExitOffers) obj).dismiss);
    }

    public final ExitOffer getDismiss() {
        return this.dismiss;
    }

    public int hashCode() {
        ExitOffer exitOffer = this.dismiss;
        if (exitOffer == null) {
            return 0;
        }
        return exitOffer.hashCode();
    }

    public String toString() {
        return "ExitOffers(dismiss=" + this.dismiss + ')';
    }

    @InterfaceC0641c
    public /* synthetic */ ExitOffers(int i10, ExitOffer exitOffer, Y y6) {
        if ((i10 & 1) == 0) {
            this.dismiss = null;
        } else {
            this.dismiss = exitOffer;
        }
    }

    public ExitOffers(ExitOffer exitOffer) {
        this.dismiss = exitOffer;
    }

    public /* synthetic */ ExitOffers(ExitOffer exitOffer, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : exitOffer);
    }
}
