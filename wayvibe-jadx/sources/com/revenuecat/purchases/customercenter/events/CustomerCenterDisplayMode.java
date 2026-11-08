package com.revenuecat.purchases.customercenter.events;

import D7.W;
import M8.h;
import M8.j;
import Z8.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.n;
import p260y9.O;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public enum CustomerCenterDisplayMode {
    FULL_SCREEN;

    public static final Companion Companion = new Companion(null);
    private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode$Companion$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // Z8.a
            public final p219u9.a invoke() {
                return O.d("com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode", CustomerCenterDisplayMode.values(), new String[]{"full_screen"}, new Annotation[][]{null});
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final /* synthetic */ p219u9.a get$cachedSerializer() {
            return (p219u9.a) CustomerCenterDisplayMode.$cachedSerializer$delegate.getValue();
        }

        public final p219u9.a serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
