package org.bytedeco.javacpp.indexer;

/* JADX INFO: loaded from: classes2.dex */
abstract class Raw {
    static final Raw INSTANCE;

    static {
        if (UnsafeRaw.isAvailable()) {
            INSTANCE = new UnsafeRaw();
        } else {
            INSTANCE = null;
        }
    }

    public static Raw getInstance() {
        return INSTANCE;
    }

    public abstract boolean getBoolean(long j10);

    public abstract boolean getBoolean(byte[] bArr, long j10);

    public abstract byte getByte(long j10);

    public abstract byte getByte(byte[] bArr, long j10);

    public abstract char getChar(long j10);

    public abstract char getChar(byte[] bArr, long j10);

    public abstract double getDouble(long j10);

    public abstract double getDouble(byte[] bArr, long j10);

    public abstract float getFloat(long j10);

    public abstract float getFloat(byte[] bArr, long j10);

    public abstract int getInt(long j10);

    public abstract int getInt(byte[] bArr, long j10);

    public abstract long getLong(long j10);

    public abstract long getLong(byte[] bArr, long j10);

    public abstract short getShort(long j10);

    public abstract short getShort(byte[] bArr, long j10);

    public abstract void putBoolean(long j10, boolean z10);

    public abstract void putBoolean(byte[] bArr, long j10, boolean z10);

    public abstract void putByte(long j10, byte b10);

    public abstract void putByte(byte[] bArr, long j10, byte b10);

    public abstract void putChar(long j10, char c3);

    public abstract void putChar(byte[] bArr, long j10, char c3);

    public abstract void putDouble(long j10, double d10);

    public abstract void putDouble(byte[] bArr, long j10, double d10);

    public abstract void putFloat(long j10, float f10);

    public abstract void putFloat(byte[] bArr, long j10, float f10);

    public abstract void putInt(long j10, int i10);

    public abstract void putInt(byte[] bArr, long j10, int i10);

    public abstract void putLong(long j10, long j11);

    public abstract void putLong(byte[] bArr, long j10, long j11);

    public abstract void putShort(long j10, short s8);

    public abstract void putShort(byte[] bArr, long j10, short s8);
}
