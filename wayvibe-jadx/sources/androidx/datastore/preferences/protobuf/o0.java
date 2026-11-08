package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f15138a;

    public o0(Unsafe unsafe) {
        this.f15138a = unsafe;
    }

    public final int a(Class cls) {
        return this.f15138a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f15138a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j10, Object obj);

    public abstract double d(long j10, Object obj);

    public abstract float e(long j10, Object obj);

    public final int f(long j10, Object obj) {
        return this.f15138a.getInt(obj, j10);
    }

    public final long g(long j10, Object obj) {
        return this.f15138a.getLong(obj, j10);
    }

    public final Object h(long j10, Object obj) {
        return this.f15138a.getObject(obj, j10);
    }

    public final long i(Field field) {
        return this.f15138a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j10, boolean z10);

    public abstract void k(Object obj, long j10, byte b10);

    public abstract void l(Object obj, long j10, double d10);

    public abstract void m(Object obj, long j10, float f10);

    public final void n(long j10, Object obj, int i10) {
        this.f15138a.putInt(obj, j10, i10);
    }

    public final void o(Object obj, long j10, long j11) {
        this.f15138a.putLong(obj, j10, j11);
    }

    public final void p(Object obj, long j10, Object obj2) {
        this.f15138a.putObject(obj, j10, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f15138a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            p0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
