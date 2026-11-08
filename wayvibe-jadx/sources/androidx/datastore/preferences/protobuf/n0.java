package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends o0 {
    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean c(long j10, Object obj) {
        return this.f15138a.getBoolean(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final double d(long j10, Object obj) {
        return this.f15138a.getDouble(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final float e(long j10, Object obj) {
        return this.f15138a.getFloat(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void j(Object obj, long j10, boolean z10) {
        this.f15138a.putBoolean(obj, j10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void k(Object obj, long j10, byte b10) {
        this.f15138a.putByte(obj, j10, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void l(Object obj, long j10, double d10) {
        this.f15138a.putDouble(obj, j10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void m(Object obj, long j10, float f10) {
        this.f15138a.putFloat(obj, j10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f15138a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            p0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean r() {
        Unsafe unsafe = this.f15138a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (p0.g() != null) {
                    try {
                        Class<?> cls3 = this.f15138a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        p0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                p0.a(th2);
            }
        }
        return false;
    }
}
