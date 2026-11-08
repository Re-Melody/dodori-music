package com.revenuecat.purchases.paywalls.events;

import D7.W;
import M8.h;
import M8.j;
import Z8.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallLegacyComponentInteraction;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.n;
import p260y9.O;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public enum PaywallComponentType {
    TAB,
    SWITCH,
    CAROUSEL,
    BUTTON,
    TEXT,
    PACKAGE,
    PACKAGE_SELECTION_SHEET,
    PURCHASE_BUTTON;

    public static final Companion Companion = new Companion(null);
    private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallComponentType$Companion$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // Z8.a
            public final p219u9.a invoke() {
                return O.d("com.revenuecat.purchases.paywalls.events.PaywallComponentType", PaywallComponentType.values(), new String[]{"tab", "switch", "carousel", "button", "text", "package", "package_selection_sheet", PaywallLegacyComponentInteraction.PURCHASE_BUTTON_NAME}, new Annotation[][]{null, null, null, null, null, null, null, null});
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final /* synthetic */ p219u9.a get$cachedSerializer() {
            return (p219u9.a) PaywallComponentType.$cachedSerializer$delegate.getValue();
        }

        public final p219u9.a serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
