package org.bytedeco.javacpp.indexer;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
class UnsafeRaw extends Raw {
    protected static final Unsafe UNSAFE;
    protected static final long arrayOffset;

    static {
        long jArrayBaseOffset;
        Unsafe unsafe = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            Class cls2 = Long.TYPE;
            cls.getDeclaredMethod("getByte", cls2);
            cls.getDeclaredMethod("getShort", cls2);
            cls.getDeclaredMethod("getInt", cls2);
            cls.getDeclaredMethod("getLong", cls2);
            cls.getDeclaredMethod("getFloat", cls2);
            cls.getDeclaredMethod("getDouble", cls2);
            cls.getDeclaredMethod("getChar", cls2);
            cls.getDeclaredMethod("arrayBaseOffset", Class.class);
            declaredField.setAccessible(true);
            Unsafe unsafe2 = (Unsafe) declaredField.get(null);
            jArrayBaseOffset = unsafe2.arrayBaseOffset(byte[].class);
            unsafe = unsafe2;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException unused) {
            jArrayBaseOffset = 0;
        }
        UNSAFE = unsafe;
        arrayOffset = jArrayBaseOffset;
    }

    public static boolean isAvailable() {
        return UNSAFE != null;
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public boolean getBoolean(long j10) {
        return UNSAFE.getByte(j10) != 0;
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public byte getByte(long j10) {
        return UNSAFE.getByte(j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public char getChar(long j10) {
        return UNSAFE.getChar(j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public double getDouble(long j10) {
        return UNSAFE.getDouble(j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public float getFloat(long j10) {
        return UNSAFE.getFloat(j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public int getInt(long j10) {
        return UNSAFE.getInt(j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public long getLong(long j10) {
        return UNSAFE.getLong(j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public short getShort(long j10) {
        return UNSAFE.getShort(j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putBoolean(long j10, boolean z10) {
        UNSAFE.putByte(j10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putByte(long j10, byte b10) {
        UNSAFE.putByte(j10, b10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putChar(long j10, char c3) {
        UNSAFE.putChar(j10, c3);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putDouble(long j10, double d10) {
        UNSAFE.putDouble(j10, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putFloat(long j10, float f10) {
        UNSAFE.putFloat(j10, f10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putInt(long j10, int i10) {
        UNSAFE.putInt(j10, i10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putLong(long j10, long j11) {
        UNSAFE.putLong(j10, j11);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putShort(long j10, short s8) {
        UNSAFE.putShort(j10, s8);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public boolean getBoolean(byte[] bArr, long j10) {
        return UNSAFE.getBoolean(bArr, arrayOffset + j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public byte getByte(byte[] bArr, long j10) {
        return UNSAFE.getByte(bArr, arrayOffset + j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public char getChar(byte[] bArr, long j10) {
        return UNSAFE.getChar(bArr, arrayOffset + j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public double getDouble(byte[] bArr, long j10) {
        return UNSAFE.getDouble(bArr, arrayOffset + j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public float getFloat(byte[] bArr, long j10) {
        return UNSAFE.getFloat(bArr, arrayOffset + j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public int getInt(byte[] bArr, long j10) {
        return UNSAFE.getInt(bArr, arrayOffset + j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public long getLong(byte[] bArr, long j10) {
        return UNSAFE.getLong(bArr, arrayOffset + j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public short getShort(byte[] bArr, long j10) {
        return UNSAFE.getShort(bArr, arrayOffset + j10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putBoolean(byte[] bArr, long j10, boolean z10) {
        UNSAFE.putBoolean(bArr, arrayOffset + j10, z10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putByte(byte[] bArr, long j10, byte b10) {
        UNSAFE.putByte(bArr, arrayOffset + j10, b10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putChar(byte[] bArr, long j10, char c3) {
        UNSAFE.putChar(bArr, arrayOffset + j10, c3);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putDouble(byte[] bArr, long j10, double d10) {
        UNSAFE.putDouble(bArr, arrayOffset + j10, d10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putFloat(byte[] bArr, long j10, float f10) {
        UNSAFE.putFloat(bArr, arrayOffset + j10, f10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putInt(byte[] bArr, long j10, int i10) {
        UNSAFE.putInt(bArr, arrayOffset + j10, i10);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putLong(byte[] bArr, long j10, long j11) {
        UNSAFE.putLong(bArr, arrayOffset + j10, j11);
    }

    @Override // org.bytedeco.javacpp.indexer.Raw
    public void putShort(byte[] bArr, long j10, short s8) {
        UNSAFE.putShort(bArr, arrayOffset + j10, s8);
    }
}
