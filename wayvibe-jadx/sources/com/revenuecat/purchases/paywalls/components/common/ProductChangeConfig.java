package com.revenuecat.purchases.paywalls.components.common;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.models.StoreReplacementMode;
import com.revenuecat.purchases.paywalls.components.common.serializers.DowngradeReplacementModeDeserializer;
import com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ProductChangeConfig {
    public static final Companion Companion = new Companion(null);
    private final StoreReplacementMode downgradeReplacementMode;
    private final StoreReplacementMode upgradeReplacementMode;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return ProductChangeConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProductChangeConfig() {
        this((StoreReplacementMode) null, (StoreReplacementMode) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ void getDowngradeReplacementMode$annotations() {
    }

    public static /* synthetic */ void getUpgradeReplacementMode$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(ProductChangeConfig productChangeConfig, b bVar, g gVar) {
        if (bVar.l(gVar) || !m.b(productChangeConfig.upgradeReplacementMode, StoreReplacementMode.CHARGE_PRORATED_PRICE)) {
            bVar.m(gVar, 0, UpgradeReplacementModeDeserializer.INSTANCE, productChangeConfig.upgradeReplacementMode);
        }
        if (!bVar.l(gVar) && m.b(productChangeConfig.downgradeReplacementMode, StoreReplacementMode.DEFERRED)) {
            return;
        }
        bVar.m(gVar, 1, DowngradeReplacementModeDeserializer.INSTANCE, productChangeConfig.downgradeReplacementMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductChangeConfig)) {
            return false;
        }
        ProductChangeConfig productChangeConfig = (ProductChangeConfig) obj;
        return m.b(this.upgradeReplacementMode, productChangeConfig.upgradeReplacementMode) && m.b(this.downgradeReplacementMode, productChangeConfig.downgradeReplacementMode);
    }

    public final /* synthetic */ StoreReplacementMode getDowngradeReplacementMode() {
        return this.downgradeReplacementMode;
    }

    public final /* synthetic */ StoreReplacementMode getUpgradeReplacementMode() {
        return this.upgradeReplacementMode;
    }

    public int hashCode() {
        return this.downgradeReplacementMode.hashCode() + (this.upgradeReplacementMode.hashCode() * 31);
    }

    public String toString() {
        return "ProductChangeConfig(upgradeReplacementMode=" + this.upgradeReplacementMode + ", downgradeReplacementMode=" + this.downgradeReplacementMode + ')';
    }

    @InterfaceC0641c
    public /* synthetic */ ProductChangeConfig(int i10, StoreReplacementMode storeReplacementMode, StoreReplacementMode storeReplacementMode2, Y y6) {
        this.upgradeReplacementMode = (i10 & 1) == 0 ? StoreReplacementMode.CHARGE_PRORATED_PRICE : storeReplacementMode;
        if ((i10 & 2) == 0) {
            this.downgradeReplacementMode = StoreReplacementMode.DEFERRED;
        } else {
            this.downgradeReplacementMode = storeReplacementMode2;
        }
    }

    public ProductChangeConfig(StoreReplacementMode upgradeReplacementMode, StoreReplacementMode downgradeReplacementMode) {
        m.f(upgradeReplacementMode, "upgradeReplacementMode");
        m.f(downgradeReplacementMode, "downgradeReplacementMode");
        this.upgradeReplacementMode = upgradeReplacementMode;
        this.downgradeReplacementMode = downgradeReplacementMode;
    }

    public /* synthetic */ ProductChangeConfig(StoreReplacementMode storeReplacementMode, StoreReplacementMode storeReplacementMode2, int i10, f fVar) {
        this((i10 & 1) != 0 ? StoreReplacementMode.CHARGE_PRORATED_PRICE : storeReplacementMode, (i10 & 2) != 0 ? StoreReplacementMode.DEFERRED : storeReplacementMode2);
    }
}
