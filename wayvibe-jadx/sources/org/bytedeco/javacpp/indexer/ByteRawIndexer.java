package org.bytedeco.javacpp.indexer;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class ByteRawIndexer extends ByteIndexer {
    protected static final Raw RAW = Raw.getInstance();
    final long base;
    protected BytePointer pointer;
    final long size;

    public ByteRawIndexer(BytePointer bytePointer) {
        this(bytePointer, new long[]{bytePointer.limit() - bytePointer.position()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long j10) {
        return RAW.getByte(Indexer.checkIndex(j10, this.size) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public char getChar(long j10) {
        return RAW.getChar(Indexer.checkIndex(j10, this.size - 1) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public double getDouble(long j10) {
        return RAW.getDouble(Indexer.checkIndex(j10, this.size - 7) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public float getFloat(long j10) {
        return RAW.getFloat(Indexer.checkIndex(j10, this.size - 3) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public int getInt(long j10) {
        return RAW.getInt(Indexer.checkIndex(j10, this.size - 3) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public long getLong(long j10) {
        return RAW.getLong(Indexer.checkIndex(j10, this.size - 7) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public short getShort(long j10) {
        return RAW.getShort(Indexer.checkIndex(j10, this.size - 1) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Pointer pointer() {
        return this.pointer;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, byte b10) {
        RAW.putByte(Indexer.checkIndex(j10, this.size) + this.base, b10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putChar(long j10, char c3) {
        RAW.putChar(Indexer.checkIndex(j10, this.size - 1) + this.base, c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putDouble(long j10, double d10) {
        RAW.putDouble(Indexer.checkIndex(j10, this.size - 7) + this.base, d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putFloat(long j10, float f10) {
        RAW.putFloat(Indexer.checkIndex(j10, this.size - 3) + this.base, f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putInt(long j10, int i10) {
        RAW.putInt(Indexer.checkIndex(j10, this.size - 3) + this.base, i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putLong(long j10, long j11) {
        RAW.putLong(Indexer.checkIndex(j10, this.size - 7) + this.base, j11);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putShort(long j10, short s8) {
        RAW.putShort(Indexer.checkIndex(j10, this.size - 1) + this.base, s8);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.pointer = null;
    }

    public ByteRawIndexer(BytePointer bytePointer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.pointer = bytePointer;
        this.base = bytePointer.position() + bytePointer.address();
        this.size = bytePointer.limit() - bytePointer.position();
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer get(long j10, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i10 + i12] = get((this.strides[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put((this.strides[0] * j10) + ((long) i12), bArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long j10, long j11) {
        return get((j10 * this.strides[0]) + ((long) ((int) j11)));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, long j11, byte b10) {
        put((j10 * this.strides[0]) + j11, b10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer get(long j10, long j11, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            bArr[i10 + i12] = get((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, long j11, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            put((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12), bArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long j10, long j11, long j12) {
        long[] jArr = this.strides;
        return get(b.h(j11, jArr[1], j10 * jArr[0], j12));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, long j11, long j12, byte b10) {
        long[] jArr = this.strides;
        put(b.h(j11, jArr[1], j10 * jArr[0], j12), b10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long... jArr) {
        return get(index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long[] jArr, byte b10) {
        put(index(jArr), b10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer get(long[] jArr, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i10 + i12] = get(index(jArr) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long[] jArr, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put(index(jArr) + ((long) i12), bArr[i10 + i12]);
        }
        return this;
    }
}
