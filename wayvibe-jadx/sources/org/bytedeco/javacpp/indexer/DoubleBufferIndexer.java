package org.bytedeco.javacpp.indexer;

import V0.p;
import java.nio.Buffer;
import java.nio.DoubleBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class DoubleBufferIndexer extends DoubleIndexer {
    protected DoubleBuffer buffer;

    public DoubleBufferIndexer(DoubleBuffer doubleBuffer) {
        this(doubleBuffer, new long[]{doubleBuffer.limit()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long j10) {
        return this.buffer.get((int) j10);
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, double d10) {
        this.buffer.put((int) j10, d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.buffer = null;
    }

    public DoubleBufferIndexer(DoubleBuffer doubleBuffer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.buffer = doubleBuffer;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer get(long j10, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            dArr[i10 + i12] = this.buffer.get((((int) j10) * ((int) this.strides[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put((((int) j10) * ((int) this.strides[0])) + i12, dArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long j10, long j11) {
        return this.buffer.get((((int) j10) * ((int) this.strides[0])) + ((int) j11));
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, long j11, double d10) {
        this.buffer.put((((int) j10) * ((int) this.strides[0])) + ((int) j11), d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer get(long j10, long j11, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            DoubleBuffer doubleBuffer = this.buffer;
            long[] jArr = this.strides;
            dArr[i10 + i12] = doubleBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, long j11, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            DoubleBuffer doubleBuffer = this.buffer;
            long[] jArr = this.strides;
            doubleBuffer.put(p.A((int) j11, (int) jArr[1], ((int) j10) * ((int) jArr[0]), i12), dArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long j10, long j11, long j12) {
        DoubleBuffer doubleBuffer = this.buffer;
        long[] jArr = this.strides;
        return doubleBuffer.get((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12));
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long j10, long j11, long j12, double d10) {
        DoubleBuffer doubleBuffer = this.buffer;
        long[] jArr = this.strides;
        doubleBuffer.put((((int) j11) * ((int) jArr[1])) + (((int) j10) * ((int) jArr[0])) + ((int) j12), d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public double get(long... jArr) {
        return this.buffer.get((int) index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long[] jArr, double d10) {
        this.buffer.put((int) index(jArr), d10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer get(long[] jArr, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            dArr[i10 + i12] = this.buffer.get(((int) index(jArr)) + i12);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.DoubleIndexer
    public DoubleIndexer put(long[] jArr, double[] dArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.buffer.put(((int) index(jArr)) + i12, dArr[i10 + i12]);
        }
        return this;
    }
}
