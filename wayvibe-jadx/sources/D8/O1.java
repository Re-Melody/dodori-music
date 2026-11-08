package D8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class O1 implements N0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f2304b = Logger.getLogger(O1.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f2305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f2306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RuntimeException f2307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f2308f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2309a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                int i10 = 0;
                cls.getMethod("sum", new Class[0]);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                while (true) {
                    if (i10 >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i10];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f2304b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null || constructor == null) {
            f2305c = null;
            f2306d = null;
            f2307e = new RuntimeException(th);
        } else {
            f2305c = constructor;
            f2306d = method;
            f2307e = null;
        }
        f2308f = new Object[]{1L};
    }

    public O1() {
        RuntimeException runtimeException = f2307e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f2309a = f2305c.newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // D8.N0
    public final void a() {
        try {
            f2306d.invoke(this.f2309a, f2308f);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
