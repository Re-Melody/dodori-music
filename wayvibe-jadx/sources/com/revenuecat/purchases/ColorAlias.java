package com.revenuecat.purchases;

import B2.AbstractC0112b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class ColorAlias {
    public static final Companion Companion = new Companion(null);
    private final String value;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final p219u9.a serializer() {
            return ColorAlias$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ColorAlias(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorAlias m28boximpl(String str) {
        return new ColorAlias(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m29constructorimpl(String value) {
        m.f(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30equalsimpl(String str, Object obj) {
        return (obj instanceof ColorAlias) && m.b(str, ((ColorAlias) obj).m34unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31equalsimpl0(String str, String str2) {
        return m.b(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33toStringimpl(String str) {
        return AbstractC0112b.c(')', "ColorAlias(value=", str);
    }

    public boolean equals(Object obj) {
        return m30equalsimpl(this.value, obj);
    }

    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m32hashCodeimpl(this.value);
    }

    public String toString() {
        return m33toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m34unboximpl() {
        return this.value;
    }
}
