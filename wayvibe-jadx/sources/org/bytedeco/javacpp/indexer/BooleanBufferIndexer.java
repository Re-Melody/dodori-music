package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class BooleanBufferIndexer extends BooleanIndexer {
    protected ByteBuffer buffer;

    public BooleanBufferIndexer(ByteBuffer byteBuffer) {
        this(byteBuffer, new long[]{byteBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long j10) {
        return this.buffer.get((int) j10) != 0;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, boolean z10) {
        this.buffer.put((int) j10, z10 ? (byte) 1 : (byte) 0);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public BooleanBufferIndexer(ByteBuffer byteBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = byteBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer get(long j10, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            zArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12) != 0;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, zArr[i10 + i12] ? (byte) 1 : (byte) 0);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11)) != 0;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, long j11, boolean z10) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), z10 ? (byte) 1 : (byte) 0);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer get(long j10, long j11, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i10 + i12;
            ByteBuffer byteBuffer = this.buffer;
            long[] jArr = this.strides;
            boolean z10 = true;
            if (byteBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12) == 0) {
                z10 = false;
            }
            zArr[i13] = z10;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, long j11, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBuffer = this.buffer;
            long[] jArr = this.strides;
            byteBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), zArr[i10 + i12] ? (byte) 1 : (byte) 0);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long j10, long j11, long j12) {
        ByteBuffer byteBuffer = this.buffer;
        long[] jArr = this.strides;
        return byteBuffer.get(((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0]))) + ((int) j12)) != 0;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long j10, long j11, long j12, boolean z10) {
        ByteBuffer byteBuffer = this.buffer;
        long[] jArr = this.strides;
        byteBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), z10 ? (byte) 1 : (byte) 0);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public boolean get(long... jArr) {
        return this.buffer.get((int) index(jArr)) != 0;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long[] jArr, boolean z10) {
        this.buffer.put((int) index(jArr), z10 ? (byte) 1 : (byte) 0);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer get(long[] jArr, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            zArr[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12) != 0;
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.BooleanIndexer
    public BooleanIndexer put(long[] jArr, boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, zArr[i10 + i12] ? (byte) 1 : (byte) 0);
        }
        return this;
    }
}
