package p057f2;

import androidx.datastore.preferences.protobuf.AbstractC1063v;
import androidx.datastore.preferences.protobuf.AbstractC1066y;
import androidx.datastore.preferences.protobuf.C1049g;
import androidx.datastore.preferences.protobuf.C1064w;
import androidx.datastore.preferences.protobuf.EnumC1065x;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.b0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC1066y {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile W PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC1066y.j(k.class, kVar);
    }

    public static i D() {
        return (i) ((AbstractC1063v) DEFAULT_INSTANCE.c(EnumC1065x.NEW_BUILDER));
    }

    public static void l(k kVar, long j10) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j10);
    }

    public static void m(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void n(k kVar, h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void o(k kVar, double d10) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d10);
    }

    public static void p(k kVar, C1049g c1049g) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = c1049g;
    }

    public static void q(k kVar, boolean z10) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z10);
    }

    public static void r(k kVar, float f10) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f10);
    }

    public static void s(k kVar, int i10) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(i10);
    }

    public static k v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final h B() {
        return this.valueCase_ == 6 ? (h) this.value_ : h.m();
    }

    public final j C() {
        switch (this.valueCase_) {
            case 0:
                return j.VALUE_NOT_SET;
            case 1:
                return j.BOOLEAN;
            case 2:
                return j.FLOAT;
            case 3:
                return j.INTEGER;
            case 4:
                return j.LONG;
            case 5:
                return j.STRING;
            case 6:
                return j.STRING_SET;
            case 7:
                return j.DOUBLE;
            case 8:
                return j.BYTES;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1066y
    public final Object c(EnumC1065x enumC1065x) {
        W c1064w;
        switch (c.f19742a[enumC1065x.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new i(DEFAULT_INSTANCE);
            case 3:
                return new b0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                W w10 = PARSER;
                if (w10 != null) {
                    return w10;
                }
                synchronized (k.class) {
                    try {
                        c1064w = PARSER;
                        if (c1064w == null) {
                            c1064w = new C1064w();
                            PARSER = c1064w;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1064w;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C1049g u() {
        return this.valueCase_ == 8 ? (C1049g) this.value_ : C1049g.f15092c;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
