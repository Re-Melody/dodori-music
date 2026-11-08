package com.revenuecat.purchases.ads.events.types;

import B2.AbstractC0112b;
import java.util.Locale;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p097i9.k;

/* JADX INFO: loaded from: classes.dex */
public final class AdRevenuePrecision {
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final String EXACT = m126constructorimpl("exact");
    private static final String PUBLISHER_DEFINED = m126constructorimpl("publisher_defined");
    private static final String ESTIMATED = m126constructorimpl("estimated");
    private static final String UNKNOWN = m126constructorimpl("unknown");

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: fromString-QAIqrgA, reason: not valid java name */
        public final String m132fromStringQAIqrgA(String value) {
            m.f(value, "value");
            String lowerCase = value.toLowerCase(Locale.ROOT);
            m.e(lowerCase, "toLowerCase(...)");
            String string = k.S0(lowerCase).toString();
            switch (string.hashCode()) {
                case -623607748:
                    if (string.equals("estimated")) {
                        return m133getESTIMATEDrAcPn4k();
                    }
                    break;
                case -284840886:
                    if (string.equals("unknown")) {
                        return m136getUNKNOWNrAcPn4k();
                    }
                    break;
                case 96946943:
                    if (string.equals("exact")) {
                        return m134getEXACTrAcPn4k();
                    }
                    break;
                case 655944390:
                    if (string.equals("publisher_defined")) {
                        return m135getPUBLISHER_DEFINEDrAcPn4k();
                    }
                    break;
            }
            return AdRevenuePrecision.m126constructorimpl(value);
        }

        /* JADX INFO: renamed from: getESTIMATED-rAcPn4k, reason: not valid java name */
        public final String m133getESTIMATEDrAcPn4k() {
            return AdRevenuePrecision.ESTIMATED;
        }

        /* JADX INFO: renamed from: getEXACT-rAcPn4k, reason: not valid java name */
        public final String m134getEXACTrAcPn4k() {
            return AdRevenuePrecision.EXACT;
        }

        /* JADX INFO: renamed from: getPUBLISHER_DEFINED-rAcPn4k, reason: not valid java name */
        public final String m135getPUBLISHER_DEFINEDrAcPn4k() {
            return AdRevenuePrecision.PUBLISHER_DEFINED;
        }

        /* JADX INFO: renamed from: getUNKNOWN-rAcPn4k, reason: not valid java name */
        public final String m136getUNKNOWNrAcPn4k() {
            return AdRevenuePrecision.UNKNOWN;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdRevenuePrecision(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdRevenuePrecision m125boximpl(String str) {
        return new AdRevenuePrecision(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m126constructorimpl(String value) {
        m.f(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m127equalsimpl(String str, Object obj) {
        return (obj instanceof AdRevenuePrecision) && m.b(str, ((AdRevenuePrecision) obj).m131unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m128equalsimpl0(String str, String str2) {
        return m.b(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m129hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m130toStringimpl(String str) {
        return AbstractC0112b.c(')', "AdRevenuePrecision(value=", str);
    }

    public boolean equals(Object obj) {
        return m127equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m129hashCodeimpl(this.value);
    }

    public String toString() {
        return m130toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m131unboximpl() {
        return this.value;
    }
}
