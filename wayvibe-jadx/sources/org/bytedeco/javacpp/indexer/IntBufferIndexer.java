package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class IntBufferIndexer extends IntIndexer {
    protected IntBuffer buffer;

    public IntBufferIndexer(IntBuffer intBuffer) {
        this(intBuffer, new long[]{intBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long j10) {
        return this.buffer.get((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, int i10) {
        this.buffer.put((int) j10, i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public IntBufferIndexer(IntBuffer intBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = intBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer get(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11));
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, long j11, int i10) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer get(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            IntBuffer intBuffer = this.buffer;
            long[] jArr = this.strides;
            iArr[i10 + i12] = intBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, long j11, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            IntBuffer intBuffer = this.buffer;
            long[] jArr = this.strides;
            intBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), iArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long j10, long j11, long j12) {
        IntBuffer intBuffer = this.buffer;
        long[] jArr = this.strides;
        return intBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12));
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long j10, long j11, long j12, int i10) {
        IntBuffer intBuffer = this.buffer;
        long[] jArr = this.strides;
        intBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public int get(long... jArr) {
        return this.buffer.get((int) index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long[] jArr, int i10) {
        this.buffer.put((int) index(jArr), i10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer get(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.IntIndexer
    public IntIndexer put(long[] jArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, iArr[i10 + i12]);
        }
        return this;
    }
}
