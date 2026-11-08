package com.revenuecat.purchases;

import B8.V;
import D7.W;
import M8.h;
import M8.j;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.n;
import p260y9.O;

/* JADX INFO: loaded from: classes.dex */
public enum PostReceiptInitiationSource {
    RESTORE,
    PURCHASE,
    UNSYNCED_ACTIVE_PURCHASES;

    public static final Companion Companion = new Companion(null);
    private static final h $cachedSerializer$delegate = W.R(j.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptInitiationSource$Companion$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements Z8.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // Z8.a
            public final p219u9.a invoke() {
                return O.e("com.revenuecat.purchases.PostReceiptInitiationSource", PostReceiptInitiationSource.values());
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final /* synthetic */ p219u9.a get$cachedSerializer() {
            return (p219u9.a) PostReceiptInitiationSource.$cachedSerializer$delegate.getValue();
        }

        public final p219u9.a serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostReceiptInitiationSource.values().length];
            try {
                iArr[PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String getPostReceiptFieldValue() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return "restore";
        }
        if (i10 == 2) {
            return "purchase";
        }
        if (i10 == 3) {
            return "unsynced_active_purchases";
        }
        throw new V();
    }
}
