package org.bytedeco.javacpp.indexer;

import org.bytedeco.javacpp.FloatPointer;
import org.bytedeco.javacpp.Pointer;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class FloatRawIndexer extends FloatIndexer {
    protected static final Raw RAW = Raw.getInstance();
    final long base;
    protected FloatPointer pointer;
    final long size;

    public FloatRawIndexer(FloatPointer floatPointer) {
        this(floatPointer, new long[]{floatPointer.limit() - floatPointer.position()}, Indexer.ONE_STRIDE);
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long j10) {
        return RAW.getFloat((Indexer.checkIndex(j10, this.size) * 4) + this.base);
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public Pointer pointer() {
        return this.pointer;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, float f10) {
        RAW.putFloat((Indexer.checkIndex(j10, this.size) * 4) + this.base, f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.Indexer
    public void release() {
        this.pointer = null;
    }

    public FloatRawIndexer(FloatPointer floatPointer, long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
        this.pointer = floatPointer;
        this.base = (floatPointer.position() * 4) + floatPointer.address();
        this.size = floatPointer.limit() - floatPointer.position();
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer get(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = get((this.strides[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put((this.strides[0] * j10) + ((long) i12), fArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long j10, long j11) {
        return get((j10 * this.strides[0]) + j11);
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, long j11, float f10) {
        put((j10 * this.strides[0]) + j11, f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer get(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            fArr[i10 + i12] = get((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, long j11, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.strides;
            put((jArr[1] * j11) + (jArr[0] * j10) + ((long) i12), fArr[i10 + i12]);
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long j10, long j11, long j12) {
        long[] jArr = this.strides;
        return get(b.h(j11, jArr[1], j10 * jArr[0], j12));
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long j10, long j11, long j12, float f10) {
        long[] jArr = this.strides;
        put(b.h(j11, jArr[1], j10 * jArr[0], j12), f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public float get(long... jArr) {
        return get(index(jArr));
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long[] jArr, float f10) {
        put(index(jArr), f10);
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer get(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = get(index(jArr) + ((long) i12));
        }
        return this;
    }

    @Override // org.bytedeco.javacpp.indexer.FloatIndexer
    public FloatIndexer put(long[] jArr, float[] fArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            put(index(jArr) + ((long) i12), fArr[i10 + i12]);
        }
        return this;
    }
}
