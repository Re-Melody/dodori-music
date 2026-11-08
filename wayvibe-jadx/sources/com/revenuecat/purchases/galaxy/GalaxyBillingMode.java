package com.revenuecat.purchases.galaxy;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GalaxyBillingMode {
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final GalaxyBillingMode PRODUCTION = new GalaxyBillingMode() { // from class: com.revenuecat.purchases.galaxy.GalaxyBillingMode$Companion$PRODUCTION$1
    };
    public static final GalaxyBillingMode TEST = new GalaxyBillingMode() { // from class: com.revenuecat.purchases.galaxy.GalaxyBillingMode$Companion$TEST$1
    };
    public static final GalaxyBillingMode ALWAYS_FAIL = new GalaxyBillingMode() { // from class: com.revenuecat.purchases.galaxy.GalaxyBillingMode$Companion$ALWAYS_FAIL$1
    };

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public GalaxyBillingMode(String name) {
        m.f(name, "name");
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
