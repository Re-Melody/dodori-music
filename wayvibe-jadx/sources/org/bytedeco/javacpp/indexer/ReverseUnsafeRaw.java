package org.bytedeco.javacpp.indexer;

/* JADX INFO: loaded from: classes2.dex */
class ReverseUnsafeRaw extends UnsafeRaw {
    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public char getChar(long j10) {
        return Character.reverseBytes(super.getChar(j10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public double getDouble(long j10) {
        return Double.longBitsToDouble(Long.reverseBytes(super.getLong(j10)));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public float getFloat(long j10) {
        return Float.intBitsToFloat(Integer.reverseBytes(super.getInt(j10)));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public int getInt(long j10) {
        return Integer.reverseBytes(super.getInt(j10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public long getLong(long j10) {
        return Long.reverseBytes(super.getLong(j10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public short getShort(long j10) {
        return Short.reverseBytes(super.getShort(j10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putChar(long j10, char c3) {
        super.putChar(j10, Character.reverseBytes(c3));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putDouble(long j10, double d10) {
        super.putDouble(j10, Long.reverseBytes(Double.doubleToRawLongBits(d10)));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putFloat(long j10, float f10) {
        super.putFloat(j10, Integer.reverseBytes(Float.floatToRawIntBits(f10)));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putInt(long j10, int i10) {
        super.putInt(j10, Integer.reverseBytes(i10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putLong(long j10, long j11) {
        super.putLong(j10, Long.reverseBytes(j11));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putShort(long j10, short s8) {
        super.putShort(j10, Short.reverseBytes(s8));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public char getChar(byte[] bArr, long j10) {
        return Character.reverseBytes(super.getChar(bArr, j10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public double getDouble(byte[] bArr, long j10) {
        return Double.longBitsToDouble(Long.reverseBytes(super.getLong(bArr, j10)));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public float getFloat(byte[] bArr, long j10) {
        return Float.intBitsToFloat(Integer.reverseBytes(super.getInt(bArr, j10)));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public int getInt(byte[] bArr, long j10) {
        return Integer.reverseBytes(super.getInt(bArr, j10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public long getLong(byte[] bArr, long j10) {
        return Long.reverseBytes(super.getLong(bArr, j10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public short getShort(byte[] bArr, long j10) {
        return Short.reverseBytes(super.getShort(bArr, j10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putChar(byte[] bArr, long j10, char c3) {
        super.putChar(bArr, j10, Character.reverseBytes(c3));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putDouble(byte[] bArr, long j10, double d10) {
        super.putDouble(bArr, j10, Long.reverseBytes(Double.doubleToRawLongBits(d10)));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putFloat(byte[] bArr, long j10, float f10) {
        super.putFloat(bArr, j10, Integer.reverseBytes(Float.floatToRawIntBits(f10)));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putInt(byte[] bArr, long j10, int i10) {
        super.putInt(bArr, j10, Integer.reverseBytes(i10));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putLong(byte[] bArr, long j10, long j11) {
        super.putLong(bArr, j10, Long.reverseBytes(j11));
    }

    @Override // org.bytedeco.javacpp.indexer.UnsafeRaw, org.bytedeco.javacpp.indexer.Raw
    public void putShort(byte[] bArr, long j10, short s8) {
        super.putShort(bArr, j10, Short.reverseBytes(s8));
    }
}
