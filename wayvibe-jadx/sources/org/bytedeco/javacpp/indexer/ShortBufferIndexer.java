package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ShortBufferIndexer extends ShortIndexer {
    protected ShortBuffer buffer;

    public ShortBufferIndexer(ShortBuffer shortBuffer) {
        this(shortBuffer, new long[]{shortBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public short get(long j10) {
        return this.buffer.get((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, short s8) {
        this.buffer.put((int) j10, s8);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public ShortBufferIndexer(ShortBuffer shortBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = shortBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer get(long j10, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, sArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public short get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11));
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, long j11, short s8) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), s8);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer get(long j10, long j11, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ShortBuffer shortBuffer = this.buffer;
            long[] jArr = this.strides;
            sArr[i10 + i12] = shortBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, long j11, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ShortBuffer shortBuffer = this.buffer;
            long[] jArr = this.strides;
            shortBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), sArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public short get(long j10, long j11, long j12) {
        ShortBuffer shortBuffer = this.buffer;
        long[] jArr = this.strides;
        return shortBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12));
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long j10, long j11, long j12, short s8) {
        ShortBuffer shortBuffer = this.buffer;
        long[] jArr = this.strides;
        shortBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), s8);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public short get(long... jArr) {
        return this.buffer.get((int) index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long[] jArr, short s8) {
        this.buffer.put((int) index(jArr), s8);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer get(long[] jArr, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.ShortIndexer
    public ShortIndexer put(long[] jArr, short[] sArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, sArr[i10 + i12]);
        }
        return this;
    }
}
