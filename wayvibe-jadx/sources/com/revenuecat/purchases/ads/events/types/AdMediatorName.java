package com.revenuecat.purchases.ads.events.types;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p097i9.k;

/* JADX INFO: loaded from: classes.dex */
public final class AdMediatorName {
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final String AD_MOB = m111constructorimpl("AdMob");
    private static final String APP_LOVIN = m111constructorimpl("AppLovin");

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: renamed from: fromString-CJOXPJU, reason: not valid java name */
        public final String m117fromStringCJOXPJU(String value) {
            m.f(value, "value");
            String string = k.S0(value).toString();
            if (m.b(string, "AdMob")) {
                return m118getAD_MOBGyoM_N4();
            }
            return m.b(string, "AppLovin") ? m119getAPP_LOVINGyoM_N4() : AdMediatorName.m111constructorimpl(value);
        }

        /* JADX INFO: renamed from: getAD_MOB-GyoM_N4, reason: not valid java name */
        public final String m118getAD_MOBGyoM_N4() {
            return AdMediatorName.AD_MOB;
        }

        /* JADX INFO: renamed from: getAPP_LOVIN-GyoM_N4, reason: not valid java name */
        public final String m119getAPP_LOVINGyoM_N4() {
            return AdMediatorName.APP_LOVIN;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdMediatorName(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdMediatorName m110boximpl(String str) {
        return new AdMediatorName(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m111constructorimpl(String value) {
        m.f(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m112equalsimpl(String str, Object obj) {
        return (obj instanceof AdMediatorName) && m.b(str, ((AdMediatorName) obj).m116unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m113equalsimpl0(String str, String str2) {
        return m.b(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m114hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m115toStringimpl(String str) {
        return AbstractC0112b.c(')', "AdMediatorName(value=", str);
    }

    public boolean equals(Object obj) {
        return m112equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m114hashCodeimpl(this.value);
    }

    public String toString() {
        return m115toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m116unboximpl() {
        return this.value;
    }
}
