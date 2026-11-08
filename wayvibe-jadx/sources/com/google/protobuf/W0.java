package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends X0 {
    @Override // com.google.protobuf.X0
    public final void c(long j10, byte[] bArr, long j11, long j12) {
        this.f18708a.copyMemory((Object) null, j10, bArr, Y0.f18723f + j11, j12);
    }

    @Override // com.google.protobuf.X0
    public final boolean d(long j10, Object obj) {
        return this.f18708a.getBoolean(obj, j10);
    }

    @Override // com.google.protobuf.X0
    public final byte e(long j10) {
        return this.f18708a.getByte(j10);
    }

    @Override // com.google.protobuf.X0
    public final byte f(long j10, Object obj) {
        return this.f18708a.getByte(obj, j10);
    }

    @Override // com.google.protobuf.X0
    public final double g(long j10, Object obj) {
        return this.f18708a.getDouble(obj, j10);
    }

    @Override // com.google.protobuf.X0
    public final float h(long j10, Object obj) {
        return this.f18708a.getFloat(obj, j10);
    }

    @Override // com.google.protobuf.X0
    public final void m(Object obj, long j10, boolean z10) {
        this.f18708a.putBoolean(obj, j10, z10);
    }

    @Override // com.google.protobuf.X0
    public final void n(Object obj, long j10, byte b10) {
        this.f18708a.putByte(obj, j10, b10);
    }

    @Override // com.google.protobuf.X0
    public final void o(Object obj, long j10, double d10) {
        this.f18708a.putDouble(obj, j10, d10);
    }

    @Override // com.google.protobuf.X0
    public final void p(Object obj, long j10, float f10) {
        this.f18708a.putFloat(obj, j10, f10);
    }

    @Override // com.google.protobuf.X0
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f18708a.getClass();
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
            Y0.a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.X0
    public final boolean u() {
        Unsafe unsafe = this.f18708a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (Y0.e() != null) {
                    try {
                        Class<?> cls3 = this.f18708a.getClass();
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
                        Y0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                Y0.a(th2);
            }
        }
        return false;
    }
}
