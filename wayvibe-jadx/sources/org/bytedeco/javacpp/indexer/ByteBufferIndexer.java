package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ByteBufferIndexer extends ByteIndexer {
    protected ByteBuffer buffer;

    public ByteBufferIndexer(ByteBuffer byteBuffer) {
        this(byteBuffer, new long[]{byteBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long j10) {
        return this.buffer.get((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public char getChar(long j10) {
        return this.buffer.getChar((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public double getDouble(long j10) {
        return this.buffer.getDouble((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public float getFloat(long j10) {
        return this.buffer.getFloat((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public int getInt(long j10) {
        return this.buffer.getInt((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public long getLong(long j10) {
        return this.buffer.getLong((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public short getShort(long j10) {
        return this.buffer.getShort((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, byte b10) {
        this.buffer.put((int) j10, b10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putChar(long j10, char c3) {
        this.buffer.putChar((int) j10, c3);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putDouble(long j10, double d10) {
        this.buffer.putDouble((int) j10, d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putFloat(long j10, float f10) {
        this.buffer.putFloat((int) j10, f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putInt(long j10, int i10) {
        this.buffer.putInt((int) j10, i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putLong(long j10, long j11) {
        this.buffer.putLong((int) j10, j11);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer putShort(long j10, short s8) {
        this.buffer.putShort((int) j10, s8);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public ByteBufferIndexer(ByteBuffer byteBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = byteBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer get(long j10, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, bArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, long j11, byte b10) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), b10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer get(long j10, long j11, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBuffer = this.buffer;
            long[] jArr = this.strides;
            bArr[i10 + i12] = byteBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, long j11, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBuffer = this.buffer;
            long[] jArr = this.strides;
            byteBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), bArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long j10, long j11, long j12) {
        ByteBuffer byteBuffer = this.buffer;
        long[] jArr = this.strides;
        return byteBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long j10, long j11, long j12, byte b10) {
        ByteBuffer byteBuffer = this.buffer;
        long[] jArr = this.strides;
        byteBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), b10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public byte get(long... jArr) {
        return this.buffer.get((int) index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long[] jArr, byte b10) {
        this.buffer.put((int) index(jArr), b10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer get(long[] jArr, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ByteIndexer
    public ByteIndexer put(long[] jArr, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, bArr[i10 + i12]);
        }
        return this;
    }
}
