package androidx.datastore.preferences.protobuf;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f15141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f15142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f15143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f15145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f15146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f15147g;

    static {
        Unsafe unsafeI = i();
        f15141a = unsafeI;
        f15142b = AbstractC1045c.f15071a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        o0 n0Var = null;
        if (unsafeI != null) {
            if (!AbstractC1045c.a()) {
                n0Var = new n0(unsafeI);
            } else if (zH) {
                n0Var = new m0(unsafeI, 1);
            } else if (zH2) {
                n0Var = new m0(unsafeI, 0);
            }
        }
        f15143c = n0Var;
        f15144d = n0Var == null ? false : n0Var.r();
        f15145e = n0Var == null ? false : n0Var.q();
        f15146f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && n0Var != null) {
            n0Var.i(fieldG);
        }
        f15147g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j10, Object obj) {
        return ((byte) ((f15143c.f((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & ColorExtractionConstants.COLOR_COMPONENT_MASK)) != 0;
    }

    public static boolean c(long j10, Object obj) {
        return ((byte) ((f15143c.f((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & ColorExtractionConstants.COLOR_COMPONENT_MASK)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f15141a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(Class cls) {
        if (f15145e) {
            return f15143c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f15145e) {
            f15143c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1045c.a()) {
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

    public static boolean h(Class cls) {
        if (!AbstractC1045c.a()) {
            return false;
        }
        try {
            Class cls2 = f15142b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new l0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j10, byte b10) {
        f15143c.k(bArr, f15146f + j10, b10);
    }

    public static void k(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iF = f15143c.f(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        m(j11, obj, ((255 & b10) << i10) | (iF & (~(ColorExtractionConstants.COLOR_COMPONENT_MASK << i10))));
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m(j11, obj, ((255 & b10) << i10) | (f15143c.f(j11, obj) & (~(ColorExtractionConstants.COLOR_COMPONENT_MASK << i10))));
    }

    public static void m(long j10, Object obj, int i10) {
        f15143c.n(j10, obj, i10);
    }

    public static void n(Object obj, long j10, long j11) {
        f15143c.o(obj, j10, j11);
    }

    public static void o(Object obj, long j10, Object obj2) {
        f15143c.p(obj, j10, obj2);
    }
}
