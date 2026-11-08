package com.google.protobuf;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f18718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f18719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X0 f18720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f18721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f18722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f18723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f18724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f18725h;

    static {
        Unsafe unsafeJ = j();
        f18718a = unsafeJ;
        f18719b = AbstractC1234c.f18730a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        X0 w10 = null;
        if (unsafeJ != null) {
            if (!AbstractC1234c.a()) {
                w10 = new W0(unsafeJ);
            } else if (zF) {
                w10 = new V0(unsafeJ, 1);
            } else if (zF2) {
                w10 = new V0(unsafeJ, 0);
            }
        }
        f18720c = w10;
        f18721d = w10 == null ? false : w10.u();
        f18722e = w10 == null ? false : w10.t();
        f18723f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        f18724g = (fieldE == null || w10 == null) ? -1L : w10.l(fieldE);
        f18725h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(Y0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f18718a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int c(Class cls) {
        if (f18722e) {
            return f18720c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f18722e) {
            f18720c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1234c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!AbstractC1234c.a()) {
            return false;
        }
        try {
            Class cls2 = f18719b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j10) {
        return f18720c.f(f18723f + j10, bArr);
    }

    public static byte h(long j10, Object obj) {
        return (byte) ((f18720c.i((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
    }

    public static byte i(long j10, Object obj) {
        return (byte) ((f18720c.i((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new U0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j10, byte b10) {
        f18720c.n(bArr, f18723f + j10, b10);
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = f18720c.i(j11, obj);
        int i11 = ((~((int) j10)) & 3) << 3;
        n(j11, obj, ((255 & b10) << i11) | (i10 & (~(ColorExtractionConstants.COLOR_COMPONENT_MASK << i11))));
    }

    public static void m(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        n(j11, obj, ((255 & b10) << i10) | (f18720c.i(j11, obj) & (~(ColorExtractionConstants.COLOR_COMPONENT_MASK << i10))));
    }

    public static void n(long j10, Object obj, int i10) {
        f18720c.q(j10, obj, i10);
    }

    public static void o(Object obj, long j10, long j11) {
        f18720c.r(obj, j10, j11);
    }

    public static void p(Object obj, long j10, Object obj2) {
        f18720c.s(obj, j10, obj2);
    }
}
